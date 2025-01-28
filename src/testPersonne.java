
public class testPersonne {
	public static void main(String[] args) {
		Personne P0 = new Personne();
		System.out.println(P0);
		Personne P1 = new Personne("Agostinelli", "Laurence");
		System.out.println(P1);
		System.out.println(P1.getNom());
		System.out.println(P1.getPrenom());
	}
}
