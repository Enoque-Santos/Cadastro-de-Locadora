package locadora.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import locadora.controller.AtorController;

public class TelaCadastroAtor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBoxNacional;

	
	/**
	 * Create the frame.
	 */

	public TelaCadastroAtor() {
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Video Locadora Hora da Pipoca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Ator");
		lblNewLabel.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-48.png"));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setBounds(224, 12, 281, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(25, 64, 563, 311);
		contentPane.add(panel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNome.setBounds(45, 54, 64, 20);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 14));
		textField.setBounds(98, 54, 430, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade:");
		lblNacionalidade.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNacionalidade.setBounds(32, 99, 113, 20);
		panel.add(lblNacionalidade);
		
		comboBoxNacional = new JComboBox();
		comboBoxNacional.setFont(new Font("Calibri", Font.BOLD, 14));
		
		String[] nacionalidades = {"Selecione uma nacionalidade:",
			    "Afegã", "Albanesa", "Alemã", "Americana", "Andorrana",
			    "Angolana", "Antiguana", "Argentina", "Armênia", "Australiana",
			    "Austríaca", "Azeri",

			    "Bahamenha", "Bareinita", "Bangladeshiana", "Barbadiana", "Belga",
			    "Belizenha", "Beninense", "Bielorrussa", "Birmanesa", "Boliviana",
			    "Bósnia", "Botsuanesa", "Brasileira", "Britânica", "Bruneana",
			    "Búlgara", "Burquinense", "Burundinesa",

			    "Cabo-verdiana", "Camaronesa", "Canadense", "Centro-africana",
			    "Chadiana", "Chilena", "Chinesa", "Cipriota", "Colombiana",
			    "Comorense", "Congolesa", "Costarriquenha", "Croata", "Cubana",
			    "Catariana", "Tcheca",

			    "Dinamarquesa", "Djiboutiana", "Dominicana",

			    "Egípcia", "Equatoriana", "Eritreia", "Eslovaca", "Eslovena",
			    "Espanhola", "Estadunidense", "Estoniana", "Etíope",

			    "Fijiana", "Filipina", "Finlandesa", "Francesa",

			    "Gabonesa", "Gambiana", "Ganesa", "Georgiana", "Granadina",
			    "Grega", "Guatemalteca", "Guianense", "Guinéu-equatoriana",

			    "Haitiana", "Holandesa", "Hondurenha", "Húngara",

			    "Iemenita", "Indiana", "Indonésia", "Iraniana", "Iraquiana",
			    "Irlandesa", "Islandesa", "Israelense", "Italiana",

			    "Jamaicana", "Japonesa", "Jordaniana",

			    "Cazaque", "Queniana", "Kiribatiana", "Kuwaitiana",

			    "Laociana", "Letã", "Libanesa", "Liberiana", "Líbia",
			    "Liechtensteinense", "Lituana", "Luxemburguesa",

			    "Macedônia", "Malaia", "Malauiana", "Maldiva", "Malinesa",
			    "Maltesa", "Marroquina", "Marshallina", "Mauriciana",
			    "Mauritana", "Mexicana", "Micronésia", "Moçambicana",
			    "Moldava", "Monegasca", "Mongol", "Montenegrina",

			    "Namibiana", "Nauruana", "Nepalesa", "Nicaraguense",
			    "Nigeriana", "Nigerina", "Norueguesa", "Neozelandesa",

			    "Omanense",

			    "Paquistanesa", "Panamenha", "Paraguaia", "Peruana",
			    "Polonesa", "Portuguesa",

			    "Queniana",

			    "Romena", "Russa", "Ruandesa",

			    "Salvadorenha", "Samoana", "São-tomense", "Saudita",
			    "Senegalesa", "Sérvia", "Seychelloise", "Serra-leonesa",
			    "Singapurense", "Síria", "Somali", "Sri-lankesa",
			    "Sul-africana", "Sudanesa", "Sueca", "Suíça",
			    "Surinamesa",

			    "Tailandesa", "Tajique", "Tanzaniana", "Timorense",
			    "Togolesa", "Tonganesa", "Trinitária", "Tunisiana",
			    "Turca", "Turcomena", "Tuvaluana",

			    "Ucraniana", "Ugandense", "Uruguaia", "Uzbeque",

			    "Venezuelana", "Vietnamita",

			    "Zambiana", "Zimbabuense"
			};

			comboBoxNacional.setModel(
			    new DefaultComboBoxModel<>(nacionalidades)
			);

			comboBoxNacional.setBounds(167, 98, 237, 22); // aumentei a largura
			panel.add(comboBoxNacional);
			
			JButton btnSalvar = new JButton("SALVAR");
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AtorController atorController = new AtorController();
					
					try {
						String nome = textField.getText();
						String nacionalidade = comboBoxNacional.getSelectedItem().toString();
						boolean sucesso = atorController.cadastrarAtor(nome,nacionalidade);
						if(sucesso) {
							JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso" );
							limparCampos();
						}else {
							JOptionPane.showMessageDialog(null,"Os Campos não foram preenchidos corretamente" );
						}
					} catch (Exception ex) {
						  JOptionPane.showMessageDialog(null,
			                    "Erro ao cadastrar ator: " + ex.getMessage(),
			                    "Erro",
			                    JOptionPane.ERROR_MESSAGE);
			            }
										
				}
			});
			btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
			btnSalvar.setBounds(12, 165, 102, 29);
			panel.add(btnSalvar);
			
			JButton btnLimpar = new JButton("LIMPAR");
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					limparCampos();
				}
			});
			
			btnLimpar.setFont(new Font("Calibri", Font.BOLD, 16));
			btnLimpar.setBounds(126, 165, 113, 29);
			panel.add(btnLimpar);
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cancelarAtor();
				}
			});
			
			btnCancelar.setFont(new Font("Calibri", Font.BOLD, 16));
			btnCancelar.setBounds(264, 165, 121, 29);
			panel.add(btnCancelar);
			
			JButton btnConsultar = new JButton("CONSULTAR");
			btnConsultar.setFont(new Font("Calibri", Font.BOLD, 16));
			btnConsultar.setBounds(397, 165, 131, 29);
			panel.add(btnConsultar);
			//Adiciona o evento de clique no botão
			btnConsultar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaConsultaAtor telaConsulta = new TelaConsultaAtor(TelaCadastroAtor.this);
					telaConsulta.setVisible(true);

					// Esconde a tela de cadastro atual
					TelaCadastroAtor.this.setVisible(false);
				}
			});
		
	}
	private void limparCampos() {		
		textField.setText("");
		comboBoxNacional.setSelectedIndex(0);	   
	}
	
	private void cancelarAtor() {
		this.dispose();
	}
}
