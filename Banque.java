import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Banque extends UnicastRemoteObject implements IBanque  {
	private String nomBanque;
	private List<ICompte> l ;
	
	public Banque(String nom) throws RemoteException
	{
		super();
		nomBanque = nom;
		l =new ArrayList<ICompte>();	
	}
	
	public void addCompte(ICompte c) throws RemoteException
	{
		l.add(c);		
	}
}