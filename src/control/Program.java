package control;

import model.Project;

public class Program {

	/**
	 * Método para testar o modelo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Project pj1 = new Project("ScrumJ", "Ferramenta para rápida implementação do método SCRUM em pequenos projetos.");
		
		System.out.println(pj1);
	}

}
