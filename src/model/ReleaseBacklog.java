package model;

import java.util.Date;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class ReleaseBacklog {
	
	private Date deadLine;
	private String avaliation;
	private ProductBacklog productBacklog;
	private Professional scrumMaster;
	
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
	 * @param productBacklog
	 * @param scrumMaster
	 */
	public ReleaseBacklog(Date deadLineDate, String avaliation, ProductBacklog productBacklog, Professional scrumMaster) {
		this.setDeadLine(deadLineDate);
		this.setAvaliationn(avaliation);
		this.setProductBacklog(productBacklog);
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

	public ProductBacklog getProductBacklog() {
		return productBacklog;
	}

	public void setProductBacklog(ProductBacklog productBacklog) {
		this.productBacklog = productBacklog;
	}

	public Professional getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Professional scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	public String toString() {
		return "\n\nRELEASEBACKLOG\nData limite: " + this.getDeadLine() 
		+ "\nAvaliação: " + this.getAvaliationn()
		+ "\nProductBacklog: " + this.getProductBacklog()
		+ "\nScrumMaster: " + this.getScrumMaster();
	}

}
