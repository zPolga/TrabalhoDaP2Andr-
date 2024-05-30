package dao;

import registro.Registro;
import tipo.Tipo;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class TipoDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public TipoDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Tipo t) {
        this.em.persist(t);
    }
    public void Remover(Tipo t){
        this.em.remove(t);
    }
    public List<Tipo> ListarTipo() {
        TypedQuery<Tipo> query = em.createQuery("SELECT t from Tipo t ", Tipo.class);
        return query.getResultList();
    }
}
