package dao;

import notaFiscal.NotaFiscal;

import javax.persistence.EntityManager;

public class NotaFiscalDao {
    private EntityManager em;

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
        this.em.persist(n);
    }
}
