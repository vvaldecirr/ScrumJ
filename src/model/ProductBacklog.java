package model;

import java.util.Date;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class ProductBacklog {
	
	private Date deadLine;
	private Project project;
	private Professional productOwner;
	
	/**
	 * Simple Constructor
	 */
	public ProductBacklog() {
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param deadLine
	 * @param project
	 * @param productOwner
	 */
	public ProductBacklog(Date deadLine, Project project, Professional productOwner) {
		super();
		this.setDeadLine(deadLine);
		this.setProject(project);
		this.setProductOwner(productOwner);
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Professional getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Professional productOwner) {
		this.productOwner = productOwner;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nPRODUCTBACKLOG\nData: " + this.getDeadLine() 
		+ "\nProjeto: " + this.getProject()
		+ "\nProductOwner: " + this.getProductOwner();
	}

}
