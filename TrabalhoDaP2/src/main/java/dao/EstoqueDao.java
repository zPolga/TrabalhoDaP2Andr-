package dao;

import entidades.Estoque;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstoqueDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public EstoqueDao( ) {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Estoque e) {
        etx.begin();
        em.persist(e);
        etx.commit();
    }

    public void Remover(Estoque e){

        etx.begin();
        em.remove(e);
        etx.commit();
    }
    public List<Estoque> ListarEstoque() {
        TypedQuery<Estoque> query = em.createQuery("SELECT e from Estoque e ", Estoque.class);
        return query.getResultList();
    }
}
