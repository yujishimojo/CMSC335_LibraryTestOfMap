import java.util.Comparator;

public class BookAuthorIndexComparator implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.authorIndex.compareTo(book2.authorIndex) < 0) {
			return -1;
		} else if (book1.authorIndex.compareTo(book2.authorIndex) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}