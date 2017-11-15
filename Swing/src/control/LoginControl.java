package control;

import model.Login;
import model.dao.DaoGeneric;
import model.dao.LoginDao;
import view.LoginView;

public class LoginControl {

	public static void chamaModelDao(String login, String senha) {

		LoginDao loginDao = new LoginDao();

		loginDao.validaLogin(login,senha);

	}
}
