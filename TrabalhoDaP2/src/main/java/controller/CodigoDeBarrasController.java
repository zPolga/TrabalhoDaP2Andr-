package controller;

import funcionario.Funcionario;

public class CodigoDeBarrasController {
    public void CadastrarFuncionario() {
        Funcionario func = new Funcionario();
        String loginNovo = "lucas";
        if(func.getLogin().equals(loginNovo)){
            CadastrarFuncionario();
        }
    }
}
