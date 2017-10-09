package model;

import java.util.Date;
import java.util.List;

/**
 * Model Class
 *
 * @author Valdecir
 *
 */
public class ReleaseBacklog {

	private Date deadLine;
	private String avaliation;
	private Professional productOwner;
	private List<UserStory> userStories;
	private List<SprintBacklog> sprintBacklogs;

	/**
	 * Simple Constructor
	 */
	public ReleaseBacklog() {

	}

	/**
	 * Constructor
	 *
	 * @param deadLineDate
	 * @param avaliation
	 * @param scrumMaster
	 */
	public ReleaseBacklog(Date deadLineDate, String avaliation, Professional productOwner) {
		super();
		this.setDeadLine(deadLineDate);
		this.setAvaliationn(avaliation);
		this.setProductOwner(productOwner);
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getAvaliationn() {
		return avaliation;
	}

	public void setAvaliationn(String avaliation) {
		this.avaliation = avaliation;
	}

	public Professional getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Professional productOwner) {
		this.productOwner = productOwner;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

	public void addUserStory(UserStory userStory) {
		this.userStories.add(userStory);
	}

    public void removeUserStory(UserStory userStory) {
        this.userStories.remove(userStory);
    }

	public List<SprintBacklog> getSprintBacklogs() {
		return sprintBacklogs;
	}

	public void setSprintBacklogs(List<SprintBacklog> sprintBacklogs) {
		this.sprintBacklogs = sprintBacklogs;
	}

	public void addSprintBacklog(SprintBacklog sprintBacklog) {
		this.sprintBacklogs.add(sprintBacklog);
	}

    public void removeUserStory(SprintBacklog sprintBacklog) {
        this.sprintBacklogs.remove(sprintBacklog);
    }

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nRELEASEBACKLOG\nData limite: " + this.getDeadLine()
				+ "\nAvalia��o: " + this.getAvaliationn()
				+ "\nProductOwner: " + this.getProductOwner();
	}

}
