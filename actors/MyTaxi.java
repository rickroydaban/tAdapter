package actors;

import java.io.Serializable;
import data.TaxiStatus;

public class MyTaxi implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9165214409919118757L;
	private double curLat, curLng, prevLat, prevLng;
	private String plateNo, bodyNo, companyNo, companyName, driverName, description, ip, passengerIp;
	private TaxiStatus status;
	
	public MyTaxi(){
	}
	
	//GETTERS
	public double getCurLat(){
		return curLat;
	}
	public double getCurLng(){
		return curLng;
	}
	public double getPrevLat(){
		return prevLat;
	}
	public double getPrevLng(){
		return prevLng;
	}
	public String getPlateNumber(){
		return plateNo;
	}
	public String getBodyNumber(){
		return bodyNo;
	}
	public TaxiStatus getStatus(){
		return status;
	}
	public String getIP(){
		return ip;
	}
	public String getPassengerIP(){
		return passengerIp;
	}
	public String getDescription(){
		return description;
	}
	public String getCompanyName(){
		return companyName;
	}
	public String getCompanyNumber(){
		return companyNo;
	}
	public String getDriverName(){
		return driverName;
	}

	
	//SETTERS
    public void setIp(String pIp){
    	ip=pIp;
    }
    public void setPassengerIp(String pPassengerIp){
    	passengerIp=pPassengerIp;
    }
    public void setPlateNumber(String pPlateNo){
    	plateNo=pPlateNo;
    }
    public void setBodyNumber(String pBodyNo){
    	bodyNo=pBodyNo;
    }
    public void setStatus(TaxiStatus pStatus){
    	status=pStatus;
    }
    public void setDescription(String pDescription){
    	description = pDescription;
    }
    public void setCurrentLocation(double pCurLat, double pCurLng){
    	prevLat = curLat;
    	prevLng = curLng;
    	
    	curLat=pCurLat;
    	curLng=pCurLng;
    }

    public void setCompanyName(String pCompName){
    	companyName=pCompName;
    }
    public void setCompanyNumber(String pCompNo){
    	companyNo=pCompNo;
    }
    public void setDriverName(String pDriverName){
    	driverName=pDriverName;
    }
}
