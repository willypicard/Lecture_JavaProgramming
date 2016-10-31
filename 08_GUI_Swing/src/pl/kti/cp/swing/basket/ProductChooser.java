package pl.kti.cp.swing.basket;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import pl.kti.cp.example.IProduct;

public class ProductChooser extends JDialog {
	private static final long serialVersionUID = 6613303684761321935L;

	private JList<IProduct> _productList;

	private IProduct _chosenProduct;

	public ProductChooser(JFrame parent, ProductListModel productListModel) {
		super(parent, "Product Chooser", true);
		_productList = new JList<IProduct>(productListModel);
		initGUI();
	}

	private void initGUI() {
		getContentPane().setLayout(new BorderLayout());

		JLabel label = new JLabel("Choose a product");
		label.setFont(new Font("Serif", Font.BOLD, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label, BorderLayout.NORTH);

		JScrollPane listScroller = new JScrollPane(_productList);
		getContentPane().add(listScroller, BorderLayout.CENTER);

		JPanel panel = new JPanel();

		JButton chooseButton = new JButton("Choose");
		JButton cancelButton = new JButton("Cancel");
		panel.add(chooseButton);
		panel.add(cancelButton);

		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object value = _productList.getSelectedValue();
				if (value == null) {
					System.out.println("No product selected");
				} else {
					IProduct product = (IProduct) value;
					System.out.println("Selected: " + product);
					_chosenProduct = product;
				}
				setVisible(false);
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_chosenProduct = null;
				setVisible(false);
			}
		});

		getContentPane().add(panel, BorderLayout.SOUTH);
	}

	public IProduct getChosenProduct() {
		return _chosenProduct;
	}
}