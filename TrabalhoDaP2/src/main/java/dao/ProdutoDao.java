package dao;

import produto.Produto;

import javax.persistence.EntityManager;

public class ProdutoDao {
    EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Produto p) {
        this.em.persist(p);
    }
}
