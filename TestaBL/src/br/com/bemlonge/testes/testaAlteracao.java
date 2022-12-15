package br.com.bemlonge.testes;

import br.com.bemlonge.dto.GuiaDAO;

public class testaAlteracao {
	public static void main(String[] args) throws ClassNotFoundException {

		GuiaDAO dao = new GuiaDAO();
		dao.conectar();
		dao.alterar("KKKKK", "11112",16);
		dao.desconectar();
	}
}
