import java.util.Comparator;

public class BookGenreComparator implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.genre.compareTo(book2.genre) < 0) {
			return -1;
		} else if (book1.genre.compareTo(book2.genre) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}