package week2.day1;

public class Library {

	
		public String addBook (String bookTitle) {
         System.out.println("Book added successfully");
         return (bookTitle);
	}
		public void issueBook() {
			System.out.println("Book Issued successfully");
			
		}
		public static void main(String[] args) {
			Library obj = new Library();
			obj.addBook("bookOSHO");
			obj. issueBook();
		
		}
 
}
