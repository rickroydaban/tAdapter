package actors;

import java.io.Serializable;

import data.TaxiStatus;

public class MyTaxi implements Serializable{

	private double taxiLat, taxiLng, clientLat, clientLng, desLat, desLng;
	private String companyNo, plateNo, bodyNo, ip, companyName, description, driverName, driverLicense;

	private data.TaxiStatus status;

	public MyTaxi(){
		//empty constructor
	}
	
	public MyTaxi(int pId, double pCurLat, double pCurLng, String pPlateNo, String pBodyNo, int pDriverId){
	  taxiLat=pCurLat;
	  taxiLng=pCurLng;
	  plateNo=pPlateNo;
	  bodyNo=pBodyNo;
	  status=TaxiStatus.vacant;
	}
	
	public MyTaxi(int pId, String pPlateNo, String pPassword, String pBodyNo, String pCompanyName){
	  plateNo=pPlateNo;
	  bodyNo=pBodyNo;
	  companyName=pCompanyName;
	}
	
	//GETTERS
	public double getCurLat(){
		return taxiLat;
	}
	public double getCurLng(){
		return taxiLng;
	}
	public double getClientLat(){
		return clientLat;
	}
	public double getClientLng(){
		return clientLng;
	}
	public double getDesLat(){
		return desLat;
	}
	public double getDesLng(){
		return desLng;
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
    public MyTaxi getTaxi(){
    	return this;
    }
    
    
	//SETTERS
    public void setIp(String pIp){
    	ip=pIp;
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
    public void setDestination(double pDesLat, double pDesLng){
    	desLat=pDesLat;
    	desLng=pDesLng;
    }
    public void setCurrentLocation(double pCurLat, double pCurLng){
    	taxiLat=pCurLat;
    	taxiLng=pCurLng;
    }
    public void setClientLocation(double pClientLat, double pClientLng){
    	clientLat=pClientLat;
    	clientLng=pClientLng;
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
