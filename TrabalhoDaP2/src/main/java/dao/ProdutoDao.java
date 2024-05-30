package dao;

import notaFiscal.NotaFiscal;
import produto.Produto;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProdutoDao {
    EntityManager em;

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
        this.em.persist(p);
    }
    public void Remover(Produto p){
        this.em.remove(p);
    }
    public List<Produto> ListarProduto() {
        TypedQuery<Produto> query = em.createQuery("SELECT p from Produto p ", Produto.class);
        return query.getResultList();
    }

}
