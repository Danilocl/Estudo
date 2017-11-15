package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.LoginControl;
import model.Login;

import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField loginField;
	JLabel labelLogin;
	JLabel labelSenha;
	
	/**
	 * Launch the application.
	 */
	Login login;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel labelLogin = new JLabel("Login: ");
		
		loginField = new JTextField();
		
		loginField.setColumns(8);

		JLabel labelSenha = new JLabel("Senha: ");

		JButton buttonVoltar = new JButton("Cancelar");

		JButton buttonLogar = new JButton("Logar");
		
		

		buttonLogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				validacao();
			}
		});

		passwordField = new JPasswordField();

		JButton buttonCadastro = new JButton("Clique Aqui ?");

		JLabel labelCadastro = new JLabel("N\u00E3o Possui Cadastro ?");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addGap(43)
				.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE).addGap(63)
				.addComponent(buttonLogar, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE).addGap(70))
				.addGroup(gl_panel.createSequentialGroup().addGap(33).addGroup(gl_panel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addComponent(labelCadastro).addGap(29)
								.addComponent(buttonCadastro).addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(labelSenha)
										.addComponent(labelLogin))
								.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(loginField, Alignment.LEADING).addComponent(passwordField,
												Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
								.addGap(95)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(34)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(labelLogin)
								.addComponent(loginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addGap(77)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(labelSenha)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(labelCadastro)
						.addComponent(buttonCadastro))
				.addGap(40).addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(buttonLogar)
						.addComponent(buttonVoltar))
				.addContainerGap()));

		buttonVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int test = JOptionPane.showConfirmDialog(buttonVoltar, "Tem certeza que deseja sair ?");

				int confirm = JOptionPane.YES_OPTION;

				if (test == confirm) {
					dispose();
				}

			}
		});

		buttonLogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new DialogCadastro();

			}
		});
		panel.setLayout(gl_panel);
	}
	
	public void setFields() {
		login.setNome(labelLogin.getText());
		login.setSenha(labelSenha.getText());
		
		
	}
	
	@SuppressWarnings("deprecation")
	public void validacao() {
		if(loginField.getText().isEmpty() || passwordField.getText().isEmpty() || passwordField.getText().length() < 8) {
			JOptionPane.showMessageDialog(null, "Campo inválido");
		} else {
			
			LoginControl.chamaModelDao(loginField.getText(),passwordField.getText());
		}
	}
}
