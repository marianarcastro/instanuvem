package instanuvem.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Imagem {
	
	@Autowired
	private Integer id;
	
	@Autowired
	private String url;
	
	@Autowired
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
