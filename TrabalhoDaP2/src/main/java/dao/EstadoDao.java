package dao;

import estado.Estado;

import javax.persistence.EntityManager;

public class EstadoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EstadoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public Estado Cadastrar(Estado e) {
        this.em.persist(e);
        return e;
    }
}
