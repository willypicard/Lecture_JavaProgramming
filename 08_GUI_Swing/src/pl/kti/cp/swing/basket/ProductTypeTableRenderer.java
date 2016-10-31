package pl.kti.cp.swing.basket;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import pl.kti.cp.example.IBook;
import pl.kti.cp.example.ICD;
import pl.kti.cp.example.IProduct;

public class ProductTypeTableRenderer extends JLabel implements
		TableCellRenderer {

	private static final long serialVersionUID = 5390698055895231777L;

	private final static Icon ICON_CD = new ImageIcon(
			ProductTypeTableRenderer.class.getResource("/img/cd.png"));

	private final static Icon ICON_BOOK = new ImageIcon(
			ProductTypeTableRenderer.class.getResource("/img/book.png"));
	
	public ProductTypeTableRenderer() {
        setOpaque(true);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
    }
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {

		if (isSelected) {
			setBackground(table.getSelectionBackground());
			setForeground(table.getSelectionForeground());
		} else {
			setBackground(table.getBackground());
			setForeground(table.getForeground());
		}
		IProduct product = (IProduct) value;
		if (product instanceof ICD) {
//			setText("P³yta: "+ product.getTitle());
			setIcon(ICON_CD);
		}
		if (product instanceof IBook) {
			setIcon(ICON_BOOK);
//			setText("Book");
		}
		return this;
	}
}