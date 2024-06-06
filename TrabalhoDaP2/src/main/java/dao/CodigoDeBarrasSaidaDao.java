package dao;

import entidades.CodigoDeBarrasSaida;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CodigoDeBarrasSaidaDao {
    private EntityManager em;
    private EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }

    public CodigoDeBarrasSaidaDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(CodigoDeBarrasSaida c) {
        etx.begin();
        this.em.persist(c);
        etx.commit();
    }
}
