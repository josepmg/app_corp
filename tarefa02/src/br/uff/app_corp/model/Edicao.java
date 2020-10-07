package br.uff.app_corp.model;

import javax.persistence.*;

@Entity
@Table(name = "edicao")
public class Edicao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "edicaoId")
	private int edicaoId;
	@Column (name = "numero")
	private int numero;
	@Column (name = "ano")
	private double ano;
	@Column (name = "dataInicio")
	private double dataInicio;
	@Column (name = "dataFim")
	private  double dataFim;
	@Column (name = "cidadeSede")
	private String cidadeSede;
	@Column (name = "paisSede")
	private String  paisSede;
	@ManyToOne
	private Evento evento;
	
	public Edicao() {
		super();
	}
	
	public Edicao(int edicaoId) {
		super();
		this.edicaoId = edicaoId;
	}

	public Edicao(int numero, double ano, double dataInicio, double dataFim, String cidadeSede, String paisSede,
			Evento evento) {
		super();
		this.numero = numero;
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cidadeSede = cidadeSede;
		this.paisSede = paisSede;
		this.evento = evento;
	}

	public Edicao(int edicaoId, int numero, double ano, double dataInicio, double dataFim, String cidadeSede,
			String paisSede, Evento evento) {
		super();
		this.edicaoId = edicaoId;
		this.numero = numero;
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cidadeSede = cidadeSede;
		this.paisSede = paisSede;
		this.evento = evento;
	}

	public int getEdicaoId() {
		return edicaoId;
	}
	
	public void setEdicaoId(int edicaoId) {
		this.edicaoId = edicaoId;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getAno() {
		return ano;
	}
	
	public void setAno(double ano) {
		this.ano = ano;
	}
	
	public double getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(double dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public double getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(double dataFim) {
		this.dataFim = dataFim;
	}
	
	public String getCidadeSede() {
		return cidadeSede;
	}
	
	public void setCidadeSede(String cidadeSede) {
		this.cidadeSede = cidadeSede;
	}
	
	public String getPaisSede() {
		return paisSede;
	}
	
	public void setPaisSede(String paisSede) {
		this.paisSede = paisSede;
	}

	
	public Evento getEvento() {
		return evento;
	}

	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
