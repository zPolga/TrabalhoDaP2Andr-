package dao;

import entidades.Estado;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstadoDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }

    public EstadoDao() {
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Estado e) {
        etx.begin();
        em.persist(e);
        etx.commit();
    }
    public void Remover(Estado e){

        etx.begin();
        em.remove(e);
        etx.commit();
    }
    public List<Estado> ListarEstado() {
        TypedQuery<Estado> query = em.createQuery("SELECT e from Estado e ", Estado.class);
        return query.getResultList();
    }
}