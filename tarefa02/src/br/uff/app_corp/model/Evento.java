package br.uff.app_corp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "eventoId")
	private int eventoId;
	@Column (name = "nome")
	private String nome;
	@Column (name = "sigla")
	private String sigla;
	@Column (name = "areaConcentracao")
	private String areaConcentracao;
	@Column (name = "instituicaoOrganizadora")
	private String instituicaoOrganizadora;
	@OneToMany(mappedBy="eventoId")
	private List<Edicao> edicoes;
	
	public Evento() {
	}

	public Evento(int eventoId) {
		super();
		this.eventoId = eventoId;
	}

	public Evento(String nome, String sigla, String areaConcentracao, String instituicaoOrganizadora,
			List<Edicao> edicoes) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.areaConcentracao = areaConcentracao;
		this.instituicaoOrganizadora = instituicaoOrganizadora;
		this.edicoes = edicoes;
	}

	public Evento(int eventoId, String nome, String sigla, String areaConcentracao, String instituicaoOrganizadora,
			List<Edicao> edicoes) {
		super();
		this.eventoId = eventoId;
		this.nome = nome;
		this.sigla = sigla;
		this.areaConcentracao = areaConcentracao;
		this.instituicaoOrganizadora = instituicaoOrganizadora;
		this.edicoes = edicoes;
	}

	public int getEventoId() {
		return eventoId;
	}
	
	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getAreaConcentracao() {
		return areaConcentracao;
	}
	
	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}
	
	public String getInstituicaoOrganizadora() {
		return instituicaoOrganizadora;
	}

	public void setInstituicaoOrganizadora(String instituicaoOrganizadora) {
		this.instituicaoOrganizadora = instituicaoOrganizadora;
	}
	
	public List<Edicao> getEdicoes(){
		return edicoes;
	}

	public void setEdicoes(List<Edicao> edicoes) {
		this.edicoes = edicoes;
	}
	

}
