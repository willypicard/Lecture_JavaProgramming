package pl.kti.cp.swing.basket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.AbstractListModel;

import pl.kti.cp.example.IProduct;


public class ProductListModel extends AbstractListModel<IProduct> {
	private static final long serialVersionUID = 3488577139196395518L;
	
	private List<IProduct> _products = new ArrayList<IProduct>();

	public ProductListModel(List<IProduct> products) {
		super();
		Collections.sort(products);
		_products.addAll(products);
	}

	public int getSize() {
		return _products.size();
		
	}

	public IProduct getElementAt(int index) {
		return _products.get(index);
	}

}
