package org.example;

import cidade.Cidade;
import dao.*;
import endereco.Endereco;
import estado.Estado;
import estoque.Estoque;
import funcionario.Funcionario;
import login.Login;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estado est = new Estado(32,"Amazonas", "AM");

        Cadastrar(est);
    }
    public static void Cadastrar(Estado estadoo) {
        Estado est = new Estado(22, "Amazonas", "AM");
        Cidade cid = new Cidade(22,"Deodapolis",est);

        Endereco end = new Endereco(232,"CENTRO","7990320",cid);
        Login log = new Login(23,"Lucas", "2323",new Funcionario(22,"ana","323","323232","feminino","3232","92392", new Date(),"empregado","domador de LEAO","3232",end,new Login()), new Estoque(22,"novo","usado",22,332));
        Funcionario fun = new Funcionario(22,"Lucas","2232132213","22042020","masculino","99932932","lucas@gmail.com",new Date(),"gerente","soldado","22020",end,log);
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        EnderecoDao enderecoDao = new EnderecoDao(em);
        CidadeDao cidadeDao = new CidadeDao(em);
        EstadoDao estadoDao = new EstadoDao(em);
        LoginDao loginDao = new LoginDao(em);
        FuncionarioDao funcionarioDao = new FuncionarioDao(em);

    try {
        tx.begin();
        Estado estado = em.find(Estado.class, est.getId());
        if(estado != null){
            loginDao.Cadastrar(log);
            enderecoDao.Cadastrar(end);
            cidadeDao.Cadastrar(cid);
            estadoDao.Cadastrar(est);
            funcionarioDao.Cadastrar(fun);
            em.getTransaction().commit();
            System.out.println("cadastrado com sucesso");
        }else {
            em.persist(est);

        }
    tx.commit();


    }catch (Exception e) {
        if(tx.isActive()){
            em.getTransaction().rollback();;

        }
        System.out.println("Erro!");
        e.printStackTrace();

    }finally {
        em.close();
    }
    }
}