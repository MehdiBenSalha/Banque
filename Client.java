import java.rmi.Naming;
import java.util.Scanner;

public class Client {
	public static void main (String [] args)
	{
	try{
	IBanque b = (IBanque)Naming.lookup("rmi://localhost:1099/MyBanque");
	ICompte c = (ICompte)Naming.lookup("rmi://localhost:1099/MyCompte");
	Scanner sc = new Scanner(System.in);
	b.addCompte(c);
	c.setValeurCompte(5000);
	System.out.println("montant du compte Initialisé "+ c.getValeurCompte());
	System.out.println("Operation1 : Ajouter Solde ");
	double x = sc.nextDouble();
	c.ajouterSurCompte(x);

	System.out.println("Operation1 : Enlever Solde ");
	double y =sc.nextDouble();
	c.enleverSurCompte(y);
	
	System.out.println( "Montant dans le Compte: " + c.getValeurCompte());
	System.out.println( "Etat du compte: " +c.etatCompte());   }

	catch (Exception e){
	System.out.println ("Erreur d'accés à l'objet distant.");
	System.out.println (e.toString());
	}
	}
}
