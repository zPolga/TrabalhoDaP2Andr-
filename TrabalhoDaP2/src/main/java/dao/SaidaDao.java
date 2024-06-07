package dao;

import entidades.Saida;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class SaidaDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public SaidaDao() {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Saida s) {
        etx.begin();
        em.persist(s);
        etx.commit();
    }
    public void Remover(Saida s){

        etx.begin();
        em.remove(s);
        etx.commit();
    }
    public List<Saida> ListarSaida() {
        TypedQuery<Saida> query = em.createQuery("SELECT s from Saida s ", Saida.class);
        return query.getResultList();
    }
}
