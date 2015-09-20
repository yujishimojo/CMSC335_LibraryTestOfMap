import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LibraryTestOfMap implements ActionListener, ItemListener {

	//declare Swing components as instance variables
	static Library library;
	static JFrame outputFrame;
	static JPanel panel1, panel2, panel3, panel4;
	static Container container;
	static JLabel label1, label2, label3, label4;
	static JTextField textField1, textField2, textField3;
	static JButton button1, button2, button3, button4;
	static JComboBox comboBox;
	static JTextArea textArea;
	static String [] sort = {"title", "genre", "price", "author index"};
	static ArrayList<Book> list; // create an ArrayList that is used in the actionPerformed() below

	public static void main(String args[]){
		// instantiate a Library object
		library  = new Library();

		// instantiate list
		list = new ArrayList<Book>();

		// create instances of authors
		library.authors.put("Dan Brown", new Author("Dan Brown", "123 Street", "Concord", "New Hampshire", 3301, "603-123-456"));
		library.authors.put("Stephen R. Covey", new Author("Stephen R. Covey", "456 Street", "Salt Lake City", "Utah", 84101, "385-456-7890"));
		library.authors.put("Tina Seelig", new Author("Tina Seelig", "450 Serra Mall", "Stanford", "California", 94305, "650-725-1627"));
		library.authors.put("Y. Daniel Liang", new Author("Y. Daniel Liang", "11935 Abercorn Street", "Savannah", "Georgia", 314191997, "912-344-3264"));
		library.authors.put("Ray Murphy", new Author("Ray Murphy", "University Road", "Galway", "County Galway, Ireland", 904018, "353-91-493081"));
		library.authors.put("Walter Isaacson", new Author("Walter Isaacson", "789 Street", "New Orleans", "Louisiana", 70112, "504-789-0123"));

		// create instances of books
		// add key/value pairs to a HashMap object
		library.books.put("The Lost Symbol", new Book("The Lost Symbol", "Mystery & Thrillers", 10, 0));
		library.books.put("Angels & Demons", new Book("Angels & Demons", "Mystery & Thrillers", 16, 0));
		library.books.put("The Da Vinci Code", new Book("The Da Vinci Code", "Mystery & Thrillers", 10, 0));
		library.books.put("Deception Point", new Book("Deception Point", "Mystery & Thrillers", 16, 0));
		library.books.put("Digital Fortress", new Book("Digital Fortress", "Mystery & Thrillers", 9, 0));
		library.books.put("The 7 Habits of Highly Effective People", new Book("The 7 Habits of Highly Effective People", "Business & Investing", 16, 1));
		library.books.put("The 8th Habit: From Effectiveness to Greatness", new Book("The 8th Habit: From Effectiveness to Greatness", "Business & Investing", 16, 1));
		library.books.put("The 3rd Alternative: Solving Life's Most Difficult Problems", new Book("The 3rd Alternative: Solving Life's Most Difficult Problems", "Business & Investing", 16, 1));
		library.books.put("What I Wish I Knew When I Was 20", new Book("What I Wish I Knew When I Was 20", "Business & Investing", 23, 2));
		library.books.put("Introduction to Java Programming, Comprehensive", new Book("Introduction to Java Programming, Comprehensive", "Computers & Technology", 129, 3));
		library.books.put("English Grammar In Use", new Book("English Grammar In Use", "Education & Reference", 36, 4));
		library.books.put("Steve Jobs", new Book("Steve Jobs", "Biographies & Memoirs", 30, 5));
		library.books.put("Java Concurrency in Practice", new Book("Java Concurrency in Practice", "Computers & Technology", 60, 11));

		library.genreList.add (new Book("The Lost Symbol", "Mystery & Thrillers", 10, 0));
		library.genreList.add (new Book("Angels & Demons", "Mystery & Thrillers", 16, 0));
		library.genreList.add (new Book("The Da Vinci Code", "Mystery & Thrillers", 10, 0));
		library.genreList.add (new Book("Deception Point", "Mystery & Thrillers", 16, 0));
		library.genreList.add (new Book("Digital Fortress", "Mystery & Thrillers", 9, 0));
		library.books.put("Mystery & Thrillers", library.genreList);

		library.genreList.add (new Book("The 7 Habits of Highly Effective People", "Business & Investing", 16, 1));
		library.genreList.add (new Book("The 8th Habit: From Effectiveness to Greatness", "Business & Investing", 16, 1));
		library.genreList.add (new Book("The 3rd Alternative: Solving Life's Most Difficult Problems", "Business & Investing", 16, 1));
		library.genreList.add (new Book("What I Wish I Knew When I Was 20", "Business & Investing", 23, 2));
		library.books.put("Business & Investing", library.genreList);

		library.genreList.add (new Book("Introduction to Java Programming, Comprehensive", "Computers & Technology", 129, 3));
		library.genreList.add (new Book("Java Concurrency in Practice", "Computers & Technology", 60, 11));
		library.books.put("Computers & Technology", library.genreList);

		library.genreList.add (new Book("English Grammar In Use", "Education & Reference", 36, 4));
		library.books.put("Education & Reference", library.genreList);

		library.genreList.add (new Book("Steve Jobs", "Biographies & Memoirs", 30, 5));
		library.books.put("Biographies & Memoirs", library.genreList);

		library.authorIndexList.add (new Book("The Lost Symbol", "Mystery & Thrillers", 10, 0));
		library.authorIndexList.add (new Book("Angels & Demons", "Mystery & Thrillers", 16, 0));
		library.authorIndexList.add (new Book("The Da Vinci Code", "Mystery & Thrillers", 10, 0));
		library.authorIndexList.add (new Book("Deception Point", "Mystery & Thrillers", 16, 0));
		library.authorIndexList.add (new Book("Digital Fortress", "Mystery & Thrillers", 9, 0));
		library.books.put((Integer)0, library.authorIndexList);

		library.authorIndexList.add (new Book("The 7 Habits of Highly Effective People", "Business & Investing", 16, 1));
		library.authorIndexList.add (new Book("The 8th Habit: From Effectiveness to Greatness", "Business & Investing", 16, 1));
		library.authorIndexList.add (new Book("The 3rd Alternative: Solving Life's Most Difficult Problems", "Business & Investing", 16, 1));
		library.books.put((Integer)1, library.authorIndexList);

		library.authorIndexList.add (new Book("What I Wish I Knew When I Was 20", "Business & Investing", 23, 2));
		library.books.put((Integer)2, library.authorIndexList);

		library.authorIndexList.add (new Book("Introduction to Java Programming, Comprehensive", "Computers & Technology", 129, 3));
		library.books.put((Integer)3, library.authorIndexList);

		library.authorIndexList.add (new Book("English Grammar In Use", "Education & Reference", 36, 4));
		library.books.put((Integer)4, library.authorIndexList);

		library.authorIndexList.add (new Book("Steve Jobs", "Biographies & Memoirs", 30, 5));
		library.books.put((Integer)5, library.authorIndexList);

		library.authorIndexList.add (new Book("Java Concurrency in Practice", "Computers & Technology", 60, 11));
		library.books.put((Integer)11, library.authorIndexList);

		// instantiate a LibraryTest object that invokes libraryGUI() method
		LibraryTestOfMap viewer = new LibraryTestOfMap();
		viewer.libraryGUI();
	}

	public void libraryGUI() {

		// instantiate a JFrame object
		outputFrame = new JFrame();
		outputFrame.setSize(900,320);
		outputFrame.setTitle("LibraryTestOfMap");
		outputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		container = outputFrame.getContentPane();
		container.setLayout( new FlowLayout() );

		// instantiate a JPanel object
		panel1 = new JPanel();

		// instantiate a JLabel object, add it to container and panel
		label1 = new JLabel( "Title :" );
		container.add( label1 );
		panel1.add(label1);

		textField1 = new JTextField( "", 15 );
		container.add( textField1 );
		panel1.add(textField1);
		// handler is the actionPerformed() below
		textField1.addActionListener( this );

		button1 = new JButton( "Search on Title" );
		container.add( button1 );
		panel1.add(button1);
		button1.addActionListener( this );

		outputFrame.add(panel1);

		panel2 = new JPanel();

		label2 = new JLabel( "Genre :" );
		container.add( label2 );
		panel2.add(label2);

		textField2 = new JTextField( "", 15 );
		container.add( textField2 );
 		panel2.add(textField2);
		textField2.addActionListener( this );

		button2 = new JButton( "Search on Genre" );
		container.add( button2 );
		panel2.add(button2);
 		button2.addActionListener( this );

		outputFrame.add(panel2);

		panel3 = new JPanel();

		label3 = new JLabel( "Author Index :" );
		container.add( label3 );
		panel3.add(label3);

		textField3 = new JTextField( "", 3 );
		container.add( textField3 );
		panel3.add(textField3);
 		textField3.addActionListener( this );

		button3 = new JButton( "Search on author index" );
		container.add( button3 );
		panel3.add(button3);
 		button3.addActionListener( this );

		outputFrame.add(panel3);

		panel4 = new JPanel();

		label4 = new JLabel( "Sort by :" );
		container.add( label4 );
		panel4.add(label4);

		comboBox = new JComboBox(sort);
 		comboBox.setMaximumRowCount(4);
		container.add( comboBox );
		panel4.add(comboBox);
 		comboBox.addItemListener( this );

		button4 = new JButton( "Sort" );
		container.add( button4 );
		panel4.add(button4);
		button4.addActionListener( this );

		outputFrame.add(panel4);

		//create a textarea, attach a scrollbar, add to container.
		textArea = new JTextArea(10,65);
		container.add( new JScrollPane(textArea));

		outputFrame.setVisible(true);
	}

	// event handler for JButton, JTextField events.
	public void actionPerformed( ActionEvent event ) {
		//access the text
		String queryTitle = textField1.getText();
		String queryGenre = textField2.getText();
		String queryAuthorIndex = textField3.getText();

		if ( event.getSource() == button1 ) {
			if (!queryTitle.equals("")) {
				Book resultTitle = this.library.searchTitle(queryTitle);
				if (resultTitle == null) {
					textArea.append("\"" + queryTitle + "\" is not found in the library.\n");
				}
				else {
					list.add(resultTitle);
					textArea.append(resultTitle.toString());
				}
			}
			else {
				textArea.append("Enter a book title.\n");
			}
		} else if ( event.getSource() == button2 ) {
			if (!queryGenre.equals("")) {
				ArrayList<Book> resultGenre = this.library.searchGenre(queryGenre);
				if (resultGenre == null) {
					textArea.append("\"" + queryGenre + "\" is not found in the library.\n");
				}
				else {
					list.addAll(resultGenre);
					textArea.append(resultGenre.toString() + "\n");
				}
			}
			else {
				textArea.append("Enter a book genre.\n");
			}
		} else if ( event.getSource() == button3 ) {
			if (!queryAuthorIndex.equals("")) {
				int queryAuthorIndexInt = Integer.valueOf(queryAuthorIndex);
				ArrayList<Book> resultAuthorIndex = this.library.searchAuthorIndex(queryAuthorIndexInt);
				if (resultAuthorIndex == null) {
					textArea.append("\"" + queryAuthorIndex + "\" is not found in the library.\n");
				}
				else {
					list.addAll(resultAuthorIndex);
					textArea.append(resultAuthorIndex.toString() + "\n");
				}
			}
			else {
				textArea.append("Enter an author index.\n");
			}
		} else if ( event.getSource() == button4 ) {
			if (comboBox.getSelectedItem() == "title") { // sort by title
				Collections.sort(list, new BookTitleComparator());
				textArea.setText("");
				textArea.append(list.toString() + "\n");
			} else if (comboBox.getSelectedItem() == "genre") { // sort by genre
				Collections.sort(list, new BookGenreComparator());
				textArea.setText("");
				textArea.append(list.toString() + "\n");
			} else if (comboBox.getSelectedItem() == "price") { // sort by price
				Collections.sort(list, new BookPriceComparator());
				textArea.setText("");
				textArea.append(list.toString() + "\n");
			} else if (comboBox.getSelectedItem() == "author index") { // sort by author index
				Collections.sort(list, new BookAuthorIndexComparator());
				textArea.setText("");
 				textArea.append(list.toString() + "\n");
			}
		}
	}

	// event handler for JComboBox events.
	public void itemStateChanged( ItemEvent event ) {
		if ( event.getSource() == comboBox ) {
			if ( event.getStateChange() == ItemEvent.SELECTED ) {
				int i = comboBox.getSelectedIndex();
			}
 		}
	}

}