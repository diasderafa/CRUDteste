package br.com.bemlonge.actions;

import java.util.List;
import java.util.ArrayList;

import br.com.bemlonge.dto.Guia;
import br.com.bemlonge.dto.GuiaDAO;

import com.opensymphony.xwork2.ActionSupport;

public class GuiaCRUDAction extends ActionSupport {

	private String nome;
	private String cpf;
	private int id;
	private int idConsultado;
	List<Guia> listaGuias;
	private Guia guiaConsultado;
	
	private static final long serialVersionUID = 1L;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public List<Guia> getListaGuias() {
		return listaGuias;
	}

	public void setListaGuias(List<Guia> listaGuias) {
		this.listaGuias = listaGuias;
	}		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public Guia getGuiaConsultado() {
		return guiaConsultado;
	}

	public void setGuiaConsultado(Guia guiaConsultado) {
		this.guiaConsultado = guiaConsultado;
	}		

	public int getIdConsultado() {
		return idConsultado;
	}

	public void setIdConsultado(int idConsultado) {
		this.idConsultado = idConsultado;
	}

	public String salvarGuia() throws ClassNotFoundException {
		try {
//			System.out.println("Nome: " + nome);
//			System.out.println("CPF: " + cpf);
			GuiaDAO dao = new GuiaDAO();
			Guia guiaNovo = new Guia();
			guiaNovo.setCpf(this.cpf);
			guiaNovo.setNome(this.nome);
			dao.conectar();
			dao.salvar(guiaNovo);
			dao.desconectar();
			return SUCCESS;
		} catch (NullPointerException ex) {
			return ERROR;
		}
	}
	
	public String listarGuia() throws ClassNotFoundException {
		try {			
			GuiaDAO dao = new GuiaDAO();			
			listaGuias = new ArrayList<Guia>();
			dao.conectar();
			listaGuias = dao.listar();
			dao.desconectar();
			return SUCCESS;
		} catch (NullPointerException ex) {
			return ERROR;
		}
	}
	
	public String mostrarGuia() throws ClassNotFoundException {
		try {			
			GuiaDAO dao = new GuiaDAO();
			guiaConsultado = new Guia();
			dao.conectar();
			guiaConsultado = dao.consultar(id);
			dao.desconectar();
			return SUCCESS;
		} catch (NullPointerException ex) {
			return ERROR;
		}
	}
	
	public String alterarGuia() throws ClassNotFoundException {
		try {			
			GuiaDAO dao = new GuiaDAO();
			dao.conectar();
			dao.alterar(guiaConsultado.getNome(), guiaConsultado.getCpf(), idConsultado);
			dao.desconectar();
			return SUCCESS;
		} catch (NullPointerException ex) {
			return ERROR;
		}
	}

	public String apagarGuia() throws ClassNotFoundException {
		try {			
			GuiaDAO dao = new GuiaDAO();
			dao.conectar();
			dao.deletar(id);
			dao.desconectar();
			return SUCCESS;
		} catch (NullPointerException ex) {
			return ERROR;
		}
	}
}
