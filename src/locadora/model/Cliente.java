package locadora.model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

	private Integer codCliente;
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private Date dtNascimento;
	private ArrayList<Item> itens = new ArrayList<Item>();

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String email, String endereco, Date dtNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	
	public void cadastrarCliente( Cliente cliente) {
		
	}
}
