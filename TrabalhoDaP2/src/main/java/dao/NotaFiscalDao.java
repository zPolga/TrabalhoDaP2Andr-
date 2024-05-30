package dao;

import entidades.NotaFiscal;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class NotaFiscalDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public NotaFiscalDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(NotaFiscal n) {
        etx.begin();
        em.persist(n);
        etx.commit();
    }
    public void Remover(NotaFiscal n){
        this.em.remove(n);
    }
    public List<NotaFiscal> ListarNotaFiscal() {
        TypedQuery<NotaFiscal> query = em.createQuery("SELECT n from NotaFiscal n ", NotaFiscal.class);
        return query.getResultList();
    }

}
