package locadora.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNomeCliente;
	private JLabel lblLabelNomeCliente;
	private JLabel labelTituloCliente;
	private JButton btnNewButtonConsultaCliente;
	private JTable tableConsultaCliente;
	
	
	public TelaCadastroCliente telaCadastroCliente;
	
	public TelaConsultaCliente() {
		this(null);
	}
	
	public TelaConsultaCliente(TelaCadastroCliente telaCadastroCliente) {
		this.telaCadastroCliente = telaCadastroCliente;
		
		setTitle("Video locadora hora pipoca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
		// Evento para reabrir o cadastro quando a consulta for fechada (clicar no X)
			addWindowListener(new java.awt.event.WindowAdapter() {
				//Este método é acionado após a janela de consulta ser totalmente fechada.
				@Override
				public void windowClosed(java.awt.event.WindowEvent e) {
					if (telaCadastroCliente != null) {
						telaCadastroCliente.setVisible(true);
					}
				}
			
			});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		labelTituloCliente = new JLabel("Consulta Cliente");
		labelTituloCliente.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-20.png"));
		labelTituloCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		labelTituloCliente.setBounds(222, 10, 148, 20);
		contentPane.add(labelTituloCliente);
		
		JPanel panelConsultaCliente = new JPanel();
		panelConsultaCliente.setBackground(new Color(94,92,100));
		panelConsultaCliente.setBounds(25, 65, 561, 334);
		
		contentPane.add(panelConsultaCliente);
		panelConsultaCliente.setLayout(null);
		
		lblLabelNomeCliente = new JLabel("Informe nome cliente:");
		lblLabelNomeCliente.setForeground(new Color(255, 255, 255));
		lblLabelNomeCliente.setBackground(new Color(94,92,100));
		lblLabelNomeCliente.setBounds(12, 49, 141, 17);
		panelConsultaCliente.add(lblLabelNomeCliente);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setToolTipText("Informe nome cliente:");
		//textFieldNomeAtor.setBounds(154, 47, 311, 21);
		textFieldNomeCliente.setBounds(154, 47, 311,21);
		panelConsultaCliente.add(textFieldNomeCliente);
		textFieldNomeCliente.setColumns(10);
		
		btnNewButtonConsultaCliente = new JButton("");
		btnNewButtonConsultaCliente.setIcon(
				new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-pesquisar-16.png"));
		btnNewButtonConsultaCliente.setBounds(477, 47, 40, 21);
		panelConsultaCliente.add(btnNewButtonConsultaCliente);
		
		// não implementado ainda;
		
		btnNewButtonConsultaCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Consulta nome do cliente");
				
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 92, 510, 230);
		panelConsultaCliente.add(scrollPane);
		
		tableConsultaCliente = new JTable();
		tableConsultaCliente.setFillsViewportHeight(true);
		tableConsultaCliente.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "CPF", "E-mail", "Endere\u00E7o", "Nascimento"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableConsultaCliente.getColumnModel().getColumn(2).setPreferredWidth(94);
			scrollPane.setViewportView(tableConsultaCliente);
		

	}
}
