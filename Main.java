public class Main{
	public static void main(String args[]){
		
		// Set properties using setter methods
		Book book1=new Book();		
		book1.setTitle("The Catcher in the Rye");
		book1.setItemID("B001");
		book1.setAuthor("J.D. Salinger");
		book1.setNumPages(240);
		
		// Create 5 Book objects
		Book book2=new Book("To Kill a Mockingbird ","B002","Harper Lee",281);
		Book book3=new Book("1984","B003","George Orwell",328);
		Book book4=new Book("Pride and Prejudice","Boo4","Jane Austen",432);
		Book book5=new Book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		System.out.println(".................Book Details..................");
		System.out.println();
		book1.displayItemDetails();
		System.out.println();
		book2.displayItemDetails();
		System.out.println();
		book3.displayItemDetails();
		System.out.println();
		book4.displayItemDetails();
		System.out.println();
		book5.displayItemDetails();
		System.out.println();

		// Set properties using setter methods
		Magazine magazine1=new Magazine();		
		magazine1.setTitle("National Geographic");
		magazine1.setItemID("M001");
		magazine1.setIssueDate("August 2023");
		magazine1.setPublisher("National Geographic Society");
		
		// Create 5 Magazine objects
		Magazine magazine2=new Magazine("Time","M002","September 2023","Time USA, LLC");
		Magazine magazine3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine magazine4=new Magazine("Vogue","M004","July 2023","Condé Nast");
		Magazine magazine5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		System.out.println(".................Magazine Details..................");
		System.out.println();
		magazine1.displayItemDetails();
		System.out.println();
		magazine2.displayItemDetails();
		System.out.println();
		magazine3.displayItemDetails();
		System.out.println();
		magazine4.displayItemDetails();
		System.out.println();
		magazine5.displayItemDetails();
		System.out.println();

		// Set properties using setter methods
		LibraryMember member1=new LibraryMember();
		member1.setMemberID("L001");
		member1.setName("John Doe");
		
		// Create 5 LibraryMember objects
		LibraryMember member2=new LibraryMember("L002","John Doe");
		LibraryMember member3=new LibraryMember("L003","John Doe");
		LibraryMember member4=new LibraryMember("L004","John Doe");
		LibraryMember member5=new LibraryMember("L005","John Doe");

		System.out.println(".................Magazine Details..................");
		System.out.println();
		member1.displayMemberDetails();
		System.out.println();
		member2.displayMemberDetails();
		System.out.println();
		member3.displayMemberDetails();
		System.out.println();
		member4.displayMemberDetails();
		System.out.println();
		member5.displayMemberDetails();
		System.out.println();


	}
}