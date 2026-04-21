package gui_giocatori;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.*;

public class GiocatoriGUI {

	private JFrame frame;
	private ArrayList<Giocatore> lista = new ArrayList<>();

    private JTextField nomeField = new JTextField(10);
    private JSpinner goalSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 1000, 1));
    private JSpinner goalNazSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 1000, 1));
    private JCheckBox capitanoBox = new JCheckBox("Capitano");

    private DefaultListModel<Giocatore> model = new DefaultListModel<>();
    private JList<Giocatore> jList = new JList<>(model);

    public GiocatoriGUI() {
        initialize();
    }

    private void initialize() {

        // ===== FRAME =====
        frame = new JFrame("Gestione Giocatori");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        Font font = new Font("Arial", Font.PLAIN, 14);

        // ===== TITOLO =====
        JLabel titolo = new JLabel("Gestione Giocatori di Calcio", JLabel.CENTER);
        titolo.setFont(new Font("Arial", Font.BOLD, 18));
        titolo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(titolo, BorderLayout.NORTH);

        // ===== PANEL CENTRALE =====
        JPanel centerPanel = new JPanel(new BorderLayout());
        frame.add(centerPanel, BorderLayout.CENTER);

        // ===== FORM =====
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Inserimento dati"));

        formPanel.add(new JLabel("Nome:"));
        formPanel.add(nomeField);

        formPanel.add(new JLabel("Goal:"));
        formPanel.add(goalSpinner);

        formPanel.add(new JLabel("Goal Nazionale:"));
        formPanel.add(goalNazSpinner);

        formPanel.add(new JLabel("Capitano:"));
        formPanel.add(capitanoBox);

        centerPanel.add(formPanel, BorderLayout.NORTH);

        // ===== LISTA =====
        jList.setFont(font);
        JScrollPane scroll = new JScrollPane(jList);
        scroll.setBorder(BorderFactory.createTitledBorder("Lista giocatori"));
        centerPanel.add(scroll, BorderLayout.CENTER);

        // ===== BOTTONI =====
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton addBtn = new JButton("Aggiungi");
        JButton modBtn = new JButton("Modifica");
        JButton delBtn = new JButton("Elimina");

        addBtn.setBackground(new Color(76, 175, 80));
        modBtn.setBackground(new Color(33, 150, 243));
        delBtn.setBackground(new Color(244, 67, 54));

        addBtn.setForeground(Color.WHITE);
        modBtn.setForeground(Color.WHITE);
        delBtn.setForeground(Color.WHITE);

        buttonPanel.add(addBtn);
        buttonPanel.add(modBtn);
        buttonPanel.add(delBtn);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // ===== AZIONI =====
        addBtn.addActionListener(e -> aggiungiGiocatore());
        modBtn.addActionListener(e -> modificaGiocatore());
        delBtn.addActionListener(e -> eliminaGiocatore());
    }

    // ===== LOGICA =====
    private void aggiungiGiocatore() {
        String nome = nomeField.getText();
        int goal = (int) goalSpinner.getValue();
        int goalNaz = (int) goalNazSpinner.getValue();
        boolean capitano = capitanoBox.isSelected();

        Giocatore g = new Giocatore(nome, goal, goalNaz, capitano);

        lista.add(g);
        model.addElement(g);

        pulisciCampi();
    }

    private void modificaGiocatore() {
        int index = jList.getSelectedIndex();

        if (index != -1) {
            Giocatore g = lista.get(index);

            g.setNome(nomeField.getText());
            g.setGoal((int) goalSpinner.getValue());
            g.setGoalNazionale((int) goalNazSpinner.getValue());
            g.setCapitano(capitanoBox.isSelected());

            model.set(index, g);
        }
    }

    private void eliminaGiocatore() {
        int index = jList.getSelectedIndex();

        if (index != -1) {
            lista.remove(index);
            model.remove(index);
        }
    }

    private void pulisciCampi() {
        nomeField.setText("");
        goalSpinner.setValue(0);
        goalNazSpinner.setValue(0);
        capitanoBox.setSelected(false);
    }
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiocatoriGUI window = new GiocatoriGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
