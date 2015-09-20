import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.price.compareTo(book2.price) < 0) {
			return -1;
		} else if (book1.price.compareTo(book2.price) == 0) {
			return 0;
 		} else {
			return 1;
		}
	}
}