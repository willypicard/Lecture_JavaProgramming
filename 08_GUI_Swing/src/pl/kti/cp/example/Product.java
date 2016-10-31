package pl.kti.cp.example;


public abstract class Product implements IProduct {
	private String _title;
	private String _author;
	private IPrice _price;

	public Product(String title, String author, IPrice price){
		_title = title;
		_author = author;
		_price = price;
	}
	public String getTitle() {
		return _title;
	}

	public String getAuthor() {
		return _author;
	}

	public IPrice getPrice() {
		return _price;
	}
}
