package locadora.model;

import java.util.Date;

import locadora.dao.ExceptionDAO;
import locadora.dao.ClienteDAO;

public class Item {
	
	private  Integer codItem;
	private  Double preco;
	private  String tipo;
	private  Date dataLocacao;
	private  Date dataDevolucao;
	private  Filme filme;
	private  Cliente cliente;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getCodItem() {
		return codItem;
	}
	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
