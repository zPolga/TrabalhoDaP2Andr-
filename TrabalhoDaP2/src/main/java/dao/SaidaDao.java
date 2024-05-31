package dao;

import saida.Saida;

import javax.persistence.EntityManager;

public class SaidaDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public SaidaDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Saida s) {
        this.em.persist(s);
    }
}
