package jana60;

public class BookStore {
	
	public static void main(String[] args) {
		//titolo
		String titolo = "9 algoritmi che hanno cambiato il futuro";
		//formato
		Boolean copertinaFlessibile = true;
		Boolean formatoKindle = false;
		//data pubblicazione
		short giornoPubblicazione = 1;
		short mesePubblicazione = 11;
		int annoPubblicazione = 2012;
		//autore
		String autore = "John McCormick";
		//rating
		float rating = 4.8F;
		int numeroVoti = 23;
		
		//descrizione
		String descrizione = "Un libro che parla di come alcuni algoritmi, descritti nella loro semplicità, hanno cambiato la vita di tutti i giorni.";
		
		//prezzo
		double prezzoConsigliato = 18.00;
		double sconto = 0.05;
		double prezzoFinale = prezzoConsigliato - (prezzoConsigliato * sconto);
		
		//ISBN
		String isbn = "355-9900433323";
		
		//dimensioni
		float altezza = 21.0F;
		float lunghezza = 13.7F;
		float profondita = 1.7F;
		
		//stampo tutto
		System.out.println("Titolo: " + titolo);
		System.out.println("Copertina flessibile: " + copertinaFlessibile);
		System.out.println(formatoKindle);
		System.out.print("data di pubblicazione: " + giornoPubblicazione + "/");    //il print senza ln mi stampa senza andare a capo
		System.out.print(mesePubblicazione + "/");
		System.out.println(annoPubblicazione);
		System.out.println("autore: " + autore);
		System.out.println("rating: " + rating);
		System.out.println("numero voti: " + numeroVoti);
		System.out.println("descrizione: " + descrizione);
		System.out.println(prezzoFinale);
		System.out.println(prezzoConsigliato);
		System.out.println("sconto del " + sconto + "%");
		System.out.println("Codice univoco: " + isbn);
		System.out.print("Dimensioni: " + altezza + " * ");
		System.out.print(lunghezza + " * ");
		System.out.println(profondita + "cm");
		
		
	}

}
