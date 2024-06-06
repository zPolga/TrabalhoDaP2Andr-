package dao;

import entidades.Validade;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ValidadeDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public ValidadeDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Validade v) {
        this.em.persist(v);
    }
    public void Remover(Validade v){
        this.em.remove(v);
    }
    public List<Validade> ListarValidade() {
        TypedQuery<Validade> query = em.createQuery("SELECT v from Validade v ", Validade.class);
        return query.getResultList();
    }
}
