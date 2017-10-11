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

	/**
	 * Método alterado para garantir que a visibilidade bidirecional seja íntegra
	 * @param productBacklog
	 */
	public void setProductBacklog(ProductBacklog productBacklog) {
//		this.productBacklog = productBacklog;
		
		//Se o objeto a ser setado for o mesmo, não fazer nada
		if (this.productBacklog == productBacklog)
			return;
		
		//Se estiver nulificando o atributo garantir a integridade
		if (productBacklog == null) {
			this.productBacklog.setProject(null);
			this.productBacklog = null;
		} else { //Se o objeto a ser setado não for o mesmo, substituir garantindo a integridade 
			if (this.productBacklog != null)
				this.productBacklog.setProject(null);
			
			this.productBacklog = productBacklog;
			productBacklog.setProject(this);
		}
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nPROJECT\nTítulo: " + this.getTitle() 
		+ "\nDescrição: " + this.getDescription()
		+ "\nProductBackLog: " + this.getProductBacklog();
	}

}
