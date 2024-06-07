package dao;

import entidades.Tipo;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class TipoDao  {
     EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }

    public TipoDao( ) {

    }


    public void Cadastrar(Tipo t) {
        etx.begin();
        em.persist(t);
        etx.commit();

    }
    public void Remover(Tipo t){

        etx.begin();
        em.remove(t);
        etx.commit();
    }
    public List<Tipo> ListarTipo() {
        TypedQuery<Tipo> query = em.createQuery("SELECT t from Tipo t ", Tipo.class);
        return query.getResultList();
    }
}
