package dao;

import entidades.Endereco;
import entidades.Estoque;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EnderecoDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }

    public EnderecoDao( ) {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Endereco e) {
            etx.begin();
            em.persist(e);
            etx.commit();
    }

    public void Remover(Endereco e){

        etx.begin();
        em.remove(e);
        etx.commit();
    }

    public List<Endereco> ListarEndereco() {
        TypedQuery<Endereco> query = em.createQuery("SELECT e from Endereco e ", Endereco.class);
        return query.getResultList();
    }
}