package ds2022;

public class JeuPrincipal {

	public static void main(String[] args) {
		Editeur ed1=new Editeur(123, "Ubisoft", "Canada");
		Editeur ed2=new Editeur(133, "Vivendi Universal", "France");

		Jeu tab[]=new Jeu[3];
		Jeu j1=new Jeu("Watch dogs", 2020, 6, ed1);
		Jeu j2=new Jeu("WoW", 2019,12, ed2);
		JeuMulti j3=new JeuMulti("WoW", 2018,12,ed2, 2);
		
		tab[0]=j1;
		tab[1]=j2;
		tab[2]=j3;
		
		System.out.println("*****************************les jeux édités par l’éditeur nommé Vivendi Universal :***********************");
		for (int i = 0; i < tab.length; i++) {
		    if (tab[i].getEditeur().getnomEdit().equals("Vivendi Universal")) {
		    	tab[i].decrire();;
		    }

		}

		
		System.out.println("*****************************Nombre de Joueur des jeux multiple :***********************");
		for(int i=0;i<tab.length;i++) {
			if(tab[i] instanceof JeuMulti) {
				int a= ((JeuMulti) tab[i]).getNbJoueur();
				System.out.println(a);
						
			}
		}
		
	}

}
