package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Benvenuto qui potrai registrarti");
		try {
			
			//chiedo i dati da inserire
			System.out.println("inserisci il tuo nome ");
			String nomeImput = scan.nextLine();
			System.out.println("inserisci il tuo cognome ");
			String cognomeImput = scan.nextLine();
			System.out.println("inserisci la tua email ");
			String emailImput = scan.nextLine();
			System.out.println("inserisci la tua password personale ");
			String passwordImput = scan.nextLine();
			System.out.println("inserisci la tua eta ");
			int etaImput = Integer.parseInt(scan.nextLine());
			//costruisco un oggetto utente
			Utente nuovoUtente = new Utente (nomeImput,cognomeImput,emailImput,passwordImput,etaImput);
			
			
			System.out.println("Grazie per la tua registrazione" + nuovoUtente.getNome());
		} catch (NumberFormatException e) {
			System.out.println("eta non valida");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("parametro non valido " + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("parametro nullo " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("ERRORE GENERICO ");
			e.printStackTrace();
		}
		
		
		
		scan.close();

	}

}
