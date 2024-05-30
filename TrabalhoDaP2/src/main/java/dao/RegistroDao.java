package dao;

import produto.Produto;
import registro.Registro;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ResourceBundle;

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
    public void Remover(Registro r){
        this.em.remove(r);
    }
    public List<Registro> ListarRegistro() {
        TypedQuery<Registro> query = em.createQuery("SELECT r from Registro r ", Registro.class);
        return query.getResultList();
    }
}
