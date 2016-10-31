package pl.kti.cp.swing.basket;

import javax.swing.table.AbstractTableModel;

import pl.kti.cp.example.IBasket;
import pl.kti.cp.example.IBook;
import pl.kti.cp.example.ICD;
import pl.kti.cp.example.IProduct;


public class BasketTableModel extends AbstractTableModel {
	private static final long serialVersionUID = -3733403105813762570L;
	
	private IBasket _basket;
	private String[] columnNames = { "", "Author",  "Title", "Price", "Others" };
    
	public BasketTableModel(IBasket basket){
		_basket = basket;
	}
	
	public int getRowCount() {
		return _basket.getNumberOfProducts();
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		IProduct product = _basket.getProduct(rowIndex);
		if (columnIndex == 0){
			return product;
		}
		if (columnIndex == 1){
			return product.getAuthor();
		}
		if(columnIndex == 2){
			return product.getTitle();
		}
		if (columnIndex == 3){
			return product.getPrice().inZloty()+"PLN";
		}
		if (columnIndex ==4){
			if (product instanceof ICD){
				ICD cd = (ICD) product;
				return cd.getLength()+" min.";
			}
			if (product instanceof IBook){
				IBook book = (IBook) product;
				return book.getNumberOfPages()+" pages";
			}
		}
		return null;
	}

	public void addProduct(IProduct product){
		_basket.add(product);
		fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
	}
}
