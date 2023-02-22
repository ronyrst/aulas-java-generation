package exercicios_classe6;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Java - Do Zero ao Super Sayajin 4", 20, "Kuririn", "Java para Backend", "Iniciante");
		
		curso1.visualizar();
		
		Curso curso2 = new Curso("Javascript Senior", 80, "Rafael/Clauber", "Javascript para Frontend", "Avançado");
		
		curso2.visualizar();

	}

}
