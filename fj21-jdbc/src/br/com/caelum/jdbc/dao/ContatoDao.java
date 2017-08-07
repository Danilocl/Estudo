package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao {

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	private Connection connection;

	Calendar data = Calendar.getInstance();

	
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * Construtor da classe
	 */
	public ContatoDao() {

		// Utiliza a variável de conexão para abrir a conexão
		this.connection = new ConnectionFactory().getConnection();

	}

	/**
	 * método que irá inserir os dados na tabela contato
	 */
	public void adiciona(Contato contato) {

		// query que estipula os dados a serem inseridos
		String sql = "insert into contatos" + "(nome,email,endereco,dataNascimento)" + "values (?,?,?,?)";
		try {

			PreparedStatement psm = connection.prepareStatement(sql);

			psm.setString(1, contato.getNome());
			psm.setString(2, contato.getEmail());
			psm.setString(3, contato.getEndereco());
			psm.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			psm.execute();
			psm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getlist() {

		try {
			List<Contato> contato = new ArrayList<Contato>();

			PreparedStatement stm = this.connection.prepareStatement("Select * from contatos");
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {

				Contato contatos = new Contato();

				contatos.setNome(rs.getString("nome"));
				contatos.setEmail(rs.getString("email"));
				contatos.setEndereco(rs.getString("endereco"));

				// Faz a conversão da data atual para dd/mm/yyyy
//				df.setTimeZone(data.getTimeZone());
				data.setTime(rs.getDate("dataNascimento"));
				contatos.setDataNascimento(data);

				contato.add(contatos);
			}
			rs.close();
			stm.close();
			return contato;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

	}

	public void alter(Contato contato) {
		try {
			PreparedStatement stm = this.connection.prepareStatement(
					"update contatos set nome=?, email=?, endereco=?," + "dataNascimento=? where id=?");

			stm.setString(1, contato.getNome());
			stm.setString(2, contato.getEmail());
			stm.setString(3, contato.getEndereco());
			stm.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stm.setLong(5, contato.getId());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public void remove(Contato contato) {
		try {
			PreparedStatement stm = this.connection.prepareStatement("delete from contatos where id=?");
			stm.setLong(1, contato.getId());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	
	
}
