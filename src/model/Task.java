package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Task {
	
	private String description;
	private Integer priority;
	private String state;
	private Float progress;
	private UserStory userHistory;
	private Professional professional;
	private SprintBacklog sprintBacklog;
	
	/**
	 * Simple Constructor
	 */
	public Task() {

	}

	/**
	 * Constructor
	 * 
	 * @param description
	 * @param priority
	 * @param state
	 * @param progress
	 * @param userHistory
	 * @param professional
	 * @param sprintBacklog
	 */
	public Task(String description, Integer priority, String state, Float progress, UserStory userHistory,
			Professional professional, SprintBacklog sprintBacklog) {
		this.setDescription(description);
		this.setPriority(priority);
		this.setState(state);
		this.setProgress(progress);
		this.setUserHistory(userHistory);
		this.setProfessional(professional);
		this.setSprintBacklog(sprintBacklog);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Float getProgress() {
		return progress;
	}

	public void setProgress(Float progress) {
		this.progress = progress;
	}

	public UserStory getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(UserStory userHistory) {
		this.userHistory = userHistory;
	}

	public Professional getProfessional() {
		return professional;
	}

	public void setProfessional(Professional professional) {
		this.professional = professional;
	}

	public SprintBacklog getSprintBacklog() {
		return sprintBacklog;
	}

	public void setSprintBacklog(SprintBacklog sprintBacklog) {
		this.sprintBacklog = sprintBacklog;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	public String toString() {
		return "\n\nTASK\nDescrição: " + this.getDescription() 
		+ "\nPrioridade: " + this.getPriority()
		+ "\nEstado: " + this.getState()
		+ "\nProgresso: " + this.getProgress()
		+ "\nUserHistory: " + this.getUserHistory()
		+ "\nProfissional: " + this.getProfessional()
		+ "\nSprintBacklog: " + this.getSprintBacklog();
	}

}
