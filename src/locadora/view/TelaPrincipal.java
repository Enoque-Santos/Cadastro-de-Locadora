package locadora.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Toolkit;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setForeground(UIManager.getColor("CheckBoxMenuItem.selectionForeground"));
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("HORA DA PIPOCA\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);

		JMenuBar menuBarTelaPrincipal = new JMenuBar();
		setJMenuBar(menuBarTelaPrincipal);

		JMenu mnMenuLocacao = new JMenu("Locação");
		mnMenuLocacao.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-avançar-16.png"));
		mnMenuLocacao.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnMenuLocacao);

		JMenuItem mntmNewMenuItemAlugar = new JMenuItem("Alugar");
		mntmNewMenuItemAlugar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItemAlugar.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItemAlugar.setFont(new Font("Calibri", Font.BOLD, 14));
		mnMenuLocacao.add(mntmNewMenuItemAlugar);

		JMenuItem mntmNewMenuItemConsulta = new JMenuItem("Consulta");
		mntmNewMenuItemConsulta.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItemConsulta.setFont(new Font("Calibri", Font.BOLD, 14));
		mnMenuLocacao.add(mntmNewMenuItemConsulta);

		
		// menu de cadastro
		JMenu mnNewCadastro = new JMenu("Cadastro");
		mnNewCadastro.setIcon(new ImageIcon("/media/enoque/Projetos/JAVA/Cadastro-de-Locadora/src/imagens/icons8-avançar-16.png"));
		mnNewCadastro.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnNewCadastro);

		JMenuItem mntmNewMenuItemAtor = new JMenuItem("Ator");
		mntmNewMenuItemAtor.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItemAtor.setFont(new Font("Calibri", Font.BOLD, 14));
		mntmNewMenuItemAtor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroAtor telaCliente = new TelaCadastroAtor();
				telaCliente.setVisible(true);
			}
		});
		
		mnNewCadastro.add(mntmNewMenuItemAtor);
		
		//chama tela de cadastro cliente	
		JMenuItem mntmNewMenuItemCliente = new JMenuItem("Cliente");
		mntmNewMenuItemCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItemCliente.setFont(new Font("Calibri", Font.BOLD, 14));
		mntmNewMenuItemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente telaCliente = new TelaCadastroCliente();
				telaCliente.setVisible(true);
			}
		});
		
		
		mnNewCadastro.add(mntmNewMenuItemCliente);

		//chama tela de cadastro  filme
		JMenuItem mntmNewMenuItemFilme = new JMenuItem("Filme");
		mntmNewMenuItemFilme.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItemFilme.setFont(new Font("Calibri", Font.BOLD, 14));
		mntmNewMenuItemFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFilme telaFilme = new TelaCadastroFilme();
				telaFilme.setVisible(true);
			}
		});
		mnNewCadastro.add(mntmNewMenuItemFilme);

		
		//chama tela de cadastro item
		JMenuItem mntmNewMenuItem = new JMenuItem("Item");
		mntmNewMenuItem.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/icons8-ordenar-para-a-direita-13.png")));
		mntmNewMenuItem.setFont(new Font("Calibri", Font.BOLD, 14));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroItem telaItem = new TelaCadastroItem();
				telaItem.setVisible(true);
			}
		});
		mnNewCadastro.add(mntmNewMenuItem);
		
			

		JMenu mnNewSair = new JMenu("Sair");
		mnNewSair.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnNewSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(94, 92, 100));
		panel.setBounds(12, 0, 576, 374);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/locadora/imagens/cinema(2).png")));
		lblNewLabel.setBounds(24, 0, 540, 374);
		panel.add(lblNewLabel);
	

		
	}
}
