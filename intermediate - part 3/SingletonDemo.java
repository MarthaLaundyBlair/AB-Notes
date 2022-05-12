class SingletonDemo{
	
	
	public static void main(String[] args){
	
		
		//Service s1 = new Service();
		
		
		Service s1 = Service.getInstance();
		
		System.out.println(s1.hashCode());
				
		Service s2 = Service.getInstance();
		
		System.out.println(s2.hashCode());
	
	}
	
	

}