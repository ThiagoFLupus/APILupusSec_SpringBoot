package com.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ordem_servico")
public class OrdemServico {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Long numero;
	@Column(nullable=false)
	private String nomeCliente;
	@Column(nullable=false)
	private StringBuilder descricaoOrdem;
	@Column(nullable=false)
	private ZonedDateTime dataCriacao;
	@Column(nullable=false)
	private String status;
	
	public OrdemServico() {}
	
	public OrdemServico(String nomeCliente, StringBuilder descricaoCliente, ZonedDateTime dataCriacao, String status) {
		this.nomeCliente= nomeCliente;
		this.descricaoOrdem= descricaoOrdem;
		this.dataCriacao= dataCriacao;
		this.status= status;	
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public StringBuilder getDescricaoOrdem() {
		return descricaoOrdem;
	}

	public void setDescricaoOrdem(StringBuilder descricaoOrdem) {
		this.descricaoOrdem = descricaoOrdem;
	}
	
	

	public ZonedDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(ZonedDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
