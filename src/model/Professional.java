package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Professional {
	
	private String email;
	private String unicPass;
	
	/**
	 * Simple Constructor
	 */
	public Professional() {

	}
	
	/**
	 * Constructor
	 * 
	 * @param email
	 * @param unicPass
	 */
	public Professional(String email, String unicPass) {
		super();
		this.email		= email;
		this.unicPass	= unicPass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUnicPass() {
		return unicPass;
	}

	public void setUnicPass(String unicPass) {
		this.unicPass = unicPass;
	}

	/**
	 * Método que retorna uma String de descrição do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nPROFESSIONAL\nEmail: " + this.getEmail() 
		+ "\nSenha: " + this.getUnicPass();
	}

}
