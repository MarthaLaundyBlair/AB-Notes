class Quadratic{
	
   private double coefficientA;
   private double coefficientB;
   private double coefficientC;
   private boolean realSolutions = true;

   // constructor
   public Quadratic(double coefficientA, double coefficientB,  double coefficientC){

	this.coefficientA = coefficientA;
	this.coefficientB = coefficientB;
	this.coefficientC = coefficientC;
	
	}
	
	// constructor -- method overloading
	public Quadratic(double coefficientB,  double coefficientC){

	this.coefficientB = coefficientB;
	this.coefficientC = coefficientC;
	
	}
	
	//////////////////////////////////////////
	
	// private boolean realSolutions(){
		
		double d = coefficientB*coefficientB - 4*coefficientA*coefficientC;
		if (d >= 0){
			return true;
		}
		else{
			return false;
		}
	
	}
	