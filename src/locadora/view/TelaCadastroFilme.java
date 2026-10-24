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
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import locadora.controller.FilmeController;

public class TelaCadastroFilme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextArea textAreaSinopse;
	private JComboBox<String> comboBoxGenero;
	private JSpinner spinnerDuracao;

	/**
	 * Create the frame.
	 */
	public TelaCadastroFilme() {
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Video Locadora Hora da Pipoca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro de Filme");
		lblNewLabel.setIcon(new ImageIcon(
				"/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-documentário-48.png"));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setBounds(236, 12, 275, 41);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(25, 78, 732, 360);
		contentPane.add(panel);

		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTitulo.setBounds(45, 23, 64, 20);
		panel.add(lblTitulo);

		textFieldTitulo = new JTextField();
		textFieldTitulo.setFont(new Font("Calibri", Font.BOLD, 14));
		textFieldTitulo.setToolTipText("informe o titulo do filme ");
		textFieldTitulo.setBounds(119, 21, 485, 20);
		panel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);

		JLabel lblGenero = new JLabel("Gênero:");
		lblGenero.setFont(new Font("Calibri", Font.BOLD, 14));
		lblGenero.setBounds(45, 57, 100, 20);
		panel.add(lblGenero);

		comboBoxGenero = new JComboBox<>();
		comboBoxGenero.setToolTipText("informe o genero do filme");
		comboBoxGenero.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione uma genêro:", "Ação", "Animação", "Aventura", "Comédia", "Documentário",
						"Fantasia", "Ficção Cientifica", "Musicais", "Romance", "Suspense", "Terror", "Drama", }));
		comboBoxGenero.setFont(new Font("Calibri", Font.BOLD, 14));
		comboBoxGenero.setBounds(119, 56, 164, 22); // aumentei a largura
		panel.add(comboBoxGenero);

		JLabel lblSinopse = new JLabel("Sinopse:");
		lblSinopse.setFont(new Font("Calibri", Font.BOLD, 14));
		lblSinopse.setBounds(45, 91, 64, 20);
		panel.add(lblSinopse);

		textAreaSinopse = new JTextArea();
		textAreaSinopse.setFont(new Font("Calibri", Font.BOLD, 14));
		textAreaSinopse.setToolTipText("Informe a sinopse do filme");
		textAreaSinopse.setBounds(119, 88, 485, 127);
		panel.add(textAreaSinopse);

		spinnerDuracao = new JSpinner();
		spinnerDuracao.setModel(new SpinnerNumberModel(20, 20, 300, 10));
		spinnerDuracao.setFont(new Font("Calibri", Font.BOLD, 14));
		spinnerDuracao.setToolTipText("Informa da duração do filme ");
		spinnerDuracao.setBounds(119, 237, 64, 29);
		panel.add(spinnerDuracao);

		JLabel lblNewLabel_1 = new JLabel("minutos");
		lblNewLabel_1.setBounds(194, 252, 57, 14);
		panel.add(lblNewLabel_1);

		// Botão Salvar e tratamento.
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int duracao = (Integer) spinnerDuracao.getValue();
					String genero = comboBoxGenero.getSelectedItem().toString();
					FilmeController filmeController = new FilmeController();
					boolean sucesso = filmeController.cadastrarFilmes(textFieldTitulo.getText(), genero,
							textAreaSinopse.getText(), duracao);
					if (sucesso) {
						JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso");
						limparCampos();

					} else {
						JOptionPane.showMessageDialog(null, "Os Campos não foram preenchidos corretamente");
					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar filme: " + ex.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnSalvar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSalvar.setBounds(45, 304, 100, 29);
		panel.add(btnSalvar);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();

			}
		});
		btnLimpar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnLimpar.setBounds(179, 304, 104, 29);
		panel.add(btnLimpar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelarTela();
			}
		});
		btnCancelar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCancelar.setBounds(313, 304, 127, 29);
		panel.add(btnCancelar);

		// 1. Criação e configuração do botão "CONSULTAR"
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnConsultar.setBounds(485, 304, 136, 29);
		panel.add(btnConsultar);

		// 2. Adiciona o evento de clique no botão
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaFilme telaConsulta = new TelaConsultaFilme(TelaCadastroFilme.this);
				telaConsulta.setVisible(true);

				// Esconde a tela de cadastro atual
				TelaCadastroFilme.this.setVisible(false);
			}
		});

		JLabel lblDuracao = new JLabel("Duração:");
		lblDuracao.setFont(new Font("Calibri", Font.BOLD, 14));
		lblDuracao.setBounds(45, 246, 64, 20);
		panel.add(lblDuracao);

	}

	private void limparCampos() {
		textFieldTitulo.setText("");
		textAreaSinopse.setText("");
		comboBoxGenero.setSelectedIndex(0);
		spinnerDuracao.setValue(20);
	}

	private void CancelarTela() {
		this.dispose();

	}
}
