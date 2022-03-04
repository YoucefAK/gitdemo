package metier;


public class Compte{
	private int code;
	private float solde;
	public Compte(int c, float s) {
		code=c;
		solde=s;
			}

	public void verser(float mt) {
		solde=solde+mt;
	}
	public void retirer (float mt) {
		solde=solde-mt;
	}

	public String toString() {
		return ("Code="+code+"Solde "+solde);
	}

}