package dao;

import entidades.CodigoDeBarras;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CodigoDeBarrasDao {
    private  EntityManager em = JpaUtil.getEntityManager();
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
        try {
            etx.begin();
            em.persist(c);
            etx.commit();
        } catch (Exception e) {
            if (etx != null && etx.isActive()) {
                etx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
    public void Remover(CodigoDeBarras c){

        etx.begin();
        em.remove(c);
        etx.commit();
    }
    public List<CodigoDeBarras> ListarCodigoDeBarras() {
        TypedQuery<CodigoDeBarras>query = em.createQuery("SELECT c from CodigoDeBarras c ", CodigoDeBarras.class);
        return query.getResultList();
    }
}
