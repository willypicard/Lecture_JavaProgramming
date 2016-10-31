package pl.kti.cp.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket implements IBasket {
	private List<IProduct> _products;

	public Basket() {
		super();
		_products = new ArrayList<IProduct>();
	}

	public void add(IProduct product) {
		_products.add(product);
	}

	public List<IBook> getBooks() {
		List<IBook> books = new ArrayList<IBook>();
		for (int i = 0; i < _products.size(); i++) {
			Object obj = _products.get(i);
			if (obj instanceof IBook) {
				books.add((IBook) obj);
			}
		}
		return books;
	}

	public List<ICD> getCDs() {
		List<ICD> cds = new ArrayList<ICD>();
		for (int i = 0; i < _products.size(); i++) {
			Object obj = _products.get(i);
			if (obj instanceof ICD) {
				cds.add((ICD)obj);
			}
		}
		return cds;
	}

	public IPrice getTotalPrice() {
		try {
			IPrice finalPrice = new Price(0);
			for (int i = 0; i < _products.size(); i++) {
				IProduct product = (IProduct) _products.get(i);
				finalPrice.add(product.getPrice());
			}
			return finalPrice;
		} catch (NegativePriceException e) {
			System.err.println("This should never happen");
			e.printStackTrace(System.err);
		}
		return null;
	}

	public void printProducts() {
		Collections.sort(_products);
		for (int i = 0; i < _products.size(); i++) {
			IProduct product = (IProduct) _products.get(i);
			System.out.println(product);
		}
		System.out.println("Total price");
		System.out.println(getTotalPrice().inZloty() + " PLN");
		System.out.println(getTotalPrice().inEuro() + " EUR");
		System.out.println("===============================");
	}

}