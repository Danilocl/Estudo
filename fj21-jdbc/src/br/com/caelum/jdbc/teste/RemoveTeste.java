package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class RemoveTeste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();

		contato.setId(5);
		dao.remove(contato);
		System.out.println("Dados removidos com sucesso!!!");

	}

}
