package dao;

import entidades.CodigoDeBarrasSaida;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CodigoDeBarrasSaidaDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }

    public CodigoDeBarrasSaidaDao( ) {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(CodigoDeBarrasSaida c) {
        etx.begin();
        this.em.persist(c);
        etx.commit();
    }
    public void Remover(CodigoDeBarrasSaida c) {

        etx.begin();
        em.remove(c);
        etx.commit();
    }
}
