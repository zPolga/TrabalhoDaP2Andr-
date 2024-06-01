package controller;

import cidade.Cidade;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CidadeController {
    EntityManager em= JpaUtil.getEntityManager();
    public List<Cidade> ListaDeCidades() {
        TypedQuery<Cidade> query = em.createQuery("SELECT c from Cidade c",Cidade.class);
        return query.getResultList();
    }
}
