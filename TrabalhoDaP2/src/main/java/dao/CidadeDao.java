package dao;

import cidade.Cidade;

import javax.persistence.EntityManager;

public class CidadeDao {
   private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Cidade c) {
        this.em.persist(c);
    }
}
