package model;

import java.util.Date;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class ProductBacklog {
	
	private Date date;
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
	 * @param date
	 * @param project
	 * @param productOwner
	 */
	public ProductBacklog(Date date, Project project, Professional productOwner) {
		super();
		this.setDate(date);
		this.setProject(project);
		this.setProductOwner(productOwner);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		return "\n\nPRODUCTBACKLOG\nData: " + this.getDate() 
		+ "\nProjeto: " + this.getProject()
		+ "\nProductOwner: " + this.getProductOwner();
	}

}
