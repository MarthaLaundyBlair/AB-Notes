class Book{
	
   private double price;
   private String name;
   private String author;

   // constructor
   public Book(String name, String author,  double price){

	this.price = price;
	this.name = name;
	this.author = author;
	
	}
	
	// getters

	public double getPrice(){
	   
	   return this.price;
   }
   
   public String getName(){
	   
	   return this.name;
   }
   
   public String getAuthor(){
	   
	   return this.author;
   }
   
   // setters

	public void setPrice(double price){
	   
	   this.price  = price;
   }
   
   public void setName(String name){
	   
	   this.name = name;
   }
   
   public void setAuthor(String author){
	   
	   this.author  = author;
   }

	public String getBookDetails(){

		return "Name : " + this.name + ", Author : " + this.author + ", Price: " + this.price;
   }   
	
}

class BooksDemo{

	
   public static void main(String[] args){
	   
		
	Book b1 = new Book("Intoduction to Java", "Tom", 5.99);	
	
	Book b2 = new Book("Intoduction to Javascript", "Alex", 8.99);	
	
	Book b3 = new Book("Intoduction to Python", "Liv", 9.50);	
	
	//Book listOfBooks [] = new Book[3];
	Book [] listOfBooks = {b1, b2, b3};
	
	for (Book book: listOfBooks ){
			System.out.println(book.getBookDetails());
	}
   }
	

}



   