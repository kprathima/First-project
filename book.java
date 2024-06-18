import java.util.ArrayList;

public class book {

    public class book {
        private string title;
        private string author;
        private string ISBN;
        private static ArrayList<book> book collection=new
        array list<book>();

        public book(string title, string author, string ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public string gettitle() {
            return title;
        }

        public void set(string title) {
            this.title = title;
        }

        public string getauthor() {
            return author;
        }

        public void set(string author) {
            this.author = author;
        }

    public string get

        ISBN(){
        return ISBN;
    }

        public void set(string ISBN) {
            this.ISBN = ISBN;
        }

        public static void add_Book(Book book) {
            bookCollection.add(book);
        }

  public static void remove_Book(Book book) {
    bookCollection.remove(book);
  }
