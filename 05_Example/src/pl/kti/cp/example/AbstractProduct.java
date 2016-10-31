package pl.kti.cp.example;


public abstract class AbstractProduct implements IProduct{
	private IPrice _price;
	private String _author;
	private String _title;
	
	public AbstractProduct(String author, String title, IPrice price){
		_author = author;
		_title = title;
		_price = price;
	}
	public IPrice getPrice() {
		return _price;
	}

	public String getAuthor() {
		return _author;
	}

	public String getTitle() {
		return _title;
	}

	public String toString(){
		return getAuthor()+"/"+getTitle()+" ["+getPrice()+"]";
	}
}
