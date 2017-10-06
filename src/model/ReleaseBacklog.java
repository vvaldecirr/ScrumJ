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
	private Professional scrumMaster;
	private List<UserStory> userStories;

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
	public ReleaseBacklog(Date deadLineDate, String avaliation, Professional scrumMaster) {
		super();
		this.setDeadLine(deadLineDate);
		this.setAvaliationn(avaliation);
		this.setScrumMaster(scrumMaster);
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

	public Professional getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Professional scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nRELEASEBACKLOG\nData limite: " + this.getDeadLine()
				+ "\nAvalia��o: " + this.getAvaliationn()
				+ "\nScrumMaster: " + this.getScrumMaster();
	}

}
