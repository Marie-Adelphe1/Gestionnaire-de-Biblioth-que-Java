package revison;
import java.util.ArrayList;
import java.util.List;

public class Bibliothèque {
	  //Constructeurs
			public Bibliothèque() {
		        this.name = "Bibliothèque";
		        this.Livres = new ArrayList<>();
		    }
		
		    public Bibliothèque(String name) {
		        this.name = name;
		        this.Livres = new ArrayList<>();
		    }

			
		//Destructeur
			
			
			
		//Accesseurs
			
			public int getNbreLivre() {
				return nbreLivre;
			}  
			
			public String getName() {
				return name;
			}
			
			
		//Mutateurs
			
			public void setNbreLivre(int nbreLivre) {
				this.nbreLivre=Math.abs(nbreLivre);
			}
			
			public void setName(String name) {
				this.name=name;
			}
			
			
		
		//Attributs
			protected String name ;
			protected int nbreLivre;
			protected List<Livres> Livres;
					
		//Méthodes
			
			public String afficherBiblio() {
				
				StringBuilder texte = new StringBuilder("Nom de la bibliothèque: " + name + "\nNombre de livres: " + Livres.size() + "\nLivres: \n");
		        for (Livres livre : Livres) {
		            texte.append(livre.afficher()).append("\n\n\n\n");
		        }
		        return texte.toString();
			
			}
			
			
			public void ajouterLivre(Livres livre) {
				Livres.add(livre);
				nbreLivre+=1;
				
			}
			
			public void supprimerLivre(Livres livre) {
				if(Livres.contains(livre)) {
				Livres.remove(livre);
				nbreLivre-=1;}
				else {
					System.out.println("le Livre que vous souhaitez supprimer semble ne pas appartenir à la bibliothèque");
				}
				
			}
			
			public void afficherParAuteurs(String auteur) {
				
			
		        for (Livres livre : Livres) {
		           if(((revison.Livres) Livres).getAuteur().equals(auteur)) 
		           		{System.out.println(livre.afficher());
		           		}
		        }
		        
			
		}
			
			
}
