package dao;

import entidades.Funcionario;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class FuncionarioDao {
    private EntityManager em = JpaUtil.getEntityManager();
    private EntityTransaction etx = em.getTransaction();

    public FuncionarioDao() {}

    public void Cadastrar(Funcionario f) {
        etx.begin();
        em.persist(f);
        etx.commit();
    }

    public void Remover(Funcionario f) {
        etx.begin();
        em.remove(f);
        etx.commit();
    }

    public List<Funcionario> listarFuncionario(String nome, String cpf, String rg, Date dataAdm, String sexo, String email, Date dataNasc, String cargo, String funcao) {
        StringBuilder jpql = new StringBuilder("SELECT f FROM Funcionario f WHERE 1 = 1");

        if (nome != null && !nome.isEmpty()) {
            jpql.append(" AND f.nomeCompleto LIKE :nome");
        }
        if (cpf != null && !cpf.isEmpty()) {
            jpql.append(" AND f.CPF = :cpf");
        }
        if (rg != null && !rg.isEmpty()) {
            jpql.append(" AND f.rg = :rg");
        }
        if (dataAdm != null) {
            jpql.append(" AND f.dataAdmissao = :dataAdm");
        }
        if (sexo != null && !sexo.isEmpty()) {
            jpql.append(" AND f.sexo = :sexo");
        }
        if (email != null && !email.isEmpty()) {
            jpql.append(" AND f.email = :email");
        }
        if (dataNasc != null) {
            jpql.append(" AND f.dtnascimento = :dataNasc");
        }
        if (cargo != null && !cargo.isEmpty()) {
            jpql.append(" AND f.cargo = :cargo");
        }
        if (funcao != null && !funcao.isEmpty()) {
            jpql.append(" AND f.funcao = :funcao");
        }

        System.out.println("JPQL Query: " + jpql.toString());

        TypedQuery<Funcionario> query = em.createQuery(jpql.toString(), Funcionario.class);

        if (nome != null && !nome.isEmpty()) {
            query.setParameter("nome", "%" + nome + "%");
            System.out.println("Nome: " + nome);
        }
        if (cpf != null && !cpf.isEmpty()) {
            query.setParameter("cpf", cpf);
            System.out.println("CPF: " + cpf);
        }
        if (rg != null && !rg.isEmpty()) {
            query.setParameter("rg", rg);
            System.out.println("RG: " + rg);
        }
        if (dataAdm != null) {
            query.setParameter("dataAdm", dataAdm);
            System.out.println("Data Admissão: " + dataAdm);
        }
        if (sexo != null && !sexo.isEmpty()) {
            query.setParameter("sexo", sexo);
            System.out.println("Sexo: " + sexo);
        }
        if (email != null && !email.isEmpty()) {
            query.setParameter("email", email);
            System.out.println("Email: " + email);
        }
        if (dataNasc != null) {
            query.setParameter("dataNasc", dataNasc);
            System.out.println("Data Nascimento: " + dataNasc);
        }
        if (cargo != null && !cargo.isEmpty()) {
            query.setParameter("cargo", cargo);
            System.out.println("Cargo: " + cargo);
        }
        if (funcao != null && !funcao.isEmpty()) {
            query.setParameter("funcao", funcao);
            System.out.println("Função: " + funcao);
        }

        List<Funcionario> result = query.getResultList();
        System.out.println("Number of results: " + result.size());
        return result;
    }
}
