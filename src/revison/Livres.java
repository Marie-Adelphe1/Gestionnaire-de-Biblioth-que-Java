package revison;

public class Livres {

	//Constructeurs
		
		public Livres() {
			 this.titre="inédit";
			 this.auteur="inconnu";
			 this.anEdition=000;
		}
		
		public Livres(String title, String autor) {
			 this.titre=title;
			 this.auteur=autor;
			 this.anEdition=000;
		}
		
		public Livres(String title, String autor, int year) {
			 this.titre=title;
			 this.auteur=autor;
			 this.anEdition=year;
		}
		
		public Livres(int year) {
			this.titre="inédit";
			 this.auteur="inconnu";
			 this.anEdition=year;
		}

		
		public Livres( Livres original) {
			this.titre=original.titre;
			this.auteur=original.auteur;
			this.anEdition=original.anEdition;
			
		}


	//Destructeur
		
		
		
	//Accesseurs
		
		public String getTitre() {
			return titre;
		}
		
		public String getAuteur() {
			return auteur;
		}
		
		public int getAnEdition() {
			return anEdition;
		}  
		
		
	//Mutateurs
		
		public void setTitre(String titre) {
			this.titre=titre;
		}
		
		public void setAuteur ( String auteur) {
			this.auteur=auteur;
		}
		
		public void setAnEdition(int anEdition) {
			this.anEdition=anEdition;     
		}
		
	
	
	//Attributs
	
		protected String titre;
		protected String auteur;
		protected int anEdition;
		
		
	//Méthodes
		public String afficher() {
		
				String texte="";
				texte+="Titre:           " + titre + "\n Auteur:          " + auteur + "\n Année d'edition: " + anEdition;
				return texte ;
			
		}
		
		
	

}
