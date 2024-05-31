package dao;

import validade.Validade;

import javax.persistence.EntityManager;

public class ValidadeDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public ValidadeDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Validade v) {
        this.em.persist(v);
    }
}
