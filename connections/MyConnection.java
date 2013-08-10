package connections;

public class MyConnection {
  private String serverIp;
  private int serverPort;
  private int taxiPort;
	
  public MyConnection(){
	  serverIp = "";
	  serverPort = 8000;
	  taxiPort = 8888;
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
}
