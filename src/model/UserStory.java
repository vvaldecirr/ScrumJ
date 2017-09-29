package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class UserStory {
	
	private Integer priority;
	private String requirement;
	private ProductBacklog productBacklog;
	
	/**
	 * Simple Constructor
	 */
	public UserStory() {

	}
	
	/**
	 * Constructor
	 * 
	 * @param priority
	 * @param requirement
	 * @param productBacklog
	 */
	public UserStory(Integer priority, String requirement, ProductBacklog productBacklog) {
		this.setPriority(priority);
		this.setRequirement(requirement);
		this.setProductBacklog(productBacklog);
	}
	
	public Integer getPriority() {
		return priority;
	}
	
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public ProductBacklog getProductBacklog() {
		return productBacklog;
	}
	
	public void setProductBacklog(ProductBacklog productBacklog) {
		this.productBacklog = productBacklog;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	public String toString() {
		return "\n\nUSER HISTORY\nPrioridade: " + this.getPriority() 
		+ "\nRequisito: " + this.getRequirement()
		+ "\nProductBacklog: " + this.getProductBacklog();
	}

}
