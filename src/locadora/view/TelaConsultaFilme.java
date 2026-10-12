package locadora.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaFilme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel labelTirulo = new JLabel("Consulta de Filme");
	private JTextField textFieldTituloFilme;
	private JTable tableConsultaFilme;

	private TelaCadastroFilme telaCadastroFilme;

	// 1. Construtor padrão (caso abra direto pelo main)
    public TelaConsultaFilme() {
        this(null); // Chama o outro construtor passando null
    }
    
	// 2. Construtor que recebe a tela de cadastro (o que o seu botão chama)
	public TelaConsultaFilme(TelaCadastroFilme telaCadastroFilme) {
			this.telaCadastroFilme = telaCadastroFilme;
			
			// Configurações da Janela
			setTitle("Video Locadora Hora da Pipoca");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 598, 448);
			
			// Evento para reabrir o cadastro quando a consulta for fechada (clicar no X)
			addWindowListener(new java.awt.event.WindowAdapter() {
				@Override
				public void windowClosed(java.awt.event.WindowEvent e) {
					if (telaCadastroFilme != null) {
						telaCadastroFilme.setVisible(true);
					}
				}
			
			});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		labelTirulo.setBounds(222, 10, 148, 20);
		labelTirulo.setFont(new Font("Dialog", Font.BOLD, 14));
		labelTirulo.setIcon(new ImageIcon(
				"/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-20.png"));
		contentPane.add(labelTirulo);

		JPanel jPanelConsultaFilme = new JPanel();
		jPanelConsultaFilme.setBounds(25, 65, 561, 334);
		jPanelConsultaFilme.setBackground(new Color(94, 92, 100));
		contentPane.add(jPanelConsultaFilme);
		jPanelConsultaFilme.setLayout(null);

		JLabel lblNewLabelTitulo = new JLabel("Insira o tilulo do filme:");
		lblNewLabelTitulo.setBounds(12, 49, 136, 17);
		lblNewLabelTitulo.setForeground(new Color(255, 255, 255));
		jPanelConsultaFilme.add(lblNewLabelTitulo);

		textFieldTituloFilme = new JTextField();
		textFieldTituloFilme.setToolTipText("Informe o titulo do fime.");
		textFieldTituloFilme.setBounds(154, 47, 311, 21);
		textFieldTituloFilme.setHorizontalAlignment(SwingConstants.LEFT);
		jPanelConsultaFilme.add(textFieldTituloFilme);
		textFieldTituloFilme.setColumns(10);

		JButton btnNewButtonConsultaFilme = new JButton("");
		btnNewButtonConsultaFilme.setIcon(
				new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-pesquisar-16.png"));
		btnNewButtonConsultaFilme.setBounds(477, 47, 40, 21);
		jPanelConsultaFilme.add(btnNewButtonConsultaFilme);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 78, 505, 244);
		jPanelConsultaFilme.add(scrollPane);

		tableConsultaFilme = new JTable();
		tableConsultaFilme.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "C\u00F3digo", "T\u00EDtulo", "G\u00EAnero", "Sinopse", "Dura\u00E7\u00E3o" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		scrollPane.setViewportView(tableConsultaFilme);

	}
}
