package model;

import java.util.List;

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
	private ReleaseBacklog releaseBacklog;
	private List<Task> tasks;

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
		super();
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

	public ReleaseBacklog getReleaseBacklog() {
		return releaseBacklog;
	}

	public void setReleaseBacklog(ReleaseBacklog releaseBacklog) {
		this.releaseBacklog = releaseBacklog;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void removeTask(Task task) {
		this.tasks.remove(task);
	}


	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nUSER HISTORY\nPrioridade: " + this.getPriority()
				+ "\nRequisito: " + this.getRequirement()
				+ "\nProductBacklog: " + this.getProductBacklog()
				+ "\nReleaseBacklog: " + this.getReleaseBacklog();
	}

}
