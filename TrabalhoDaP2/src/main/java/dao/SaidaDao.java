package dao;

import registro.Registro;
import saida.Saida;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class SaidaDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public SaidaDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Saida s) {
        this.em.persist(s);
    }
    public void Remover(Saida s){
        this.em.remove(s);
    }
    public List<Saida> ListarSaida() {
        TypedQuery<Saida> query = em.createQuery("SELECT s from Saida s ", Saida.class);
        return query.getResultList();
    }
}
