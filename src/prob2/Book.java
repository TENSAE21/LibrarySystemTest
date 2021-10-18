package prob2;

public class Book extends LendingItem {
	private String isbn;
	private String authorFirstName;
	private String authorLasttName;
	private String title;

    public Book(String isbn, String title, String authorFirstName, String authorLasttName) {
        this.isbn = isbn;
        this.authorFirstName = authorFirstName;
        this.authorLasttName = authorLasttName;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (!obj.getClass().getSimpleName().equals("Book")) return false;
        else {
            Book book = (Book) obj;
            if(book.getIsbn().equals(isbn)) return true;
        }
     return false;

    }


}
