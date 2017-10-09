package model;

import java.util.List;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class SprintBacklog {

	private String functionality;
	private ReleaseBacklog releaseBacklog;
	private List<Task> tasks;
	
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

	public void addTask(Task task){
		this.tasks.add(task);
	}

	public void removeTask(Task task){
		this.tasks.remove(task);
	}

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
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
