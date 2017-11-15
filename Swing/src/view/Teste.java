package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Teste extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
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
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton buttonLogar = new JButton("Logar");
		
		JButton buttonBack = new JButton("Voltar");
		
		JPanel CONTENT = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addComponent(buttonBack)
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addComponent(buttonLogar)
					.addGap(58))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(CONTENT, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(CONTENT, GroupLayout.PREFERRED_SIZE, 191, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonLogar)
						.addComponent(buttonBack))
					.addGap(4))
		);
		
		JLabel login = new JLabel("Login");
		
		JLabel senha = new JLabel("Senha");
		
		textFieldLogin = new JTextField();
		textFieldLogin.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setColumns(10);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		GroupLayout gl_CONTENT = new GroupLayout(CONTENT);
		gl_CONTENT.setHorizontalGroup(
			gl_CONTENT.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_CONTENT.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_CONTENT.createParallelGroup(Alignment.LEADING)
						.addComponent(senha)
						.addComponent(login))
					.addGap(87)
					.addGroup(gl_CONTENT.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(277))
				.addGroup(gl_CONTENT.createSequentialGroup()
					.addGap(103)
					.addComponent(buttonCadastrar)
					.addContainerGap(334, Short.MAX_VALUE))
		);
		gl_CONTENT.setVerticalGroup(
			gl_CONTENT.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CONTENT.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_CONTENT.createParallelGroup(Alignment.BASELINE)
						.addComponent(login)
						.addComponent(textFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_CONTENT.createParallelGroup(Alignment.BASELINE)
						.addComponent(senha)
						.addComponent(textFieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addComponent(buttonCadastrar)
					.addContainerGap())
		);
		CONTENT.setLayout(gl_CONTENT);
		contentPane.setLayout(gl_contentPane);
	}
}
