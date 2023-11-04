package ds2022;

public class Editeur {
	long code;
	String nomEdit;
	String paysEdit;
	
	public Editeur(long code, String nomEdit, String paysEdit) {
		this.code = code;
		this.nomEdit = nomEdit;
		this.paysEdit = paysEdit;
	}
public void setCode(long code) {
	this.code=code;
}
public long getCode() {
	return this.code;
}

public void setnomEdit(String nomEdit) {
	this.nomEdit=nomEdit;
}
public String getnomEdit() {
	return this.nomEdit;
}

public void setpaysEdit(String paysEdit) {
	this.paysEdit=paysEdit;
}
public String getpaysEdit() {
	return this.paysEdit;
}
@Override
public String toString() {
	return "Le code ="+this.code+",Nom editeur ="+this.nomEdit+",Pays editeur :"+this.paysEdit;
}

}
