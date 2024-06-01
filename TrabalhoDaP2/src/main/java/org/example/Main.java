package org.example;

import cidade.Cidade;
import controller.CidadeController;
import dao.*;
import endereco.Endereco;
import estado.Estado;
import estoque.Estoque;
import funcionario.Funcionario;
import login.Login;
import telas.Inicio;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Estado est = new Estado(32,"Amazonas", "AM");

//       Cadastrar(est);
        CidadeController cidade = new CidadeController();
        List<Cidade> cidades= cidade.ListaDeCidades();
        for (Cidade cid: cidades) {
            System.out.println(cid.getNome());
            System.out.println(cid.getEstado());
        }
    }
    public static void Cadastrar(Estado estadoo) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            EstadoDao estadoDao = new EstadoDao(em);
            Estado estado = estadoDao.Cadastrar(estadoo);

            if (estado != null) {
                Cidade cid = new Cidade(22, "Deodapolis", estado);
                Estoque estoque = new Estoque(22,2, 3, 22, 332);
                Endereco end = new Endereco(232, "CENTRO", "7990320", cid);
                Login log = new Login(23, "Lucas", "2323", null, estoque); // Funcionário definido como null para evitar referência circular
                Funcionario fun = new Funcionario(22, "Lucas", "2232132213", new Date(), "m/d", "99932932", "lucas@gmail.com", new Date(), "gerente", "soldado", 323.2, end, log);

                log.setFuncionario(fun);

                fun.setLogin(log);

                estoque.setCidade(cid);

                cid.setEstoques(Collections.singletonList(estoque));

                em.persist(cid);
                em.persist(estoque);
                em.persist(end);
                em.persist(log);
                em.persist(fun);

                tx.commit();
                System.out.println("Cadastrado com sucesso");
            } else {
                System.out.println("Erro ao cadastrar o estado.");
            }
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            System.out.println("Erro!");
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}