package org.example;

import telas.Inicio;


public class Main {
    public static void main(String[] args) {
        Inicio inicio = new Inicio();

//        Cadastrar(est);
//        CidadeController cidade = new CidadeController();
//        List<Cidade> cidades= cidade.ListaDeCidades();
//        for (Cidade cid: cidades) {
//            System.out.println(cid.getNome());
//            System.out.println(cid.getEstado());
//        }
//       Cadastrar(est);
//        CidadeController cidadess = new CidadeController();
//        List<Cidade> cidadez= cidade.ListaDeCidades();
//        for (Cidade cid: cidadez) {
//            System.out.println(cid.getNome());
//            System.out.println(cid.getEstado());
//        }
//    }
//    public static void Cadastrar(Estado estadoo) {
//        EntityManager em = JpaUtil.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        try {
//            tx.begin();
//
//            EstadoDao estadoDao = new EstadoDao(em);
//            Estado entidades.estado = estadoDao.Cadastrar(estadoo); // Cadastre o entidades.estado e obtenha o objeto gerenciado
//
//            if (entidades.estado != null) {
//                Cidade cid = new Cidade(22, "Deodapolis", entidades.estado);
//                Estoque estoque = new Estoque(22,2, 3, 22, 332);
//                Endereco end = new Endereco(232, "CENTRO", "7990320", cid);
//                Login log = new Login(23, "Lucas", "2323", null, estoque); // Funcionário definido como null para evitar referência circular
//                Funcionario fun = new Funcionario(22, "Lucas", "2232132213", new Date(), "m/d", "99932932", "lucas@gmail.com", new Date(), "gerente", "soldado", 323.2, end, log);
//
//                log.setFuncionario(fun);
//
//                fun.setLogin(log);
//
//                estoque.setCidade(cid);
//
//                cid.setEstoques(Collections.singletonList(estoque));
//
//                em.persist(cid);
//                em.persist(estoque);
//                em.persist(end);
//                em.persist(log);
//                em.persist(fun);
//
//                tx.commit();
//                System.out.println("Cadastrado com sucesso");
//            } else {
//                System.out.println("Erro ao cadastrar o entidades.estado.");
//            }
//        } catch (Exception e) {
//            if (tx.isActive()) {
//                tx.rollback();
//            }
//            System.out.println("Erro!");
//        e.printStackTrace();
//      } finally {
//           em.close();
//      }
//  }close
}}
