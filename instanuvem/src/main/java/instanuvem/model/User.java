package instanuvem.model;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	@Autowired
	private String nome;
	
	@Autowired
	private String email;
	
	@Autowired
	private String usuario;
	
	@Autowired
	private String senha;
	
	@Autowired
	private Imagem fotoPerfil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Imagem getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(Imagem fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

}
