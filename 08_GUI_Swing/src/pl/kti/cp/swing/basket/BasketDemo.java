package pl.kti.cp.swing.basket;

import java.util.ArrayList;
import java.util.List;

import pl.kti.cp.example.*;


public class BasketDemo {

	public static void main(String[] args) {
		try {
			BasketFrame frame = new BasketFrame(createProductList());
			frame.pack();
			frame.setVisible(true);
		} catch (NegativePriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<IProduct> createProductList() throws NegativePriceException {
		IProduct cd1 = new CD("Miles Davis", "Kind of Blue", new Price(45),
				56);
		IProduct cd2 = new CD("Prince", "The Rainbow Children", new Price(
				155), 97);
		IProduct cd3 = new CD("Prince", "N.E.W.S", new Price(125), 63);
		IProduct cd4 = new CD("Ray Charles", "Genius loves company", new Price(75), 67);
		IProduct cd5 = new CD("Eminem", "Encore", new Price(85), 62);
		IProduct cd6 = new CD("Maroon 5", "Songs for Jane", new Price(59), 56);

		IProduct book1 = new Book("Tolkien", "Lord of the Ring", new Price(
				70), 1750);
		IProduct book2 = new Book("Dan Brown", "The Da Vinci Code",
				new Price(55), 454);
		IProduct book3 = new Book("Dan Brown", "Angels & Demons",
				new Price(51), 354);
		IProduct book4 = new Book("Dan Brown", "Digital Fortress",
				new Price(61), 394);
		
		List<IProduct> products = new ArrayList<IProduct>();
		products.add(cd1);
		products.add(cd2);
		products.add(cd3);
		products.add(cd4);
		products.add(cd5);
		products.add(cd6);
		products.add(book1);
		products.add(book2);
		products.add(book3);
		products.add(book4);
		return products;
	}
}
