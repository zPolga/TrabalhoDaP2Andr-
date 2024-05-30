package dao;

import util.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Dao {
     EntityManager em = JpaUtil.getEntityManager();
     EntityTransaction etx = em.getTransaction();

     public void Salvar(EntityManager em) {
          etx.begin();

     }
}