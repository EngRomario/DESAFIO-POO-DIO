package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria() {}
	
	public Mentoria(String titulo, String descricao, LocalDate data ) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		String mentoria = "Título: " + getTitulo();
		mentoria += "\nDescrição: " + getDescricao();
		mentoria += "\nData: " + data;
		mentoria += "\n-----------------------------------\n";
		return mentoria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
}
