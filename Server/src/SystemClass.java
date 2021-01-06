package Server;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemClass extends UnicastRemoteObject implements SystemInterface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id="1";
	int housenumber=45;
	String street="street nahli";
	String city="ariana";
	int poste=3333;
	Boolean alarmstatus=true;
	Date aujourdhui=new Date();
	SimpleDateFormat Dtef = new SimpleDateFormat("dd/MM/yyyy");
	private String[] ch =new String[] {id,Integer.toString(housenumber),street,city,Integer.toString(poste),Boolean.toString(alarmstatus),Dtef.format(aujourdhui)};
	public SystemClass() throws RemoteException{}
	public String[] AlertTransfer() throws RemoteException {
		return ch;
	}

}
