package br.com.bemlonge.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuiaDAO {

	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	public GuiaDAO() {
	}

	public boolean conectar() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/agencia_ebix", "root", "root");
			System.out.println("Conexão estabelecida.");
			return true;
		} catch (SQLException ex) {
			System.out.println("Conexão não sucedida.");
			return false;
		}
	}

	public int salvar(Guia guia) {
		int status;
		try {
			st = conn
					.prepareStatement("INSERT INTO GUIA(CPF,NOME) VALUES (?,?);");
			st.setString(2, guia.getNome());
			st.setString(1, guia.getCpf());
			status = st.executeUpdate();
			System.out.println("Guia salvo com sucesso.");
			return status;
		} catch (SQLException ex) {
			System.out.println("Guia não foi salvo com sucesso.");
			return ex.getErrorCode();
		}
	}

	public int deletar(int id) {
		int status;
		try {
			st = conn.prepareStatement("DELETE FROM GUIA WHERE id=?");
			st.setInt(1, id);
			status = st.executeUpdate();
			System.out.println("Guia apagado com sucesso.");
			return status;
		} catch (SQLException ex) {
			System.out.println("Guia não foi apagado com sucesso.");
			return ex.getErrorCode();
		}
	}

	public void desconectar() {
		try {
			conn.close();
			System.out.println("Conexão fechada.");
		} catch (SQLException ex) {

		}
	}

	public Guia consultar(int id) {
		try {
			Guia guia = new Guia();
			st = conn.prepareStatement("select * from guia WHERE id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				guia.setCpf(rs.getString("cpf"));
				guia.setNome(rs.getString("nome"));
				return guia;
			} else {
				return null;
			}
		} catch (SQLException ex) {
			return null;
		}
	}

	public int alterar(String nome, String cpf, int id){
		int status;
		try {
			st = conn
					.prepareStatement("UPDATE GUIA SET nome= ?, cpf=?  WHERE id= ?");
			st.setString(1, nome);
			st.setString(2, cpf);
			st.setInt(3, id);
			status = st.executeUpdate();
			System.out.println("Alteração realizada");
			return status;
		} catch (SQLException ex) {
			System.out.println("Alteração  não realizada");
			return ex.getErrorCode();
		}
	}

	public List<Guia> listar() {

		List<Guia> guias = new ArrayList<Guia>();

		try {
			st = conn.prepareStatement("SELECT * FROM GUIA");
			rs = st.executeQuery();
			while (rs.next()) {
				Guia guia = new Guia();
				guia.setId(rs.getString("id"));
				guia.setCpf(rs.getString("cpf"));
				guia.setNome(rs.getString("nome"));
				guias.add(guia);
			}
			System.out.println("Consulta sucedida");

			return guias;
		} catch (SQLException ex) {
			System.out.println("Consulta não sucedida");
			return null;
		}
	}

}
