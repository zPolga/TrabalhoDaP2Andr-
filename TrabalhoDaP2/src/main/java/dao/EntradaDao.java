package dao;

import entrada.Entrada;

import javax.persistence.EntityManager;

public class EntradaDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EntradaDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Entrada e) {
        this.em.persist(e);
    }
}
