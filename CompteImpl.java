import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompteImpl extends UnicastRemoteObject implements ICompte
{	public double montant;
	public Banque b;
	public CompteImpl() throws RemoteException {
		super();
		}
	
	public String etatCompte() throws RemoteException {
		if (montant>0)
			return "Compte en débit";
		else if(montant<0)
			return "Compte en crédit";
		else
			return("Débit et Crédit égaux");
	}
	public void ajouterSurCompte(double x) throws RemoteException {
		montant+=x;
	}
	public void enleverSurCompte(double x )throws RemoteException {
		montant-=x;
	}
	public void transfertEntreCompte(ICompte c, double x) throws RemoteException {
		montant -= x;
		c.ajouterSurCompte(x);
	}
	public double getValeurCompte() throws RemoteException {
		return montant;
	}
	public void setValeurCompte(double x) throws RemoteException {
		montant = x;
	}
	public void creerCompte() throws RemoteException {
		montant =0;
		b.addCompte(this);
	}
}
