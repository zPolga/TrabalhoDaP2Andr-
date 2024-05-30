package dao;

import login.Login;
import notaFiscal.NotaFiscal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class NotaFiscalDao {
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public NotaFiscalDao(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(NotaFiscal n) {
        this.em.persist(n);
    }
    public void Remover(NotaFiscal n){
        this.em.remove(n);
    }
    public List<NotaFiscal> ListarNotaFiscal() {
        TypedQuery<NotaFiscal> query = em.createQuery("SELECT n from NotaFiscal n ", NotaFiscal.class);
        return query.getResultList();
    }

}
