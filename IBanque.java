import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBanque extends Remote {
	public void addCompte(ICompte c) throws RemoteException;
}
