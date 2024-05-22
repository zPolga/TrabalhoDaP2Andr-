package dao;

import estoque.Estoque;

import javax.persistence.EntityManager;

public class EstoqueDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Estoque e) {
        this.em.persist(e);
    }
}
