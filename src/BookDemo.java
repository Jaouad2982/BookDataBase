import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDemo {
	private static Book myBook = new Book();
	private static List<Book> myList = new ArrayList<Book>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String repeat = null;
		int option;
		do {
			printChoices();
			option = input.nextInt();
			Book myBook = new Book();
			if (option == 1) {
				populateBook(myBook);
				myList.add(myBook);
			} else if (option == 2) {
				for (Book myLivre : myList) {
					System.out.println(myLivre.toString());
					System.out.println("=================");

				}
				System.out.println("list of skus :");
				for (int i = 0; i < myList.size(); i++) {

					System.out.println("\n" + "Book :" + ((i + 1) + myList.get(i).getSku()));
				}
			} else if (option == 3) {
				System.out.println("You are searching for a book based on an Sku..");
				System.out.println("Enter your Sku");
				input.nextLine();
				String newSku = input.nextLine();
				int position = myList.indexOf(myBook.getSku());
				System.out.println("Your Sku exist, it matches.");
				System.out.println();
				System.out.println(myList.get(position + 1));

			} else if (option == 4) {
				System.out
						.println("You are searching a book based on the author's name!! " + "\n" + "Enter the author's name.");
				input.nextLine();
				String authorName = input.nextLine();
				int bookPosition = myList.indexOf(myBook.getAuthor());
				System.out.println();
				System.out.println("We found your book..  " + "\n"+ myList.get(bookPosition + 1));

			}
			System.out.println("Press 'Y' key to return to the main menu and choose a different option");
			repeat = input.next();
		} while (repeat.equalsIgnoreCase("y"));

	}

	public static void printChoices() {
		System.out.println("What would you like to do ?  " + "\n" + "Press 1 to add a book in the list");
		System.out.println("Press 2 check your list of books");
		System.out.println("Press 3 to search for a book by its SKU");
		System.out.println("Press 4 to search for a book by the author's name..");
	

	}

	public static Book populateBook(Book b) {

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