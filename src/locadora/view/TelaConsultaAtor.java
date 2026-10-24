package locadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaAtor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNomeAtor;
	private JTable tableConsultaAtor;

	private TelaCadastroAtor telaCadastroAtor;

	// 1. Construtor padrão (caso abra direto pelo main)
    public TelaConsultaAtor() {
        this(null); // Chama o outro construtor passando null
    }
 // 2. Construtor que recebe a tela de cadastro (o que o seu botão chama)
 	public TelaConsultaAtor(TelaCadastroAtor telaCadastroAtor) {
 			this.telaCadastroAtor = telaCadastroAtor;
 			
 			// Configurações da Janela
 			setTitle("Video Locadora Hora da Pipoca");
 			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 			setBounds(100, 100, 600, 450);
 			
 			// Evento para reabrir o cadastro quando a consulta for fechada (clicar no X)
 			addWindowListener(new java.awt.event.WindowAdapter() {
 				//Este método é acionado após a janela de consulta ser totalmente fechada.
 				@Override
 				public void windowClosed(java.awt.event.WindowEvent e) {
 					if (telaCadastroAtor != null) {
 						telaCadastroAtor.setVisible(true);
 					}
 				}
 			
 			});
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel labelTituloAtor = new JLabel("Consulta Ator");
		labelTituloAtor.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-20.png"));
		labelTituloAtor.setFont(new Font("Dialog", Font.BOLD, 14));
		labelTituloAtor.setBounds(222, 10, 148, 20);
		contentPane.add(labelTituloAtor);
		
		JPanel jPanelConsultaAtor = new JPanel();
		jPanelConsultaAtor.setBackground(new Color(94, 92, 100));
		jPanelConsultaAtor.setBounds(25, 65, 561, 334);
		contentPane.add(jPanelConsultaAtor);
		jPanelConsultaAtor.setLayout(null);
		
		JLabel lblLabelNomeAtor = new JLabel("Informe nome ator:");
		lblLabelNomeAtor.setForeground(new Color(255, 255, 255));
		lblLabelNomeAtor.setBounds(12, 49, 136, 17);
		jPanelConsultaAtor.add(lblLabelNomeAtor);
		
		textFieldNomeAtor = new JTextField();
		textFieldNomeAtor.setToolTipText("Informe o nome do ator:");
		textFieldNomeAtor.setBounds(154, 47, 311, 21);
		jPanelConsultaAtor.add(textFieldNomeAtor);
		textFieldNomeAtor.setColumns(10);
		
		JButton btnNewButtonConsultaAtor = new JButton("");
		btnNewButtonConsultaAtor.setIcon(
				new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-pesquisar-16.png"));
		btnNewButtonConsultaAtor.setBounds(477, 47, 40, 21);
		jPanelConsultaAtor.add(btnNewButtonConsultaAtor);
		
		// Não implementado ainda.
		btnNewButtonConsultaAtor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Consulta nome do Ator");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 92, 502, 230);
		jPanelConsultaAtor.add(scrollPane);
		
		tableConsultaAtor = new JTable();
		tableConsultaAtor.setFillsViewportHeight(true);
		tableConsultaAtor.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "Nacionalidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableConsultaAtor.getColumnModel().getColumn(2).setPreferredWidth(94);
			scrollPane.setViewportView(tableConsultaAtor);
	}
}
