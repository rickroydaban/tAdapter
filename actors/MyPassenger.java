package actors;

import java.io.Serializable;

public class MyPassenger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
    int id;
    
	public double srcLat, srcLng, desLat, desLng;
	public String ip, name;
	
    //CONSTRUCTOR USED FOR THE SERVER APPLICATION
	public MyPassenger(int pId, double pSrcLat, double pSrcLng, double pDesLat, double pDesLng, String pName){
	  id=pId;
	  srcLat=pSrcLat;
	  srcLng=pSrcLng;
	  desLat=pDesLat;
	  desLng=pDesLng;
	  name=pName;
	}
	
	//CONSTRUCTOR USED FOR THE CLIENT APPLICATION
	public MyPassenger(double pSrcLat, double pSrcLng, double pDesLat, double pDesLng, String pName){
		  srcLat=pSrcLat;
		  srcLng=pSrcLng;
		  desLat=pDesLat;
		  desLng=pDesLng;
		  name=pName;
	}
	
	public double getSrcLat(){
		return srcLat;
	}

	public double getSrcLng(){
		return srcLng;
	}

	public double getDesLat(){
		return desLat;
	}

	public double getDesLng(){
		return desLng;
	}

	public String getClientName(){
		return name;
	}
	
    public void setIp(String pIp){
    	ip=pIp;
    }
    
    public String getIp(){
    	return ip;
    }
    
    
    public MyPassenger getPassenger(){
    	return this;
    }
}
