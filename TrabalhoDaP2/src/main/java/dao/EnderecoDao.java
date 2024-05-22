package dao;

import endereco.Endereco;

import javax.persistence.EntityManager;

public class EnderecoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Endereco e) {
        this.em.persist(e);
    }
}
