package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class SprintBacklog {

	private String functionality;
	private ReleaseBacklog releaseBacklog;
	
	/**
	 * Simple Constructor
	 */
	public SprintBacklog() {

	}

	/**
	 * Constructor
	 * 
	 * @param functionality
	 * @param releaseBacklog
	 */
	public SprintBacklog(String functionality, ReleaseBacklog releaseBacklog) {
		super();
		this.setFunctionality(functionality);
		this.setReleaseBacklog(releaseBacklog);
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public ReleaseBacklog getReleaseBacklog() {
		return releaseBacklog;
	}

	public void setReleaseBacklog(ReleaseBacklog releaseBacklog) {
		this.releaseBacklog = releaseBacklog;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nSPRINTBACKLOG\nFuncionalidade: " + this.getFunctionality() 
		+ "\nReleaseBacklog: " + this.getReleaseBacklog();
	}

}
