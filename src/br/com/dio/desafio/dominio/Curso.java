package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso() {}
	
	public Curso(String titulo, String descricao, int cargaHoraria ) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		
		String curso = "Título: " + getTitulo();
		curso += "\nDescrição: " + getDescricao();
		curso += "\nCarga Horária: " + cargaHoraria;
		curso += "\n----------------------------------\n";
		return curso;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
}
