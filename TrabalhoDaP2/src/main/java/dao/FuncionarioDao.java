package dao;

import entidades.Funcionario;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class FuncionarioDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();
    public EntityManager getEm() {
        return em;
    }



    public FuncionarioDao()
    {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public void Cadastrar(Funcionario f) {

        etx.begin();
        em.persist(f);
        etx.commit();
    }
    public void Remover(Funcionario f){
        etx.begin();
        em.remove(f);
        etx.commit();
    }
    public List<Funcionario> ListarFuncionario() {
        TypedQuery<Funcionario> query = em.createQuery("SELECT f from Funcionario f ", Funcionario.class);
        return query.getResultList();
    }
}
