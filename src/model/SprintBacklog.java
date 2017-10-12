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
	private List<Task> listTasks;

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

    public List<Task> getTasks() {
        return listTasks;
    }

    public void addTask(Task task) {
        if (this.listTasks.contains(task))
            return;

        if (task == null) {
            return;
        } else {
            this.listTasks.add(task);
            task.setSprintBacklog(this);
        }
    }

	public void removeTask(Task task){
	    if (this.listTasks.contains(task)){
            task.setSprintBacklog(null);
            this.listTasks.remove(task);
	    }
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
