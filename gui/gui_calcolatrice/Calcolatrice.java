package gui_calcolatrice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcolatrice {

	private JFrame frame; //finestra principale
	private JTextField display; //casella di testo per l'input dell'utente
    private double num1 = 0; //salva il primo numero che l'utente inserisce
    private String operatore = ""; //operazione che sarà selezionata

	/**
	 * Costruttore di default. che richiama il metodo
     * un metodo che genera l'interfaccia grafica.
	 */
	public Calcolatrice() {
		generaInterfaccia();
	}

	/**
	 * Inizializza il contenuto del Frame. 
     * e alla fine lo rende visibile.
	 */
	private void generaInterfaccia() {
		frame = new JFrame("Calcolatrice"); //Si crea il frame specificando il titolo della finestra 
        frame.setSize(569, 538);  //dimensione iniziale della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cosa succede quando si chiude la finestra

        /*
         * si imposta il layout del contenitore principale 
         * della finestra. Come layout si sceglie un BorderLayout
         * che divide lo spazio in 5 parti: nord, ovest, centro, 
         * est, sud 
         * */
        frame.getContentPane().setLayout(new BorderLayout()); 

        display = new JTextField(); //si crea la casella di testo
        display.setFont(new Font("Arial", Font.BOLD, 24)); //si imposta il font del testo che comparira' nella casella di testo
        display.setHorizontalAlignment(JTextField.RIGHT); //allineamento del testo
        
        /*
         * Si aggiunge alla finestra principalela casella di 
         * testo posizionandola nell'area nord della finestra. 
         * */
        frame.getContentPane().add(display, BorderLayout.NORTH); 
        
        //gestione del tastierino numerico con le operazioni

        /*
         * array di stringhe contenente i testi che verranno
         * associati ai diversi bottoni 
         * */
        String[] testiBottoni = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };

        GridLayout griglia4x4 = new GridLayout(4,4);
        
        JPanel panel = new JPanel(griglia4x4);

        for (int i = 0; i < testiBottoni.length; i++) {
        	String testoBottone = testiBottoni[i];
            JButton btn = new JButton(testoBottone);
            Font f = new Font("Arial", Font.BOLD, 24);
            btn.setFont(f);
            btn.addActionListener(e -> gestisciInput(testoBottone));
            panel.add(btn);
        }
        
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
	}

    private void gestisciInput(String cmd) {
        if ("0123456789".contains(cmd)) {
            display.setText(display.getText() + cmd);
        } 
        else if (cmd.equals("C")) {
            display.setText("");
            num1 = 0;
            operatore = "";
        } 
        else if (cmd.equals("=")) {
        	if (display.getText().equals("") == false) {
        		double num2 = Double.parseDouble(display.getText());
                double risultato = calcola(num1, num2, operatore);
                display.setText("" + risultato);
                operatore = "";
        	}
        } 
        else { //+, -, *, /
        	//se c'e' un numero da leggere si salva il numero, l'operazione e
        	//cancella il contenuto
        	if (display.getText().equals("") == false) { 
        		num1 = Double.parseDouble(display.getText());
                operatore = cmd;
                display.setText("");
        	}
            
        }
    }

    private double calcola(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcolatrice window = new Calcolatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
