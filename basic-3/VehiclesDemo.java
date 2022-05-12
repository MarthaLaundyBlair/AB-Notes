class Vehicle{
	
   private String model;
   private long mileage;
   private String manufacturer;
   private String owner;
   private int noPastOwners = 0;

   // constructor
   public Vehicle(String model, long mileage,  String manufacturer, String owner){

	this.model = model;
	this.mileage = mileage;
	this.manufacturer =  manufacturer;
	this.owner = owner;
	
	}
	
// constructor - method overloading
   public Vehicle(String model, long mileage,  String manufacturer, String owner, int noPastOwners){

	this.model = model;
	this.mileage = mileage;
	this.manufacturer =  manufacturer;
	this.owner = owner;
	this.noPastOwners = noPastOwners;
	
	}
	
	/////////////////////////////////////////////////////////////////////
	// getters

	public String getModel(){
	   
	   return this.model;
   }
   
   public Long getMileage(){
	   
	   return this.mileage;
   }
   
   public String getManufacturer(){
	   
	   return this.manufacturer;
   }
   
    public String getOwner(){
	   
	   return this.owner;
   }
   
   ////////////////////////////////////////////////////////////////////////////////
   // setters

	public void setModel(String model){
	   
	   this.model  = model;
   }
   
   public void setMileage(long mileage){
	   
	   this.mileage = mileage;
   }
   
   public void setManufacturer(String manufacturer){
	   
	   this.manufacturer  = manufacturer;
   }

	public void setOwner(String owner){
	   
	   this.owner  = owner;
   }
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public void getVehicleDetails(){

		System.out.println("Model : " + this.model + ", Mileage : " + this.mileage + ", Manufacturer: "
		+ this.manufacturer + ", Owner: " + this.owner + ", noPastOwner: " + this.noPastOwners );
		if (noPastOwners != 0){
			
			System.out.print( "Mileage Per Previous Owner: " + MilesPerOwner() );
		}
	}  
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	
	private double MilesPerOwner(){
			
			return (this.mileage / this.noPastOwners);

	}
	


}

class VehiclesDemo{

	
   public static void main(String[] args){
	   
		
	Vehicle v1 = new Vehicle("Car", 60000, "Ford", "Tim", 7);	
	v1.getVehicleDetails();
	}

}

   