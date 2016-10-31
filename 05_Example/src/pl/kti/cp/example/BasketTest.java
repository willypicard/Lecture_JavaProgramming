package pl.kti.cp.example;

public class BasketTest {

	public static void main(String[] args) {
		IBasket basket = new Basket();
		try {
		IProduct cd1 = new CD("Miles Davis", "Kind of Blue", new Price(45), 56);
		IProduct cd2 = new CD("Prince", "The Rainbow Children", new Price(155), 97);
		IProduct cd3 = new CD("Prince", "N.E.W.S", new Price(125), 63);
		
		IProduct book1 = new Book("Tolkien", "Lord of the Ring", new Price(70), 1750);
		IProduct book2 = new Book("Dan Brown", "The Da Vinci Code", new Price(55), 454);

		basket.add(cd1);
		basket.add(cd2);
		basket.add(cd3);
		basket.add(book1);
		basket.add(book2);
		} catch (NegativePriceException e){
			e.printStackTrace(System.err);
		}
		basket.printProducts();
		
		Thread checkerThread = new PrintBasketThread(basket, 10);
		checkerThread.start();
		
	}
}