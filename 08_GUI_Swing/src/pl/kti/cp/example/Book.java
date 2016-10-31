package pl.kti.cp.example;


public class Book extends AbstractProduct implements IBook {
	private int _numberOfPages;
	
	public Book(String author, String title, IPrice price, int numberOfPages) {
		super(author, title, price);
		_numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return _numberOfPages;
	}

	public String toString(){
		return "Book:\t"+super.toString();
	}
	
	public int compareTo(IProduct product) {
		if (product instanceof IBook){
			IBook book = (IBook) product;
			int compareAuthor = getAuthor().compareTo(book.getAuthor());
			if (compareAuthor != 0){
				return compareAuthor;
			}
			int compareTitle = getTitle().compareTo(book.getTitle());
			if (compareTitle != 0){
				return compareTitle;
			}
			int comparePrice = getPrice().compareTo(book.getPrice());
			if (comparePrice != 0){
				return comparePrice;
			}
			return 0;
		}
		return -1;
	}

}
