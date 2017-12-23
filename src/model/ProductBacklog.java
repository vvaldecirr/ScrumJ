package model;

import java.util.Date;
import java.util.List;

/**
 * Model Class
 *
 * @author Valdecir
 *
 */
public class ProductBacklog {

	private Date deadLine;
	private Project project;
	private Professional scrumMaster;
	private List<UserStory> listUserStories;

	/**
	 * Simple Constructor
	 */
	public ProductBacklog() {

	}

	/**
	 * Constructor
	 *
	 * @param deadLine
	 * @param project
	 * @param productOwner
	 */
	public ProductBacklog(Date deadLine, Project project, Professional scrumMaster) {
		super();
		this.setDeadLine(deadLine);
		this.setProject(project);
		this.setScrumMaster(scrumMaster);
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public Project getProject() {
		return project;
	}

	/**
	 * Método alterado para garantir que a visibilidade bidirecional seja íntegra
	 * @param productBacklog
	 */
	public void setProject(Project project) {
//		this.project = project;

		//Se o objeto a ser setado for o mesmo, não fazer nada
		if (this.project == project)
			return;

		//Se estiver nulificando o atributo garantir a integridade
		if (project == null) {
			this.project.setProductBacklog(null);
			this.project = null;
		} else { //Se o objeto a ser setado não for o mesmo, substituir garantindo a integridade
			if (this.project != null)
				this.project.setProductBacklog(null);

			this.project = project;
			project.setProductBacklog(this);
		}
	}

	public Professional getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Professional scrumMaster) {
		if (scrumMaster == null){
			return;
		}
		this.scrumMaster = scrumMaster;
	}

	public List<UserStory> getUserStories() {
		return listUserStories;
	}

    public void addUserStory(UserStory userStory) {
        if (this.listUserStories.contains(userStory))
            return;

        if (userStory == null) {
            return;
        } else {
            this.listUserStories.add(userStory);
            userStory.setProductBacklog(this);
        }
    }

	public void removeUserStory(UserStory userStory) {
        if (this.listUserStories.contains(userStory)){
            userStory.setProductBacklog(null);
            this.listUserStories.remove(userStory);
		}
	}

	/**
	 * Método que retorna uma String de descrição do objeto
	 */
	@Override
	public String toString() {
		return "\n\nPRODUCTBACKLOG\nData: " + this.getDeadLine()
				+ "\nProjeto: " + this.getProject().getTitle()
				+ "\nScrumMaster: " + this.getScrumMaster();
	}

}
