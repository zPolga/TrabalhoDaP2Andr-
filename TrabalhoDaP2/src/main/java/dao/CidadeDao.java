package dao;

import entidades.Cidade;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CidadeDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public EntityManager getEm() {
        return em;
    }

    public CidadeDao( ) {
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Cidade c) {
        etx.begin();
        em.persist(c);
        etx.commit();
    }
    public List<Cidade> ListaDeCidades() {
        TypedQuery<Cidade> query = em.createQuery("SELECT c from Cidade c",Cidade.class);
        return query.getResultList();
    }
    public void Remover(Cidade c){

        etx.begin();
        em.remove(c);
        etx.commit();
    }
}
