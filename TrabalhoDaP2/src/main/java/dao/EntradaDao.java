package dao;

import entidades.Entrada;
import entidades.Estado;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EntradaDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public EntradaDao() {


    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Entrada e) {
        etx.begin();
        em.persist(e);
        etx.commit();
    }
    public void Remover(Estado e){

        etx.begin();
        em.remove(e);
        etx.commit();
    }
    public List<Entrada> ListarEntrada() {
        TypedQuery<Entrada> query = em.createQuery("SELECT e from Entrada e ", Entrada.class);
        return query.getResultList();
    }
}