package dao;

import codigoDeBarrasSaida.CodigoDeBarrasSaida;

import javax.persistence.EntityManager;

public class CodigoDeBarrasSaidaDao {
    private EntityManager em;

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
        this.em.persist(c);
    }
}
