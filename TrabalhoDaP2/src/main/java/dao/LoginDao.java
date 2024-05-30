package dao;

import entidades.Login;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class LoginDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public LoginDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Login l) {
        etx.begin();
        em.persist(l);
        etx.commit();
    }

    public void Remover(Login l){
        this.em.remove(l);
    }
    public List<Login> ListarLogin() {
        TypedQuery<Login> query = em.createQuery("SELECT l from Login l ", Login.class);
        return query.getResultList();
    }
}
