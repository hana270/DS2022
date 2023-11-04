package ds2022;

public class JeuMulti extends Jeu{

private int nbjoueur;

public JeuMulti(String nom, int annee, int ageMin, Editeur edit,int n) {
	super(nom,annee,ageMin,edit);
	this.nbjoueur=n;
}
public int getNbJoueur() {
	return this.nbjoueur;
}
@Override
public String toString() {
	return super.toString()+"Nombre de joueur ="+this.nbjoueur;
}

public void decrire() {
	System.out.println(this.toString());
}
}
