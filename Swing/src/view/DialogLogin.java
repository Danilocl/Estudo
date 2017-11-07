package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DialogLogin extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogLogin frame = new DialogLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DialogLogin() {
		setDefaultCloseOperation(DialogLogin.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// instancia um novo painel
		contentPane = new JPanel();
		// cria uma borda
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		// adiciona um painel ao JFrame
		setContentPane(contentPane);
	}

}
