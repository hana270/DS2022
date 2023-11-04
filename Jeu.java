package ds2022;

public class Jeu {
private static long count=0;
private  long id;
private String nom;
private int annee;
private int nbtotal;
private int agemin;

private Editeur editeur;

public Jeu(Editeur e) {
	count++;
	this.id=count;
	this.nbtotal++;
	this.editeur=e;

}
public Jeu(String nom, int annee, int ageMin, Editeur edit) {
	this(edit);
	 this.nom = nom;
     this.annee = annee;
     this.agemin= ageMin;
}
public Editeur getEditeur() {
    return editeur;
}
@Override
public String toString() {
	return "id ="+this.id+" name ="+this.nom+" Année d'édition= "+this.annee+" Age minimum ="+this.agemin+" Editeur"+this.editeur;
}

public void decrire() {
	System.out.println(this.toString());
}
}
