package calcolatrice_semplice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class CalcolatriceVers1 {

	private JFrame frame;
	private JTextField num1TextField;
	private JTextField num2TextField;
	private JLabel labelRisultato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcolatriceVers1 window = new CalcolatriceVers1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcolatriceVers1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 493, 205);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelInputOutput = new JPanel();
		frame.getContentPane().add(panelInputOutput, BorderLayout.NORTH);
		panelInputOutput.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel labelNum1 = new JLabel("Numero 1");
		labelNum1.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(labelNum1);
		
		num1TextField = new JTextField();
		num1TextField.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(num1TextField);
		num1TextField.setColumns(10);
		
		JLabel labelNum2 = new JLabel("Numero 2");
		labelNum2.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(labelNum2);
		
		num2TextField = new JTextField();
		num2TextField.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(num2TextField);
		num2TextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Risultato");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(lblNewLabel_2);
		
		labelRisultato = new JLabel("");
		labelRisultato.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelInputOutput.add(labelRisultato);
		
		JPanel panelPulsanti = new JPanel();
		frame.getContentPane().add(panelPulsanti, BorderLayout.SOUTH);
		panelPulsanti.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnSomma = new JButton("Somma");
		btnSomma.setForeground(new Color(128, 0, 128));
		btnSomma.setBackground(new Color(255, 228, 196));
		btnSomma.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelPulsanti.add(btnSomma);
		
		JButton btnSottrazione = new JButton("Sottrazione");
		btnSottrazione.setForeground(new Color(128, 0, 128));
		btnSottrazione.setBackground(new Color(255, 228, 196));
		btnSottrazione.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelPulsanti.add(btnSottrazione);
		
		JButton btnMoltiplicazione = new JButton("Moltiplicazione");
		btnMoltiplicazione.setForeground(new Color(128, 0, 128));
		btnMoltiplicazione.setBackground(new Color(255, 228, 196));
		btnMoltiplicazione.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelPulsanti.add(btnMoltiplicazione);
		
		JButton btnDivisione = new JButton("Divisione");
		btnDivisione.setForeground(new Color(128, 0, 128));
		btnDivisione.setBackground(new Color(255, 228, 196));
		btnDivisione.setFont(new Font("Verdana", Font.PLAIN, 18));
		panelPulsanti.add(btnDivisione);
		
		btnSomma.addActionListener(e -> somma());
		btnSottrazione.addActionListener(e -> sottrazione());
		btnMoltiplicazione.addActionListener(e -> moltiplicazione());
		btnDivisione.addActionListener(e -> divisione());
	}
	
	public void somma() {
		double n1 = Double.parseDouble(num1TextField.getText());
		double n2 = Double.parseDouble(num2TextField.getText());
		double ris = n1 + n2;
		labelRisultato.setText("" + ris);
	}
	
	public void sottrazione() {
		double n1 = Double.parseDouble(num1TextField.getText());
		double n2 = Double.parseDouble(num2TextField.getText());
		double ris= n1 - n2;
		labelRisultato.setText("" + ris);
	}
	
	public void moltiplicazione() {
		double n1 = Double.parseDouble(num1TextField.getText());
		double n2 = Double.parseDouble(num2TextField.getText());
		double ris = n1 * n2;
		labelRisultato.setText("" + ris);	
	}
	
	public void divisione() {
		double n2 = Double.parseDouble(num2TextField.getText());
		if(n2 == 0) {
			labelRisultato.setText("imp");
		} else {
			double n1 = Double.parseDouble(num1TextField.getText());
			double ris = n1 / n2;
			labelRisultato.setText("" + ris);
		}	
	}
}
