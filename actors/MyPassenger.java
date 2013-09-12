package actors;

import java.io.Serializable;

public class MyPassenger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private double curLat, curLng, desLat, desLng;
	private String ip, passengerName;
	
	//GETTERS
	public double getCurLat(){
		return curLat;
	}
	public double getCurLng(){
		return curLng;
	}
	public double getDesLat(){
		return desLat;
	}
	public double getDesLng(){
		return desLng;
	}
	public String getIp(){
    	return ip;
    }
	public String getPassengerName(){
		return passengerName;
	}

    
    //SETTERS
    public void setCurrentLocation(double pCurLat, double pCurLng){
    	curLat=pCurLat;
    	curLng=pCurLng;
    }
    public void setDestinationLocation(double pDesLat, double pDesLng){
    	desLat=pDesLat;
    	desLng=pDesLng;
    }
    public void setIp(String pIp){
    	ip = pIp;
    }
    public void setPassengerName(String pPassengerName){
		passengerName = pPassengerName;
	}
}
