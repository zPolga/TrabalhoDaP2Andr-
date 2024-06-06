package dao;

import entidades.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EnderecoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EnderecoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Endereco e) {
        this.em.persist(e);
    }

    public void Remover(Endereco e){
        this.em.remove(e);
    }
    public List<Endereco> ListarEndereco() {
        TypedQuery<Endereco> query = em.createQuery("SELECT e from Endereço e ", Endereco.class);
        return query.getResultList();
    }
}