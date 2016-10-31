package pl.kti.cp.example;

import java.util.List;


public interface IBasket {
	public void add(IProduct product);
	public List<IBook> getBooks();
	public List<ICD> getCDs();
	public IPrice getTotalPrice();
	public void printProducts();
	public int getNumberOfProducts();
	public IProduct getProduct(int index);
}
