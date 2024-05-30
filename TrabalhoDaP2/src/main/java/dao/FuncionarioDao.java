package dao;

import estoque.Estoque;
import funcionario.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

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
    public void Remover(Funcionario f){
        this.em.remove(f);
    }
    public List<Funcionario> ListarFuncionario() {
        TypedQuery<Funcionario> query = em.createQuery("SELECT f from Funcionario f ", Funcionario.class);
        return query.getResultList();
    }
}
