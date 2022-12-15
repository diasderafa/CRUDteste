package br.com.bemlonge.testes;

import br.com.bemlonge.dto.Guia;
import br.com.bemlonge.dto.GuiaDAO;

public class testaApagar {
	public static void main(String[] args) throws ClassNotFoundException {

		GuiaDAO dao = new GuiaDAO();
		int id = 20;
		dao.conectar();
		dao.deletar(id);
		dao.desconectar();
	}
}
