package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class AdicionaTeste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("TEST");
		contato.setEmail("danilocalessa@gmail.com");
		contato.setEndereco("itamotinga 118 apt 301");
		contato.setDataNascimento(Calendar.getInstance());

		ContatoDao cont = new ContatoDao();
		cont.adiciona(contato);
		System.out.println("Dados adicionados !!");
	}
}
