package dao;

import entidades.Estoque;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstoqueDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EstoqueDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Estoque e) {
        this.em.persist(e);
    }

    public void Remover(Estoque e){
        this.em.remove(e);
    }
    public List<Estoque> ListarEstoque() {
        TypedQuery<Estoque> query = em.createQuery("SELECT e from Estoque e ", Estoque.class);
        return query.getResultList();
    }
}
