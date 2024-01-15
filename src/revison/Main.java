package revison;

public class Main {
    public static void main(String[] args) {
        Livres livre1 = new Livres("Une vie pour autrui", "Marie-Adelphe AGUESSY", 2024);
        Livres livre2 = new Livres("Ne tirez pas sur l'oiseau moqueur", "Harper Lee", 1960);
        Livres livre3 = new Livres(1960);

        Bibliothèque bibliothèque = new Bibliothèque("Ma Bibliothèque");
        bibliothèque.ajouterLivre(livre1);
        bibliothèque.ajouterLivre(livre2);
        bibliothèque.ajouterLivre(livre3);
        
        

        System.out.println(bibliothèque.afficherBiblio());
        
        bibliothèque.supprimerLivre(livre3);
        System.out.println(bibliothèque.afficherBiblio());
    }
}