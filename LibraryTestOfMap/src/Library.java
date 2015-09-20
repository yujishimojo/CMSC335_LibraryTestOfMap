import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Library {

	// instantiate an Author and a Book objects
	public Map authors;
	public Map books;
	public ArrayList genreList;
	public ArrayList authorIndexList;

	//constructor
	Library() {
		authors = new HashMap<String,Author>();
		books = new HashMap<String,Book>();
		genreList = new ArrayList<Book>();
		authorIndexList = new ArrayList<Book>();
	}

	// search on book title
	// queryTitle is from user input.
	public Book searchTitle(String queryTitle) {
		return (Book) books.get(queryTitle);
	}

	private int indexBook;
	private ArrayList<Book> array = new ArrayList<Book>();
	private Book b;

	// search on book genre
	// queryGenre is from user input.
	public ArrayList<Book> searchGenre(String queryGenre) {
		array.clear();
		Iterator<Book> it = genreList.iterator();
		while (it.hasNext()) {
			b = it.next();
			indexBook = b.genre.indexOf(queryGenre);
			if (indexBook != -1){
				array.add(b);
			}
		}
		if (!array.isEmpty()) {
			return array;
		} else {
			return null;
		}
	}

	// search on author index
	// queryAuthorIndex is from user input.
	public ArrayList<Book> searchAuthorIndex(int queryAuthorIndex) {
		array.clear();
		Iterator<Book> it = authorIndexList.iterator();
		while (it.hasNext()) {
			b = it.next();
			if (queryAuthorIndex == b.authorIndex){
				array.add(b);
			}
		}
		if (!array.isEmpty()) {
			return array;
		} else {
			return null;
		}
	}
}