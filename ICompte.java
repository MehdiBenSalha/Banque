import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICompte extends Remote {
		public String etatCompte() throws RemoteException ;
		public void ajouterSurCompte(double x) throws RemoteException ;
		public void enleverSurCompte(double x )throws RemoteException ;
		public void transfertEntreCompte(ICompte c, double x) throws RemoteException ;
		public double getValeurCompte() throws RemoteException ;
		public void setValeurCompte(double x) throws RemoteException ;
		public void creerCompte() throws RemoteException ;	
		
}
