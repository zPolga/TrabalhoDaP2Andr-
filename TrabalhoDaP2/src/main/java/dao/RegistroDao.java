package dao;

import registro.Registro;

import javax.persistence.EntityManager;

public class RegistroDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public RegistroDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Registro r) {
        this.em.persist(r);
    }
}
