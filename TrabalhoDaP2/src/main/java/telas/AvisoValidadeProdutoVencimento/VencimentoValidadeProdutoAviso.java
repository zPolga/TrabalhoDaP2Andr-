package telas.AvisoValidadeProdutoVencimento;

import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class VencimentoValidadeProdutoAviso {
    public static void main(String[] args) {

        String NomeProduto = "Produto Mestre";
        LocalDate datadevencimenta = LocalDate.of(2024, 6, 9);


        LocalDate hojedoido = LocalDate.now();
        long dataateexpirar = ChronoUnit.DAYS.between(hojedoido, datadevencimenta);


        if (dataateexpirar <= 7) {

            JOptionPane.showMessageDialog(null, "Atenção/Cuidado caraio: " + NomeProduto + " está perto da validade absurda (" + datadevencimenta + ").");
        }
    }
}