package pl.kti.cp.swing.basket;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import pl.kti.cp.example.Basket;
import pl.kti.cp.example.IProduct;


public class BasketFrame extends JFrame{
	private static final long serialVersionUID = 5447740201586769240L;
	
	private BasketTableModel _basketTableModel;
	private ProductChooser _productChooser ;
	
	public BasketFrame(List<IProduct> products){
		_basketTableModel = new BasketTableModel(new Basket());
		_productChooser = new ProductChooser(this, new ProductListModel(products));
		initGUI();
	}
	
	private void initGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new BorderLayout(5,5));
		
		JLabel labelTitle = new JLabel("Basket");
		
		labelTitle.setFont(new Font("Serif", Font.BOLD, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelTitle,BorderLayout.NORTH);
		
		JTable table = new JTable(_basketTableModel);
		table.getColumnModel().getColumn(0).setCellRenderer( new ProductTypeTableRenderer());
		table.setRowHeight(36);
		JScrollPane listScroller = new JScrollPane(table);
		getContentPane().add(listScroller,BorderLayout.CENTER);

		JButton btAddProduct = new JButton("Add product");
		getContentPane().add(btAddProduct, BorderLayout.SOUTH);
		btAddProduct.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				_productChooser.pack();
				_productChooser.setVisible(true);
				IProduct chosenProduct = _productChooser.getChosenProduct();
				if (chosenProduct== null){
					System.out.println("No product selected");
				} else {
					System.out.println("Selected: "+chosenProduct);
					_basketTableModel.addProduct(chosenProduct);
				}

			}
			
		});
	}
}
