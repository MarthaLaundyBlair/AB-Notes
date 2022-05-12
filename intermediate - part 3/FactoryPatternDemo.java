class FactoryPatternDemo{

 
	public static void main(String[] args) throws Exception{

       //Customer c1 = new Customer(1,"Kishore");     
	   
	   Customer c1 = MyFactory.getCustomer();
	   
	   System.out.println(c1.hashCode());
	   
	   
	   Customer c2 = MyFactory.getCustomer();
	   
       System.out.println(c2.hashCode());
    
	}
    

}