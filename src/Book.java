
import java.text.NumberFormat;

public class Book {

	private String title;
	private String author;
	private String description;
	private double price;
	private String Sku;

	public Book() {

		title = " Notitle";
		author = " noNameYet";
		description = " noDescription";
		price = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSku(String newSku) {
		Sku = newSku;
	}

	public String getSku() {
		return Sku;
	}

	public String currentPrices(double newPrice) {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		String priceTwo = defaultFormat.format(getPrice());
		return priceTwo;

	}

	public String toString() {
		return "title :" + title + " \n" + "name :" + author + " \n" + "description :" + description + " \n" + "price :"
				+ price;
	}

}