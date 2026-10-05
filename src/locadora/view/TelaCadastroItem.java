package locadora.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaCadastroItem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public TelaCadastroItem() {
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Video Locadora Hora da Pipoca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Item");
		lblNewLabel.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-48.png"));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setBounds(244, 12, 274, 41);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(25, 78, 732, 305);
		contentPane.add(panel);
		
		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTitulo.setBounds(30, 70, 46, 14);
		panel.add(lblTitulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setEnabled(false);
		textFieldTitulo.setToolTipText("Consulte um tipo de Filme");
		textFieldTitulo.setBounds(86, 65, 489, 20);
		panel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTipo.setBounds(30, 116, 46, 14);
		panel.add(lblTipo);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setToolTipText("escolha um tipo");
		comboBoxTipo.setFont(new Font("Calibri", Font.BOLD, 14));
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Selecione um tipo:", "Blu-Ray Disc", "CD", "DVD"}));
		comboBoxTipo.setBounds(86, 110, 145, 22);
		panel.add(comboBoxTipo);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPreco.setBounds(30, 157, 46, 14);
		panel.add(lblPreco);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 14));
		textField.setBounds(86, 152, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSalvar.setBounds(30, 231, 100, 29);
		panel.add(btnSalvar);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnLimpar.setBounds(164, 231, 100, 29);
		panel.add(btnLimpar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCancelar.setBounds(298, 231, 127, 29);
		panel.add(btnCancelar);

		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnConsultar.setBounds(470, 231, 141, 29);
		panel.add(btnConsultar);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setIcon(new ImageIcon(TelaCadastroItem.class.getResource("/imagens/lupa16x16.png")));
		btnPesquisar.setFont(new Font("Calibri", Font.BOLD, 14));
		btnPesquisar.setBounds(585, 64, 26, 23);
		panel.add(btnPesquisar);
	}
}
