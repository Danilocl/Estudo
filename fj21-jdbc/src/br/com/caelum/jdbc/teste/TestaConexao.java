package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta com sucesso!!");
		con.close();

	}
}
