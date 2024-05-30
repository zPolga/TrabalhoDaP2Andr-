package dao;

import codigoDeBarras.CodigoDeBarras;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CodigoDeBarrasDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public CodigoDeBarrasDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(CodigoDeBarras c) {
        this.em.persist(c);
    }
    public void Remover(CodigoDeBarras c){
        this.em.remove(c);
    }
    public List<CodigoDeBarras> ListarCodigoDeBarras() {
        TypedQuery<CodigoDeBarras>query = em.createQuery("SELECT c from CodigoDeBarras c ", CodigoDeBarras.class);
        return query.getResultList();
    }
}
