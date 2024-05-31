package dao;

import funcionario.Funcionario;

import javax.persistence.EntityManager;

public class FuncionarioDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public FuncionarioDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Funcionario f) {
        this.em.persist(f);
    }
}
