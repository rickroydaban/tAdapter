package data;

public enum TaxiStatus {
  vacant,     //the taxi has no passenger onboard
  requested,  //the taxi has no passenger onboard but is on its way to fetch a requesting passenger
  occupied,   //the taxi has a passenger onboard
  unavailable, //the taxi driver may have been taking a break or personal necessities
  disconnected //the taxi is no longer connected to the server 
}
