package dao;

import funcionario.Funcionario;
import login.Login;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public void Remover(Login l){
        this.em.remove(l);
    }
    public List<Login> ListarLogin() {
        TypedQuery<Login> query = em.createQuery("SELECT l from Login l ", Login.class);
        return query.getResultList();
    }
}
