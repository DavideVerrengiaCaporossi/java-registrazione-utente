package jana60;

public class Utente {
//attributi
	private String nome, email, password;
	private int eta;
	//costruttore
															      //qua si richiamano tute le eccezioni di ogni metodo per fargli gestire gli errori
	public Utente(String nome, String email, String password, int eta) throws IllegalArgumentException, NullPointerException {
		super();
		
		//richiama i metodi
		validaEmail (email);
		validaPassword(password);
		validaEta(eta);
		
		//metodo
		
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		validaEmail (email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		valutaPassword(password);
		this.password = password;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		valutaEta(eta);
		this.eta = eta;
	}
	
	private void validaEmail(String emailImput) throws IllegalArgumentException,NullPointerException { 
		if (emailImput == null) { 
			throw new IllegalArgumentException("email non valida");
		}
		if(email.contains("@")|| !email.contains(".")) 
		{
			//interrompi e solleva eccezioni
			throw new NullPointerException("email non valida deve contenere @ e .");
		
		}
	private void validaPassword(String passwordImput) throws IllegalArgumentException, NullPointerException {
		if(passwordImput == null) {
			throw new NullPointerException("password non valida");
		}
		if(passwordImput.length() > 8 && passwordImput.length() < 12) {
			throw new IllegalArgumentException("password non valida deve contenere dagli 8 ai 12 caratteri");
		}
			
		}
	}
	  public void validaEta() throws Exception {
	        if (eta<18)
	            throw new Exception("Devi avere più di 18 anni");
	    
	    }
}

	
