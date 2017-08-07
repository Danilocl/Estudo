package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class AlterTeste {

	public static void main(String[] args) {
		ContatoDao contdao = new ContatoDao();

		Contato contato = new Contato();

		contato.setNome("Parzival");
		contato.setEmail("foxtab63@gmail.com");
		contato.setEndereco("Tumba dos Horrores");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(1);

		contdao.alter(contato);
		System.out.println("Dados alterados com sucesso!!");

	}

}
