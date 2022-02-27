import java.rmi.Naming;

public class Server {
public static void main(String [] args) {
	try {
		System.out.println( "Serveur : Construction de l'implementation ");
		CompteImpl c= new CompteImpl();
		Banque b = new Banque("Banque1");
		System.out.println("Objet lié dans le RMIregistry");
		Naming.rebind("rmi://localhost:1099/MyBanque", b);
		Naming.rebind("rmi://localhost:1099/MyCompte", c);
		System.out.println("Attente des invocations des clients �");

	}
	catch (Exception e) {
		System.out.println("Erreur de liaison de l'objet");
		System.out.println(e.toString());
	}
}
}
