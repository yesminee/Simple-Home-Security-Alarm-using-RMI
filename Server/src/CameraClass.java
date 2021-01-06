package Server;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class CameraClass extends UnicastRemoteObject implements CameraInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  boolean imgcam1=false;
	private  boolean imgcam2=true;
	private  boolean imgcam3=true;
	private  boolean imgcam4=true;
	private  boolean tab[]=new boolean[]{imgcam1,imgcam2,imgcam3,imgcam4};
	public CameraClass() throws RemoteException{}
	public boolean[] ImageTransfer() throws RemoteException {
		
		return tab ;
	}
	public  boolean[] getTab() {
		return tab;
	}
}
