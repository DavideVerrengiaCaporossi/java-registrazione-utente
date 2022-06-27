package jana60;

//potremmo usate anche solo throws Exception PER QUESTO ESERCIZIO MA HO USATO I CONTROLLI CONSIGLIATI DA COSTANZA

public class Utente {
//attributi
	private String nome,cognome, email, password;
	private int eta;
	//costruttore
															      //qua si richiamano tutte le eccezioni di ogni metodo per fargli gestire gli errori
	public Utente(String nome,String cognome, String email, String password, int eta) throws IllegalArgumentException, NullPointerException, Exception {
		super();
		
		
		
		//metodo
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		
		//richiama i metodi nel costruttore e nei metodi set
				validaEmail (email);
				valutaPassword(password);
				valutaEta(eta);
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws IllegalArgumentException, NullPointerException{
		validaEmail (email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws IllegalArgumentException, NullPointerException {
		valutaPassword(password);
		this.password = password;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) throws Exception{
		valutaEta(eta);
		this.eta = eta;
	}
	
	private void validaEmail(String emailImput) throws IllegalArgumentException,NullPointerException { 
		if (emailImput == null) { 
			throw new IllegalArgumentException("email non valida");
		}
		if(!(email.contains("@"))|| !(email.contains("."))) 
		{
			//interrompi e solleva eccezioni
			throw new NullPointerException("email non valida deve contenere @ e .");
		
		}
	}
	private void valutaPassword(String passwordImput) throws IllegalArgumentException, NullPointerException {
		if(passwordImput == null) {
			throw new NullPointerException("password non valida");
		}
		if(passwordImput.length() > 8 && passwordImput.length() < 12) {
			throw new IllegalArgumentException("password non valida deve contenere dagli 8 ai 12 caratteri");
		}
			
		}
	
	  public void valutaEta(int etaImput) throws Exception {
	        if (etaImput<18)
	            throw new Exception("Devi avere più di 18 anni");
	    
	    }
}

	
