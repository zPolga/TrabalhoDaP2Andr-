package dao;

import codigoDeBarras.CodigoDeBarras;

import javax.persistence.EntityManager;

public class CodigoDeBarrasDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public CodigoDeBarrasDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(CodigoDeBarras c) {
        this.em.persist(c);
    }
}
