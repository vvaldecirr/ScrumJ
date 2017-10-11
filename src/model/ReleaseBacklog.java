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
	private List<UserStory> userstories;
	private List<SprintBacklog> sprintbacklogs;

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

	public List<UserStory> getUserstories() {
		return userstories;
	}

	public void addUserStory(UserStory userStory) {
        if (this.userstories.contains(userStory))
            return;

        if (userStory == null) {
            return;
        } else {
            this.userstories.add(userStory);
            userStory.setReleaseBacklog(this);
        }
	}

    public void removeUserStory(UserStory userStory) {
        this.userstories.remove(userStory);
    }

	public List<SprintBacklog> getSprintbacklogs() {
		return sprintbacklogs;
	}

	public void addSprintBacklog(SprintBacklog sprintBacklog) {
        if (this.sprintbacklogs.contains(sprintBacklog))
            return;

        if (sprintBacklog == null) {
            return;
        } else {
            this.sprintbacklogs.add(sprintBacklog);
            sprintBacklog.setReleaseBacklog(this);
        }
	}

    public void removeUserStory(SprintBacklog sprintBacklog) {
        this.sprintbacklogs.remove(sprintBacklog);
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
