package br.com.bemlonge.testes;

import br.com.bemlonge.dto.Guia;
import br.com.bemlonge.dto.GuiaDAO;

public class testaAdicionar {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		GuiaDAO dao = new GuiaDAO();
		Guia guia = new Guia();
		guia.setCpf("123");
		guia.setNome("Google");
		dao.conectar();
		dao.salvar(guia);
		dao.desconectar();
	}

}
