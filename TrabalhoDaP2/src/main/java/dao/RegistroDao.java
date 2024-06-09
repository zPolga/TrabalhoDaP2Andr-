package dao;

import entidades.Registro;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class RegistroDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public RegistroDao() {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Registro r) {
        etx.begin();
        em.persist(r);
        etx.commit();
    }
    public void Remover(Registro r){

        etx.begin();
        em.remove(r);
        etx.commit();
    }
    public List<Registro> ListarRegistro() {
        TypedQuery<Registro> query = em.createQuery("SELECT r from Registro r ", Registro.class);
        return query.getResultList();
    }
}
