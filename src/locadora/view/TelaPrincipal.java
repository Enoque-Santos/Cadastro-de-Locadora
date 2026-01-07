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
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Video Locadora Hora da Pipoca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBarTelaPrincipal = new JMenuBar();
		setJMenuBar(menuBarTelaPrincipal);
		
		JMenu mnMenuLocacao = new JMenu("Locação");
		mnMenuLocacao.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnMenuLocacao);
		
		JMenuItem mntmNewMenuItemAlugar = new JMenuItem("Alugar");
		mntmNewMenuItemAlugar.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItemAlugar.setFont(new Font("Calibri", Font.BOLD, 14));
		mnMenuLocacao.add(mntmNewMenuItemAlugar);
		
		JMenuItem mntmNewMenuItemConsulta = new JMenuItem("Consulta");
		mntmNewMenuItemConsulta.setFont(new Font("Calibri", Font.BOLD, 14));
		mnMenuLocacao.add(mntmNewMenuItemConsulta);
		
		JMenu mnNewCadasttro = new JMenu("Cadastro");
		mnNewCadasttro.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnNewCadasttro);
		
		JMenuItem mntmNewMenuItemAtor = new JMenuItem("Ator");
		mntmNewMenuItemAtor.setFont(new Font("Calibri", Font.BOLD, 14));
		mnNewCadasttro.add(mntmNewMenuItemAtor);
		
		JMenuItem mntmNewMenuItemCliente = new JMenuItem("Cliente");
		mntmNewMenuItemCliente.setFont(new Font("Calibri", Font.BOLD, 14));
		mnNewCadasttro.add(mntmNewMenuItemCliente);
		
		JMenuItem mntmNewMenuItemFilme = new JMenuItem("Filme");
		mntmNewMenuItemFilme.setFont(new Font("Calibri", Font.BOLD, 14));
		mntmNewMenuItemFilme.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        TelaCadastroFilme telaFilme = new TelaCadastroFilme();
		        telaFilme.setVisible(true);
		    }
		});
		mnNewCadasttro.add(mntmNewMenuItemFilme);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Item");
		mntmNewMenuItem.setFont(new Font("Calibri", Font.BOLD, 14));
		mnNewCadasttro.add(mntmNewMenuItem);
		
		JMenu mnNewSair = new JMenu("Sair");
		mnNewSair.setFont(new Font("Calibri", Font.BOLD, 14));
		menuBarTelaPrincipal.add(mnNewSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabelIMG = new JLabel("");
		lblNewLabelIMG.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/36477..png")));
		contentPane.add(lblNewLabelIMG);
		setBounds(100, 100, 800, 600);
	}

}
