package dao;

import entidades.CodigoDeBarras;
import util.JpaUtil;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CodigoDeBarrasDao {
    private EntityManager em;
    EntityTransaction etx = em.getTransaction();


    public EntityManager getEm() {
        return em;
    }

    public CodigoDeBarrasDao() {
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(CodigoDeBarras c) {
        etx.begin();
        this.em.persist(c);
        etx.commit();

    }
    public void Remover(CodigoDeBarras c){
        this.em.remove(c);
    }
    public List<CodigoDeBarras> ListarCodigoDeBarras() {
        TypedQuery<CodigoDeBarras>query = em.createQuery("SELECT c from CodigoDeBarras c ", CodigoDeBarras.class);
        return query.getResultList();
    }
}
