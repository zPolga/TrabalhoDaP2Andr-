package dao;

import login.Login;

import javax.persistence.EntityManager;

public class LoginDao {
    private EntityManager em;

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
        this.em.persist(l);
    }
}
