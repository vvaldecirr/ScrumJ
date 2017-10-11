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
	private List<UserStory> listUserStories;
	private List<SprintBacklog> listSprintBacklogs;

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
		return listUserStories;
	}

	public void addUserStory(UserStory userStory) {
		this.listUserStories.add(userStory);
	}

    public void removeUserStory(UserStory userStory) {
        this.listUserStories.remove(userStory);
    }

	public List<SprintBacklog> getSprintBacklogs() {
		return listSprintBacklogs;
	}

	public void addSprintBacklog(SprintBacklog sprintBacklog) {
		this.listSprintBacklogs.add(sprintBacklog);
	}

    public void removeUserStory(SprintBacklog sprintBacklog) {
        this.listSprintBacklogs.remove(sprintBacklog);
    }

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nRELEASEBACKLOG\nData limite: " + this.getDeadLine()
				+ "\nAvaliação: " + this.getAvaliationn()
				+ "\nProductOwner: " + this.getProductOwner();
	}

}
