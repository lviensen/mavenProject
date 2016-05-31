package br.csi.modelo;

public class Cliente {

	private Long codigo;
	private String nome;
	private String ruaNroComp;
	private String bairro;
	private String cidade;
	
	
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getRuaNroComp() {
		return ruaNroComp;
	}
	public Long getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRuaNroComp(String ruaNroComp) {
		this.ruaNroComp = ruaNroComp;
	}
}
