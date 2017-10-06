package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Team {
	
	private String function;
	private Professional professional;
	private Project project;
	
	/**
	 * Simple Constructor
	 */
	public Team() {

	}

	/**
	 * Constructor
	 * 
	 * @param function
	 * @param professional
	 * @param project
	 */
	public Team(String function, Professional professional, Project project) {
		super();
		this.setFunction(function);
		this.setProfessional(professional);
		this.setProject(project);
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Professional getProfessional() {
		return professional;
	}

	public void setProfessional(Professional professional) {
		this.professional = professional;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nTEAM\nFunction: " + this.getFunction() 
		+ "\nProfessional: " + this.getProfessional()
		+ "\nProject: " + this.getProfessional();
	}
	
}
