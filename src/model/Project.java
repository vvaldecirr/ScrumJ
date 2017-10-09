package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Project {
	
	private String title;	
	private String description;
	private ProductBacklog productBacklog;
	
	/**
	 * Simple Constructor
	 */
	public Project() {
		
	}

	/**
	 * Constructor
	 * 
	 * @param title
	 * @param description
	 * @throws Exception 
	 */
	public Project(String title, String description) {
		super();
		this.setTitle(title);
		this.setDescription(description);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public ProductBacklog getProductBacklog() {
		return productBacklog;
	}

	public void setProductBacklog(ProductBacklog productBacklog) {
		this.productBacklog = productBacklog;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nPROJECT\nT�tulo: " + this.getTitle() 
		+ "\nDescri��o: " + this.getDescription();
	}

}
