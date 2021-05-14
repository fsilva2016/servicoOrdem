package com.project.listservice.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Produto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double custo;
	private Double valor_venda;
	private Double margem;
	private Double lucro;
	private String garantia;
	private String marca;
	private String categoria;
	private Integer estoque;
	private String foto;
	private String situacao;
	
	@OneToMany
	@JoinTable(name = "fornecedor_produto",
	joinColumns = @JoinColumn(name = "fornecedor_id"),
	inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private Set<Fornecedor> fornecedor = new HashSet<>();
	
	
	public Produto(Long id, String nome, Double custo, Double valor_venda, Double margem, Double lucro, String garantia,
			String marca, String categoria, Integer estoque, String foto, String situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.custo = custo;
		this.valor_venda = valor_venda;
		this.margem = margem;
		this.lucro = lucro;
		this.garantia = garantia;
		this.marca = marca;
		this.categoria = categoria;
		this.estoque = estoque;
		this.foto = foto;
		this.situacao = situacao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getCusto() {
		return custo;
	}


	public void setCusto(Double custo) {
		this.custo = custo;
	}


	public Double getValor_venda() {
		return valor_venda;
	}


	public void setValor_venda(Double valor_venda) {
		this.valor_venda = valor_venda;
	}


	public Double getMargem() {
		return margem;
	}


	public void setMargem(Double margem) {
		this.margem = margem;
	}


	public Double getLucro() {
		return lucro;
	}


	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}


	public String getGarantia() {
		return garantia;
	}


	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getEstoque() {
		return estoque;
	}


	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public Set<Fornecedor> getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Set<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

}
