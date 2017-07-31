// Jaouad Sarouti



import java.util.ArrayList;// import the arrayList
import java.util.List;// import the list 
import java.util.Scanner; // import the scanner

public class BookDemo {
	private static Book myBook = new Book();
	private static List<Book> myList = new ArrayList<Book>(); //create and initialize the array list

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String repeat = null;
		int option; 
		do { // a do while loop that will run as long as the condition is true
			printChoices(); // invoke the printChoices method
			option = input.nextInt();
			Book myBook = new Book();// create the book object 
			if (option == 1) {
				populateBook(myBook);
				myList.add(myBook); // add the object to the list
			} else if (option == 2) {
				for (Book myLivre : myList) { // for each loop, going through the myList. 
					System.out.println(myLivre.toString());
					System.out.println("=================");

				}
				System.out.println("list of skus :");
				for (int i = 0; i < myList.size(); i++) {

					System.out.println("\n" + "Book :" + ((i + 1) + myList.get(i).getSku()));
				}
			} else if (option == 3) {// option 4 search for a book based on a sku 
				System.out.println("You are searching for a book based on an Sku..");
				System.out.println("Enter your Sku");
				input.nextLine();
				String newSku = input.nextLine(); // input the sku we are searching for
				int position = myList.indexOf(myBook.getSku()); // find the position of the book based on the sku giving
				System.out.println("Your Sku exist, it matches.");
				System.out.println();
				System.out.println(myList.get(position + 1));

			} else if (option == 4) { // find the book based on the author
				System.out
						.println("You are searching a book based on the author's name!! " + "\n" + "Enter the author's name.");
				input.nextLine();
				String authorName = input.nextLine();// input the name we are searching for
				int bookPosition = myList.indexOf(myBook.getAuthor());// find the position of the book based on the author giving
				System.out.println();
				System.out.println("We found your book..  " + "\n"+ myList.get(bookPosition + 1));

			}
			System.out.println("Press 'Y' key to return to the main menu and choose a different option");
			repeat = input.next();
		} while (repeat.equalsIgnoreCase("y"));

	}

	public static void printChoices() {// 4 options to choose from
		System.out.println("What would you like to do ?  " + "\n" + "Press 1 to add a book in the list");
		System.out.println("Press 2 check your list of books");
		System.out.println("Press 3 to search for a book by its SKU");
		System.out.println("Press 4 to search for a book by the author's name..");
	

	}

	public static Book populateBook(Book b) { // create a  method will set the title,sku, name,price of the book object.
		// set these arguments using the the setters inside the Book classs

		Scanner s = new Scanner(System.in);
		System.out.println("What is title of the book ");
		String title = s.nextLine();
		System.out.println("What is the Sku of the book?");
		String Sku = s.nextLine();

		System.out.println("What is the name of the author ");
		String name = s.nextLine();

		System.out.println("What is the description of the book?");
		String description = s.nextLine();
		System.out.println("What is the price of the book?");
		double price = s.nextDouble();

		b.setTitle(title);
		b.setSku(Sku);
		b.setAuthor(name);
		b.setDescription(description);
		b.setPrice(price);
		return b;

	}

}
