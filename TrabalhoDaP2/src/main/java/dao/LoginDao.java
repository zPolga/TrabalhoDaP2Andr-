package dao;

import entidades.Login;
import org.springframework.security.crypto.bcrypt.BCrypt;
import util.JpaUtil;

import javax.persistence.*;

public class LoginDao {
    private  EntityManager em = JpaUtil.getEntityManager();
    EntityTransaction etx = em.getTransaction();

    public LoginDao() {

    }

    public void Cadastrar(Login login) {

        String hashedSenha = BCrypt.hashpw(login.getSenha(), BCrypt.gensalt());
        login.setSenha(hashedSenha);

        etx.begin();
        em.persist(login);
        etx.commit();
    }

    public boolean autenticar(String usuario, String senha) {
        try {
            TypedQuery<Login> query = em.createQuery("SELECT l FROM Login l WHERE l.nome = :usuario", Login.class);
            query.setParameter("usuario", usuario);
            Login login = query.getSingleResult();

            if (BCrypt.checkpw(senha, login.getSenha())) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
