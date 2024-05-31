package dao;

import tipo.Tipo;

import javax.persistence.EntityManager;

public class TipoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public TipoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Tipo t) {
        this.em.persist(t);
    }
}
