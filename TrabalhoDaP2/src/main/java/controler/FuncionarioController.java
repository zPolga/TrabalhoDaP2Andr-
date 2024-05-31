package controler;

import funcionario.Funcionario;

import java.util.Date;
import java.util.Scanner;

public class FuncionarioController {
    private Funcionario funcionario;;
        public void cadastrarFuncionario() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Cadastro de Funcionário ===");

            System.out.print("Nome completo: ");
            String nomeCompleto = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            Date dataNascimento = new Date();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("E-mail: ");
            String email = scanner.nextLine();

            System.out.print("Data de admissão (dd/mm/aaaa): ");
            Date dataAdmissao = new Date();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Função: ");
            String funcao = scanner.nextLine();

            funcionario = new Funcionario(nomeCompleto, cpf, dataNascimento, endereco, sexo,
                    telefone, email, dataAdmissao, salario, cargo, funcao);

            System.out.println("\n=== Criação de Login ===");

            System.out.print("Nome de usuário: ");
            String username = scanner.nextLine();

            System.out.print("Senha: ");
            String password = scanner.nextLine();
        }

    public static void main(String[] args) {
        FuncionarioController controller = new FuncionarioController();
        controller.cadastrarFuncionario();
    }
}
