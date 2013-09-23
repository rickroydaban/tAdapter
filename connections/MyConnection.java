package connections;

public class MyConnection {
  private String serverIp,dbUrl;
  private int serverPort, taxiPort, passengerPort;
	
  public MyConnection(){
	  serverIp = "";
	  serverPort = 7000;
	  taxiPort = 8000;
	  passengerPort = 9000;
	  dbUrl = "http://transphone.freetzi.com";
  }
  
  public String getDBUrl(){
  	return dbUrl;
  }
  
  public void setServerIp(String pIp){
	  serverIp = pIp;
  }
  
  public String getServerIp(){
	  return serverIp;
  }
  
  public int getServerPort(){
	  return serverPort;
  }
  
  public int getTaxiPort(){
	  return taxiPort;
  }
  
  public int getPassengerPort(){
	  return passengerPort;
  }
}
