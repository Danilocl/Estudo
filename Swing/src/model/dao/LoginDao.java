package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import model.Login;

public class LoginDao extends DaoGeneric<Login> {

	private static LoginDao instancia;

	public static LoginDao getInstancia() {

		if (instancia == null) {
			instancia = new LoginDao();
			return instancia;
		} else {
			return instancia;
		}
	}

	public Login validaLogin(String login,String senha) {
		EntityManager entity = getEntityManager();

		Login log = null;
		try {
			Query query = entity.createQuery("select l from login l where l.loginName = :login");
			query.setParameter("login", login);
			@SuppressWarnings("unchecked")
			List<Login> list = query.getResultList();
			log = list.get(0);
			System.out.println(list.get(0).getLoginName());
			if (log.getSenha().equals(senha)) {
				JOptionPane.showMessageDialog(null, "Seja bem vindo " + log.getLoginName());

			} else {
				JOptionPane.showMessageDialog(null, "Senha incorreta!");
				log = null;
			}
		} catch (IndexOutOfBoundsException nexc) {
			JOptionPane.showMessageDialog(null, "Login não encontrado!");
			log = null;
		}

		return log;
	}

}
