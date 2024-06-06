package dao;

import entidades.Cidade;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CidadeDao {
   private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public CidadeDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Cidade c) {
        this.em.persist(c);
    }
    public List<Cidade> ListaDeCidades() {
        TypedQuery<Cidade> query = em.createQuery("SELECT c from Cidade c",Cidade.class);
        return query.getResultList();
    }
    public void Remover(Cidade c){
        this.em.remove(c);
    }
}
