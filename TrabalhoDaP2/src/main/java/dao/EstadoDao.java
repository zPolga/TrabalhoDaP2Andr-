package dao;

import estado.Estado;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstadoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EstadoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public Estado Cadastrar(Estado e) {
        this.em.persist(e);
        return e;
    }
    public void Remover(Estado e){
        this.em.remove(e);
    }
    public List<Estado> ListarEstado() {
        TypedQuery<Estado> query = em.createQuery("SELECT e from Estado e ", Estado.class);
        return query.getResultList();
    }
}