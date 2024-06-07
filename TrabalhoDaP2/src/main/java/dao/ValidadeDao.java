package dao;

import entidades.Validade;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ValidadeDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public ValidadeDao() {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Validade v) {
        etx.begin();
        em.persist(v);
        etx.commit();
    }
    public void Remover(Validade v){
        etx.begin();
        em.remove(v);
        etx.commit();
    }
    public List<Validade> ListarValidade() {
        TypedQuery<Validade> query = em.createQuery("SELECT v from Validade v ", Validade.class);
        return query.getResultList();
    }
}
