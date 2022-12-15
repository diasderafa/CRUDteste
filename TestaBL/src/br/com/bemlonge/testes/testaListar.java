package br.com.bemlonge.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.bemlonge.dto.Guia;
import br.com.bemlonge.dto.GuiaDAO;

public class testaListar {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		GuiaDAO dao = new GuiaDAO();		
		List<Guia> listaGuias = new ArrayList<Guia>();
		dao.conectar();
		listaGuias = dao.listar();
		dao.desconectar();
		System.out.println(listaGuias.get(0).getNome());
	}

}
