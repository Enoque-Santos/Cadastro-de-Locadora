package locadora.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import locadora.controller.ClienteController;

public class TelaCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFNome;
	private JFormattedTextField textFieldData;
	private JTextField textFieldEmail;
	private JTextField textFieldEndereco;
	private JFormattedTextField textFieldCPF;

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente() {
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Video Locadora Hora da Pipoca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroCliente = new JLabel("Cadastro de Cliente");
		lblCadastroCliente.setFont(new Font("Calibri", Font.BOLD, 24));
		lblCadastroCliente.setBounds(260, 23, 200, 30);
		contentPane.add(lblCadastroCliente);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(25, 64, 732, 386);
		contentPane.add(panel);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNome.setBounds(104, 54, 44, 20);
		panel.add(lblNome);

		textFNome = new JTextField();
		textFNome.setBounds(183, 52, 488, 20);
		panel.add(textFNome);
		textFNome.setColumns(10);

		textFieldData = new JFormattedTextField();

		JLabel lblDataNasc = new JLabel("Data Nascimento:");
		lblDataNasc.setFont(new Font("Calibri", Font.BOLD, 14));
		lblDataNasc.setBounds(36, 85, 105, 20);
		panel.add(lblDataNasc);

		textFieldData = new JFormattedTextField();
		try {
			MaskFormatter mask = new MaskFormatter("##/##/####"); // dd/MM/yyyy
			mask.setPlaceholderCharacter('_'); // mostra ___/__/____
			((JFormattedTextField) textFieldData)
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mask));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		textFieldData.setColumns(10);
		textFieldData.setBounds(182, 85, 149, 20);
		panel.add(textFieldData);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCpf.setBounds(117, 120, 31, 20);
		panel.add(lblCpf);

		textFieldCPF = new JFormattedTextField();
		try {
			MaskFormatter mask = new MaskFormatter("###.###.###-##"); // dd/MM/yyyy
			mask.setPlaceholderCharacter('_'); // mostra ___.___.___-___
			((JFormattedTextField) textFieldCPF)
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mask));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(183, 118, 149, 20);
		panel.add(textFieldCPF);

		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setFont(new Font("Calibri", Font.BOLD, 14));
		lblEmail.setBounds(104, 151, 64, 20);
		panel.add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(183, 154, 331, 20);
		panel.add(textFieldEmail);

		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Calibri", Font.BOLD, 14));
		lblEndereco.setBounds(84, 186, 64, 20);
		panel.add(lblEndereco);

		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(183, 187, 488, 20);
		panel.add(textFieldEndereco);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController clienteController = new ClienteController();
				try {
					//(textFNome.getText(), textFieldCPF.getText(),
					//textFieldEmail.getText(), textFieldEndereco.getText(), textFieldEndereco.getText()
					boolean sucesso = clienteController.cadastrarCliente(textFNome.getText(),textFieldCPF.getText(),textFieldEmail.getText()
							,textFieldEndereco.getText(),textFieldData.getText());
					if (sucesso) {
						JOptionPane.showMessageDialog(null, "O cadastro cliente foi realizado com sucesso");
						limparCampos();
						

					} else {
						JOptionPane.showMessageDialog(null, "Os Campos não foram preenchidos corretamente");
					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + ex.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSalvar.setBounds(104, 262, 89, 29);
		panel.add(btnSalvar);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnLimpar.setBounds(238, 262, 89, 29);
		panel.add(btnLimpar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelarCliente();
			}
		});
		btnCancelar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCancelar.setBounds(372, 262, 127, 29);
		panel.add(btnCancelar);

		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnConsultar.setBounds(544, 262, 127, 29);
		panel.add(btnConsultar);

	}

	private void limparCampos() {
		textFieldCPF.setText("");
		textFNome.setText("");
		textFieldData.setText("");
		textFieldEmail.setText("");
		textFieldEndereco.setText("");
		
	}

	private void cancelarCliente() {
		this.dispose();
	}

}
