package com.project.listservice.dto;

import java.io.Serializable;

import com.project.listservice.model.Produto;

public class ProdutoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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
	
	public ProdutoDto() {
		
	}
	
	public ProdutoDto(Produto entity) {
		
		 id = entity.getId();
		 nome = entity.getNome();
		 custo = entity.getCusto();
		 valor_venda = entity.getValor_venda();
		 margem = entity.getMargem();
		 lucro = entity.getLucro();
		 garantia = entity.getGarantia();
		 marca = entity.getMarca();
		 categoria = entity.getCategoria();
		 estoque = entity.getEstoque();
		 foto = entity.getFoto();
		 situacao = entity.getSituacao();
		 
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
	
	
	

}
