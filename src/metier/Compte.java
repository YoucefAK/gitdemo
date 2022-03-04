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
		System.out.println("Le solde est =" + solde);
	}
	public void retirer (float mt) {
		solde=solde-mt;
		System.out.println("Le solde est =" + solde);

	}

	public String toString() {
		return ("Code="+code+"Solde "+solde);

	}

}