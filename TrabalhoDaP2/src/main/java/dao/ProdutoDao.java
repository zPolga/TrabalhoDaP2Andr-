package dao;

import entidades.Produto;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProdutoDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Produto p) {
        etx.begin();
        em.persist(p);
        etx.commit();
    }
    public void Remover(Produto p){
        this.em.remove(p);
    }
    public List<Produto> ListarProduto() {
        TypedQuery<Produto> query = em.createQuery("SELECT p from Produto p ", Produto.class);
        return query.getResultList();
    }

}
