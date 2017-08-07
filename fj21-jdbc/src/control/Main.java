package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class Main {

	public static void main(String[] args) {

		String nome;
		String email;
		String end;
		String date;
		int id;

		Contato contato = new Contato();

		Scanner in = new Scanner(System.in);

		int resp = 0;

		ContatoDao dao = new ContatoDao();

		System.out.println("Digite 1 para adicionar | 2 para alterar | 3 para remover e 4 para selecionar");
		resp = in.nextInt();

		switch (resp) {

		case 1:

			System.out.println("Digite o nome do usuário");
			nome = in.next();

			System.out.println("Digite o email do usuário");
			email = in.next();

			System.out.println("Digite o endereco do usuário");
			end = in.next();

			System.out.println("Digite a data de nascimento");
			date = in.next();

			try {
				SimpleDateFormat smd = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime(smd.parse(date));

				contato.setNome(nome);
				contato.setEmail(email);
				contato.setEndereco(end);

				contato.setDataNascimento(cal);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			dao.adiciona(contato);
			System.out.println("Dados adicionados com sucesso!! ");
			break;

		case 2:

			System.out.println("Digite a id do usuário a ser alterado");
			id = in.nextInt();

			System.out.println("Digite o novo nome do usuário");
			nome = in.next();

			System.out.println("Digite o novo email do usuário");
			email = in.next();

			System.out.println("Digite o novo endereço do usuário");
			end = in.next();

			System.out.println("Digite a nova data de nascimento do usuário");
			date = in.next();

			contato.setId(id);
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setEndereco(end);

			try {
				SimpleDateFormat smd = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime(smd.parse(date));

				contato.setDataNascimento(cal);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			dao.alter(contato);
			System.out.println("Dados adicionados com Sucesso!!");
			break;

		case 3:

			System.out.println("Digite a id do usuário a ser removido");
			id = in.nextInt();

			contato.setId(id);

			dao.remove(contato);

			System.out.println("Usuário removido");
			break;

		case 4:

			List<Contato> contatos = dao.getlist();

			for (Contato cont : contatos) {

				System.out.println("Nome : " + cont.getNome());
				System.out.println("Email : " + cont.getEmail());
				System.out.println("Endereço : " + cont.getEndereco());
				System.out.println("Data de Nascimento " + cont.getDataNascimento().getTime());

			}

			break;
		}

		in.close();
	}
}
