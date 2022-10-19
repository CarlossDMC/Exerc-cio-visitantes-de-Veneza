package entities;

public class Visitante {
	private String nome;
	private Integer fone;
	private String cidade;
	private String sexo;
	private Integer nascimento;
	
	public Visitante(String nome, Integer fone, String cidade, String sexo, Integer nascimento) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.cidade = cidade;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	
	public Integer getNascimento() {
		return nascimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getFone() {
		return fone;
	}

	public void setFone(Integer fone) {
		this.fone = fone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}}
	

