import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.title.compareTo(book2.title) < 0) {
			return -1;
		} else if (book1.title.compareTo(book2.title) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}