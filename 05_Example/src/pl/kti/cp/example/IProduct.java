package pl.kti.cp.example;

public interface IProduct extends Comparable<IProduct>{
	public IPrice getPrice();
	public String getAuthor();
	public String getTitle();
}
