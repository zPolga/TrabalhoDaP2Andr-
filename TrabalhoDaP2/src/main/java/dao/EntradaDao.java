package dao;

import endereco.Endereco;
import entrada.Entrada;
import estado.Estado;
import estoque.Estoque;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EntradaDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public EntradaDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Entrada e) {
        this.em.persist(e);
    }
    public void Remover(Estado e){
        this.em.remove(e);
    }
    public List<Entrada> ListarEntrada() {
        TypedQuery<Entrada> query = em.createQuery("SELECT e from Entrada e ", Entrada.class);
        return query.getResultList();
    }
}