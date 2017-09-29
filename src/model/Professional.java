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
	private String function;
	
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
	 * @param function
	 */
	public Professional(String email, String unicPass, String function) {
		this.email		= email;
		this.unicPass	= unicPass;
		this.function	= function;
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

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

}
