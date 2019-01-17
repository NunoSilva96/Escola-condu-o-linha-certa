package com.escoladigital.tgpsi2013;

import java.awt.EventQueue;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JList;

import java.awt.SystemColor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextPane;

public class Gestao {

	private JFrame frame;
	private JTextField txtNomeDeUtilizador;
	private JTextField txtAdcionar_Aluno_Nome;
	private JTextField txtAdcionar_Aluno_Morada;
	private JTextField txtAdcionar_Aluno_Numero_Porta;
	private JTextField txtAdcionar_Aluno_Fracao;
	private JTextField txtAdcionar_Aluno_C_Postal;
	private JTextField txtAdcionar_Aluno_Freguesia;
	private JTextField txtAdcionar_Aluno_Data_Nascimento;
	private JTextField txtAdcionar_Aluno_Nacionalidade;
	private JTextField txtAdcionar_Aluno_Numero_CC;
	private JTextField txtAdcionar_Aluno_Numero_Aluno;
	private JTextField txtAdcionar_Aluno_NIF;
	private JTextField txtAdcionar_Aluno_Contacto_Telefonico;
	private JTextField txtAdcionar_Aluno_Email;
	private JTextField txtAdcionar_Aluno_Categoria;
	private JTextField txtAdcionar_Aluno_Data_Inscricao;
	private JTextField txtAdcionar_Aluno_Validade;
	private JTextField txtAdcionar_Aluno_Data_Emissao;
	private JTextField txtAdcionar_Aluno_Contacto_Movel;
	private JTextField text_Editar_Aluno_NomeCompleto;
	private JTextField text_Editar_Aluno_Morada;
	private JTextField text_Editar_Aluno_NumeroPorta;
	private JTextField text_Editar_Aluno_Fracao;
	private JTextField text_Editar_Aluno_C_Postal;
	private JTextField text_Editar_Aluno_Freguesia;
	private JTextField text_Editar_Aluno_Data_Nascimento;
	private JTextField text_Editar_Aluno_Nacionalidade;
	private JTextField text_Editar_Aluno_Numero_CC;
	private JTextField text_Editar_Aluno_Validade;
	private JTextField text_Editar_Aluno_NIF;
	private JTextField text_Editar_Aluno_Data_Emissao;
	private JTextField text_Editar_Aluno_Contacto_Telefonico;
	private JTextField text_Editar_Aluno_Contacto_Movel;
	private JTextField text_Editar_Aluno_Email;
	private JTextField text_Editar_Aluno_Categoria;
	private JTextField text_Editar_Aluno_Data_Inscricao;
	private JTextField txtAdicionar_Veiculo_Marca;
	private JTextField txtAdicionar_Veiculo_Modelo;
	private JTextField txtAdicionar_Veiculo_Matricula;
	private JTextField txtAdicionar_Veiculo_Motorizacao;
	private JTextField txtAdicionar_Veiculo_Combustivel;
	private JTextField txtAdicionar_Veiculo_Numero_Quadro;
	private JTextField txtAdicionar_Veiculo_Ano;
	private JTextField txtAdicionar_Veiculo_Mes;
	private JTextField txtEditar_Veiculo_Marca;
	private JTextField txtEditar_Veiculo_Modelo;
	private JTextField txtEditar_Veiculo_Motorizacao;
	private JTextField txtEditar_Veiculo_Combustivel;
	private JTextField txtEditar_Veiculo_NumeroQuadro;
	private JTextField txtEditar_Veiculo_Ano;
	private JTextField txtEditar_Veiculo_Mes;
	private JTextField txtApagar_Veiculo_Matricula;
	private JTextField txtAdicionar_Docente_CodigoDocente;
	private JTextField txtAdicionar_Docente_NomeCompleto;
	private JTextField txtAdicionar_Docente_Morada;
	private JTextField txtAdicionar_Docente_NumeroPorta;
	private JTextField txtAdicionar_Docente_DataNascimento;
	private JTextField txtAdicionar_Docente_NIF;
	private JTextField txtAdicionar_Docente_Contacto;
	private JTextField txtAdicionar_Docente_Email;
	private JTextField txtAdicionar_Docente_Fração;
	private JPasswordField txtAdicionar_Docente_Password;
	private JPasswordField txtEditar_Docente_PalavraChave;
	private JTextField txtEditar_Docente_NomeCompleto;
	private JTextField txtEditar_Docente_Morada;
	private JTextField txtEditar_Docente_NumeroPorta;
	private JTextField txtEditar_Docente_Fracao;
	private JTextField txtEditar_Docente_DataNascimento;
	private JTextField txtEditar_Docente_NIF;
	private JTextField txtEditar_Docente_Contacto;
	private JTextField txtEditar_Docente_Email;
	private JTextField txtMarcar_Aula_NumeroAula;
	private JTextField text_Editar_Aluno_PalavraChave;
	private JButton btnLimparFormulrio;
	private JButton btn_Editar_Voltar_LimparFormulario;
	private JButton btn_Editar_Aluno_Voltar;
	private JButton btnValidarEdio;
	private JComboBox combobox_Adicionar_Docente_Cargo;
	private JComboBox comboboxEditar_Docente_Cargo;
	private JTextArea txtApagar_Docente_Motivo;
	private JComboBox comboboxAdicionar_Veiculos_CodigoDocente;
	private JComboBox comboboxEditar_Veiculo_CodigoDocente;
	private JTextArea txtApagar_Veiculo_Motivo;
	private JComboBox comboboxMarcar_Aula_Hora;
	private JComboBox comboboxMarcar_Aula_Minuto;
	private JRadioButton radio_Alunos;
	private JRadioButton radio_Docentes;
	private JRadioButton radio_Administradores;
	DefaultListModel<String> model = new DefaultListModel<>();
	private JList<String> list = new JList<>(model);
	private JTextArea textArea_registos;
	DefaultTableModel modelo_Docentes = new DefaultTableModel() {
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		
	};
	private JTable tableAulas_Marcadas;
	DefaultTableModel aulas_marcadas = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		
	};
	
	DefaultTableModel administrador_listar = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		
	};
	
	DefaultTableModel desmarcar_aulas = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		
	};
	
	DefaultTableModel modelo_Veiculos = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
	};
	DefaultTableModel modelo_Aulas = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
	};
	
	DefaultTableModel modelo_Alunos = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
		       return false;
		    }
	};
	private JTextField txtMarcar_Aulas_data;
	private JTextField txtAdministrador_Adicionar_CodigoAdministrador;
	private JTextField txtAdministrador_Adicionar_Email;
	private JTextField txtAdministrador_Adicionar_NomeCompleto;
	private JPasswordField txtAdministrador_Adicionar_PalavraChave;
	private JPasswordField txtAdministrador_Editar_PalavraChave;
	private JTextField txtAdministrador_Editar_Email;
	private JTextField txtAdministrador_Editar_NomeCompleto;
	private JComboBox comboboxAdministrador_Editar_CodigoAdministrador;
	private JComboBox comboboxAdministrador_Apagar_CodigoAdministrador;
	private JTextPane txtAdministrador_Apagar_Motivo;
	private JComboBox comboBoxEditar_Docente_CodigoDocente;
	private JComboBox comboBoxApagar_Docente_CodigoDocente;
	private JComboBox comboBoxRemover_Aluno_NumeroAluno;
	private JComboBox comboBoxEditar_Aluno_NumeroAluno;
	private JRadioButton radiologin_Administrador;
	private JRadioButton radiologin_Docente;
	private JTextArea txtAdministrador_ConsultarSessoes;
	private JTextArea txtRemover_Aluno_Motivo;
	private String entrada;
	private JComboBox comboboxEditar_Veiculo_Matricula;
	private JTextField txtMarcar_Aula_NumeroAluno;
	private JTextField txtMarcar_Aula_Instrutor;
	private JPasswordField txtPalavraChave;
	private JPasswordField txtAdcionar_Aluno_PalavraChave;
	private JTextField txtDesmarcar_Aula_NumeroAula;
	private JTextPane txtDesmarcar_Aula_Motivo;
	private JRadioButton radioButton_ConsultarSessoes_Docentes;
	private JRadioButton radioButton_ConsultarSessoes_Administradores;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestao window = new Gestao();
					window.frame.setVisible(true);
					 window.frame.setExtendedState(window.frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gestao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1193, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel home_page = new JPanel();
		frame.getContentPane().add(home_page, "home_page");
		home_page.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Topo = new JPanel();
		home_page.add(panel_Topo, BorderLayout.NORTH);
		panel_Topo.setBackground(Color.BLACK);
		GridBagLayout gbl_panel_Topo = new GridBagLayout();
		gbl_panel_Topo.columnWidths = new int[]{30, 0, 0};
		gbl_panel_Topo.rowHeights = new int[]{85, 64, 0};
		gbl_panel_Topo.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Topo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_Topo.setLayout(gbl_panel_Topo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 2;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_Topo.add(label, gbc_label);
		
		JLabel lblEscolaDeConduo = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa");
		lblEscolaDeConduo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblEscolaDeConduo.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblEscolaDeConduo = new GridBagConstraints();
		gbc_lblEscolaDeConduo.anchor = GridBagConstraints.SOUTH;
		gbc_lblEscolaDeConduo.insets = new Insets(0, 0, 5, 0);
		gbc_lblEscolaDeConduo.gridx = 1;
		gbc_lblEscolaDeConduo.gridy = 0;
		panel_Topo.add(lblEscolaDeConduo, gbc_lblEscolaDeConduo);
		
		JLabel lblGesto = new JLabel("Gest\u00E3o");
		lblGesto.setForeground(Color.WHITE);
		lblGesto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblGesto = new GridBagConstraints();
		gbc_lblGesto.anchor = GridBagConstraints.NORTH;
		gbc_lblGesto.gridx = 1;
		gbc_lblGesto.gridy = 1;
		panel_Topo.add(lblGesto, gbc_lblGesto);
		
		JPanel panel_Mid = new JPanel();
		home_page.add(panel_Mid, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Mid = new GridBagLayout();
		gbl_panel_Mid.columnWidths = new int[]{183, 124, 142, 180, 138, 126, 0, 0, 0};
		gbl_panel_Mid.rowHeights = new int[]{67, 73, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_Mid.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Mid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_Mid.setLayout(gbl_panel_Mid);
		panel_Mid.setBackground(new Color(240, 255, 240));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/rsz_1users-enter-2-icon.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panel_Mid.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAutenticaoNecessria = new JLabel("Autentica\u00E7\u00E3o Necess\u00E1ria:");
		lblAutenticaoNecessria.setFont(new Font("SansSerif", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAutenticaoNecessria = new GridBagConstraints();
		gbc_lblAutenticaoNecessria.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutenticaoNecessria.gridx = 2;
		gbc_lblAutenticaoNecessria.gridy = 2;
		panel_Mid.add(lblAutenticaoNecessria, gbc_lblAutenticaoNecessria);
		
		JLabel lblNewLabel_2 = new JLabel("     Gest\u00E3o");
		lblNewLabel_2.setFont(new Font("Britannic Bold", Font.PLAIN, 19));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 2;
		panel_Mid.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblEscolaDeConduo_1 = new JLabel("Escola de Condu\u00E7\u00E3o");
		lblEscolaDeConduo_1.setFont(new Font("Britannic Bold", Font.PLAIN, 19));
		GridBagConstraints gbc_lblEscolaDeConduo_1 = new GridBagConstraints();
		gbc_lblEscolaDeConduo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscolaDeConduo_1.gridx = 6;
		gbc_lblEscolaDeConduo_1.gridy = 2;
		panel_Mid.add(lblEscolaDeConduo_1, gbc_lblEscolaDeConduo_1);
		
		txtNomeDeUtilizador = new JTextField();
		txtNomeDeUtilizador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtNomeDeUtilizador.setText("");
			}
		});
		txtNomeDeUtilizador.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomeDeUtilizador.setText("Nome de Utilizador");
		GridBagConstraints gbc_txtNomeDeUtilizador = new GridBagConstraints();
		gbc_txtNomeDeUtilizador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeDeUtilizador.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeDeUtilizador.gridx = 2;
		gbc_txtNomeDeUtilizador.gridy = 3;
		panel_Mid.add(txtNomeDeUtilizador, gbc_txtNomeDeUtilizador);
		txtNomeDeUtilizador.setColumns(10);
		
		radiologin_Administrador = new JRadioButton("Administrador");
		radiologin_Administrador.setBackground(new Color(240, 255, 240));
		GridBagConstraints gbc_radiologin_Administrador = new GridBagConstraints();
		gbc_radiologin_Administrador.anchor = GridBagConstraints.WEST;
		gbc_radiologin_Administrador.insets = new Insets(0, 0, 5, 5);
		gbc_radiologin_Administrador.gridx = 3;
		gbc_radiologin_Administrador.gridy = 3;
		panel_Mid.add(radiologin_Administrador, gbc_radiologin_Administrador);
		
		JLabel lblGestoDos = new JLabel("\u261B Gest\u00E3o dos Alunos");
		GridBagConstraints gbc_lblGestoDos = new GridBagConstraints();
		gbc_lblGestoDos.anchor = GridBagConstraints.WEST;
		gbc_lblGestoDos.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestoDos.gridx = 4;
		gbc_lblGestoDos.gridy = 3;
		panel_Mid.add(lblGestoDos, gbc_lblGestoDos);
		
		JLabel lblRuaDo = new JLabel("\u261B Rua do Sentido \u00DAnico, n\u00BA52A");
		GridBagConstraints gbc_lblRuaDo = new GridBagConstraints();
		gbc_lblRuaDo.anchor = GridBagConstraints.WEST;
		gbc_lblRuaDo.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuaDo.gridx = 6;
		gbc_lblRuaDo.gridy = 3;
		panel_Mid.add(lblRuaDo, gbc_lblRuaDo);
		
		txtPalavraChave = new JPasswordField();
		txtPalavraChave.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtPalavraChave = new GridBagConstraints();
		gbc_txtPalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_txtPalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPalavraChave.gridx = 2;
		gbc_txtPalavraChave.gridy = 4;
		panel_Mid.add(txtPalavraChave, gbc_txtPalavraChave);
		
		radiologin_Docente = new JRadioButton("Docente");
		radiologin_Docente.setBackground(new Color(240, 255, 240));
		GridBagConstraints gbc_radiologin_Docente = new GridBagConstraints();
		gbc_radiologin_Docente.anchor = GridBagConstraints.WEST;
		gbc_radiologin_Docente.insets = new Insets(0, 0, 5, 5);
		gbc_radiologin_Docente.gridx = 3;
		gbc_radiologin_Docente.gridy = 4;
		panel_Mid.add(radiologin_Docente, gbc_radiologin_Docente);
		
		JLabel lblGestoDos_1 = new JLabel("\u261B Gest\u00E3o dos Docentes");
		GridBagConstraints gbc_lblGestoDos_1 = new GridBagConstraints();
		gbc_lblGestoDos_1.anchor = GridBagConstraints.WEST;
		gbc_lblGestoDos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestoDos_1.gridx = 4;
		gbc_lblGestoDos_1.gridy = 4;
		panel_Mid.add(lblGestoDos_1, gbc_lblGestoDos_1);
		
		JLabel label_1 = new JLabel("\u261B 1800-999");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 4;
		panel_Mid.add(label_1, gbc_label_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(radiologin_Administrador.isSelected())
				{
					try{
						Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
						PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Codigo_Administrador, Palavra_Chave FROM administrador");
						ResultSet res=instP.executeQuery();
						
						String codigo_escrito = txtNomeDeUtilizador.getText();
						String palavra_escrita = String.valueOf(txtPalavraChave.getPassword());

						if(res.next()){
							String codigo_administrador = res.getString("Codigo_Administrador");
							String palavra_chave = res.getString("Palavra_Chave");
							
								if(codigo_escrito.equals(codigo_administrador))
								{
									if(palavra_escrita.equals(palavra_chave))
									{
										CardLayout card=(CardLayout)frame.getContentPane().getLayout();
										card.show(frame.getContentPane(), "panel_Second");
										JOptionPane.showMessageDialog(null, "Bem-Vindo ao Programa de Gestão da Escola Linha Certa!\nEntrou como: Administrador");						    
									    entrada = "Administrador";
										try{
									    		java.util.Date data = new java.util.Date();  
									    		SimpleDateFormat formatarDate = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
									    		
									    		String filename = formatarDate.format(data) + " - Administrador";

									        	File file =new File("logs/Sessoes/Administradores/" + filename);
									        	if(!file.exists()){
									        	   file.createNewFile();
									        	}

									          }catch(IOException ex){
									             JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
									           }
									    }
									else
									{
										JOptionPane.showMessageDialog(null, "Utilizador ou Palavra Chave errados!");
									}
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Utilizador ou Palavra Chave errados!");
								}
						}
				
				
				
						}
						catch(Exception ex)
						{
							JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
						}
				}
				else if(radiologin_Docente.isSelected())
				{
					try{
						Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
						PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Codigo_Docente, Palavra_Chave FROM docentes");
						ResultSet res=instP.executeQuery();
					
						String codigo_escrito = txtNomeDeUtilizador.getText();
						String palavra_escrita = String.valueOf(txtPalavraChave.getPassword());

						if(res.next()){
							String codigo_docente = res.getString("Codigo_Docente");
							String palavra_chave = res.getString("Palavra_Chave");
						
							if(codigo_escrito.equals(codigo_docente))
							{
								if(palavra_escrita.equals(palavra_chave))
								{
									CardLayout card=(CardLayout)frame.getContentPane().getLayout();
									card.show(frame.getContentPane(), "panel_Second");
									JOptionPane.showMessageDialog(null, "Bem-Vindo ao Programa de Gestão da Escola Linha Certa!\nEntrou como: Docente");
									entrada = "Docente";
									try{
							    		Date data = new Date(System.currentTimeMillis());  
							    		SimpleDateFormat formatarDate = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
							    		
							    		String filename = formatarDate.format(data) + "- Administrador";

							        	File file =new File("logs/Sessoes/Docentes/" + filename);
							        	if(!file.exists()){
							        	   file.createNewFile();
							        	}
							          }catch(IOException ex){
							             JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
							           }
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Utilizador ou Palavra Chave Errados!");
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Utilizador ou Palavra Chave Errados!");
							}
						
						}
						
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}

				}
				else
				{
					JOptionPane.showMessageDialog(null, "Deve selecionar o tipo de conta!");
				}
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/rsz_11login_button.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		panel_Mid.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblGestoDos_2 = new JLabel("\u261B Gest\u00E3o dos Ve\u00EDculos");
		GridBagConstraints gbc_lblGestoDos_2 = new GridBagConstraints();
		gbc_lblGestoDos_2.anchor = GridBagConstraints.WEST;
		gbc_lblGestoDos_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestoDos_2.gridx = 4;
		gbc_lblGestoDos_2.gridy = 5;
		panel_Mid.add(lblGestoDos_2, gbc_lblGestoDos_2);
		
		JLabel lblInfolinhacertapt = new JLabel("\u261B info@linhacerta.pt");
		GridBagConstraints gbc_lblInfolinhacertapt = new GridBagConstraints();
		gbc_lblInfolinhacertapt.anchor = GridBagConstraints.WEST;
		gbc_lblInfolinhacertapt.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfolinhacertapt.gridx = 6;
		gbc_lblInfolinhacertapt.gridy = 5;
		panel_Mid.add(lblInfolinhacertapt, gbc_lblInfolinhacertapt);
		
		JLabel lblMarcaoDe = new JLabel("\u261B Marca\u00E7\u00E3o de Aulas");
		GridBagConstraints gbc_lblMarcaoDe = new GridBagConstraints();
		gbc_lblMarcaoDe.anchor = GridBagConstraints.WEST;
		gbc_lblMarcaoDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarcaoDe.gridx = 4;
		gbc_lblMarcaoDe.gridy = 6;
		panel_Mid.add(lblMarcaoDe, gbc_lblMarcaoDe);
		
		JLabel label_2 = new JLabel("\u261B 210 000 000");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 6;
		panel_Mid.add(label_2, gbc_label_2);
		
		JPanel panel_Second = new JPanel();
		frame.getContentPane().add(panel_Second, "panel_Second");
		panel_Second.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_Second.add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{30, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{85, 64, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_3 = new JLabel("");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridheight = 2;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 0;
		panel_1.add(label_3, gbc_label_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.gridheight = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 0;
		panel_1.add(label_6, gbc_label_6);
		
		JLabel lblEscolaDeConduo_2 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		lblEscolaDeConduo_2.setForeground(Color.WHITE);
		lblEscolaDeConduo_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblEscolaDeConduo_2 = new GridBagConstraints();
		gbc_lblEscolaDeConduo_2.anchor = GridBagConstraints.SOUTH;
		gbc_lblEscolaDeConduo_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblEscolaDeConduo_2.gridx = 2;
		gbc_lblEscolaDeConduo_2.gridy = 0;
		panel_1.add(lblEscolaDeConduo_2, gbc_lblEscolaDeConduo_2);
		
		JLabel lblGesto_1 = new JLabel("Gest\u00E3o            ");
		lblGesto_1.setForeground(Color.WHITE);
		lblGesto_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblGesto_1 = new GridBagConstraints();
		gbc_lblGesto_1.anchor = GridBagConstraints.NORTH;
		gbc_lblGesto_1.gridx = 2;
		gbc_lblGesto_1.gridy = 1;
		panel_1.add(lblGesto_1, gbc_lblGesto_1);
		
		JPanel panel_2 = new JPanel();
		panel_Second.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{70, 0, 250, 200, 250, 200, 250, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{61, 43, 0, 79, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		panel_2.setBackground(new Color(240, 255, 240));
		
		JLabel lblAluno = new JLabel("");
		lblAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Alunos");
			}
		});
		lblAluno.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/alunos.png")));
		GridBagConstraints gbc_lblAluno = new GridBagConstraints();
		gbc_lblAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblAluno.gridx = 2;
		gbc_lblAluno.gridy = 2;
		panel_2.add(lblAluno, gbc_lblAluno);
		
		JLabel lblAulas = new JLabel("");
		lblAulas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Aulas_Conducao");
			}
		});
		lblAulas.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/aulas.png")));
		GridBagConstraints gbc_lblAulas = new GridBagConstraints();
		gbc_lblAulas.insets = new Insets(0, 0, 5, 5);
		gbc_lblAulas.gridx = 4;
		gbc_lblAulas.gridy = 2;
		panel_2.add(lblAulas, gbc_lblAulas);
		
		JLabel lblVeiculos = new JLabel("");
		lblVeiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Veiculos");
			}
		});
		lblVeiculos.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/veiculo.png")));
		GridBagConstraints gbc_lblVeiculos = new GridBagConstraints();
		gbc_lblVeiculos.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeiculos.gridx = 6;
		gbc_lblVeiculos.gridy = 2;
		panel_2.add(lblVeiculos, gbc_lblVeiculos);
		
		JLabel lblAlunos = new JLabel("Alunos");
		lblAlunos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAlunos = new GridBagConstraints();
		gbc_lblAlunos.anchor = GridBagConstraints.NORTH;
		gbc_lblAlunos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlunos.gridx = 2;
		gbc_lblAlunos.gridy = 3;
		panel_2.add(lblAlunos, gbc_lblAlunos);
		
		JLabel lblAulas_1 = new JLabel("Aulas Condu\u00E7\u00E3o");
		lblAulas_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAulas_1 = new GridBagConstraints();
		gbc_lblAulas_1.anchor = GridBagConstraints.NORTH;
		gbc_lblAulas_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAulas_1.gridx = 4;
		gbc_lblAulas_1.gridy = 3;
		panel_2.add(lblAulas_1, gbc_lblAulas_1);
		
		JLabel lblVeculos = new JLabel("Ve\u00EDculos");
		lblVeculos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVeculos = new GridBagConstraints();
		gbc_lblVeculos.anchor = GridBagConstraints.NORTH;
		gbc_lblVeculos.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeculos.gridx = 6;
		gbc_lblVeculos.gridy = 3;
		panel_2.add(lblVeculos, gbc_lblVeculos);
		
		JLabel lblAdministrador = new JLabel("");
		lblAdministrador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(entrada.equals("Administrador"))
				{
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administradores");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A sua conta não pertence à administração!");
				}
				
				
			}
		});
		lblAdministrador.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/admin.png")));
		GridBagConstraints gbc_lblAdministrador = new GridBagConstraints();
		gbc_lblAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdministrador.gridx = 2;
		gbc_lblAdministrador.gridy = 4;
		panel_2.add(lblAdministrador, gbc_lblAdministrador);
		
		JLabel lblDocentes = new JLabel("");
		lblDocentes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
			}
		});
		lblDocentes.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/docentes.png")));
		GridBagConstraints gbc_lblDocentes = new GridBagConstraints();
		gbc_lblDocentes.insets = new Insets(0, 0, 5, 5);
		gbc_lblDocentes.gridx = 4;
		gbc_lblDocentes.gridy = 4;
		panel_2.add(lblDocentes, gbc_lblDocentes);
		
		JLabel lblSair = new JLabel("");
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] opcoes = new String[2];
				opcoes[0] = new String("Sim");
				opcoes[1] = new String("Não");
				int resposta = JOptionPane.showOptionDialog(frame.getContentPane(),"Tem a certeza que quer terminar a sessão?","Terminar Sessão", 0,JOptionPane.INFORMATION_MESSAGE,null,opcoes,null);
				if(resposta == JOptionPane.YES_OPTION)
				{
					entrada = "";
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "home_page");
				}
			}
		});
		lblSair.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblSair = new GridBagConstraints();
		gbc_lblSair.insets = new Insets(0, 0, 5, 5);
		gbc_lblSair.gridx = 6;
		gbc_lblSair.gridy = 4;
		panel_2.add(lblSair, gbc_lblSair);
		
		JLabel lblAdministrador_1 = new JLabel("Administrador");
		lblAdministrador_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAdministrador_1 = new GridBagConstraints();
		gbc_lblAdministrador_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdministrador_1.gridx = 2;
		gbc_lblAdministrador_1.gridy = 5;
		panel_2.add(lblAdministrador_1, gbc_lblAdministrador_1);
		
		JLabel lblDocentes_1 = new JLabel("Docentes");
		lblDocentes_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDocentes_1 = new GridBagConstraints();
		gbc_lblDocentes_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDocentes_1.gridx = 4;
		gbc_lblDocentes_1.gridy = 5;
		panel_2.add(lblDocentes_1, gbc_lblDocentes_1);
		
		JLabel lblVoltar = new JLabel("Terminar Sess\u00E3o");
		lblVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar = new GridBagConstraints();
		gbc_lblVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar.gridx = 6;
		gbc_lblVoltar.gridy = 5;
		panel_2.add(lblVoltar, gbc_lblVoltar);
		

		JPanel panel_Alunos = new JPanel();
		frame.getContentPane().add(panel_Alunos, "panel_Alunos");
		panel_Alunos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_top = new JPanel();
		panel_top.setBackground(Color.BLACK);
		panel_Alunos.add(panel_top, BorderLayout.NORTH);
		GridBagLayout gbl_panel_top = new GridBagLayout();
		gbl_panel_top.columnWidths = new int[]{30, 0, 0, 0};
		gbl_panel_top.rowHeights = new int[]{85, 64, 0};
		gbl_panel_top.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_top.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_top.setLayout(gbl_panel_top);
		
		JLabel label_53 = new JLabel("");
		GridBagConstraints gbc_label_513 = new GridBagConstraints();
		gbc_label_513.gridheight = 2;
		gbc_label_513.insets = new Insets(0, 0, 0, 5);
		gbc_label_513.gridx = 0;
		gbc_label_513.gridy = 0;
		panel_top.add(label_53, gbc_label_513);
		
		JLabel label_642 = new JLabel("");
		label_642.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_641 = new GridBagConstraints();
		gbc_label_641.gridheight = 2;
		gbc_label_641.insets = new Insets(0, 0, 0, 5);
		gbc_label_641.gridx = 1;
		gbc_label_641.gridy = 0;
		panel_top.add(label_642, gbc_label_641);
		
		JLabel label_4 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.SOUTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 0;
		panel_top.add(label_4, gbc_label_4);
		
		JLabel lblAlunos_1 = new JLabel("Alunos              ");
		lblAlunos_1.setForeground(Color.WHITE);
		lblAlunos_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAlunos_1 = new GridBagConstraints();
		gbc_lblAlunos_1.anchor = GridBagConstraints.NORTH;
		gbc_lblAlunos_1.gridx = 2;
		gbc_lblAlunos_1.gridy = 1;
		panel_top.add(lblAlunos_1, gbc_lblAlunos_1);
		
		JPanel panel_mid = new JPanel();
		panel_Alunos.add(panel_mid, BorderLayout.CENTER);
		GridBagLayout gbl_panel_mid = new GridBagLayout();
		gbl_panel_mid.columnWidths = new int[]{128, 46, 60, 81, 80, 59, 80, 49, 80, 152, 78, 0};
		gbl_panel_mid.rowHeights = new int[]{151, 95, 66, 0, 0};
		gbl_panel_mid.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_mid.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_mid.setLayout(gbl_panel_mid);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Adicionar_Aluno");
				
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Numero_Aluno FROM alunos ORDER BY Numero_Aluno DESC LIMIT 1");
					ResultSet res=instP.executeQuery();
					
					
					if(res.next()){
						int Numero_Aluno = res.getInt("Numero_Aluno")+1;
						txtAdcionar_Aluno_Numero_Aluno.setText((Integer.toString(Numero_Aluno)));
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}
			}
		});
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Listar_Alunos");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Numero_Aluno`, Palavra_Chave, Nome, Morada,Numero_Porta, Fracao, Freguesia, Nacionalidade, Validade, Data_Emissao, C_Postal, Data_Nascimento, Numero_Cartao_Cidadao, NIF, Contacto_Telefonico, Contacto_Movel, Email, Categoria, Data_Inscricao FROM alunos");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						int numero_aluno = res.getInt("Numero_Aluno");
						String nome = res.getString("Nome");
						String palavra_chave = res.getString("Palavra_Chave");
						String morada = res.getString("Morada");
						int numero_porta = res.getInt("Numero_Porta");
						String fracao = res.getString("Fracao");
						String freguesia = res.getString("Freguesia");
						String nacionalidade = res.getString("Nacionalidade");
						Date validade = res.getDate("Validade");
						String data_validade = String.valueOf(validade);
						Date emissao = res.getDate("Data_Emissao");
						String data_emissao = String.valueOf(emissao);
						String c_postal = res.getString("C_Postal");
						
						Date nascimento = res.getDate("Data_Nascimento");
						String data_nascimento = String.valueOf(nascimento);
						
						String cartao_cidadao = res.getString("Numero_Cartao_Cidadao");
						int nif = res.getInt("NIF");
						int contacto_telefonico = res.getInt("Contacto_Telefonico");
						int contacto_movel = res.getInt("Contacto_Movel");
						String email = res.getString("Email");
						
						String categoria = res.getString("Categoria");
						
						Date inscricao = res.getDate("Data_Inscricao");
						String data_inscricao = String.valueOf(inscricao);

						modelo_Alunos.addRow(new Object[]{numero_aluno, palavra_chave, nome, morada, numero_porta, fracao, freguesia, nacionalidade, validade, data_emissao, c_postal, data_nascimento, cartao_cidadao, nif, contacto_telefonico, contacto_movel, email, categoria, data_inscricao});
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		lblNewLabel_29.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/lista_alunos.png")));
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_29.gridx = 1;
		gbc_lblNewLabel_29.gridy = 1;
		panel_mid.add(lblNewLabel_29, gbc_lblNewLabel_29);
		lblNewLabel_3.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/adicionar_aluno (2).png")));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 1;
		panel_mid.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Editar_Aluno");
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Numero_Aluno FROM alunos");
					
					ResultSet res = stmt.executeQuery();
					comboBoxEditar_Aluno_NumeroAluno.removeAllItems();
					while(res.next()){
						
						
						int numero_aluno = res.getInt("Numero_Aluno");
						comboBoxEditar_Aluno_NumeroAluno.addItem(numero_aluno);
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
				
				

			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/Editar_Aluno_NEW.png")));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 5;
		gbc_lblNewLabel_4.gridy = 1;
		panel_mid.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Apagar_Aluno");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Numero_Aluno FROM alunos");
					
					ResultSet res = stmt.executeQuery();
					comboBoxRemover_Aluno_NumeroAluno.removeAllItems();
					while(res.next()){
						
						
						int numero_aluno = res.getInt("Numero_Aluno");
						comboBoxRemover_Aluno_NumeroAluno.addItem(numero_aluno);
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/remover_aluno3.png")));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 7;
		gbc_lblNewLabel_5.gridy = 1;
		panel_mid.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Second");
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 9;
		gbc_lblNewLabel_6.gridy = 1;
		panel_mid.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblLista_2 = new JLabel("Listar");
		lblLista_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblLista_2 = new GridBagConstraints();
		gbc_lblLista_2.anchor = GridBagConstraints.NORTH;
		gbc_lblLista_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblLista_2.gridx = 1;
		gbc_lblLista_2.gridy = 2;
		panel_mid.add(lblLista_2, gbc_lblLista_2);
		
		JLabel lblAdicionar = new JLabel("Adicionar");
		lblAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAdicionar = new GridBagConstraints();
		gbc_lblAdicionar.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionar.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionar.gridx = 3;
		gbc_lblAdicionar.gridy = 2;
		panel_mid.add(lblAdicionar, gbc_lblAdicionar);
		
		JLabel lblEditar = new JLabel("Editar");
		lblEditar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEditar = new GridBagConstraints();
		gbc_lblEditar.anchor = GridBagConstraints.NORTH;
		gbc_lblEditar.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditar.gridx = 5;
		gbc_lblEditar.gridy = 2;
		panel_mid.add(lblEditar, gbc_lblEditar);
		
		JLabel lblRemover = new JLabel("Remover");
		lblRemover.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRemover = new GridBagConstraints();
		gbc_lblRemover.anchor = GridBagConstraints.NORTH;
		gbc_lblRemover.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemover.gridx = 7;
		gbc_lblRemover.gridy = 2;
		panel_mid.add(lblRemover, gbc_lblRemover);
		
		JLabel lblVoltar_1 = new JLabel("Voltar");
		lblVoltar_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_1 = new GridBagConstraints();
		gbc_lblVoltar_1.anchor = GridBagConstraints.NORTH;
		gbc_lblVoltar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_1.gridx = 9;
		gbc_lblVoltar_1.gridy = 2;
		panel_mid.add(lblVoltar_1, gbc_lblVoltar_1);
		
		JPanel panel_Listar_Alunos = new JPanel();
		frame.getContentPane().add(panel_Listar_Alunos, "panel_Listar_Alunos");
		panel_Listar_Alunos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.BLACK);
		panel_Listar_Alunos.add(panel_45, BorderLayout.NORTH);
		GridBagLayout gbl_panel_45 = new GridBagLayout();
		gbl_panel_45.columnWidths = new int[]{80, 0, 0};
		gbl_panel_45.rowHeights = new int[]{85, 64, 0};
		gbl_panel_45.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_45.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_45.setLayout(gbl_panel_45);
		
		JLabel label_102 = new JLabel("");
		label_102.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_102 = new GridBagConstraints();
		gbc_label_102.gridheight = 2;
		gbc_label_102.insets = new Insets(0, 0, 0, 5);
		gbc_label_102.gridx = 0;
		gbc_label_102.gridy = 0;
		panel_45.add(label_102, gbc_label_102);
		
		JLabel label_103 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_103.setForeground(Color.WHITE);
		label_103.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_103 = new GridBagConstraints();
		gbc_label_103.anchor = GridBagConstraints.SOUTH;
		gbc_label_103.insets = new Insets(0, 0, 5, 0);
		gbc_label_103.gridx = 1;
		gbc_label_103.gridy = 0;
		panel_45.add(label_103, gbc_label_103);
		
		JLabel lblListaDeAluns = new JLabel("Lista de Alunos");
		lblListaDeAluns.setForeground(Color.WHITE);
		lblListaDeAluns.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblListaDeAluns = new GridBagConstraints();
		gbc_lblListaDeAluns.anchor = GridBagConstraints.NORTH;
		gbc_lblListaDeAluns.gridx = 1;
		gbc_lblListaDeAluns.gridy = 1;
		panel_45.add(lblListaDeAluns, gbc_lblListaDeAluns);
		
		JPanel panel_46 = new JPanel();
		panel_Listar_Alunos.add(panel_46, BorderLayout.CENTER);
		GridBagLayout gbl_panel_46 = new GridBagLayout();
		gbl_panel_46.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_46.rowHeights = new int[]{0, 245, 51, 0};
		gbl_panel_46.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_46.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_46.setLayout(gbl_panel_46);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		JTable tableListar_Alunos = new JTable(modelo_Alunos);
		tableListar_Alunos.setCellSelectionEnabled(true);
		tableListar_Alunos.setRowSelectionAllowed(false);
		modelo_Alunos.addColumn("Numero de Aluno");
		modelo_Alunos.addColumn("Palavra-Chave");
		modelo_Alunos.addColumn("Nome");
		modelo_Alunos.addColumn("Morada");
		modelo_Alunos.addColumn("Numero da Porta");
		modelo_Alunos.addColumn("Fracao");
		modelo_Alunos.addColumn("Freguesia");
		modelo_Alunos.addColumn("Nacionalidade");
		modelo_Alunos.addColumn("Validade");
		modelo_Alunos.addColumn("Data de Emissao");
		modelo_Alunos.addColumn("Código Postal");
		modelo_Alunos.addColumn("Data de Nascimento");
		modelo_Alunos.addColumn("Número do CC");
		modelo_Alunos.addColumn("NIF");
		modelo_Alunos.addColumn("Contacto Telefónico");
		modelo_Alunos.addColumn("Contacto Movel");
		modelo_Alunos.addColumn("Email");
		modelo_Alunos.addColumn("Categoria");
		modelo_Alunos.addColumn("Data de Inscrição");
		
		scrollPane_3.setViewportView(tableListar_Alunos);
		
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 0;
		gbc_scrollPane_3.gridy = 1;
		panel_46.add(scrollPane_3, gbc_scrollPane_3);
		
		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Alunos");
				
				int rowCount = modelo_Alunos.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					modelo_Alunos.removeRow(i);
				}
			}
		});
		GridBagConstraints gbc_btnVoltar_3 = new GridBagConstraints();
		gbc_btnVoltar_3.fill = GridBagConstraints.BOTH;
		gbc_btnVoltar_3.gridx = 2;
		gbc_btnVoltar_3.gridy = 2;
		panel_46.add(btnVoltar_3, gbc_btnVoltar_3);
		
		JPanel panel_Adicionar_Aluno = new JPanel();
		frame.getContentPane().add(panel_Adicionar_Aluno, "panel_Adicionar_Aluno");
		panel_Adicionar_Aluno.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_Adicionar_Aluno.add(panel_6, BorderLayout.NORTH);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{80, 0, 0};
		gbl_panel_6.rowHeights = new int[]{85, 64, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		

		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.gridheight = 2;
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 0;
		panel_6.add(label_5, gbc_label_5);
		
		JLabel label_8 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.SOUTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 0;
		panel_6.add(label_8, gbc_label_8);
		
		JLabel lblAdicionarAluno = new JLabel("Adicionar Aluno          ");
		lblAdicionarAluno.setForeground(Color.WHITE);
		lblAdicionarAluno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAdicionarAluno = new GridBagConstraints();
		gbc_lblAdicionarAluno.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionarAluno.gridx = 1;
		gbc_lblAdicionarAluno.gridy = 1;
		panel_6.add(lblAdicionarAluno, gbc_lblAdicionarAluno);
		
		JPanel panel_7 = new JPanel();
		panel_Adicionar_Aluno.add(panel_7, BorderLayout.CENTER);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{141, 141, 163, 76, 129, 133, 145, 66, 192, 0};
		gbl_panel_7.rowHeights = new int[]{99, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0, 0};
		gbl_panel_7.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel lblFichaDeInscrio = new JLabel("Ficha de Inscri\u00E7\u00E3o do(a) Aluno(a)");
		lblFichaDeInscrio.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblFichaDeInscrio.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFichaDeInscrio = new GridBagConstraints();
		gbc_lblFichaDeInscrio.anchor = GridBagConstraints.WEST;
		gbc_lblFichaDeInscrio.gridwidth = 2;
		gbc_lblFichaDeInscrio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFichaDeInscrio.gridx = 1;
		gbc_lblFichaDeInscrio.gridy = 1;
		panel_7.add(lblFichaDeInscrio, gbc_lblFichaDeInscrio);
		
		JLabel label_11 = new JLabel("                                                                            \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.NORTH;
		gbc_label_11.gridwidth = 5;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 2;
		panel_7.add(label_11, gbc_label_11);
		
		JLabel lblNDeAluno = new JLabel("N\u00BA de Aluno: ");
		lblNDeAluno.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNDeAluno = new GridBagConstraints();
		gbc_lblNDeAluno.anchor = GridBagConstraints.EAST;
		gbc_lblNDeAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeAluno.gridx = 1;
		gbc_lblNDeAluno.gridy = 3;
		panel_7.add(lblNDeAluno, gbc_lblNDeAluno);
		
		txtAdcionar_Aluno_Numero_Aluno = new JTextField();
		txtAdcionar_Aluno_Numero_Aluno.setEditable(false);
		GridBagConstraints gbc_txtAdcionar_Aluno_Numero_Aluno = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Numero_Aluno.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Numero_Aluno.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Numero_Aluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Numero_Aluno.gridx = 2;
		gbc_txtAdcionar_Aluno_Numero_Aluno.gridy = 3;
		panel_7.add(txtAdcionar_Aluno_Numero_Aluno, gbc_txtAdcionar_Aluno_Numero_Aluno);
		txtAdcionar_Aluno_Numero_Aluno.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/adicionar_aluno2.png")));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_12.gridheight = 10;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 6;
		gbc_lblNewLabel_12.gridy = 3;
		panel_7.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblPalavrachave_2 = new JLabel("Palavra-Chave: ");
		lblPalavrachave_2.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPalavrachave_2 = new GridBagConstraints();
		gbc_lblPalavrachave_2.anchor = GridBagConstraints.EAST;
		gbc_lblPalavrachave_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPalavrachave_2.gridx = 1;
		gbc_lblPalavrachave_2.gridy = 4;
		panel_7.add(lblPalavrachave_2, gbc_lblPalavrachave_2);
		
		txtAdcionar_Aluno_PalavraChave = new JPasswordField();
		GridBagConstraints gbc_txtAdcionar_Aluno_PalavraChave = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_PalavraChave.gridwidth = 3;
		gbc_txtAdcionar_Aluno_PalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_PalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_PalavraChave.gridx = 2;
		gbc_txtAdcionar_Aluno_PalavraChave.gridy = 4;
		panel_7.add(txtAdcionar_Aluno_PalavraChave, gbc_txtAdcionar_Aluno_PalavraChave);
		
		JLabel lblNewLabel_11 = new JLabel("Nome Completo: ");
		lblNewLabel_11.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 5;
		panel_7.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		txtAdcionar_Aluno_Nome = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Nome = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Nome.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Nome.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Nome.gridx = 2;
		gbc_txtAdcionar_Aluno_Nome.gridy = 5;
		panel_7.add(txtAdcionar_Aluno_Nome, gbc_txtAdcionar_Aluno_Nome);
		txtAdcionar_Aluno_Nome.setColumns(10);
		
		JLabel lblMorada = new JLabel("Morada: ");
		lblMorada.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMorada = new GridBagConstraints();
		gbc_lblMorada.anchor = GridBagConstraints.EAST;
		gbc_lblMorada.insets = new Insets(0, 0, 5, 5);
		gbc_lblMorada.gridx = 1;
		gbc_lblMorada.gridy = 6;
		panel_7.add(lblMorada, gbc_lblMorada);
		
		txtAdcionar_Aluno_Morada = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Morada = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Morada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Morada.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Morada.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Morada.gridx = 2;
		gbc_txtAdcionar_Aluno_Morada.gridy = 6;
		panel_7.add(txtAdcionar_Aluno_Morada, gbc_txtAdcionar_Aluno_Morada);
		txtAdcionar_Aluno_Morada.setColumns(10);
		
		JLabel lblNmeroDaPorta = new JLabel("N\u00FAmero da Porta: ");
		lblNmeroDaPorta.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNmeroDaPorta = new GridBagConstraints();
		gbc_lblNmeroDaPorta.anchor = GridBagConstraints.EAST;
		gbc_lblNmeroDaPorta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDaPorta.gridx = 1;
		gbc_lblNmeroDaPorta.gridy = 7;
		panel_7.add(lblNmeroDaPorta, gbc_lblNmeroDaPorta);
		
		txtAdcionar_Aluno_Numero_Porta = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Numero_Porta = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Numero_Porta.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Numero_Porta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Numero_Porta.gridx = 2;
		gbc_txtAdcionar_Aluno_Numero_Porta.gridy = 7;
		panel_7.add(txtAdcionar_Aluno_Numero_Porta, gbc_txtAdcionar_Aluno_Numero_Porta);
		txtAdcionar_Aluno_Numero_Porta.setColumns(10);
		
		JLabel lblFrao = new JLabel("Fra\u00E7\u00E3o: ");
		lblFrao.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFrao = new GridBagConstraints();
		gbc_lblFrao.anchor = GridBagConstraints.EAST;
		gbc_lblFrao.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrao.gridx = 3;
		gbc_lblFrao.gridy = 7;
		panel_7.add(lblFrao, gbc_lblFrao);
		
		txtAdcionar_Aluno_Fracao = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Fracao = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Fracao.fill = GridBagConstraints.BOTH;
		gbc_txtAdcionar_Aluno_Fracao.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Fracao.gridx = 4;
		gbc_txtAdcionar_Aluno_Fracao.gridy = 7;
		panel_7.add(txtAdcionar_Aluno_Fracao, gbc_txtAdcionar_Aluno_Fracao);
		txtAdcionar_Aluno_Fracao.setColumns(10);
		
		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal: ");
		lblCdigoPostal.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCdigoPostal = new GridBagConstraints();
		gbc_lblCdigoPostal.anchor = GridBagConstraints.EAST;
		gbc_lblCdigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigoPostal.gridx = 1;
		gbc_lblCdigoPostal.gridy = 8;
		panel_7.add(lblCdigoPostal, gbc_lblCdigoPostal);
		
		txtAdcionar_Aluno_C_Postal = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_C_Postal = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_C_Postal.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_C_Postal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_C_Postal.gridx = 2;
		gbc_txtAdcionar_Aluno_C_Postal.gridy = 8;
		panel_7.add(txtAdcionar_Aluno_C_Postal, gbc_txtAdcionar_Aluno_C_Postal);
		txtAdcionar_Aluno_C_Postal.setColumns(10);
		
		JLabel lblFreguesia = new JLabel("Freguesia: ");
		lblFreguesia.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFreguesia = new GridBagConstraints();
		gbc_lblFreguesia.anchor = GridBagConstraints.EAST;
		gbc_lblFreguesia.insets = new Insets(0, 0, 5, 5);
		gbc_lblFreguesia.gridx = 3;
		gbc_lblFreguesia.gridy = 8;
		panel_7.add(lblFreguesia, gbc_lblFreguesia);
		
		txtAdcionar_Aluno_Freguesia = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Freguesia = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Freguesia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Freguesia.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Freguesia.gridx = 4;
		gbc_txtAdcionar_Aluno_Freguesia.gridy = 8;
		panel_7.add(txtAdcionar_Aluno_Freguesia, gbc_txtAdcionar_Aluno_Freguesia);
		txtAdcionar_Aluno_Freguesia.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.anchor = GridBagConstraints.EAST;
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 9;
		panel_7.add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		txtAdcionar_Aluno_Data_Nascimento = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Data_Nascimento = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Data_Nascimento.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Data_Nascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Data_Nascimento.gridx = 2;
		gbc_txtAdcionar_Aluno_Data_Nascimento.gridy = 9;
		panel_7.add(txtAdcionar_Aluno_Data_Nascimento, gbc_txtAdcionar_Aluno_Data_Nascimento);
		txtAdcionar_Aluno_Data_Nascimento.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade: ");
		lblNacionalidade.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNacionalidade = new GridBagConstraints();
		gbc_lblNacionalidade.anchor = GridBagConstraints.EAST;
		gbc_lblNacionalidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacionalidade.gridx = 3;
		gbc_lblNacionalidade.gridy = 9;
		panel_7.add(lblNacionalidade, gbc_lblNacionalidade);
		
		txtAdcionar_Aluno_Nacionalidade = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Nacionalidade = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Nacionalidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Nacionalidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Nacionalidade.gridx = 4;
		gbc_txtAdcionar_Aluno_Nacionalidade.gridy = 9;
		panel_7.add(txtAdcionar_Aluno_Nacionalidade, gbc_txtAdcionar_Aluno_Nacionalidade);
		txtAdcionar_Aluno_Nacionalidade.setColumns(10);
		
		JLabel lblNif = new JLabel("N\u00BA Cart\u00E3o de Cidad\u00E3o: ");
		lblNif.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNif = new GridBagConstraints();
		gbc_lblNif.anchor = GridBagConstraints.EAST;
		gbc_lblNif.insets = new Insets(0, 0, 5, 5);
		gbc_lblNif.gridx = 1;
		gbc_lblNif.gridy = 10;
		panel_7.add(lblNif, gbc_lblNif);
		
		txtAdcionar_Aluno_Numero_CC = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Numero_CC = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Numero_CC.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Numero_CC.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Numero_CC.gridx = 2;
		gbc_txtAdcionar_Aluno_Numero_CC.gridy = 10;
		panel_7.add(txtAdcionar_Aluno_Numero_CC, gbc_txtAdcionar_Aluno_Numero_CC);
		txtAdcionar_Aluno_Numero_CC.setColumns(10);
		
		JLabel lblValidade = new JLabel("Validade: ");
		lblValidade.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblValidade = new GridBagConstraints();
		gbc_lblValidade.anchor = GridBagConstraints.EAST;
		gbc_lblValidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblValidade.gridx = 3;
		gbc_lblValidade.gridy = 10;
		panel_7.add(lblValidade, gbc_lblValidade);
		
		txtAdcionar_Aluno_Validade = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Validade = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Validade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Validade.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Validade.gridx = 4;
		gbc_txtAdcionar_Aluno_Validade.gridy = 10;
		panel_7.add(txtAdcionar_Aluno_Validade, gbc_txtAdcionar_Aluno_Validade);
		txtAdcionar_Aluno_Validade.setColumns(10);
		
		JLabel lblNif_1 = new JLabel("NIF: ");
		lblNif_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNif_1 = new GridBagConstraints();
		gbc_lblNif_1.anchor = GridBagConstraints.EAST;
		gbc_lblNif_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNif_1.gridx = 1;
		gbc_lblNif_1.gridy = 11;
		panel_7.add(lblNif_1, gbc_lblNif_1);
		
		txtAdcionar_Aluno_NIF = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_NIF = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_NIF.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_NIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_NIF.gridx = 2;
		gbc_txtAdcionar_Aluno_NIF.gridy = 11;
		panel_7.add(txtAdcionar_Aluno_NIF, gbc_txtAdcionar_Aluno_NIF);
		txtAdcionar_Aluno_NIF.setColumns(10);
		
		JLabel lblDataDeEmisso = new JLabel("Data de Emiss\u00E3o: ");
		lblDataDeEmisso.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDataDeEmisso = new GridBagConstraints();
		gbc_lblDataDeEmisso.anchor = GridBagConstraints.EAST;
		gbc_lblDataDeEmisso.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeEmisso.gridx = 3;
		gbc_lblDataDeEmisso.gridy = 11;
		panel_7.add(lblDataDeEmisso, gbc_lblDataDeEmisso);
		
		txtAdcionar_Aluno_Data_Emissao = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Data_Emissao = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Data_Emissao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Data_Emissao.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Data_Emissao.gridx = 4;
		gbc_txtAdcionar_Aluno_Data_Emissao.gridy = 11;
		panel_7.add(txtAdcionar_Aluno_Data_Emissao, gbc_txtAdcionar_Aluno_Data_Emissao);
		txtAdcionar_Aluno_Data_Emissao.setColumns(10);
		
		JLabel lblContactoTelefnico = new JLabel("Contacto Telef\u00F3nico: ");
		lblContactoTelefnico.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblContactoTelefnico = new GridBagConstraints();
		gbc_lblContactoTelefnico.anchor = GridBagConstraints.EAST;
		gbc_lblContactoTelefnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactoTelefnico.gridx = 1;
		gbc_lblContactoTelefnico.gridy = 12;
		panel_7.add(lblContactoTelefnico, gbc_lblContactoTelefnico);
		
		txtAdcionar_Aluno_Contacto_Telefonico = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Contacto_Telefonico = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Contacto_Telefonico.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Contacto_Telefonico.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Contacto_Telefonico.gridx = 2;
		gbc_txtAdcionar_Aluno_Contacto_Telefonico.gridy = 12;
		panel_7.add(txtAdcionar_Aluno_Contacto_Telefonico, gbc_txtAdcionar_Aluno_Contacto_Telefonico);
		txtAdcionar_Aluno_Contacto_Telefonico.setColumns(10);
		
		JLabel lblContactoMvel = new JLabel("Contacto M\u00F3vel: ");
		lblContactoMvel.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblContactoMvel = new GridBagConstraints();
		gbc_lblContactoMvel.anchor = GridBagConstraints.EAST;
		gbc_lblContactoMvel.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactoMvel.gridx = 3;
		gbc_lblContactoMvel.gridy = 12;
		panel_7.add(lblContactoMvel, gbc_lblContactoMvel);
		
		txtAdcionar_Aluno_Contacto_Movel = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Contacto_Movel = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Contacto_Movel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Contacto_Movel.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Contacto_Movel.gridx = 4;
		gbc_txtAdcionar_Aluno_Contacto_Movel.gridy = 12;
		panel_7.add(txtAdcionar_Aluno_Contacto_Movel, gbc_txtAdcionar_Aluno_Contacto_Movel);
		txtAdcionar_Aluno_Contacto_Movel.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 13;
		panel_7.add(lblEmail, gbc_lblEmail);
		
		txtAdcionar_Aluno_Email = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Email = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Email.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Email.gridx = 2;
		gbc_txtAdcionar_Aluno_Email.gridy = 13;
		panel_7.add(txtAdcionar_Aluno_Email, gbc_txtAdcionar_Aluno_Email);
		txtAdcionar_Aluno_Email.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.EAST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 1;
		gbc_lblCategoria.gridy = 14;
		panel_7.add(lblCategoria, gbc_lblCategoria);
		
		txtAdcionar_Aluno_Categoria = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Categoria = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Categoria.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Categoria.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Categoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Categoria.gridx = 2;
		gbc_txtAdcionar_Aluno_Categoria.gridy = 14;
		panel_7.add(txtAdcionar_Aluno_Categoria, gbc_txtAdcionar_Aluno_Categoria);
		txtAdcionar_Aluno_Categoria.setColumns(10);
		
		JLabel lblDataDeInscrio = new JLabel("Data de Inscri\u00E7\u00E3o: ");
		lblDataDeInscrio.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDataDeInscrio = new GridBagConstraints();
		gbc_lblDataDeInscrio.anchor = GridBagConstraints.EAST;
		gbc_lblDataDeInscrio.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeInscrio.gridx = 1;
		gbc_lblDataDeInscrio.gridy = 15;
		panel_7.add(lblDataDeInscrio, gbc_lblDataDeInscrio);
		
		txtAdcionar_Aluno_Data_Inscricao = new JTextField();
		GridBagConstraints gbc_txtAdcionar_Aluno_Data_Inscricao = new GridBagConstraints();
		gbc_txtAdcionar_Aluno_Data_Inscricao.gridwidth = 3;
		gbc_txtAdcionar_Aluno_Data_Inscricao.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdcionar_Aluno_Data_Inscricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdcionar_Aluno_Data_Inscricao.gridx = 2;
		gbc_txtAdcionar_Aluno_Data_Inscricao.gridy = 15;
		panel_7.add(txtAdcionar_Aluno_Data_Inscricao, gbc_txtAdcionar_Aluno_Data_Inscricao);
		txtAdcionar_Aluno_Data_Inscricao.setColumns(10);
		
		btnLimparFormulrio = new JButton("Limpar Formul\u00E1rio");
		btnLimparFormulrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtAdcionar_Aluno_PalavraChave.setText("");
				txtAdcionar_Aluno_Nome.setText("");
				txtAdcionar_Aluno_Morada.setText("");
				txtAdcionar_Aluno_Numero_Porta.setText("");
				txtAdcionar_Aluno_Fracao.setText("");
				txtAdcionar_Aluno_C_Postal.setText("");
				txtAdcionar_Aluno_Freguesia.setText("");
				txtAdcionar_Aluno_Data_Nascimento.setText("");
				txtAdcionar_Aluno_Nacionalidade.setText("");
				txtAdcionar_Aluno_Numero_CC.setText("");
				txtAdcionar_Aluno_Validade.setText("");
				txtAdcionar_Aluno_NIF.setText("");
				txtAdcionar_Aluno_Data_Emissao.setText("");
				txtAdcionar_Aluno_Contacto_Telefonico.setText("");
				txtAdcionar_Aluno_Contacto_Movel.setText("");
				txtAdcionar_Aluno_Email.setText("");
				txtAdcionar_Aluno_Categoria.setText("");
				txtAdcionar_Aluno_Data_Inscricao.setText("");
				

			}
		});
		GridBagConstraints gbc_btnLimparFormulrio = new GridBagConstraints();
		gbc_btnLimparFormulrio.anchor = GridBagConstraints.EAST;
		gbc_btnLimparFormulrio.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulrio.gridx = 2;
		gbc_btnLimparFormulrio.gridy = 16;
		panel_7.add(btnLimparFormulrio, gbc_btnLimparFormulrio);
		
		JButton btnInserir = new JButton("Voltar");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Alunos");
			}
		});
		GridBagConstraints gbc_btnInserir = new GridBagConstraints();
		gbc_btnInserir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInserir.insets = new Insets(0, 0, 5, 5);
		gbc_btnInserir.gridx = 3;
		gbc_btnInserir.gridy = 16;
		panel_7.add(btnInserir, gbc_btnInserir);
		
		JButton btnVoltar = new JButton("Inserir");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection lig= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement inst=(PreparedStatement) lig.prepareStatement("INSERT INTO alunos(Palavra_Chave, Nome, Morada, Numero_Porta, Fracao, Freguesia, Nacionalidade, Validade, Data_Emissao, C_Postal, Data_Nascimento, Numero_Cartao_Cidadao, NIF, Contacto_Telefonico, Contacto_Movel, Email, Categoria, Data_Inscricao) VALUES(?,?, ?,?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?);");

					inst.setString(1, String.valueOf(txtAdcionar_Aluno_PalavraChave.getPassword()));
					inst.setString(2, txtAdcionar_Aluno_Nome.getText());
					inst.setString(3, txtAdcionar_Aluno_Morada.getText());
					inst.setString(4, txtAdcionar_Aluno_Numero_Porta.getText());
					inst.setString(5, txtAdcionar_Aluno_Fracao.getText());
					inst.setString(6, txtAdcionar_Aluno_Freguesia.getText());
					inst.setString(7, txtAdcionar_Aluno_Nacionalidade.getText());
					SimpleDateFormat f=new SimpleDateFormat("dd/M/yyyy");
					java.util.Date data=f.parse(txtAdcionar_Aluno_Validade.getText());
					java.sql.Date validade=new Date(data.getTime());
					inst.setDate(8, validade);

					java.util.Date data3=f.parse(txtAdcionar_Aluno_Data_Emissao.getText());
					java.sql.Date validade2=new Date(data3.getTime());
					inst.setDate(9, validade2);
					
					inst.setString(10, txtAdcionar_Aluno_C_Postal.getText());
					
					java.util.Date data2=f.parse(txtAdcionar_Aluno_Data_Nascimento.getText());
					java.sql.Date dataNascimento=new Date(data2.getTime());
					inst.setDate(11, dataNascimento);
					
					inst.setString(12, txtAdcionar_Aluno_Numero_CC.getText());
					inst.setInt(13,  Integer.parseInt(txtAdcionar_Aluno_NIF.getText()));
					inst.setInt(14,  Integer.parseInt(txtAdcionar_Aluno_Contacto_Telefonico.getText()));
					inst.setInt(15,  Integer.parseInt(txtAdcionar_Aluno_Contacto_Movel.getText()));
					inst.setString(16, txtAdcionar_Aluno_Email.getText());
					inst.setString(17, txtAdcionar_Aluno_Categoria.getText());

					java.util.Date data42=f.parse(txtAdcionar_Aluno_Data_Inscricao.getText());
					java.sql.Date datainscricao=new Date(data42.getTime());
					inst.setDate(18, datainscricao);
					
					
					
					
					int linhas=inst.executeUpdate();
					
					if(linhas==1){
						JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso!");
						
						Date data_aluno_inserido = new Date(System.currentTimeMillis());  
			    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
			    		String nomeficheiro = "Aluno - Inserir - " + formatarData.format(data_aluno_inserido);
			    		
			        	File file =new File("logs/Registos/Alunos/"+nomeficheiro+".txt");
			        	if(!file.exists()){
			        	   file.createNewFile();
			        	}
			        	
			        	txtAdcionar_Aluno_PalavraChave.setText("");
			        	txtAdcionar_Aluno_Nome.setText("");
			        	txtAdcionar_Aluno_Morada.setText("");
			        	txtAdcionar_Aluno_Numero_Porta.setText("");
			        	txtAdcionar_Aluno_Fracao.setText("");
			        	txtAdcionar_Aluno_Freguesia.setText("");
			        	txtAdcionar_Aluno_Nacionalidade.setText("");
			        	txtAdcionar_Aluno_Validade.setText("");
			        	txtAdcionar_Aluno_Data_Emissao.setText("");
			        	txtAdcionar_Aluno_C_Postal.setText("");
			        	txtAdcionar_Aluno_Data_Nascimento.setText("");
			        	txtAdcionar_Aluno_Numero_CC.setText("");
			        	txtAdcionar_Aluno_NIF.setText("");
			        	txtAdcionar_Aluno_Contacto_Telefonico.setText("");
			        	txtAdcionar_Aluno_Contacto_Movel.setText("");
			        	txtAdcionar_Aluno_Email.setText("");
			        	txtAdcionar_Aluno_Categoria.setText("");
			        	txtAdcionar_Aluno_Data_Inscricao.setText("");
			        	
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Alunos");
					}
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "A conexão à base de dados não foi possível\nDescrição: " + e.getLocalizedMessage());
				}
			}
		
		});
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 4;
		gbc_btnVoltar.gridy = 16;
		panel_7.add(btnVoltar, gbc_btnVoltar);
		
		JPanel panel_Editar_Aluno = new JPanel();
		frame.getContentPane().add(panel_Editar_Aluno, "panel_Editar_Aluno");
		panel_Editar_Aluno.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.BLACK);
		panel_Editar_Aluno.add(panel_8, BorderLayout.NORTH);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{80, 0, 0};
		gbl_panel_8.rowHeights = new int[]{85, 64, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.gridheight = 2;
		gbc_label_13.insets = new Insets(0, 0, 0, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 0;
		panel_8.add(label_13, gbc_label_13);
		
		JLabel label_14 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.SOUTH;
		gbc_label_14.insets = new Insets(0, 0, 5, 0);
		gbc_label_14.gridx = 1;
		gbc_label_14.gridy = 0;
		panel_8.add(label_14, gbc_label_14);
		
		JLabel lblEditarAluno = new JLabel("Editar Aluno          ");
		lblEditarAluno.setForeground(Color.WHITE);
		lblEditarAluno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblEditarAluno = new GridBagConstraints();
		gbc_lblEditarAluno.anchor = GridBagConstraints.NORTH;
		gbc_lblEditarAluno.gridx = 1;
		gbc_lblEditarAluno.gridy = 1;
		panel_8.add(lblEditarAluno, gbc_lblEditarAluno);
		
		JPanel panel_9 = new JPanel();
		panel_Editar_Aluno.add(panel_9, BorderLayout.CENTER);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{77, 141, 265, 76, 138, 40, 213, 192, 0};
		gbl_panel_9.rowHeights = new int[]{99, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JLabel lblEditarFichaDe = new JLabel("Editar Ficha de Inscri\u00E7\u00E3o do(a) Aluno(a)");
		lblEditarFichaDe.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblEditarFichaDe.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEditarFichaDe = new GridBagConstraints();
		gbc_lblEditarFichaDe.anchor = GridBagConstraints.WEST;
		gbc_lblEditarFichaDe.gridwidth = 2;
		gbc_lblEditarFichaDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditarFichaDe.gridx = 1;
		gbc_lblEditarFichaDe.gridy = 1;
		panel_9.add(lblEditarFichaDe, gbc_lblEditarFichaDe);
		
		JLabel label_16 = new JLabel("                       \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.NORTH;
		gbc_label_16.gridwidth = 5;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 0;
		gbc_label_16.gridy = 2;
		panel_9.add(label_16, gbc_label_16);
		
		JLabel label_17 = new JLabel("N\u00BA de Aluno: ");
		label_17.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.anchor = GridBagConstraints.EAST;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 1;
		gbc_label_17.gridy = 3;
		panel_9.add(label_17, gbc_label_17);
		
		JButton btnObterInformaes = new JButton("Obter Informa\u00E7\u00F5es");
		btnObterInformaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {				
					
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Nome, palavra_chave, Morada, Numero_Porta, Fracao, Freguesia, Nacionalidade, Validade, Data_Emissao, C_Postal, Data_Nascimento, Numero_Cartao_Cidadao, NIF, Contacto_Telefonico, Contacto_Movel, Email, Categoria, Data_Inscricao FROM alunos WHERE Numero_Aluno=?");
					instP.setString(1, comboBoxEditar_Aluno_NumeroAluno.getSelectedItem().toString());
					ResultSet res=instP.executeQuery();

					
					
					if(res.next()){
						
						
						String nome =res.getString("nome");
						String palavra_chave = res.getString("palavra_chave");
						String morada = res.getString("morada");
						int numero_porta = res.getInt("Numero_Porta");
						String fracao = res.getString("fracao");
						String freguesia = res.getString("freguesia");
						String nacionalidade = res.getString("nacionalidade");

						
						Date validadee = res.getDate("validade");
						String Data_Validade=String.valueOf(validadee);
						
						Date emissao = res.getDate("Data_Emissao");
						String Data_Emissao=String.valueOf(emissao);
						
						String C_Postal = res.getString("C_Postal");
						
						Date nascimento = res.getDate("Data_Nascimento");
						String Data_Nascimento = String.valueOf(nascimento);
						
						String Numero_CC = res.getString("Numero_Cartao_Cidadao");
						
						int nif = res.getInt("nif");
						
						int contacto_telefonico = res.getInt("contacto_telefonico");
						
						int contacto_movel = res.getInt("contacto_movel");
						
						String email = res.getString("email");
						
						String categoria = res.getString("categoria");
						
						Date inscricao = res.getDate("data_inscricao");
						String Data_Inscricao = String.valueOf(inscricao);
						
						
						text_Editar_Aluno_NomeCompleto.setText(nome);
						
						text_Editar_Aluno_PalavraChave.setText(palavra_chave);
						
						text_Editar_Aluno_Morada.setText(morada);
						
						text_Editar_Aluno_NumeroPorta.setText(Integer.toString(numero_porta));
						
						text_Editar_Aluno_Fracao.setText(fracao);
						
						text_Editar_Aluno_Freguesia.setText(freguesia);
						
						text_Editar_Aluno_Nacionalidade.setText(nacionalidade);
						
						text_Editar_Aluno_Validade.setText(Data_Validade);
						
						text_Editar_Aluno_Data_Emissao.setText(Data_Emissao);
						
						text_Editar_Aluno_C_Postal.setText(C_Postal);
						
						text_Editar_Aluno_Data_Nascimento.setText(Data_Nascimento);
							
						text_Editar_Aluno_Numero_CC.setText(Numero_CC);
						
						text_Editar_Aluno_NIF.setText(Integer.toString(nif));
						
						text_Editar_Aluno_Contacto_Telefonico.setText(Integer.toString(contacto_telefonico));
						
						text_Editar_Aluno_Contacto_Movel.setText(Integer.toString(contacto_movel));
						
						text_Editar_Aluno_Email.setText(email);
						
						text_Editar_Aluno_Categoria.setText(categoria);
						
						text_Editar_Aluno_Data_Inscricao.setText(Data_Inscricao);					
							
						text_Editar_Aluno_PalavraChave.setEditable(true);
						
						text_Editar_Aluno_NumeroPorta.setEditable(true);
						
						text_Editar_Aluno_NomeCompleto.setEditable(true);
						
						text_Editar_Aluno_Morada.setEditable(true);
						
						text_Editar_Aluno_Fracao.setEditable(true);
						
						text_Editar_Aluno_Freguesia.setEditable(true);
						
						text_Editar_Aluno_Nacionalidade.setEditable(true);
						
						text_Editar_Aluno_Validade.setEditable(true);
						
						text_Editar_Aluno_Data_Emissao.setEditable(true);
						
						text_Editar_Aluno_C_Postal.setEditable(true);
						
						text_Editar_Aluno_Data_Nascimento.setEditable(true);
							
						text_Editar_Aluno_Numero_CC.setEditable(true);
						
						text_Editar_Aluno_NIF.setEditable(true);
						
						text_Editar_Aluno_Contacto_Telefonico.setEditable(true);
						
						text_Editar_Aluno_Contacto_Movel.setEditable(true);
						
						text_Editar_Aluno_Email.setEditable(true);
						
						text_Editar_Aluno_Categoria.setEditable(true);
						
						text_Editar_Aluno_Data_Inscricao.setEditable(true);
						
						
						btn_Editar_Voltar_LimparFormulario.setEnabled(true);
						
						btnValidarEdio.setEnabled(true);
							
						lig.close();
					}

					lig.close();
				} catch (SQLException e1) {
					
					
					JOptionPane.showMessageDialog(null, "Impossível ligar à base de dados\nErro:"+e1.getLocalizedMessage());
				}
			}
		});
		
		comboBoxEditar_Aluno_NumeroAluno = new JComboBox();
		GridBagConstraints gbc_comboBoxEditar_Aluno_NumeroAluno = new GridBagConstraints();
		gbc_comboBoxEditar_Aluno_NumeroAluno.gridwidth = 3;
		gbc_comboBoxEditar_Aluno_NumeroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxEditar_Aluno_NumeroAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxEditar_Aluno_NumeroAluno.gridx = 2;
		gbc_comboBoxEditar_Aluno_NumeroAluno.gridy = 3;
		panel_9.add(comboBoxEditar_Aluno_NumeroAluno, gbc_comboBoxEditar_Aluno_NumeroAluno);
		GridBagConstraints gbc_btnObterInformaes = new GridBagConstraints();
		gbc_btnObterInformaes.insets = new Insets(0, 0, 5, 5);
		gbc_btnObterInformaes.gridx = 5;
		gbc_btnObterInformaes.gridy = 3;
		panel_9.add(btnObterInformaes, gbc_btnObterInformaes);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/Editar_Aluno.png")));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.gridheight = 13;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 6;
		gbc_label_18.gridy = 3;
		panel_9.add(label_18, gbc_label_18);
		
		JLabel lblPalavrachave_1 = new JLabel("Palavra-Chave: ");
		lblPalavrachave_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPalavrachave_1 = new GridBagConstraints();
		gbc_lblPalavrachave_1.anchor = GridBagConstraints.EAST;
		gbc_lblPalavrachave_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPalavrachave_1.gridx = 1;
		gbc_lblPalavrachave_1.gridy = 4;
		panel_9.add(lblPalavrachave_1, gbc_lblPalavrachave_1);
		
		text_Editar_Aluno_PalavraChave = new JTextField();
		text_Editar_Aluno_PalavraChave.setEditable(false);
		text_Editar_Aluno_PalavraChave.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_PalavraChave = new GridBagConstraints();
		gbc_text_Editar_Aluno_PalavraChave.gridwidth = 3;
		gbc_text_Editar_Aluno_PalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_PalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_PalavraChave.gridx = 2;
		gbc_text_Editar_Aluno_PalavraChave.gridy = 4;
		panel_9.add(text_Editar_Aluno_PalavraChave, gbc_text_Editar_Aluno_PalavraChave);
		
		JLabel label_19 = new JLabel("Nome Completo: ");
		label_19.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.anchor = GridBagConstraints.EAST;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 1;
		gbc_label_19.gridy = 5;
		panel_9.add(label_19, gbc_label_19);
		
		text_Editar_Aluno_NomeCompleto = new JTextField();
		text_Editar_Aluno_NomeCompleto.setEditable(false);
		text_Editar_Aluno_NomeCompleto.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_NomeCompleto = new GridBagConstraints();
		gbc_text_Editar_Aluno_NomeCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_NomeCompleto.gridwidth = 3;
		gbc_text_Editar_Aluno_NomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_NomeCompleto.gridx = 2;
		gbc_text_Editar_Aluno_NomeCompleto.gridy = 5;
		panel_9.add(text_Editar_Aluno_NomeCompleto, gbc_text_Editar_Aluno_NomeCompleto);
		
		JLabel label_20 = new JLabel("Morada: ");
		label_20.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.anchor = GridBagConstraints.EAST;
		gbc_label_20.insets = new Insets(0, 0, 5, 5);
		gbc_label_20.gridx = 1;
		gbc_label_20.gridy = 6;
		panel_9.add(label_20, gbc_label_20);
		
		text_Editar_Aluno_Morada = new JTextField();
		text_Editar_Aluno_Morada.setEditable(false);
		text_Editar_Aluno_Morada.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Morada = new GridBagConstraints();
		gbc_text_Editar_Aluno_Morada.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Morada.gridwidth = 3;
		gbc_text_Editar_Aluno_Morada.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Morada.gridx = 2;
		gbc_text_Editar_Aluno_Morada.gridy = 6;
		panel_9.add(text_Editar_Aluno_Morada, gbc_text_Editar_Aluno_Morada);
		
		JLabel label_21 = new JLabel("N\u00FAmero da Porta: ");
		label_21.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.anchor = GridBagConstraints.EAST;
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 1;
		gbc_label_21.gridy = 7;
		panel_9.add(label_21, gbc_label_21);
		
		text_Editar_Aluno_NumeroPorta = new JTextField();
		text_Editar_Aluno_NumeroPorta.setEditable(false);
		text_Editar_Aluno_NumeroPorta.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_NumeroPorta = new GridBagConstraints();
		gbc_text_Editar_Aluno_NumeroPorta.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_NumeroPorta.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_NumeroPorta.gridx = 2;
		gbc_text_Editar_Aluno_NumeroPorta.gridy = 7;
		panel_9.add(text_Editar_Aluno_NumeroPorta, gbc_text_Editar_Aluno_NumeroPorta);
		
		JLabel label_22 = new JLabel("Fra\u00E7\u00E3o: ");
		label_22.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.anchor = GridBagConstraints.EAST;
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 3;
		gbc_label_22.gridy = 7;
		panel_9.add(label_22, gbc_label_22);
		
		text_Editar_Aluno_Fracao = new JTextField();
		text_Editar_Aluno_Fracao.setEditable(false);
		text_Editar_Aluno_Fracao.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Fracao = new GridBagConstraints();
		gbc_text_Editar_Aluno_Fracao.fill = GridBagConstraints.BOTH;
		gbc_text_Editar_Aluno_Fracao.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Fracao.gridx = 4;
		gbc_text_Editar_Aluno_Fracao.gridy = 7;
		panel_9.add(text_Editar_Aluno_Fracao, gbc_text_Editar_Aluno_Fracao);
		
		JLabel label_24 = new JLabel("C\u00F3digo Postal: ");
		label_24.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.anchor = GridBagConstraints.EAST;
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 1;
		gbc_label_24.gridy = 8;
		panel_9.add(label_24, gbc_label_24);
		
		text_Editar_Aluno_C_Postal = new JTextField();
		text_Editar_Aluno_C_Postal.setEditable(false);
		text_Editar_Aluno_C_Postal.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_C_Postal = new GridBagConstraints();
		gbc_text_Editar_Aluno_C_Postal.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_C_Postal.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_C_Postal.gridx = 2;
		gbc_text_Editar_Aluno_C_Postal.gridy = 8;
		panel_9.add(text_Editar_Aluno_C_Postal, gbc_text_Editar_Aluno_C_Postal);
		
		JLabel label_25 = new JLabel("Freguesia: ");
		label_25.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.anchor = GridBagConstraints.EAST;
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 3;
		gbc_label_25.gridy = 8;
		panel_9.add(label_25, gbc_label_25);
		
		text_Editar_Aluno_Freguesia = new JTextField();
		text_Editar_Aluno_Freguesia.setEditable(false);
		text_Editar_Aluno_Freguesia.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Freguesia = new GridBagConstraints();
		gbc_text_Editar_Aluno_Freguesia.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Freguesia.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Freguesia.gridx = 4;
		gbc_text_Editar_Aluno_Freguesia.gridy = 8;
		panel_9.add(text_Editar_Aluno_Freguesia, gbc_text_Editar_Aluno_Freguesia);
		
		JLabel label_27 = new JLabel("Data de Nascimento: ");
		label_27.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.anchor = GridBagConstraints.EAST;
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 1;
		gbc_label_27.gridy = 9;
		panel_9.add(label_27, gbc_label_27);
		
		text_Editar_Aluno_Data_Nascimento = new JTextField();
		text_Editar_Aluno_Data_Nascimento.setEditable(false);
		text_Editar_Aluno_Data_Nascimento.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Data_Nascimento = new GridBagConstraints();
		gbc_text_Editar_Aluno_Data_Nascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Data_Nascimento.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Data_Nascimento.gridx = 2;
		gbc_text_Editar_Aluno_Data_Nascimento.gridy = 9;
		panel_9.add(text_Editar_Aluno_Data_Nascimento, gbc_text_Editar_Aluno_Data_Nascimento);
		
		JLabel label_28 = new JLabel("Nacionalidade: ");
		label_28.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.anchor = GridBagConstraints.EAST;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 3;
		gbc_label_28.gridy = 9;
		panel_9.add(label_28, gbc_label_28);
		
		text_Editar_Aluno_Nacionalidade = new JTextField();
		text_Editar_Aluno_Nacionalidade.setEditable(false);
		text_Editar_Aluno_Nacionalidade.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Nacionalidade = new GridBagConstraints();
		gbc_text_Editar_Aluno_Nacionalidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Nacionalidade.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Nacionalidade.gridx = 4;
		gbc_text_Editar_Aluno_Nacionalidade.gridy = 9;
		panel_9.add(text_Editar_Aluno_Nacionalidade, gbc_text_Editar_Aluno_Nacionalidade);
		
		JLabel label_30 = new JLabel("N\u00BA Cart\u00E3o de Cidad\u00E3o: ");
		label_30.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.anchor = GridBagConstraints.EAST;
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 1;
		gbc_label_30.gridy = 10;
		panel_9.add(label_30, gbc_label_30);
		
		text_Editar_Aluno_Numero_CC = new JTextField();
		text_Editar_Aluno_Numero_CC.setEditable(false);
		text_Editar_Aluno_Numero_CC.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Numero_CC = new GridBagConstraints();
		gbc_text_Editar_Aluno_Numero_CC.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Numero_CC.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Numero_CC.gridx = 2;
		gbc_text_Editar_Aluno_Numero_CC.gridy = 10;
		panel_9.add(text_Editar_Aluno_Numero_CC, gbc_text_Editar_Aluno_Numero_CC);
		
		JLabel label_31 = new JLabel("Validade: ");
		label_31.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.anchor = GridBagConstraints.EAST;
		gbc_label_31.insets = new Insets(0, 0, 5, 5);
		gbc_label_31.gridx = 3;
		gbc_label_31.gridy = 10;
		panel_9.add(label_31, gbc_label_31);
		
		text_Editar_Aluno_Validade = new JTextField();
		text_Editar_Aluno_Validade.setEditable(false);
		text_Editar_Aluno_Validade.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Validade = new GridBagConstraints();
		gbc_text_Editar_Aluno_Validade.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Validade.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Validade.gridx = 4;
		gbc_text_Editar_Aluno_Validade.gridy = 10;
		panel_9.add(text_Editar_Aluno_Validade, gbc_text_Editar_Aluno_Validade);
		
		JLabel label_33 = new JLabel("NIF: ");
		label_33.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.anchor = GridBagConstraints.EAST;
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 1;
		gbc_label_33.gridy = 11;
		panel_9.add(label_33, gbc_label_33);
		
		text_Editar_Aluno_NIF = new JTextField();
		text_Editar_Aluno_NIF.setEditable(false);
		text_Editar_Aluno_NIF.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_NIF = new GridBagConstraints();
		gbc_text_Editar_Aluno_NIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_NIF.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_NIF.gridx = 2;
		gbc_text_Editar_Aluno_NIF.gridy = 11;
		panel_9.add(text_Editar_Aluno_NIF, gbc_text_Editar_Aluno_NIF);
		
		JLabel label_34 = new JLabel("Data de Emiss\u00E3o: ");
		label_34.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.anchor = GridBagConstraints.EAST;
		gbc_label_34.insets = new Insets(0, 0, 5, 5);
		gbc_label_34.gridx = 3;
		gbc_label_34.gridy = 11;
		panel_9.add(label_34, gbc_label_34);
		
		text_Editar_Aluno_Data_Emissao = new JTextField();
		text_Editar_Aluno_Data_Emissao.setEditable(false);
		text_Editar_Aluno_Data_Emissao.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Data_Emissao = new GridBagConstraints();
		gbc_text_Editar_Aluno_Data_Emissao.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Data_Emissao.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Data_Emissao.gridx = 4;
		gbc_text_Editar_Aluno_Data_Emissao.gridy = 11;
		panel_9.add(text_Editar_Aluno_Data_Emissao, gbc_text_Editar_Aluno_Data_Emissao);
		
		JLabel label_36 = new JLabel("Contacto Telef\u00F3nico: ");
		label_36.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.anchor = GridBagConstraints.EAST;
		gbc_label_36.insets = new Insets(0, 0, 5, 5);
		gbc_label_36.gridx = 1;
		gbc_label_36.gridy = 12;
		panel_9.add(label_36, gbc_label_36);
		
		text_Editar_Aluno_Contacto_Telefonico = new JTextField();
		text_Editar_Aluno_Contacto_Telefonico.setEditable(false);
		text_Editar_Aluno_Contacto_Telefonico.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Contacto_Telefonico = new GridBagConstraints();
		gbc_text_Editar_Aluno_Contacto_Telefonico.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Contacto_Telefonico.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Contacto_Telefonico.gridx = 2;
		gbc_text_Editar_Aluno_Contacto_Telefonico.gridy = 12;
		panel_9.add(text_Editar_Aluno_Contacto_Telefonico, gbc_text_Editar_Aluno_Contacto_Telefonico);
		
		JLabel label_37 = new JLabel("Contacto M\u00F3vel: ");
		label_37.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_37 = new GridBagConstraints();
		gbc_label_37.anchor = GridBagConstraints.EAST;
		gbc_label_37.insets = new Insets(0, 0, 5, 5);
		gbc_label_37.gridx = 3;
		gbc_label_37.gridy = 12;
		panel_9.add(label_37, gbc_label_37);
		
		text_Editar_Aluno_Contacto_Movel = new JTextField();
		text_Editar_Aluno_Contacto_Movel.setEditable(false);
		text_Editar_Aluno_Contacto_Movel.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Contacto_Movel = new GridBagConstraints();
		gbc_text_Editar_Aluno_Contacto_Movel.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Contacto_Movel.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Contacto_Movel.gridx = 4;
		gbc_text_Editar_Aluno_Contacto_Movel.gridy = 12;
		panel_9.add(text_Editar_Aluno_Contacto_Movel, gbc_text_Editar_Aluno_Contacto_Movel);
		
		JLabel label_38 = new JLabel("Email: ");
		label_38.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_38 = new GridBagConstraints();
		gbc_label_38.anchor = GridBagConstraints.EAST;
		gbc_label_38.insets = new Insets(0, 0, 5, 5);
		gbc_label_38.gridx = 1;
		gbc_label_38.gridy = 13;
		panel_9.add(label_38, gbc_label_38);
		
		text_Editar_Aluno_Email = new JTextField();
		text_Editar_Aluno_Email.setEditable(false);
		text_Editar_Aluno_Email.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Email = new GridBagConstraints();
		gbc_text_Editar_Aluno_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Email.gridwidth = 3;
		gbc_text_Editar_Aluno_Email.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Email.gridx = 2;
		gbc_text_Editar_Aluno_Email.gridy = 13;
		panel_9.add(text_Editar_Aluno_Email, gbc_text_Editar_Aluno_Email);
		
		JLabel label_39 = new JLabel("Categoria: ");
		label_39.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_39 = new GridBagConstraints();
		gbc_label_39.anchor = GridBagConstraints.EAST;
		gbc_label_39.insets = new Insets(0, 0, 5, 5);
		gbc_label_39.gridx = 1;
		gbc_label_39.gridy = 14;
		panel_9.add(label_39, gbc_label_39);
		
		text_Editar_Aluno_Categoria = new JTextField();
		text_Editar_Aluno_Categoria.setEditable(false);
		text_Editar_Aluno_Categoria.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Categoria = new GridBagConstraints();
		gbc_text_Editar_Aluno_Categoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Categoria.gridwidth = 3;
		gbc_text_Editar_Aluno_Categoria.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Categoria.gridx = 2;
		gbc_text_Editar_Aluno_Categoria.gridy = 14;
		panel_9.add(text_Editar_Aluno_Categoria, gbc_text_Editar_Aluno_Categoria);
		
		JLabel label_40 = new JLabel("Data de Inscri\u00E7\u00E3o: ");
		label_40.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_40 = new GridBagConstraints();
		gbc_label_40.anchor = GridBagConstraints.EAST;
		gbc_label_40.insets = new Insets(0, 0, 5, 5);
		gbc_label_40.gridx = 1;
		gbc_label_40.gridy = 15;
		panel_9.add(label_40, gbc_label_40);
		
		text_Editar_Aluno_Data_Inscricao = new JTextField();
		text_Editar_Aluno_Data_Inscricao.setEditable(false);
		text_Editar_Aluno_Data_Inscricao.setColumns(10);
		GridBagConstraints gbc_text_Editar_Aluno_Data_Inscricao = new GridBagConstraints();
		gbc_text_Editar_Aluno_Data_Inscricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Editar_Aluno_Data_Inscricao.gridwidth = 3;
		gbc_text_Editar_Aluno_Data_Inscricao.insets = new Insets(0, 0, 5, 5);
		gbc_text_Editar_Aluno_Data_Inscricao.gridx = 2;
		gbc_text_Editar_Aluno_Data_Inscricao.gridy = 15;
		panel_9.add(text_Editar_Aluno_Data_Inscricao, gbc_text_Editar_Aluno_Data_Inscricao);
		
		btn_Editar_Voltar_LimparFormulario = new JButton("Limpar Formul\u00E1rio");
		btn_Editar_Voltar_LimparFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text_Editar_Aluno_PalavraChave.setText("");
				text_Editar_Aluno_NomeCompleto.setText("");
				text_Editar_Aluno_Morada.setText("");
				text_Editar_Aluno_NumeroPorta.setText("");
				text_Editar_Aluno_Fracao.setText("");
				text_Editar_Aluno_C_Postal.setText("");
				text_Editar_Aluno_Freguesia.setText("");
				text_Editar_Aluno_Data_Nascimento.setText("");
				text_Editar_Aluno_Nacionalidade.setText("");
				text_Editar_Aluno_Numero_CC.setText("");
				text_Editar_Aluno_Validade.setText("");
				text_Editar_Aluno_NIF.setText("");
				text_Editar_Aluno_Data_Emissao.setText("");
				text_Editar_Aluno_Contacto_Telefonico.setText("");
				text_Editar_Aluno_Contacto_Movel.setText("");
				text_Editar_Aluno_Email.setText("");
				text_Editar_Aluno_Categoria.setText("");
				text_Editar_Aluno_Data_Inscricao.setText("");
				
			}
		});
		btn_Editar_Voltar_LimparFormulario.setEnabled(false);
		GridBagConstraints gbc_btn_Editar_Voltar_LimparFormulario = new GridBagConstraints();
		gbc_btn_Editar_Voltar_LimparFormulario.anchor = GridBagConstraints.EAST;
		gbc_btn_Editar_Voltar_LimparFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Editar_Voltar_LimparFormulario.gridx = 2;
		gbc_btn_Editar_Voltar_LimparFormulario.gridy = 16;
		panel_9.add(btn_Editar_Voltar_LimparFormulario, gbc_btn_Editar_Voltar_LimparFormulario);
		
		btn_Editar_Aluno_Voltar = new JButton("Voltar");
		btn_Editar_Aluno_Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Alunos");
			}
		});
		GridBagConstraints gbc_btn_Editar_Aluno_Voltar = new GridBagConstraints();
		gbc_btn_Editar_Aluno_Voltar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn_Editar_Aluno_Voltar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Editar_Aluno_Voltar.gridx = 3;
		gbc_btn_Editar_Aluno_Voltar.gridy = 16;
		panel_9.add(btn_Editar_Aluno_Voltar, gbc_btn_Editar_Aluno_Voltar);
		
		btnValidarEdio = new JButton("Validar Edi\u00E7\u00E3o");
		btnValidarEdio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						
						Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
						PreparedStatement instP=lig.prepareStatement("UPDATE alunos SET Nome=?, Palavra_Chave=?, Morada=?, Numero_Porta=?, Fracao=?, Freguesia=?, Nacionalidade=?, Validade=?, Data_Emissao=?, C_Postal=?, Data_Nascimento=?, Numero_Cartao_Cidadao=?, NIF=?, Contacto_Telefonico=?, Contacto_Movel=?, Email=?, Categoria=?, Data_Inscricao=? WHERE Numero_Aluno=?");
					
					
					instP.setString(1, text_Editar_Aluno_NomeCompleto.getText());
					instP.setString(2, text_Editar_Aluno_PalavraChave.getText());
					instP.setString(3, text_Editar_Aluno_Morada.getText());
					instP.setString(4, text_Editar_Aluno_NumeroPorta.getText());
					instP.setString(5, text_Editar_Aluno_Fracao.getText());
					instP.setString(6, text_Editar_Aluno_Freguesia.getText());
					instP.setString(7, text_Editar_Aluno_Nacionalidade.getText());

					SimpleDateFormat f=new SimpleDateFormat("dd/M/yyyy");
					java.util.Date data=f.parse(text_Editar_Aluno_Validade.getText());
					java.sql.Date validade=new Date(data.getTime());
					instP.setDate(8, validade);
					

					java.util.Date data_emissao=f.parse(text_Editar_Aluno_Data_Emissao.getText());
					java.sql.Date emissao=new Date(data_emissao.getTime());
					instP.setDate(9, emissao);
					
					instP.setString(10, text_Editar_Aluno_C_Postal.getText());
					

					java.util.Date data_nascimento=f.parse(text_Editar_Aluno_Data_Nascimento.getText());
					java.sql.Date nascimento=new Date(data_nascimento.getTime());
					instP.setDate(11, nascimento);
					
					
					instP.setString(12,(text_Editar_Aluno_Numero_CC.getText().toString()));

					instP.setInt(13, Integer.parseInt(text_Editar_Aluno_NIF.getText()));
					
					instP.setInt(14, Integer.parseInt(text_Editar_Aluno_Contacto_Telefonico.getText()));
					
					instP.setInt(15, Integer.parseInt(text_Editar_Aluno_Contacto_Movel.getText()));
					
					instP.setString(16, text_Editar_Aluno_Email.getText());
					
					instP.setString(17, text_Editar_Aluno_Categoria.getText());
					
					java.util.Date data_inscricao=f.parse(text_Editar_Aluno_Data_Nascimento.getText());
					java.sql.Date inscricao=new Date(data_inscricao.getTime());
					instP.setDate(18, inscricao);
					
					instP.setInt(19, Integer.parseInt(comboBoxEditar_Aluno_NumeroAluno.getSelectedItem().toString()));
					
					int linhas=instP.executeUpdate();
					
					lig.close();
					if(linhas==1){
					JOptionPane.showMessageDialog(null,"Aluno Atualizado com Sucesso!");
					text_Editar_Aluno_PalavraChave.setText("");
					text_Editar_Aluno_NomeCompleto.setText("");
					text_Editar_Aluno_Morada.setText("");
					text_Editar_Aluno_NumeroPorta.setText("");
					text_Editar_Aluno_Fracao.setText("");
					text_Editar_Aluno_C_Postal.setText("");
					text_Editar_Aluno_Freguesia.setText("");
					text_Editar_Aluno_Data_Nascimento.setText("");
					text_Editar_Aluno_Nacionalidade.setText("");
					text_Editar_Aluno_Numero_CC.setText("");
					text_Editar_Aluno_Validade.setText("");
					text_Editar_Aluno_NIF.setText("");
					text_Editar_Aluno_Data_Emissao.setText("");
					text_Editar_Aluno_Contacto_Telefonico.setText("");
					text_Editar_Aluno_Contacto_Movel.setText("");
					text_Editar_Aluno_Email.setText("");
					text_Editar_Aluno_Categoria.setText("");
					text_Editar_Aluno_Data_Inscricao.setText("");
					
					
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "panel_Alunos");
					
					}
					} catch (SQLException e1) {
						
						JOptionPane.showMessageDialog(null, "Erro: " + e1.getLocalizedMessage());

					} catch (ParseException e1) {
						
						JOptionPane.showMessageDialog(null, "Erro: " + e1.getLocalizedMessage());
					}
			}
		});
		btnValidarEdio.setEnabled(false);
		
		GridBagConstraints gbc_btnValidarEdio = new GridBagConstraints();
		gbc_btnValidarEdio.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnValidarEdio.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidarEdio.gridx = 4;
		gbc_btnValidarEdio.gridy = 16;
		panel_9.add(btnValidarEdio, gbc_btnValidarEdio);
		
		JPanel panel_Apagar_Aluno = new JPanel();
		frame.getContentPane().add(panel_Apagar_Aluno, "panel_Apagar_Aluno");
		panel_Apagar_Aluno.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_Apagar_Aluno.add(panel_10, BorderLayout.NORTH);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{80, 0, 0};
		gbl_panel_10.rowHeights = new int[]{85, 64, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.gridheight = 2;
		gbc_label_15.insets = new Insets(0, 0, 0, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 0;
		panel_10.add(label_15, gbc_label_15);
		
		JLabel label_23 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.anchor = GridBagConstraints.SOUTH;
		gbc_label_23.insets = new Insets(0, 0, 5, 0);
		gbc_label_23.gridx = 1;
		gbc_label_23.gridy = 0;
		panel_10.add(label_23, gbc_label_23);
		
		JLabel lblApagarAluno = new JLabel("Apagar Aluno");
		lblApagarAluno.setForeground(Color.WHITE);
		lblApagarAluno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblApagarAluno = new GridBagConstraints();
		gbc_lblApagarAluno.anchor = GridBagConstraints.NORTH;
		gbc_lblApagarAluno.gridx = 1;
		gbc_lblApagarAluno.gridy = 1;
		panel_10.add(lblApagarAluno, gbc_lblApagarAluno);
		
		JPanel panel_11 = new JPanel();
		panel_Apagar_Aluno.add(panel_11, BorderLayout.CENTER);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{60, 61, 57, 101, 269, 160, 141, 0};
		gbl_panel_11.rowHeights = new int[]{128, 0, 0, 35, 188, 0, 0, 0};
		gbl_panel_11.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		JLabel lblRemoverAlunoa = new JLabel("Remover Aluno(a)");
		lblRemoverAlunoa.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblRemoverAlunoa.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRemoverAlunoa = new GridBagConstraints();
		gbc_lblRemoverAlunoa.anchor = GridBagConstraints.WEST;
		gbc_lblRemoverAlunoa.gridwidth = 2;
		gbc_lblRemoverAlunoa.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemoverAlunoa.gridx = 1;
		gbc_lblRemoverAlunoa.gridy = 1;
		panel_11.add(lblRemoverAlunoa, gbc_lblRemoverAlunoa);
		
		JLabel label_26 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.anchor = GridBagConstraints.WEST;
		gbc_label_26.gridwidth = 4;
		gbc_label_26.gridx = 1;
		gbc_label_26.gridy = 2;
		panel_11.add(label_26, gbc_label_26);
		
		JLabel label_29 = new JLabel("N\u00BA de Aluno: ");
		label_29.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 1;
		gbc_label_29.gridy = 3;
		panel_11.add(label_29, gbc_label_29);
		
		comboBoxRemover_Aluno_NumeroAluno = new JComboBox();
		GridBagConstraints gbc_comboBoxRemover_Aluno_NumeroAluno = new GridBagConstraints();
		gbc_comboBoxRemover_Aluno_NumeroAluno.gridwidth = 3;
		gbc_comboBoxRemover_Aluno_NumeroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxRemover_Aluno_NumeroAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRemover_Aluno_NumeroAluno.gridx = 2;
		gbc_comboBoxRemover_Aluno_NumeroAluno.gridy = 3;
		panel_11.add(comboBoxRemover_Aluno_NumeroAluno, gbc_comboBoxRemover_Aluno_NumeroAluno);
		
		JLabel lblMotivo = new JLabel("Motivo: ");
		lblMotivo.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotivo = new GridBagConstraints();
		gbc_lblMotivo.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMotivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivo.gridx = 1;
		gbc_lblMotivo.gridy = 4;
		panel_11.add(lblMotivo, gbc_lblMotivo);
		
		txtRemover_Aluno_Motivo = new JTextArea();
		txtRemover_Aluno_Motivo.setBorder(UIManager.getBorder("TextField.border"));
		GridBagConstraints gbc_txtRemover_Aluno_Motivo = new GridBagConstraints();
		gbc_txtRemover_Aluno_Motivo.gridwidth = 3;
		gbc_txtRemover_Aluno_Motivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtRemover_Aluno_Motivo.fill = GridBagConstraints.BOTH;
		gbc_txtRemover_Aluno_Motivo.gridx = 2;
		gbc_txtRemover_Aluno_Motivo.gridy = 4;
		panel_11.add(txtRemover_Aluno_Motivo, gbc_txtRemover_Aluno_Motivo);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/Remover_Aluno.png")));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.gridheight = 2;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 5;
		gbc_lblNewLabel_13.gridy = 3;
		panel_11.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Alunos");
			}
		});
		GridBagConstraints gbc_btnVoltar_1 = new GridBagConstraints();
		gbc_btnVoltar_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_1.gridx = 3;
		gbc_btnVoltar_1.gridy = 5;
		panel_11.add(btnVoltar_1, gbc_btnVoltar_1);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Quer mesmo remover este aluno?","Warning",dialogButton);
				
				try{
					
					if(dialogResult == JOptionPane.YES_OPTION){
						Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
						PreparedStatement instP=(PreparedStatement) lig.prepareStatement("DELETE FROM alunos where Numero_Aluno=?");
						instP.setInt(1, Integer.parseInt(comboBoxRemover_Aluno_NumeroAluno.getSelectedItem().toString()));
						instP.execute();
						
						Date data_veiculo_inserido = new Date(System.currentTimeMillis());  
			    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
			    		String nomeficheiro = "Aluno - Apagado - " + formatarData.format(data_veiculo_inserido);
			    		
			    		
			        	File file =new File("logs/Eliminados/Alunos/"+nomeficheiro+".txt");
			        	if(!file.exists()){
			        	   file.createNewFile();
			        	}
						String conteudo = txtRemover_Aluno_Motivo.getText();
						
						FileWriter filewriter = new FileWriter(file);
						BufferedWriter writer = new BufferedWriter(new FileWriter(file));
 
						    writer.write("========================================");
						    writer.write(System.getProperty("line.separator"));
						    writer.write("Aluno Eliminado");
						    writer.write(System.getProperty("line.separator"));
						    writer.write(conteudo);
						    writer.write(System.getProperty("line.separator"));
						    writer.write("========================================");
						    writer.write(System.getProperty("line.separator"));
						    writer.write(System.getProperty("line.separator"));
						    
						    JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
						    
						    txtRemover_Aluno_Motivo.setText("");
						    CardLayout card=(CardLayout)frame.getContentPane().getLayout();
							card.show(frame.getContentPane(), "panel_Alunos");
					
					}
					else	 	
					{
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Apagar_Aluno");
					}
				
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		GridBagConstraints gbc_btnRemover = new GridBagConstraints();
		gbc_btnRemover.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemover.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemover.gridx = 4;
		gbc_btnRemover.gridy = 5;
		panel_11.add(btnRemover, gbc_btnRemover);
		
		JPanel panel_Veiculos = new JPanel();
		frame.getContentPane().add(panel_Veiculos, "panel_Veiculos");
		panel_Veiculos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_Veiculos.add(panel_4, BorderLayout.NORTH);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{80, 0, 0};
		gbl_panel_4.rowHeights = new int[]{85, 64, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.gridheight = 2;
		gbc_label_12.insets = new Insets(0, 0, 0, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 0;
		panel_4.add(label_12, gbc_label_12);
		
		JLabel label_10 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.SOUTH;
		gbc_label_10.insets = new Insets(0, 0, 5, 0);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 0;
		panel_4.add(label_10, gbc_label_10);
		
		JLabel lblVeculos_1 = new JLabel("Ve\u00EDculos       ");
		lblVeculos_1.setForeground(Color.WHITE);
		lblVeculos_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblVeculos_1 = new GridBagConstraints();
		gbc_lblVeculos_1.anchor = GridBagConstraints.NORTH;
		gbc_lblVeculos_1.gridx = 1;
		gbc_lblVeculos_1.gridy = 1;
		panel_4.add(lblVeculos_1, gbc_lblVeculos_1);
		
		JPanel panel_5 = new JPanel();
		panel_Veiculos.add(panel_5, BorderLayout.CENTER);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{46, 82, 82, 180, 80, 0, 80, 0, 80, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{62, 215, 110, 0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Adicionar_Veiculo");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Codigo_Docente FROM docentes");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String codigo_docente = res.getString("Codigo_Docente");
						comboboxAdicionar_Veiculos_CodigoDocente.addItem(codigo_docente);
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
						
						
						
						
					}
				
			
		});
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Listar_Veiculos");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Matricula`,`Marca`,`Modelo`,`Motorizacao`,`Combustivel`,`Numero_Quadro`,`Ano`,`Mes`,`Docentes_Codigo_Docente` FROM veiculos ve INNER JOIN docentes doc ON ve.Docentes_Codigo_Docente = doc.Codigo_Docente");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String matricula = res.getString("Matricula");
						String marca = res.getString("Marca");
						String modelo = res.getString("Modelo");
						int motorizacao = res.getInt("Motorizacao");
						String Combustivel = res.getString("Combustivel");
						String numero_quadro = res.getString("Numero_Quadro");
						int ano = res.getInt("Ano");
						String mes = res.getString("mes");
						String codigo_docente = res.getString("Docentes_Codigo_Docente");

						modelo_Veiculos.addRow(new Object[]{matricula, marca, modelo, motorizacao, Combustivel, numero_quadro, ano, mes, codigo_docente});
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
						
			}
		});
		lblNewLabel_28.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/listar_veiculos.png")));
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_28.gridx = 1;
		gbc_lblNewLabel_28.gridy = 1;
		panel_5.add(lblNewLabel_28, gbc_lblNewLabel_28);
		lblNewLabel_9.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/adicionar_veiculo.png")));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 3;
		gbc_lblNewLabel_9.gridy = 1;
		panel_5.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblEditar_1 = new JLabel("");
		lblEditar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Editar_Veiculo");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Matricula FROM veiculos");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String matricula = res.getString("Matricula");

						comboboxEditar_Veiculo_Matricula.addItem(matricula);
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		lblEditar_1.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/editar_veiculo.png")));
		GridBagConstraints gbc_lblEditar_1 = new GridBagConstraints();
		gbc_lblEditar_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblEditar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditar_1.gridx = 5;
		gbc_lblEditar_1.gridy = 1;
		panel_5.add(lblEditar_1, gbc_lblEditar_1);
		
		JLabel lblApagar = new JLabel("");
		lblApagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Apagar_Veiculo");
			}
		});
		lblApagar.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/apagar_veiculo2.png")));
		GridBagConstraints gbc_lblApagar = new GridBagConstraints();
		gbc_lblApagar.anchor = GridBagConstraints.SOUTH;
		gbc_lblApagar.insets = new Insets(0, 0, 5, 5);
		gbc_lblApagar.gridx = 7;
		gbc_lblApagar.gridy = 1;
		panel_5.add(lblApagar, gbc_lblApagar);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Second");
			}
		});
		lblNewLabel_10.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 9;
		gbc_lblNewLabel_10.gridy = 1;
		panel_5.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblLista_1 = new JLabel("Lista");
		lblLista_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblLista_1 = new GridBagConstraints();
		gbc_lblLista_1.anchor = GridBagConstraints.NORTH;
		gbc_lblLista_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLista_1.gridx = 1;
		gbc_lblLista_1.gridy = 2;
		panel_5.add(lblLista_1, gbc_lblLista_1);
		
		JLabel lblAdicionar_1 = new JLabel("Adicionar");
		lblAdicionar_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAdicionar_1 = new GridBagConstraints();
		gbc_lblAdicionar_1.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionar_1.gridx = 3;
		gbc_lblAdicionar_1.gridy = 2;
		panel_5.add(lblAdicionar_1, gbc_lblAdicionar_1);
		
		JLabel lblEditar_2 = new JLabel("Editar");
		lblEditar_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEditar_2 = new GridBagConstraints();
		gbc_lblEditar_2.anchor = GridBagConstraints.NORTH;
		gbc_lblEditar_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditar_2.gridx = 5;
		gbc_lblEditar_2.gridy = 2;
		panel_5.add(lblEditar_2, gbc_lblEditar_2);
		
		JLabel lblApagar_1 = new JLabel("Apagar");
		lblApagar_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblApagar_1 = new GridBagConstraints();
		gbc_lblApagar_1.anchor = GridBagConstraints.NORTH;
		gbc_lblApagar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApagar_1.gridx = 7;
		gbc_lblApagar_1.gridy = 2;
		panel_5.add(lblApagar_1, gbc_lblApagar_1);
		
		JLabel lblVoltar_2 = new JLabel("Voltar");
		lblVoltar_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_2 = new GridBagConstraints();
		gbc_lblVoltar_2.anchor = GridBagConstraints.NORTH;
		gbc_lblVoltar_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_2.gridx = 9;
		gbc_lblVoltar_2.gridy = 2;
		panel_5.add(lblVoltar_2, gbc_lblVoltar_2);
		
		JPanel panel_Listar_Veiculos = new JPanel();
		frame.getContentPane().add(panel_Listar_Veiculos, "panel_Listar_Veiculos");
		panel_Listar_Veiculos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(Color.BLACK);
		panel_Listar_Veiculos.add(panel_43, BorderLayout.NORTH);
		GridBagLayout gbl_panel_43 = new GridBagLayout();
		gbl_panel_43.columnWidths = new int[]{80, 0, 0};
		gbl_panel_43.rowHeights = new int[]{85, 64, 0};
		gbl_panel_43.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_43.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_43.setLayout(gbl_panel_43);
		
		JLabel label_100 = new JLabel("");
		label_100.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_100 = new GridBagConstraints();
		gbc_label_100.gridheight = 2;
		gbc_label_100.insets = new Insets(0, 0, 0, 5);
		gbc_label_100.gridx = 0;
		gbc_label_100.gridy = 0;
		panel_43.add(label_100, gbc_label_100);
		
		JLabel label_101 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_101.setForeground(Color.WHITE);
		label_101.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_101 = new GridBagConstraints();
		gbc_label_101.anchor = GridBagConstraints.SOUTH;
		gbc_label_101.insets = new Insets(0, 0, 5, 0);
		gbc_label_101.gridx = 1;
		gbc_label_101.gridy = 0;
		panel_43.add(label_101, gbc_label_101);
		
		JLabel lblListaDeVeculos = new JLabel("Lista de Ve\u00EDculos");
		lblListaDeVeculos.setForeground(Color.WHITE);
		lblListaDeVeculos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblListaDeVeculos = new GridBagConstraints();
		gbc_lblListaDeVeculos.anchor = GridBagConstraints.NORTH;
		gbc_lblListaDeVeculos.gridx = 1;
		gbc_lblListaDeVeculos.gridy = 1;
		panel_43.add(lblListaDeVeculos, gbc_lblListaDeVeculos);
		
		JPanel panel_44 = new JPanel();
		panel_Listar_Veiculos.add(panel_44, BorderLayout.CENTER);
		GridBagLayout gbl_panel_44 = new GridBagLayout();
		gbl_panel_44.columnWidths = new int[]{0, 0, 0};
		gbl_panel_44.rowHeights = new int[]{0, 0, 0};
		gbl_panel_44.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_44.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_44.setLayout(gbl_panel_44);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_42 = new GridBagConstraints();
		gbc_panel_42.fill = GridBagConstraints.BOTH;
		gbc_panel_42.gridx = 1;
		gbc_panel_42.gridy = 1;
		panel_44.add(panel_42, gbc_panel_42);
		GridBagLayout gbl_panel_42 = new GridBagLayout();
		gbl_panel_42.columnWidths = new int[]{0, 250, 250, 250, -574, 0, 0};
		gbl_panel_42.rowHeights = new int[]{0, 379, 43, 0, 0};
		gbl_panel_42.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_42.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_42.setLayout(gbl_panel_42);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		JTable tableListar_Veiculos = new JTable(modelo_Veiculos);
		tableListar_Veiculos.setRowSelectionAllowed(false);
		modelo_Veiculos.addColumn("Matrícula");
		modelo_Veiculos.addColumn("Marca");
		modelo_Veiculos.addColumn("Modelo");
		modelo_Veiculos.addColumn("Motorizacação");
		modelo_Veiculos.addColumn("Combustível");
		modelo_Veiculos.addColumn("Número de Quadro");
		modelo_Veiculos.addColumn("Ano");
		modelo_Veiculos.addColumn("Mês");
		modelo_Veiculos.addColumn("Código Docente");
																																																																																																																																																																																																																																																																																																
		
		scrollPane_2.setViewportView(tableListar_Veiculos);
		
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridwidth = 3;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 1;
		panel_42.add(scrollPane_2, gbc_scrollPane_2);
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Veiculos");
				
				int rowCount = modelo_Veiculos.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					modelo_Veiculos.removeRow(i);
				}
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		panel_42.add(button, gbc_button);
		
		JPanel panel_Adicionar_Veiculo = new JPanel();
		frame.getContentPane().add(panel_Adicionar_Veiculo, "panel_Adicionar_Veiculo");
		panel_Adicionar_Veiculo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.BLACK);
		panel_Adicionar_Veiculo.add(panel_12, BorderLayout.NORTH);
		GridBagLayout gbl_panel_12 = new GridBagLayout();
		gbl_panel_12.columnWidths = new int[]{80, 0, 0};
		gbl_panel_12.rowHeights = new int[]{85, 64, 0};
		gbl_panel_12.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_12.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_12.setLayout(gbl_panel_12);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.gridheight = 2;
		gbc_label_32.insets = new Insets(0, 0, 0, 5);
		gbc_label_32.gridx = 0;
		gbc_label_32.gridy = 0;
		panel_12.add(label_32, gbc_label_32);
		
		JLabel label_35 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_35.setForeground(Color.WHITE);
		label_35.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.anchor = GridBagConstraints.SOUTH;
		gbc_label_35.insets = new Insets(0, 0, 5, 0);
		gbc_label_35.gridx = 1;
		gbc_label_35.gridy = 0;
		panel_12.add(label_35, gbc_label_35);
		
		JLabel lblAdicionarVeculos = new JLabel("Adicionar Ve\u00EDculos");
		lblAdicionarVeculos.setForeground(Color.WHITE);
		lblAdicionarVeculos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAdicionarVeculos = new GridBagConstraints();
		gbc_lblAdicionarVeculos.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionarVeculos.gridx = 1;
		gbc_lblAdicionarVeculos.gridy = 1;
		panel_12.add(lblAdicionarVeculos, gbc_lblAdicionarVeculos);
		
		JPanel panel_13 = new JPanel();
		panel_Adicionar_Veiculo.add(panel_13, BorderLayout.CENTER);
		GridBagLayout gbl_panel_13 = new GridBagLayout();
		gbl_panel_13.columnWidths = new int[]{89, 194, 194, 43, 115, 115, 115, 207, 0, 0};
		gbl_panel_13.rowHeights = new int[]{71, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_13.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_13.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_13.setLayout(gbl_panel_13);
		
		JLabel lblAdicionarVeculo = new JLabel("Adicionar Ve\u00EDculo");
		lblAdicionarVeculo.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblAdicionarVeculo.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAdicionarVeculo = new GridBagConstraints();
		gbc_lblAdicionarVeculo.gridwidth = 7;
		gbc_lblAdicionarVeculo.anchor = GridBagConstraints.WEST;
		gbc_lblAdicionarVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionarVeculo.gridx = 1;
		gbc_lblAdicionarVeculo.gridy = 1;
		panel_13.add(lblAdicionarVeculo, gbc_lblAdicionarVeculo);
		
		JLabel label_42 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_42 = new GridBagConstraints();
		gbc_label_42.insets = new Insets(0, 0, 5, 5);
		gbc_label_42.gridwidth = 7;
		gbc_label_42.gridx = 1;
		gbc_label_42.gridy = 2;
		panel_13.add(label_42, gbc_label_42);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula: ");
		lblMatrcula.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMatrcula = new GridBagConstraints();
		gbc_lblMatrcula.anchor = GridBagConstraints.EAST;
		gbc_lblMatrcula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatrcula.gridx = 1;
		gbc_lblMatrcula.gridy = 4;
		panel_13.add(lblMatrcula, gbc_lblMatrcula);
		
		txtAdicionar_Veiculo_Matricula = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Matricula = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Matricula.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Matricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Matricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Matricula.gridx = 2;
		gbc_txtAdicionar_Veiculo_Matricula.gridy = 4;
		panel_13.add(txtAdicionar_Veiculo_Matricula, gbc_txtAdicionar_Veiculo_Matricula);
		txtAdicionar_Veiculo_Matricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.EAST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 1;
		gbc_lblMarca.gridy = 5;
		panel_13.add(lblMarca, gbc_lblMarca);
		
		txtAdicionar_Veiculo_Marca = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Marca = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Marca.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Marca.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Marca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Marca.gridx = 2;
		gbc_txtAdicionar_Veiculo_Marca.gridy = 5;
		panel_13.add(txtAdicionar_Veiculo_Marca, gbc_txtAdicionar_Veiculo_Marca);
		txtAdicionar_Veiculo_Marca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo: ");
		lblModelo.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 1;
		gbc_lblModelo.gridy = 6;
		panel_13.add(lblModelo, gbc_lblModelo);
		
		txtAdicionar_Veiculo_Modelo = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Modelo = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Modelo.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Modelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Modelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Modelo.gridx = 2;
		gbc_txtAdicionar_Veiculo_Modelo.gridy = 6;
		panel_13.add(txtAdicionar_Veiculo_Modelo, gbc_txtAdicionar_Veiculo_Modelo);
		txtAdicionar_Veiculo_Modelo.setColumns(10);
		
		JLabel lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o: ");
		lblMotorizao.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotorizao = new GridBagConstraints();
		gbc_lblMotorizao.anchor = GridBagConstraints.EAST;
		gbc_lblMotorizao.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotorizao.gridx = 1;
		gbc_lblMotorizao.gridy = 7;
		panel_13.add(lblMotorizao, gbc_lblMotorizao);
		
		txtAdicionar_Veiculo_Motorizacao = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Motorizacao = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Motorizacao.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Motorizacao.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Motorizacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Motorizacao.gridx = 2;
		gbc_txtAdicionar_Veiculo_Motorizacao.gridy = 7;
		panel_13.add(txtAdicionar_Veiculo_Motorizacao, gbc_txtAdicionar_Veiculo_Motorizacao);
		txtAdicionar_Veiculo_Motorizacao.setColumns(10);
		
		JLabel lblCombustvel = new JLabel("Combust\u00EDvel: ");
		lblCombustvel.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCombustvel = new GridBagConstraints();
		gbc_lblCombustvel.anchor = GridBagConstraints.EAST;
		gbc_lblCombustvel.insets = new Insets(0, 0, 5, 5);
		gbc_lblCombustvel.gridx = 1;
		gbc_lblCombustvel.gridy = 8;
		panel_13.add(lblCombustvel, gbc_lblCombustvel);
		
		txtAdicionar_Veiculo_Combustivel = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Combustivel = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Combustivel.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Combustivel.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Combustivel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Combustivel.gridx = 2;
		gbc_txtAdicionar_Veiculo_Combustivel.gridy = 8;
		panel_13.add(txtAdicionar_Veiculo_Combustivel, gbc_txtAdicionar_Veiculo_Combustivel);
		txtAdicionar_Veiculo_Combustivel.setColumns(10);
		
		JLabel lblNDeQuadro = new JLabel("N\u00BA de Quadro: ");
		lblNDeQuadro.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNDeQuadro = new GridBagConstraints();
		gbc_lblNDeQuadro.anchor = GridBagConstraints.EAST;
		gbc_lblNDeQuadro.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeQuadro.gridx = 1;
		gbc_lblNDeQuadro.gridy = 9;
		panel_13.add(lblNDeQuadro, gbc_lblNDeQuadro);
		
		txtAdicionar_Veiculo_Numero_Quadro = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Numero_Quadro = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Numero_Quadro.gridwidth = 5;
		gbc_txtAdicionar_Veiculo_Numero_Quadro.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Numero_Quadro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Numero_Quadro.gridx = 2;
		gbc_txtAdicionar_Veiculo_Numero_Quadro.gridy = 9;
		panel_13.add(txtAdicionar_Veiculo_Numero_Quadro, gbc_txtAdicionar_Veiculo_Numero_Quadro);
		txtAdicionar_Veiculo_Numero_Quadro.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano: ");
		lblAno.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAno = new GridBagConstraints();
		gbc_lblAno.anchor = GridBagConstraints.EAST;
		gbc_lblAno.insets = new Insets(0, 0, 5, 5);
		gbc_lblAno.gridx = 1;
		gbc_lblAno.gridy = 10;
		panel_13.add(lblAno, gbc_lblAno);
		
		txtAdicionar_Veiculo_Ano = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Ano = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Ano.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Ano.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Ano.gridx = 2;
		gbc_txtAdicionar_Veiculo_Ano.gridy = 10;
		panel_13.add(txtAdicionar_Veiculo_Ano, gbc_txtAdicionar_Veiculo_Ano);
		txtAdicionar_Veiculo_Ano.setColumns(10);
		
		JLabel lblMs = new JLabel("M\u00EAs: ");
		lblMs.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMs = new GridBagConstraints();
		gbc_lblMs.anchor = GridBagConstraints.EAST;
		gbc_lblMs.insets = new Insets(0, 0, 5, 5);
		gbc_lblMs.gridx = 3;
		gbc_lblMs.gridy = 10;
		panel_13.add(lblMs, gbc_lblMs);
		
		txtAdicionar_Veiculo_Mes = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Veiculo_Mes = new GridBagConstraints();
		gbc_txtAdicionar_Veiculo_Mes.gridwidth = 3;
		gbc_txtAdicionar_Veiculo_Mes.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Veiculo_Mes.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Veiculo_Mes.gridx = 4;
		gbc_txtAdicionar_Veiculo_Mes.gridy = 10;
		panel_13.add(txtAdicionar_Veiculo_Mes, gbc_txtAdicionar_Veiculo_Mes);
		txtAdicionar_Veiculo_Mes.setColumns(10);
		
		JLabel lblCodigoDeDocente = new JLabel("Codigo de Docente: ");
		lblCodigoDeDocente.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCodigoDeDocente = new GridBagConstraints();
		gbc_lblCodigoDeDocente.anchor = GridBagConstraints.EAST;
		gbc_lblCodigoDeDocente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoDeDocente.gridx = 1;
		gbc_lblCodigoDeDocente.gridy = 11;
		panel_13.add(lblCodigoDeDocente, gbc_lblCodigoDeDocente);
		
		comboboxAdicionar_Veiculos_CodigoDocente = new JComboBox();
		GridBagConstraints gbc_comboboxAdicionar_Veiculos_CodigoDocente = new GridBagConstraints();
		gbc_comboboxAdicionar_Veiculos_CodigoDocente.gridwidth = 5;
		gbc_comboboxAdicionar_Veiculos_CodigoDocente.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxAdicionar_Veiculos_CodigoDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxAdicionar_Veiculos_CodigoDocente.gridx = 2;
		gbc_comboboxAdicionar_Veiculos_CodigoDocente.gridy = 11;
		panel_13.add(comboboxAdicionar_Veiculos_CodigoDocente, gbc_comboboxAdicionar_Veiculos_CodigoDocente);
		
		JButton btnLimparFormulrio_1 = new JButton("Limpar Formul\u00E1rio");
		btnLimparFormulrio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAdicionar_Veiculo_Matricula.setText("");
				txtAdicionar_Veiculo_Marca.setText("");
				txtAdicionar_Veiculo_Modelo.setText("");
				txtAdicionar_Veiculo_Motorizacao.setText("");
				txtAdicionar_Veiculo_Combustivel.setText("");
				txtAdicionar_Veiculo_Numero_Quadro.setText("");
				txtAdicionar_Veiculo_Ano.setText("");
				txtAdicionar_Veiculo_Mes.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulrio_1 = new GridBagConstraints();
		gbc_btnLimparFormulrio_1.anchor = GridBagConstraints.EAST;
		gbc_btnLimparFormulrio_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulrio_1.gridx = 4;
		gbc_btnLimparFormulrio_1.gridy = 12;
		panel_13.add(btnLimparFormulrio_1, gbc_btnLimparFormulrio_1);
		
		JButton btnAdicionarVeculo_1 = new JButton("Voltar");
		btnAdicionarVeculo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Veiculos");
			}
		});
		GridBagConstraints gbc_btnAdicionarVeculo_1 = new GridBagConstraints();
		gbc_btnAdicionarVeculo_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdicionarVeculo_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdicionarVeculo_1.gridx = 5;
		gbc_btnAdicionarVeculo_1.gridy = 12;
		panel_13.add(btnAdicionarVeculo_1, gbc_btnAdicionarVeculo_1);
		
		JButton btnAdicionarVeculo = new JButton("Adicionar Ve\u00EDculo");
		btnAdicionarVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
try{
					
					Connection lig= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement inst=(PreparedStatement) lig.prepareStatement("INSERT INTO `veiculos` (`Matricula`, `Marca`, `Modelo`, `Motorizacao`, `Combustivel`, `Numero_Quadro`, `Ano`, `Mes`, `Docentes_Codigo_Docente`) VALUES (?,?,?,?,?,?,?,?,?)");

					inst.setString(1, txtAdicionar_Veiculo_Matricula.getText());
					
					inst.setString(2, txtAdicionar_Veiculo_Marca.getText());
					
					inst.setString(3, txtAdicionar_Veiculo_Modelo.getText());
					
					inst.setInt(4, Integer.parseInt(txtAdicionar_Veiculo_Motorizacao.getText()));
					
					inst.setString(5, txtAdicionar_Veiculo_Combustivel.getText());
					
					inst.setString(6, txtAdicionar_Veiculo_Numero_Quadro.getText());
					
					inst.setInt(7, Integer.parseInt(txtAdicionar_Veiculo_Ano.getText()));
					
					inst.setString(8, txtAdicionar_Veiculo_Mes.getText());
					
					inst.setString(9, comboboxAdicionar_Veiculos_CodigoDocente.getSelectedItem().toString());
					
					int linhas=inst.executeUpdate();
					
					if(linhas==1){
						JOptionPane.showMessageDialog(null, "Veiculo inserido com sucesso!");
						
						txtAdicionar_Veiculo_Matricula.setText("");
						txtAdicionar_Veiculo_Marca.setText("");
						txtAdicionar_Veiculo_Modelo.setText("");
						txtAdicionar_Veiculo_Motorizacao.setText("");
						txtAdicionar_Veiculo_Combustivel.setText("");
						txtAdicionar_Veiculo_Numero_Quadro.setText("");
						txtAdicionar_Veiculo_Ano.setText("");
						txtAdicionar_Veiculo_Mes.setText("");
						
						Date data_veiculo_inserido = new Date(System.currentTimeMillis());  
			    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
			    		String nomeficheiro = "Veiculo - Inserir - " + formatarData.format(data_veiculo_inserido);
			    		
			    		
			        	File file =new File("logs/Registos/Veiculos/"+nomeficheiro+".txt");
			        	if(!file.exists()){
			        	   file.createNewFile();
			        	}
			        	
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Veiculos");
					}
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "A conexão à base de dados não foi possível\nDescrição: " + e.getLocalizedMessage());
					
				}
			}
		});
		GridBagConstraints gbc_btnAdicionarVeculo = new GridBagConstraints();
		gbc_btnAdicionarVeculo.anchor = GridBagConstraints.WEST;
		gbc_btnAdicionarVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdicionarVeculo.gridx = 6;
		gbc_btnAdicionarVeculo.gridy = 12;
		panel_13.add(btnAdicionarVeculo, gbc_btnAdicionarVeculo);
		
		JPanel panel_Editar_Veiculo = new JPanel();
		frame.getContentPane().add(panel_Editar_Veiculo, "panel_Editar_Veiculo");
		panel_Editar_Veiculo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.BLACK);
		panel_Editar_Veiculo.add(panel_15, BorderLayout.NORTH);
		GridBagLayout gbl_panel_15 = new GridBagLayout();
		gbl_panel_15.columnWidths = new int[]{80, 0, 0};
		gbl_panel_15.rowHeights = new int[]{85, 64, 0};
		gbl_panel_15.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_15.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_15.setLayout(gbl_panel_15);
		
		JLabel label_43 = new JLabel("");
		label_43.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_43 = new GridBagConstraints();
		gbc_label_43.gridheight = 2;
		gbc_label_43.insets = new Insets(0, 0, 0, 5);
		gbc_label_43.gridx = 0;
		gbc_label_43.gridy = 0;
		panel_15.add(label_43, gbc_label_43);
		
		JLabel label_44 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_44.setForeground(Color.WHITE);
		label_44.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_44 = new GridBagConstraints();
		gbc_label_44.anchor = GridBagConstraints.SOUTH;
		gbc_label_44.insets = new Insets(0, 0, 5, 0);
		gbc_label_44.gridx = 1;
		gbc_label_44.gridy = 0;
		panel_15.add(label_44, gbc_label_44);
		
		JLabel lblEditarVeculo_1 = new JLabel("Editar Ve\u00EDculo");
		lblEditarVeculo_1.setForeground(Color.WHITE);
		lblEditarVeculo_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblEditarVeculo_1 = new GridBagConstraints();
		gbc_lblEditarVeculo_1.anchor = GridBagConstraints.NORTH;
		gbc_lblEditarVeculo_1.gridx = 1;
		gbc_lblEditarVeculo_1.gridy = 1;
		panel_15.add(lblEditarVeculo_1, gbc_lblEditarVeculo_1);
		
		JPanel panel_16 = new JPanel();
		panel_Editar_Veiculo.add(panel_16, BorderLayout.CENTER);
		GridBagLayout gbl_panel_16 = new GridBagLayout();
		gbl_panel_16.columnWidths = new int[]{89, 194, 194, 43, 115, 115, 115, 145, 0, 0};
		gbl_panel_16.rowHeights = new int[]{71, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_16.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_16.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_16.setLayout(gbl_panel_16);
		
		JLabel lblEditarVeculo = new JLabel("Editar Ve\u00EDculo");
		lblEditarVeculo.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblEditarVeculo.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEditarVeculo = new GridBagConstraints();
		gbc_lblEditarVeculo.anchor = GridBagConstraints.WEST;
		gbc_lblEditarVeculo.gridwidth = 7;
		gbc_lblEditarVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditarVeculo.gridx = 1;
		gbc_lblEditarVeculo.gridy = 1;
		panel_16.add(lblEditarVeculo, gbc_lblEditarVeculo);
		
		JLabel label_47 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_47 = new GridBagConstraints();
		gbc_label_47.gridwidth = 7;
		gbc_label_47.insets = new Insets(0, 0, 5, 5);
		gbc_label_47.gridx = 1;
		gbc_label_47.gridy = 2;
		panel_16.add(label_47, gbc_label_47);
		
		JLabel label_51 = new JLabel("Matr\u00EDcula: ");
		label_51.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_51 = new GridBagConstraints();
		gbc_label_51.anchor = GridBagConstraints.EAST;
		gbc_label_51.insets = new Insets(0, 0, 5, 5);
		gbc_label_51.gridx = 1;
		gbc_label_51.gridy = 4;
		panel_16.add(label_51, gbc_label_51);
		
		JButton btnNewButton_3 = new JButton("Obter Informa\u00E7\u00F5es");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Marca, Modelo, Motorizacao, Combustivel, Numero_Quadro, Ano, Mes, Docentes_Codigo_Docente FROM veiculos WHERE Matricula=?");
					stmt.setString(1, comboboxEditar_Veiculo_Matricula.getSelectedItem().toString());
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String marca = res.getString("Marca");
						String modelo = res.getString("Modelo");
						int motorizacao = res.getInt("Motorizacao");
						String combustivel = res.getString("Combustivel");
						String numero_quadro = res.getString("Numero_Quadro");
						int ano = res.getInt("Ano");
						String mes = res.getString("Mes");
						String codigo_docente = res.getString("Docentes_Codigo_Docente");
						
						
						txtEditar_Veiculo_Marca.setText(marca);
						txtEditar_Veiculo_Modelo.setText(modelo);
						txtEditar_Veiculo_Motorizacao.setText(Integer.toString(motorizacao));
						txtEditar_Veiculo_Combustivel.setText(combustivel);
						txtEditar_Veiculo_NumeroQuadro.setText(numero_quadro);
						txtEditar_Veiculo_Ano.setText(Integer.toString(ano));
						txtEditar_Veiculo_Mes.setText(mes);
						comboboxEditar_Veiculo_CodigoDocente.addItem(codigo_docente);
					
						txtEditar_Veiculo_Marca.setEditable(true);
						txtEditar_Veiculo_Modelo.setEditable(true);
						txtEditar_Veiculo_Motorizacao.setEditable(true);
						txtEditar_Veiculo_Combustivel.setEditable(true);
						txtEditar_Veiculo_NumeroQuadro.setEditable(true);
						txtEditar_Veiculo_Ano.setEditable(true);
						txtEditar_Veiculo_Mes.setEditable(true);
						
						comboboxEditar_Veiculo_Matricula.setEnabled(false);
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
						
						
						
						
					}
			
		});
		
		comboboxEditar_Veiculo_Matricula = new JComboBox();
		GridBagConstraints gbc_comboboxEditar_Veiculo_Matricula = new GridBagConstraints();
		gbc_comboboxEditar_Veiculo_Matricula.gridwidth = 5;
		gbc_comboboxEditar_Veiculo_Matricula.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxEditar_Veiculo_Matricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxEditar_Veiculo_Matricula.gridx = 2;
		gbc_comboboxEditar_Veiculo_Matricula.gridy = 4;
		panel_16.add(comboboxEditar_Veiculo_Matricula, gbc_comboboxEditar_Veiculo_Matricula);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 7;
		gbc_btnNewButton_3.gridy = 4;
		panel_16.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JLabel label_49 = new JLabel("Marca: ");
		label_49.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_49 = new GridBagConstraints();
		gbc_label_49.anchor = GridBagConstraints.EAST;
		gbc_label_49.insets = new Insets(0, 0, 5, 5);
		gbc_label_49.gridx = 1;
		gbc_label_49.gridy = 5;
		panel_16.add(label_49, gbc_label_49);
		
		txtEditar_Veiculo_Marca = new JTextField();
		txtEditar_Veiculo_Marca.setEditable(false);
		txtEditar_Veiculo_Marca.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Marca = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Marca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Marca.gridwidth = 5;
		gbc_txtEditar_Veiculo_Marca.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Marca.gridx = 2;
		gbc_txtEditar_Veiculo_Marca.gridy = 5;
		panel_16.add(txtEditar_Veiculo_Marca, gbc_txtEditar_Veiculo_Marca);
		
		JLabel label_50 = new JLabel("Modelo: ");
		label_50.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_50 = new GridBagConstraints();
		gbc_label_50.anchor = GridBagConstraints.EAST;
		gbc_label_50.insets = new Insets(0, 0, 5, 5);
		gbc_label_50.gridx = 1;
		gbc_label_50.gridy = 6;
		panel_16.add(label_50, gbc_label_50);
		
		txtEditar_Veiculo_Modelo = new JTextField();
		txtEditar_Veiculo_Modelo.setEditable(false);
		txtEditar_Veiculo_Modelo.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Modelo = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Modelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Modelo.gridwidth = 5;
		gbc_txtEditar_Veiculo_Modelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Modelo.gridx = 2;
		gbc_txtEditar_Veiculo_Modelo.gridy = 6;
		panel_16.add(txtEditar_Veiculo_Modelo, gbc_txtEditar_Veiculo_Modelo);
		
		JLabel label_52 = new JLabel("Motoriza\u00E7\u00E3o: ");
		label_52.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_52 = new GridBagConstraints();
		gbc_label_52.anchor = GridBagConstraints.EAST;
		gbc_label_52.insets = new Insets(0, 0, 5, 5);
		gbc_label_52.gridx = 1;
		gbc_label_52.gridy = 7;
		panel_16.add(label_52, gbc_label_52);
		
		txtEditar_Veiculo_Motorizacao = new JTextField();
		txtEditar_Veiculo_Motorizacao.setEditable(false);
		txtEditar_Veiculo_Motorizacao.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Motorizacao = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Motorizacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Motorizacao.gridwidth = 5;
		gbc_txtEditar_Veiculo_Motorizacao.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Motorizacao.gridx = 2;
		gbc_txtEditar_Veiculo_Motorizacao.gridy = 7;
		panel_16.add(txtEditar_Veiculo_Motorizacao, gbc_txtEditar_Veiculo_Motorizacao);
		
		JLabel label_54 = new JLabel("Combust\u00EDvel: ");
		label_54.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_54 = new GridBagConstraints();
		gbc_label_54.anchor = GridBagConstraints.EAST;
		gbc_label_54.insets = new Insets(0, 0, 5, 5);
		gbc_label_54.gridx = 1;
		gbc_label_54.gridy = 8;
		panel_16.add(label_54, gbc_label_54);
		
		txtEditar_Veiculo_Combustivel = new JTextField();
		txtEditar_Veiculo_Combustivel.setEditable(false);
		txtEditar_Veiculo_Combustivel.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Combustivel = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Combustivel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Combustivel.gridwidth = 5;
		gbc_txtEditar_Veiculo_Combustivel.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Combustivel.gridx = 2;
		gbc_txtEditar_Veiculo_Combustivel.gridy = 8;
		panel_16.add(txtEditar_Veiculo_Combustivel, gbc_txtEditar_Veiculo_Combustivel);
		
		JLabel label_55 = new JLabel("N\u00BA de Quadro: ");
		label_55.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_55 = new GridBagConstraints();
		gbc_label_55.anchor = GridBagConstraints.EAST;
		gbc_label_55.insets = new Insets(0, 0, 5, 5);
		gbc_label_55.gridx = 1;
		gbc_label_55.gridy = 9;
		panel_16.add(label_55, gbc_label_55);
		
		txtEditar_Veiculo_NumeroQuadro = new JTextField();
		txtEditar_Veiculo_NumeroQuadro.setEditable(false);
		txtEditar_Veiculo_NumeroQuadro.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_NumeroQuadro = new GridBagConstraints();
		gbc_txtEditar_Veiculo_NumeroQuadro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_NumeroQuadro.gridwidth = 5;
		gbc_txtEditar_Veiculo_NumeroQuadro.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_NumeroQuadro.gridx = 2;
		gbc_txtEditar_Veiculo_NumeroQuadro.gridy = 9;
		panel_16.add(txtEditar_Veiculo_NumeroQuadro, gbc_txtEditar_Veiculo_NumeroQuadro);
		
		JLabel label_56 = new JLabel("Ano: ");
		label_56.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_56 = new GridBagConstraints();
		gbc_label_56.anchor = GridBagConstraints.EAST;
		gbc_label_56.insets = new Insets(0, 0, 5, 5);
		gbc_label_56.gridx = 1;
		gbc_label_56.gridy = 10;
		panel_16.add(label_56, gbc_label_56);
		
		txtEditar_Veiculo_Ano = new JTextField();
		txtEditar_Veiculo_Ano.setEditable(false);
		txtEditar_Veiculo_Ano.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Ano = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Ano.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Ano.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Ano.gridx = 2;
		gbc_txtEditar_Veiculo_Ano.gridy = 10;
		panel_16.add(txtEditar_Veiculo_Ano, gbc_txtEditar_Veiculo_Ano);
		
		JLabel label_57 = new JLabel("M\u00EAs: ");
		label_57.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_57 = new GridBagConstraints();
		gbc_label_57.anchor = GridBagConstraints.EAST;
		gbc_label_57.insets = new Insets(0, 0, 5, 5);
		gbc_label_57.gridx = 3;
		gbc_label_57.gridy = 10;
		panel_16.add(label_57, gbc_label_57);
		
		txtEditar_Veiculo_Mes = new JTextField();
		txtEditar_Veiculo_Mes.setEditable(false);
		txtEditar_Veiculo_Mes.setColumns(10);
		GridBagConstraints gbc_txtEditar_Veiculo_Mes = new GridBagConstraints();
		gbc_txtEditar_Veiculo_Mes.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Veiculo_Mes.gridwidth = 3;
		gbc_txtEditar_Veiculo_Mes.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Veiculo_Mes.gridx = 4;
		gbc_txtEditar_Veiculo_Mes.gridy = 10;
		panel_16.add(txtEditar_Veiculo_Mes, gbc_txtEditar_Veiculo_Mes);
		
		JLabel lblCodigoDeDocente_1 = new JLabel("Codigo de Docente: ");
		lblCodigoDeDocente_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCodigoDeDocente_1 = new GridBagConstraints();
		gbc_lblCodigoDeDocente_1.anchor = GridBagConstraints.EAST;
		gbc_lblCodigoDeDocente_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoDeDocente_1.gridx = 1;
		gbc_lblCodigoDeDocente_1.gridy = 11;
		panel_16.add(lblCodigoDeDocente_1, gbc_lblCodigoDeDocente_1);
		
		comboboxEditar_Veiculo_CodigoDocente = new JComboBox();
		GridBagConstraints gbc_comboboxEditar_Veiculo_CodigoDocente = new GridBagConstraints();
		gbc_comboboxEditar_Veiculo_CodigoDocente.gridwidth = 5;
		gbc_comboboxEditar_Veiculo_CodigoDocente.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxEditar_Veiculo_CodigoDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxEditar_Veiculo_CodigoDocente.gridx = 2;
		gbc_comboboxEditar_Veiculo_CodigoDocente.gridy = 11;
		panel_16.add(comboboxEditar_Veiculo_CodigoDocente, gbc_comboboxEditar_Veiculo_CodigoDocente);
		
		JButton button_2 = new JButton("Limpar Formul\u00E1rio");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEditar_Veiculo_Marca.setText("");
				txtEditar_Veiculo_Modelo.setText("");
				txtEditar_Veiculo_Motorizacao.setText("");
				txtEditar_Veiculo_Combustivel.setText("");
				txtEditar_Veiculo_NumeroQuadro.setText("");
				txtEditar_Veiculo_Ano.setText("");
				txtEditar_Veiculo_Mes.setText("");
				
				comboboxEditar_Veiculo_Matricula.setEnabled(true);
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.EAST;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 12;
		panel_16.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("Voltar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Veiculos");
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 5;
		gbc_button_3.gridy = 12;
		panel_16.add(button_3, gbc_button_3);
		
		JButton btnValidarEdio_1 = new JButton("Validar Edi\u00E7\u00E3o");
		btnValidarEdio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=lig.prepareStatement("UPDATE veiculos SET Marca=?, Modelo=?, Motorizacao=?, Combustivel=?, Numero_Quadro=?, Ano=?, Mes=?, Docentes_Codigo_Docente=? WHERE Matricula=?");
					
						instP.setString(1, txtEditar_Veiculo_Marca.getText());
						instP.setString(2, txtEditar_Veiculo_Modelo.getText());
						instP.setInt(3, Integer.parseInt(txtEditar_Veiculo_Motorizacao.getText()));
						instP.setString(4, txtEditar_Veiculo_Combustivel.getText());
						instP.setString(5, txtEditar_Veiculo_NumeroQuadro.getText());
						instP.setInt(6, Integer.parseInt(txtEditar_Veiculo_Ano.getText()));
						instP.setString(7, txtEditar_Veiculo_Mes.getText());
						instP.setString(8, comboboxEditar_Veiculo_CodigoDocente.getSelectedItem().toString());
						instP.setString(9, comboboxEditar_Veiculo_Matricula.getSelectedItem().toString());
						int linhas=instP.executeUpdate();
					
					lig.close();
					if(linhas==1)
					JOptionPane.showMessageDialog(null,"Veículo Atualizado");
					
					txtEditar_Veiculo_Marca.setText("");
					txtEditar_Veiculo_Modelo.setText("");
					txtEditar_Veiculo_Motorizacao.setText("");
					txtEditar_Veiculo_Combustivel.setText("");
					txtEditar_Veiculo_NumeroQuadro.setText("");
					txtEditar_Veiculo_Ano.setText("");
					txtEditar_Veiculo_Mes.setText("");
					
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "panel_Veiculos");
					
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
				
			}
		});
		GridBagConstraints gbc_btnValidarEdio_1 = new GridBagConstraints();
		gbc_btnValidarEdio_1.anchor = GridBagConstraints.WEST;
		gbc_btnValidarEdio_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidarEdio_1.gridx = 6;
		gbc_btnValidarEdio_1.gridy = 12;
		panel_16.add(btnValidarEdio_1, gbc_btnValidarEdio_1);
		
		JPanel panel_Apagar_Veiculo = new JPanel();
		frame.getContentPane().add(panel_Apagar_Veiculo, "panel_Apagar_Veiculo");
		panel_Apagar_Veiculo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.BLACK);
		panel_Apagar_Veiculo.add(panel_14, BorderLayout.NORTH);
		GridBagLayout gbl_panel_14 = new GridBagLayout();
		gbl_panel_14.columnWidths = new int[]{80, 0, 0};
		gbl_panel_14.rowHeights = new int[]{85, 64, 0};
		gbl_panel_14.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_14.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_14.setLayout(gbl_panel_14);
		
		JLabel label_41 = new JLabel("");
		label_41.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.gridheight = 2;
		gbc_label_41.insets = new Insets(0, 0, 0, 5);
		gbc_label_41.gridx = 0;
		gbc_label_41.gridy = 0;
		panel_14.add(label_41, gbc_label_41);
		
		JLabel label_45 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_45.setForeground(Color.WHITE);
		label_45.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_45 = new GridBagConstraints();
		gbc_label_45.anchor = GridBagConstraints.SOUTH;
		gbc_label_45.insets = new Insets(0, 0, 5, 0);
		gbc_label_45.gridx = 1;
		gbc_label_45.gridy = 0;
		panel_14.add(label_45, gbc_label_45);
		
		JLabel lblRemoverVeculo = new JLabel("Apagar Ve\u00EDculo");
		lblRemoverVeculo.setForeground(Color.WHITE);
		lblRemoverVeculo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRemoverVeculo = new GridBagConstraints();
		gbc_lblRemoverVeculo.anchor = GridBagConstraints.NORTH;
		gbc_lblRemoverVeculo.gridx = 1;
		gbc_lblRemoverVeculo.gridy = 1;
		panel_14.add(lblRemoverVeculo, gbc_lblRemoverVeculo);
		
		JPanel panel_17 = new JPanel();
		panel_Apagar_Veiculo.add(panel_17, BorderLayout.CENTER);
		GridBagLayout gbl_panel_17 = new GridBagLayout();
		gbl_panel_17.columnWidths = new int[]{89, 194, 194, 43, 115, 115, 115, 207, 0, 0};
		gbl_panel_17.rowHeights = new int[]{71, 33, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_17.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_17.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_17.setLayout(gbl_panel_17);
		
		JLabel lblApagarVeculo = new JLabel("Apagar Ve\u00EDculo ");
		lblApagarVeculo.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblApagarVeculo.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblApagarVeculo = new GridBagConstraints();
		gbc_lblApagarVeculo.anchor = GridBagConstraints.WEST;
		gbc_lblApagarVeculo.gridwidth = 7;
		gbc_lblApagarVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblApagarVeculo.gridx = 1;
		gbc_lblApagarVeculo.gridy = 1;
		panel_17.add(lblApagarVeculo, gbc_lblApagarVeculo);
		
		JLabel label_58 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_58 = new GridBagConstraints();
		gbc_label_58.gridwidth = 7;
		gbc_label_58.insets = new Insets(0, 0, 5, 5);
		gbc_label_58.gridx = 1;
		gbc_label_58.gridy = 2;
		panel_17.add(label_58, gbc_label_58);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.anchor = GridBagConstraints.EAST;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 1;
		gbc_lblMatricula.gridy = 4;
		panel_17.add(lblMatricula, gbc_lblMatricula);
		
		txtApagar_Veiculo_Matricula = new JTextField();
		txtApagar_Veiculo_Matricula.setColumns(10);
		GridBagConstraints gbc_txtApagar_Veiculo_Matricula = new GridBagConstraints();
		gbc_txtApagar_Veiculo_Matricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApagar_Veiculo_Matricula.gridwidth = 5;
		gbc_txtApagar_Veiculo_Matricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtApagar_Veiculo_Matricula.gridx = 2;
		gbc_txtApagar_Veiculo_Matricula.gridy = 4;
		panel_17.add(txtApagar_Veiculo_Matricula, gbc_txtApagar_Veiculo_Matricula);
		
		JLabel lblMotivo_1 = new JLabel("Motivo: ");
		lblMotivo_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotivo_1 = new GridBagConstraints();
		gbc_lblMotivo_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMotivo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivo_1.gridx = 1;
		gbc_lblMotivo_1.gridy = 5;
		panel_17.add(lblMotivo_1, gbc_lblMotivo_1);
		
		txtApagar_Veiculo_Motivo = new JTextArea();
		txtApagar_Veiculo_Motivo.setBorder(UIManager.getBorder("TextField.border"));
		GridBagConstraints gbc_txtApagar_Veiculo_Motivo = new GridBagConstraints();
		gbc_txtApagar_Veiculo_Motivo.gridwidth = 5;
		gbc_txtApagar_Veiculo_Motivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtApagar_Veiculo_Motivo.fill = GridBagConstraints.BOTH;
		gbc_txtApagar_Veiculo_Motivo.gridx = 2;
		gbc_txtApagar_Veiculo_Motivo.gridy = 5;
		panel_17.add(txtApagar_Veiculo_Motivo, gbc_txtApagar_Veiculo_Motivo);
		
		JButton button_4 = new JButton("Limpar Formul\u00E1rio");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtApagar_Veiculo_Matricula.setText("");
				txtApagar_Veiculo_Motivo.setText("");
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.anchor = GridBagConstraints.EAST;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 6;
		panel_17.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("Voltar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Veiculos");
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 5;
		gbc_button_5.gridy = 6;
		panel_17.add(button_5, gbc_button_5);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP = lig.prepareStatement("DELETE FROM veiculos WHERE Matricula=?");
					instP.setString(1, txtApagar_Veiculo_Matricula.getText());
					 
					int resultado = instP.executeUpdate();
					if (resultado > 0) {
					    JOptionPane.showMessageDialog(null, "Veículo eliminado com sucesso!");
					    
					    	try{
					        	

					        	Date data_veiculo_apagado = new Date(System.currentTimeMillis());  
					    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
					    		String nomeficheiro = "Veiculo - Apagado - " + formatarData.format(data_veiculo_apagado);
					    		
					        	File file =new File("logs/Registos/Veiculos/"+nomeficheiro+".txt");
					        	if(!file.exists()){
					        	   file.createNewFile();
					        	}
					        	FileWriter fw = new FileWriter(file,true);
					        	//BufferedWriter writer give better performance
					        	BufferedWriter bw = new BufferedWriter(fw);
					        	String conteudo = txtApagar_Veiculo_Motivo.getText();
					        	bw.write("=========================");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write("Veiculo Eliminado:");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write(conteudo);
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write("=========================");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write(System.getProperty("line.separator"));
					        	bw.close();

					    	JOptionPane.showMessageDialog(null, "Informação para o ficheiro com sucesso!");

					          }catch(IOException ex){
					             JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					           }
					    } 
					}

					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		GridBagConstraints gbc_btnRemover_1 = new GridBagConstraints();
		gbc_btnRemover_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemover_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemover_1.gridx = 6;
		gbc_btnRemover_1.gridy = 6;
		panel_17.add(btnRemover_1, gbc_btnRemover_1);
		
		JPanel panel_Docentes = new JPanel();
		frame.getContentPane().add(panel_Docentes, "panel_Docentes");
		panel_Docentes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.BLACK);
		panel_Docentes.add(panel_25, BorderLayout.NORTH);
		GridBagLayout gbl_panel_25 = new GridBagLayout();
		gbl_panel_25.columnWidths = new int[]{80, 0, 0};
		gbl_panel_25.rowHeights = new int[]{85, 64, 0};
		gbl_panel_25.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_25.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_25.setLayout(gbl_panel_25);
		
		JLabel label_81 = new JLabel("");
		label_81.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_81 = new GridBagConstraints();
		gbc_label_81.gridheight = 2;
		gbc_label_81.insets = new Insets(0, 0, 0, 5);
		gbc_label_81.gridx = 0;
		gbc_label_81.gridy = 0;
		panel_25.add(label_81, gbc_label_81);
		
		JLabel label_82 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_82.setForeground(Color.WHITE);
		label_82.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_82 = new GridBagConstraints();
		gbc_label_82.anchor = GridBagConstraints.SOUTH;
		gbc_label_82.insets = new Insets(0, 0, 5, 0);
		gbc_label_82.gridx = 1;
		gbc_label_82.gridy = 0;
		panel_25.add(label_82, gbc_label_82);
		
		JLabel lblDocentes_2 = new JLabel("Docentes        ");
		lblDocentes_2.setForeground(Color.WHITE);
		lblDocentes_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblDocentes_2 = new GridBagConstraints();
		gbc_lblDocentes_2.anchor = GridBagConstraints.NORTH;
		gbc_lblDocentes_2.gridx = 1;
		gbc_lblDocentes_2.gridy = 1;
		panel_25.add(lblDocentes_2, gbc_lblDocentes_2);
		
		JPanel panel_26 = new JPanel();
		panel_Docentes.add(panel_26, BorderLayout.CENTER);
		GridBagLayout gbl_panel_26 = new GridBagLayout();
		gbl_panel_26.columnWidths = new int[]{0, 0, 80, 99, 80, 80, 80, 80, 80, 0, 0, 0};
		gbl_panel_26.rowHeights = new int[]{0, 0, 58, 0, 0};
		gbl_panel_26.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_26.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_26.setLayout(gbl_panel_26);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Adicionar_Docentes");
			}
		});
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Lista_Docente");
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Codigo_Docente`,`Palavra_Chave`,`Nome`,`Morada`,`Numero_Porta`,`Fracao`,`Data_Nascimento`,`NIF`,`Contacto`,`Email`,`Cargo` FROM docentes");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String codigo_Docente = res.getString("Codigo_Docente");
						String palavra_chave = res.getString("Palavra_Chave");
						String nome = res.getString("Nome");
						String morada = res.getString("Morada");
						String numero_porta = res.getString("Numero_Porta");
						String Fracao = res.getString("Fracao");
						Date Data_nascimento=res.getDate("Data_Nascimento");
						String data_nascimento = String.valueOf(Data_nascimento);
						int nif = res.getInt("NIF");
						int contacto = res.getInt("Contacto");
						String email = res.getString("Email");
						String Cargo = res.getString("Cargo");
					
						modelo_Docentes.addRow(new Object[]{codigo_Docente, palavra_chave, nome, morada, numero_porta, Fracao, data_nascimento, nif, contacto, email, Cargo});
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
						
						
						
						
					}
		});
		lblNewLabel_27.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/procurar2.png")));
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 1;
		gbc_lblNewLabel_27.gridy = 1;
		panel_26.add(lblNewLabel_27, gbc_lblNewLabel_27);
		lblNewLabel_14.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/adicionar_docente3.png")));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 3;
		gbc_lblNewLabel_14.gridy = 1;
		panel_26.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Editar_Docente");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Codigo_Docente` FROM docentes");
					
					ResultSet res = stmt.executeQuery();
					comboBoxEditar_Docente_CodigoDocente.removeAllItems();
					while(res.next()){
						String codigo_docente = res.getString("Codigo_Docente");
						comboBoxEditar_Docente_CodigoDocente.addItem(codigo_docente);
					
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}

			}
		});
		lblNewLabel_15.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/editar_docente2.png")));
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 5;
		gbc_lblNewLabel_15.gridy = 1;
		panel_26.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Apagar_Docente");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Codigo_Docente` FROM docentes");
					
					ResultSet res = stmt.executeQuery();
					comboBoxApagar_Docente_CodigoDocente.removeAllItems();
					while(res.next()){
						
						
						String codigo_docente = res.getString("Codigo_Docente");
						comboBoxApagar_Docente_CodigoDocente.addItem(codigo_docente);
					
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}

			}
		});
		lblNewLabel_16.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/apagar_veiculo2.png")));
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 7;
		gbc_lblNewLabel_16.gridy = 1;
		panel_26.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Second");
			}
		});
		lblNewLabel_17.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 9;
		gbc_lblNewLabel_17.gridy = 1;
		panel_26.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		JLabel lblLista = new JLabel("Lista");
		lblLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblLista = new GridBagConstraints();
		gbc_lblLista.anchor = GridBagConstraints.NORTH;
		gbc_lblLista.insets = new Insets(0, 0, 5, 5);
		gbc_lblLista.gridx = 1;
		gbc_lblLista.gridy = 2;
		panel_26.add(lblLista, gbc_lblLista);
		
		JLabel lblAdicionar_2 = new JLabel("Adicionar");
		lblAdicionar_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAdicionar_2 = new GridBagConstraints();
		gbc_lblAdicionar_2.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionar_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionar_2.gridx = 3;
		gbc_lblAdicionar_2.gridy = 2;
		panel_26.add(lblAdicionar_2, gbc_lblAdicionar_2);
		
		JLabel label_83 = new JLabel("Editar");
		label_83.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_label_83 = new GridBagConstraints();
		gbc_label_83.anchor = GridBagConstraints.NORTH;
		gbc_label_83.insets = new Insets(0, 0, 5, 5);
		gbc_label_83.gridx = 5;
		gbc_label_83.gridy = 2;
		panel_26.add(label_83, gbc_label_83);
		
		JLabel lblRemover_1 = new JLabel("Remover");
		lblRemover_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRemover_1 = new GridBagConstraints();
		gbc_lblRemover_1.anchor = GridBagConstraints.NORTH;
		gbc_lblRemover_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemover_1.gridx = 7;
		gbc_lblRemover_1.gridy = 2;
		panel_26.add(lblRemover_1, gbc_lblRemover_1);
		
		JLabel lblVoltar_3 = new JLabel("Voltar");
		lblVoltar_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_3 = new GridBagConstraints();
		gbc_lblVoltar_3.anchor = GridBagConstraints.NORTH;
		gbc_lblVoltar_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_3.gridx = 9;
		gbc_lblVoltar_3.gridy = 2;
		panel_26.add(lblVoltar_3, gbc_lblVoltar_3);
		
		JPanel panel_Adicionar_Docente = new JPanel();
		frame.getContentPane().add(panel_Adicionar_Docente, "panel_Adicionar_Docentes");
		panel_Adicionar_Docente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.BLACK);
		panel_Adicionar_Docente.add(panel_18, BorderLayout.NORTH);
		GridBagLayout gbl_panel_18 = new GridBagLayout();
		gbl_panel_18.columnWidths = new int[]{80, 0, 0};
		gbl_panel_18.rowHeights = new int[]{85, 64, 0};
		gbl_panel_18.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_18.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_18.setLayout(gbl_panel_18);
		
		JLabel label_46 = new JLabel("");
		label_46.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_46 = new GridBagConstraints();
		gbc_label_46.gridheight = 2;
		gbc_label_46.insets = new Insets(0, 0, 0, 5);
		gbc_label_46.gridx = 0;
		gbc_label_46.gridy = 0;
		panel_18.add(label_46, gbc_label_46);
		
		JLabel label_60 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_60.setForeground(Color.WHITE);
		label_60.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_60 = new GridBagConstraints();
		gbc_label_60.anchor = GridBagConstraints.SOUTH;
		gbc_label_60.insets = new Insets(0, 0, 5, 0);
		gbc_label_60.gridx = 1;
		gbc_label_60.gridy = 0;
		panel_18.add(label_60, gbc_label_60);
		
		JLabel lblAdicionarDocente = new JLabel("Adicionar Docente");
		lblAdicionarDocente.setForeground(Color.WHITE);
		lblAdicionarDocente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAdicionarDocente = new GridBagConstraints();
		gbc_lblAdicionarDocente.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionarDocente.gridx = 1;
		gbc_lblAdicionarDocente.gridy = 1;
		panel_18.add(lblAdicionarDocente, gbc_lblAdicionarDocente);
		
		JPanel panel_19 = new JPanel();
		panel_Adicionar_Docente.add(panel_19, BorderLayout.CENTER);
		GridBagLayout gbl_panel_19 = new GridBagLayout();
		gbl_panel_19.columnWidths = new int[]{0, 201, 148, 0, 61, 48, 0, 73, 0, 0};
		gbl_panel_19.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_19.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_19.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_19.setLayout(gbl_panel_19);
		
		JLabel lblAdicionarDocentes = new JLabel("Adicionar Docente");
		lblAdicionarDocentes.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblAdicionarDocentes.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAdicionarDocentes = new GridBagConstraints();
		gbc_lblAdicionarDocentes.gridwidth = 6;
		gbc_lblAdicionarDocentes.anchor = GridBagConstraints.WEST;
		gbc_lblAdicionarDocentes.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionarDocentes.gridx = 1;
		gbc_lblAdicionarDocentes.gridy = 1;
		panel_19.add(lblAdicionarDocentes, gbc_lblAdicionarDocentes);
		
		JLabel label_61 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_61 = new GridBagConstraints();
		gbc_label_61.insets = new Insets(0, 0, 5, 5);
		gbc_label_61.gridwidth = 6;
		gbc_label_61.gridx = 1;
		gbc_label_61.gridy = 2;
		panel_19.add(label_61, gbc_label_61);
		
		JLabel lblCdigoDeDocente = new JLabel("C\u00F3digo de Docente: ");
		lblCdigoDeDocente.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCdigoDeDocente = new GridBagConstraints();
		gbc_lblCdigoDeDocente.anchor = GridBagConstraints.EAST;
		gbc_lblCdigoDeDocente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigoDeDocente.gridx = 1;
		gbc_lblCdigoDeDocente.gridy = 4;
		panel_19.add(lblCdigoDeDocente, gbc_lblCdigoDeDocente);
		
		txtAdicionar_Docente_CodigoDocente = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_CodigoDocente = new GridBagConstraints();
		gbc_txtAdicionar_Docente_CodigoDocente.gridwidth = 5;
		gbc_txtAdicionar_Docente_CodigoDocente.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_CodigoDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_CodigoDocente.gridx = 2;
		gbc_txtAdicionar_Docente_CodigoDocente.gridy = 4;
		panel_19.add(txtAdicionar_Docente_CodigoDocente, gbc_txtAdicionar_Docente_CodigoDocente);
		txtAdicionar_Docente_CodigoDocente.setColumns(10);
		
		JLabel lblPalavrachave = new JLabel("Palavra-Chave: ");
		lblPalavrachave.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPalavrachave = new GridBagConstraints();
		gbc_lblPalavrachave.anchor = GridBagConstraints.EAST;
		gbc_lblPalavrachave.insets = new Insets(0, 0, 5, 5);
		gbc_lblPalavrachave.gridx = 1;
		gbc_lblPalavrachave.gridy = 5;
		panel_19.add(lblPalavrachave, gbc_lblPalavrachave);
		
		txtAdicionar_Docente_Password = new JPasswordField();
		GridBagConstraints gbc_txtAdicionar_Docente_Password = new GridBagConstraints();
		gbc_txtAdicionar_Docente_Password.gridwidth = 5;
		gbc_txtAdicionar_Docente_Password.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_Password.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_Password.gridx = 2;
		gbc_txtAdicionar_Docente_Password.gridy = 5;
		panel_19.add(txtAdicionar_Docente_Password, gbc_txtAdicionar_Docente_Password);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo: ");
		lblNomeCompleto.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNomeCompleto = new GridBagConstraints();
		gbc_lblNomeCompleto.anchor = GridBagConstraints.EAST;
		gbc_lblNomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeCompleto.gridx = 1;
		gbc_lblNomeCompleto.gridy = 6;
		panel_19.add(lblNomeCompleto, gbc_lblNomeCompleto);
		
		txtAdicionar_Docente_NomeCompleto = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_NomeCompleto = new GridBagConstraints();
		gbc_txtAdicionar_Docente_NomeCompleto.gridwidth = 5;
		gbc_txtAdicionar_Docente_NomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_NomeCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_NomeCompleto.gridx = 2;
		gbc_txtAdicionar_Docente_NomeCompleto.gridy = 6;
		panel_19.add(txtAdicionar_Docente_NomeCompleto, gbc_txtAdicionar_Docente_NomeCompleto);
		txtAdicionar_Docente_NomeCompleto.setColumns(10);
		
		JLabel lblMorada_1 = new JLabel("Morada: ");
		lblMorada_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMorada_1 = new GridBagConstraints();
		gbc_lblMorada_1.anchor = GridBagConstraints.EAST;
		gbc_lblMorada_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMorada_1.gridx = 1;
		gbc_lblMorada_1.gridy = 7;
		panel_19.add(lblMorada_1, gbc_lblMorada_1);
		
		txtAdicionar_Docente_Morada = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_Morada = new GridBagConstraints();
		gbc_txtAdicionar_Docente_Morada.gridwidth = 5;
		gbc_txtAdicionar_Docente_Morada.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_Morada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_Morada.gridx = 2;
		gbc_txtAdicionar_Docente_Morada.gridy = 7;
		panel_19.add(txtAdicionar_Docente_Morada, gbc_txtAdicionar_Docente_Morada);
		txtAdicionar_Docente_Morada.setColumns(10);
		
		JLabel lblNDaPorta = new JLabel("N\u00BA da Porta: ");
		lblNDaPorta.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNDaPorta = new GridBagConstraints();
		gbc_lblNDaPorta.anchor = GridBagConstraints.EAST;
		gbc_lblNDaPorta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDaPorta.gridx = 1;
		gbc_lblNDaPorta.gridy = 8;
		panel_19.add(lblNDaPorta, gbc_lblNDaPorta);
		
		txtAdicionar_Docente_NumeroPorta = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_NumeroPorta = new GridBagConstraints();
		gbc_txtAdicionar_Docente_NumeroPorta.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_NumeroPorta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_NumeroPorta.gridx = 2;
		gbc_txtAdicionar_Docente_NumeroPorta.gridy = 8;
		panel_19.add(txtAdicionar_Docente_NumeroPorta, gbc_txtAdicionar_Docente_NumeroPorta);
		txtAdicionar_Docente_NumeroPorta.setColumns(10);
		
		JLabel lblFrao_1 = new JLabel("Fra\u00E7\u00E3o: ");
		lblFrao_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFrao_1 = new GridBagConstraints();
		gbc_lblFrao_1.anchor = GridBagConstraints.EAST;
		gbc_lblFrao_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrao_1.gridx = 3;
		gbc_lblFrao_1.gridy = 8;
		panel_19.add(lblFrao_1, gbc_lblFrao_1);
		
		txtAdicionar_Docente_Fração = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_Fração = new GridBagConstraints();
		gbc_txtAdicionar_Docente_Fração.gridwidth = 3;
		gbc_txtAdicionar_Docente_Fração.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_Fração.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_Fração.gridx = 4;
		gbc_txtAdicionar_Docente_Fração.gridy = 8;
		panel_19.add(txtAdicionar_Docente_Fração, gbc_txtAdicionar_Docente_Fração);
		txtAdicionar_Docente_Fração.setColumns(10);
		
		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDataDeNascimento_1 = new GridBagConstraints();
		gbc_lblDataDeNascimento_1.anchor = GridBagConstraints.EAST;
		gbc_lblDataDeNascimento_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento_1.gridx = 1;
		gbc_lblDataDeNascimento_1.gridy = 9;
		panel_19.add(lblDataDeNascimento_1, gbc_lblDataDeNascimento_1);
		
		txtAdicionar_Docente_DataNascimento = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_DataNascimento = new GridBagConstraints();
		gbc_txtAdicionar_Docente_DataNascimento.gridwidth = 5;
		gbc_txtAdicionar_Docente_DataNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_DataNascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_DataNascimento.gridx = 2;
		gbc_txtAdicionar_Docente_DataNascimento.gridy = 9;
		panel_19.add(txtAdicionar_Docente_DataNascimento, gbc_txtAdicionar_Docente_DataNascimento);
		txtAdicionar_Docente_DataNascimento.setColumns(10);
		
		JLabel lblNif_2 = new JLabel("NIF: ");
		lblNif_2.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNif_2 = new GridBagConstraints();
		gbc_lblNif_2.anchor = GridBagConstraints.EAST;
		gbc_lblNif_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNif_2.gridx = 1;
		gbc_lblNif_2.gridy = 10;
		panel_19.add(lblNif_2, gbc_lblNif_2);
		
		txtAdicionar_Docente_NIF = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_NIF = new GridBagConstraints();
		gbc_txtAdicionar_Docente_NIF.gridwidth = 5;
		gbc_txtAdicionar_Docente_NIF.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_NIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_NIF.gridx = 2;
		gbc_txtAdicionar_Docente_NIF.gridy = 10;
		panel_19.add(txtAdicionar_Docente_NIF, gbc_txtAdicionar_Docente_NIF);
		txtAdicionar_Docente_NIF.setColumns(10);
		
		JLabel lblContacto = new JLabel("Contacto: ");
		lblContacto.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblContacto = new GridBagConstraints();
		gbc_lblContacto.anchor = GridBagConstraints.EAST;
		gbc_lblContacto.insets = new Insets(0, 0, 5, 5);
		gbc_lblContacto.gridx = 1;
		gbc_lblContacto.gridy = 11;
		panel_19.add(lblContacto, gbc_lblContacto);
		
		txtAdicionar_Docente_Contacto = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_Contacto = new GridBagConstraints();
		gbc_txtAdicionar_Docente_Contacto.gridwidth = 5;
		gbc_txtAdicionar_Docente_Contacto.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_Contacto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_Contacto.gridx = 2;
		gbc_txtAdicionar_Docente_Contacto.gridy = 11;
		panel_19.add(txtAdicionar_Docente_Contacto, gbc_txtAdicionar_Docente_Contacto);
		txtAdicionar_Docente_Contacto.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email: ");
		lblEmail_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.EAST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 1;
		gbc_lblEmail_1.gridy = 12;
		panel_19.add(lblEmail_1, gbc_lblEmail_1);
		
		txtAdicionar_Docente_Email = new JTextField();
		GridBagConstraints gbc_txtAdicionar_Docente_Email = new GridBagConstraints();
		gbc_txtAdicionar_Docente_Email.gridwidth = 5;
		gbc_txtAdicionar_Docente_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdicionar_Docente_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdicionar_Docente_Email.gridx = 2;
		gbc_txtAdicionar_Docente_Email.gridy = 12;
		panel_19.add(txtAdicionar_Docente_Email, gbc_txtAdicionar_Docente_Email);
		txtAdicionar_Docente_Email.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo: ");
		lblCargo.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCargo = new GridBagConstraints();
		gbc_lblCargo.anchor = GridBagConstraints.EAST;
		gbc_lblCargo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargo.gridx = 1;
		gbc_lblCargo.gridy = 13;
		panel_19.add(lblCargo, gbc_lblCargo);
		
		combobox_Adicionar_Docente_Cargo = new JComboBox();
		combobox_Adicionar_Docente_Cargo.setModel(new DefaultComboBoxModel(new String[] {"", "Secretariado", "Instru\u00E7\u00E3o", "Dire\u00E7\u00E3o", "Limpezas", "Gest\u00E3o"}));
		GridBagConstraints gbc_combobox_Adicionar_Docente_Cargo = new GridBagConstraints();
		gbc_combobox_Adicionar_Docente_Cargo.gridwidth = 5;
		gbc_combobox_Adicionar_Docente_Cargo.insets = new Insets(0, 0, 5, 5);
		gbc_combobox_Adicionar_Docente_Cargo.fill = GridBagConstraints.HORIZONTAL;
		gbc_combobox_Adicionar_Docente_Cargo.gridx = 2;
		gbc_combobox_Adicionar_Docente_Cargo.gridy = 13;
		panel_19.add(combobox_Adicionar_Docente_Cargo, gbc_combobox_Adicionar_Docente_Cargo);
		
		JButton btnLimparFormulrio_2 = new JButton("Limpar Formul\u00E1rio");
		btnLimparFormulrio_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAdicionar_Docente_CodigoDocente.setText("");
				txtAdicionar_Docente_Password.setText("");
				txtAdicionar_Docente_NomeCompleto.setText("");
				txtAdicionar_Docente_Morada.setText("");
				txtAdicionar_Docente_NumeroPorta.setText("");
				txtAdicionar_Docente_Fração.setText("");
				txtAdicionar_Docente_DataNascimento.setText("");
				txtAdicionar_Docente_NIF.setText("");
				txtAdicionar_Docente_Contacto.setText("");
				txtAdicionar_Docente_Email.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulrio_2 = new GridBagConstraints();
		gbc_btnLimparFormulrio_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulrio_2.gridx = 4;
		gbc_btnLimparFormulrio_2.gridy = 14;
		panel_19.add(btnLimparFormulrio_2, gbc_btnLimparFormulrio_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Adicionar_Docentes");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 14;
		panel_19.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnInserir_1 = new JButton("Inserir Docente");
		btnInserir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
					Connection lig= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement inst=(PreparedStatement) lig.prepareStatement("INSERT INTO `docentes` (`Codigo_Docente`, `Palavra_Chave`, `Nome`, `Morada`, `Numero_Porta`, `Fracao`, `Data_Nascimento`, `NIF`, `Contacto`, `Email`, `Cargo`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

					inst.setString(1, txtAdicionar_Docente_CodigoDocente.getText());
					
					String password = new String(txtAdicionar_Docente_Password.getPassword());
					inst.setString(2, password);
					
					inst.setString(3, txtAdicionar_Docente_NomeCompleto.getText());
					
					inst.setString(4, txtAdicionar_Docente_Morada.getText());
					
					inst.setInt(5, Integer.parseInt(txtAdicionar_Docente_NumeroPorta.getText()));
					
					inst.setString(6,  txtAdicionar_Docente_Fração.getText());

					SimpleDateFormat f=new SimpleDateFormat("dd/M/yyyy");
					java.util.Date data=f.parse(txtAdicionar_Docente_DataNascimento.getText());
					java.sql.Date nascimento=new Date(data.getTime());
					inst.setDate(7, nascimento);
					
					inst.setInt(8, Integer.parseInt(txtAdicionar_Docente_NIF.getText()));
					
					inst.setInt(9,  Integer.parseInt(txtAdicionar_Docente_Contacto.getText()));

					inst.setString(10, txtAdicionar_Docente_Email.getText());
					
					inst.setString(11, combobox_Adicionar_Docente_Cargo.getSelectedItem().toString());

					
					int linhas=inst.executeUpdate();
					
					if(linhas==1){
						JOptionPane.showMessageDialog(null, "Docente inserido com sucesso!");
						txtAdicionar_Docente_CodigoDocente.setText("");
						txtAdicionar_Docente_Password.setText("");
						txtAdicionar_Docente_NomeCompleto.setText("");
						txtAdicionar_Docente_Morada.setText("");
						txtAdicionar_Docente_NumeroPorta.setText("");
						txtAdicionar_Docente_Fração.setText("");
						txtAdicionar_Docente_DataNascimento.setText("");
						txtAdicionar_Docente_NIF.setText("");
						txtAdicionar_Docente_Contacto.setText("");
						txtAdicionar_Docente_Email.setText("");
						
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Docentes");
						
						Date data_docente_inserido = new Date(System.currentTimeMillis());  
			    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
			    		String nomeficheiro = "Docente - Inserir - " + formatarData.format(data_docente_inserido);
			    		
			        	File file =new File("logs/Registos/Docentes/"+nomeficheiro+".txt");
			        	if(!file.exists()){
			        	   file.createNewFile();
			        	}

					}
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "A conexão à base de dados não foi possível\nDescrição: " + e.getLocalizedMessage());
					
				}
				
			}
		});
		GridBagConstraints gbc_btnInserir_1 = new GridBagConstraints();
		gbc_btnInserir_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnInserir_1.gridx = 6;
		gbc_btnInserir_1.gridy = 14;
		panel_19.add(btnInserir_1, gbc_btnInserir_1);
		
		JPanel panel_Editar_Docente = new JPanel();
		frame.getContentPane().add(panel_Editar_Docente, "panel_Editar_Docente");
		panel_Editar_Docente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.BLACK);
		panel_Editar_Docente.add(panel_20, BorderLayout.NORTH);
		GridBagLayout gbl_panel_20 = new GridBagLayout();
		gbl_panel_20.columnWidths = new int[]{80, 0, 0};
		gbl_panel_20.rowHeights = new int[]{85, 64, 0};
		gbl_panel_20.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_20.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_20.setLayout(gbl_panel_20);
		
		JLabel label_62 = new JLabel("");
		label_62.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_62 = new GridBagConstraints();
		gbc_label_62.gridheight = 2;
		gbc_label_62.insets = new Insets(0, 0, 0, 5);
		gbc_label_62.gridx = 0;
		gbc_label_62.gridy = 0;
		panel_20.add(label_62, gbc_label_62);
		
		JLabel label_63 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_63.setForeground(Color.WHITE);
		label_63.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_63 = new GridBagConstraints();
		gbc_label_63.anchor = GridBagConstraints.SOUTH;
		gbc_label_63.insets = new Insets(0, 0, 5, 0);
		gbc_label_63.gridx = 1;
		gbc_label_63.gridy = 0;
		panel_20.add(label_63, gbc_label_63);
		
		JLabel lblEditarDocente = new JLabel("Editar Docente");
		lblEditarDocente.setForeground(Color.WHITE);
		lblEditarDocente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblEditarDocente = new GridBagConstraints();
		gbc_lblEditarDocente.anchor = GridBagConstraints.NORTH;
		gbc_lblEditarDocente.gridx = 1;
		gbc_lblEditarDocente.gridy = 1;
		panel_20.add(lblEditarDocente, gbc_lblEditarDocente);
		
		JPanel panel_21 = new JPanel();
		panel_Editar_Docente.add(panel_21, BorderLayout.CENTER);
		GridBagLayout gbl_panel_21 = new GridBagLayout();
		gbl_panel_21.columnWidths = new int[]{0, 201, 148, 0, 61, 48, 0, 73, 0, 0};
		gbl_panel_21.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_21.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_21.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_21.setLayout(gbl_panel_21);
		
		JLabel lblEditarDocente_1 = new JLabel("Editar Docente");
		lblEditarDocente_1.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblEditarDocente_1.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEditarDocente_1 = new GridBagConstraints();
		gbc_lblEditarDocente_1.anchor = GridBagConstraints.WEST;
		gbc_lblEditarDocente_1.gridwidth = 6;
		gbc_lblEditarDocente_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditarDocente_1.gridx = 1;
		gbc_lblEditarDocente_1.gridy = 1;
		panel_21.add(lblEditarDocente_1, gbc_lblEditarDocente_1);
		
		JLabel label_66 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_66 = new GridBagConstraints();
		gbc_label_66.gridwidth = 6;
		gbc_label_66.insets = new Insets(0, 0, 5, 5);
		gbc_label_66.gridx = 1;
		gbc_label_66.gridy = 2;
		panel_21.add(label_66, gbc_label_66);
		
		JLabel label_67 = new JLabel("C\u00F3digo de Docente: ");
		label_67.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_67 = new GridBagConstraints();
		gbc_label_67.anchor = GridBagConstraints.EAST;
		gbc_label_67.insets = new Insets(0, 0, 5, 5);
		gbc_label_67.gridx = 1;
		gbc_label_67.gridy = 4;
		panel_21.add(label_67, gbc_label_67);
		
		JButton btnObterInformaes_1 = new JButton("Obter Informa\u00E7\u00F5es");
		btnObterInformaes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
				
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT `Codigo_Docente`,`Palavra_Chave`,`Nome`, `Morada`,`Numero_Porta`,`Fracao`,`Data_Nascimento`,`NIF`,`Email`,`Contacto`,`Cargo` FROM docentes WHERE Codigo_Docente=?");
				stmt.setString(1, comboBoxEditar_Docente_CodigoDocente.getSelectedItem().toString());
				
				ResultSet res = stmt.executeQuery();
				
				while(res.next()){
					
					String palavra_chave = res.getString("Palavra_Chave");
					String nome = res.getString("Nome");
					String morada = res.getString("Morada");
					String numero_porta = res.getString("Numero_Porta");
					String Fracao = res.getString("Fracao");
					Date Data_nascimento=res.getDate("Data_Nascimento");
					String data_nascimento = String.valueOf(Data_nascimento);
					int nif = res.getInt("nif");
					int contacto = res.getInt("contacto");
					String email = res.getString("Email");
					String Cargo = res.getString("Cargo");
					
					txtEditar_Docente_PalavraChave.setText(palavra_chave);
					txtEditar_Docente_NomeCompleto.setText(nome);
					txtEditar_Docente_Morada.setText(morada);
					txtEditar_Docente_NumeroPorta.setText(numero_porta);
					txtEditar_Docente_Fracao.setText(Fracao);
					txtEditar_Docente_DataNascimento.setText(data_nascimento);
					txtEditar_Docente_NIF.setText(Integer.toString(nif));
					txtEditar_Docente_Contacto.setText(Integer.toString(contacto));
					txtEditar_Docente_Email.setText(email);
					comboboxEditar_Docente_Cargo.addItem(Cargo);
					
				}
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
				}
					
					
					
					
				}
		});
		
		comboBoxEditar_Docente_CodigoDocente = new JComboBox();
		GridBagConstraints gbc_comboBoxEditar_Docente_CodigoDocente = new GridBagConstraints();
		gbc_comboBoxEditar_Docente_CodigoDocente.gridwidth = 5;
		gbc_comboBoxEditar_Docente_CodigoDocente.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxEditar_Docente_CodigoDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxEditar_Docente_CodigoDocente.gridx = 2;
		gbc_comboBoxEditar_Docente_CodigoDocente.gridy = 4;
		panel_21.add(comboBoxEditar_Docente_CodigoDocente, gbc_comboBoxEditar_Docente_CodigoDocente);
		GridBagConstraints gbc_btnObterInformaes_1 = new GridBagConstraints();
		gbc_btnObterInformaes_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnObterInformaes_1.gridx = 7;
		gbc_btnObterInformaes_1.gridy = 4;
		panel_21.add(btnObterInformaes_1, gbc_btnObterInformaes_1);
		
		JLabel label_68 = new JLabel("Palavra-Chave: ");
		label_68.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_68 = new GridBagConstraints();
		gbc_label_68.anchor = GridBagConstraints.EAST;
		gbc_label_68.insets = new Insets(0, 0, 5, 5);
		gbc_label_68.gridx = 1;
		gbc_label_68.gridy = 5;
		panel_21.add(label_68, gbc_label_68);
		
		txtEditar_Docente_PalavraChave = new JPasswordField();
		GridBagConstraints gbc_txtEditar_Docente_PalavraChave = new GridBagConstraints();
		gbc_txtEditar_Docente_PalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_PalavraChave.gridwidth = 5;
		gbc_txtEditar_Docente_PalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_PalavraChave.gridx = 2;
		gbc_txtEditar_Docente_PalavraChave.gridy = 5;
		panel_21.add(txtEditar_Docente_PalavraChave, gbc_txtEditar_Docente_PalavraChave);
		
		JLabel label_69 = new JLabel("Nome Completo: ");
		label_69.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_69 = new GridBagConstraints();
		gbc_label_69.anchor = GridBagConstraints.EAST;
		gbc_label_69.insets = new Insets(0, 0, 5, 5);
		gbc_label_69.gridx = 1;
		gbc_label_69.gridy = 6;
		panel_21.add(label_69, gbc_label_69);
		
		txtEditar_Docente_NomeCompleto = new JTextField();
		txtEditar_Docente_NomeCompleto.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_NomeCompleto = new GridBagConstraints();
		gbc_txtEditar_Docente_NomeCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_NomeCompleto.gridwidth = 5;
		gbc_txtEditar_Docente_NomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_NomeCompleto.gridx = 2;
		gbc_txtEditar_Docente_NomeCompleto.gridy = 6;
		panel_21.add(txtEditar_Docente_NomeCompleto, gbc_txtEditar_Docente_NomeCompleto);
		
		JLabel label_71 = new JLabel("Morada: ");
		label_71.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_71 = new GridBagConstraints();
		gbc_label_71.anchor = GridBagConstraints.EAST;
		gbc_label_71.insets = new Insets(0, 0, 5, 5);
		gbc_label_71.gridx = 1;
		gbc_label_71.gridy = 7;
		panel_21.add(label_71, gbc_label_71);
		
		txtEditar_Docente_Morada = new JTextField();
		txtEditar_Docente_Morada.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_Morada = new GridBagConstraints();
		gbc_txtEditar_Docente_Morada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_Morada.gridwidth = 5;
		gbc_txtEditar_Docente_Morada.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_Morada.gridx = 2;
		gbc_txtEditar_Docente_Morada.gridy = 7;
		panel_21.add(txtEditar_Docente_Morada, gbc_txtEditar_Docente_Morada);
		
		JLabel label_72 = new JLabel("N\u00BA da Porta: ");
		label_72.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_72 = new GridBagConstraints();
		gbc_label_72.anchor = GridBagConstraints.EAST;
		gbc_label_72.insets = new Insets(0, 0, 5, 5);
		gbc_label_72.gridx = 1;
		gbc_label_72.gridy = 8;
		panel_21.add(label_72, gbc_label_72);
		
		txtEditar_Docente_NumeroPorta = new JTextField();
		txtEditar_Docente_NumeroPorta.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_NumeroPorta = new GridBagConstraints();
		gbc_txtEditar_Docente_NumeroPorta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_NumeroPorta.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_NumeroPorta.gridx = 2;
		gbc_txtEditar_Docente_NumeroPorta.gridy = 8;
		panel_21.add(txtEditar_Docente_NumeroPorta, gbc_txtEditar_Docente_NumeroPorta);
		
		JLabel label_73 = new JLabel("Fra\u00E7\u00E3o: ");
		label_73.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_73 = new GridBagConstraints();
		gbc_label_73.anchor = GridBagConstraints.EAST;
		gbc_label_73.insets = new Insets(0, 0, 5, 5);
		gbc_label_73.gridx = 3;
		gbc_label_73.gridy = 8;
		panel_21.add(label_73, gbc_label_73);
		
		txtEditar_Docente_Fracao = new JTextField();
		txtEditar_Docente_Fracao.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_Fracao = new GridBagConstraints();
		gbc_txtEditar_Docente_Fracao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_Fracao.gridwidth = 3;
		gbc_txtEditar_Docente_Fracao.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_Fracao.gridx = 4;
		gbc_txtEditar_Docente_Fracao.gridy = 8;
		panel_21.add(txtEditar_Docente_Fracao, gbc_txtEditar_Docente_Fracao);
		
		JLabel label_74 = new JLabel("Data de Nascimento: ");
		label_74.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_74 = new GridBagConstraints();
		gbc_label_74.anchor = GridBagConstraints.EAST;
		gbc_label_74.insets = new Insets(0, 0, 5, 5);
		gbc_label_74.gridx = 1;
		gbc_label_74.gridy = 9;
		panel_21.add(label_74, gbc_label_74);
		
		txtEditar_Docente_DataNascimento = new JTextField();
		txtEditar_Docente_DataNascimento.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_DataNascimento = new GridBagConstraints();
		gbc_txtEditar_Docente_DataNascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_DataNascimento.gridwidth = 5;
		gbc_txtEditar_Docente_DataNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_DataNascimento.gridx = 2;
		gbc_txtEditar_Docente_DataNascimento.gridy = 9;
		panel_21.add(txtEditar_Docente_DataNascimento, gbc_txtEditar_Docente_DataNascimento);
		
		JLabel label_75 = new JLabel("NIF: ");
		label_75.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_75 = new GridBagConstraints();
		gbc_label_75.anchor = GridBagConstraints.EAST;
		gbc_label_75.insets = new Insets(0, 0, 5, 5);
		gbc_label_75.gridx = 1;
		gbc_label_75.gridy = 10;
		panel_21.add(label_75, gbc_label_75);
		
		txtEditar_Docente_NIF = new JTextField();
		txtEditar_Docente_NIF.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_NIF = new GridBagConstraints();
		gbc_txtEditar_Docente_NIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_NIF.gridwidth = 5;
		gbc_txtEditar_Docente_NIF.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_NIF.gridx = 2;
		gbc_txtEditar_Docente_NIF.gridy = 10;
		panel_21.add(txtEditar_Docente_NIF, gbc_txtEditar_Docente_NIF);
		
		JLabel label_76 = new JLabel("Contacto: ");
		label_76.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_76 = new GridBagConstraints();
		gbc_label_76.anchor = GridBagConstraints.EAST;
		gbc_label_76.insets = new Insets(0, 0, 5, 5);
		gbc_label_76.gridx = 1;
		gbc_label_76.gridy = 11;
		panel_21.add(label_76, gbc_label_76);
		
		txtEditar_Docente_Contacto = new JTextField();
		txtEditar_Docente_Contacto.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_Contacto = new GridBagConstraints();
		gbc_txtEditar_Docente_Contacto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_Contacto.gridwidth = 5;
		gbc_txtEditar_Docente_Contacto.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_Contacto.gridx = 2;
		gbc_txtEditar_Docente_Contacto.gridy = 11;
		panel_21.add(txtEditar_Docente_Contacto, gbc_txtEditar_Docente_Contacto);
		
		JLabel label_77 = new JLabel("Email: ");
		label_77.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_77 = new GridBagConstraints();
		gbc_label_77.anchor = GridBagConstraints.EAST;
		gbc_label_77.insets = new Insets(0, 0, 5, 5);
		gbc_label_77.gridx = 1;
		gbc_label_77.gridy = 12;
		panel_21.add(label_77, gbc_label_77);
		
		txtEditar_Docente_Email = new JTextField();
		txtEditar_Docente_Email.setColumns(10);
		GridBagConstraints gbc_txtEditar_Docente_Email = new GridBagConstraints();
		gbc_txtEditar_Docente_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEditar_Docente_Email.gridwidth = 5;
		gbc_txtEditar_Docente_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtEditar_Docente_Email.gridx = 2;
		gbc_txtEditar_Docente_Email.gridy = 12;
		panel_21.add(txtEditar_Docente_Email, gbc_txtEditar_Docente_Email);
		
		JLabel lblCargo_1 = new JLabel("Cargo: ");
		lblCargo_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCargo_1 = new GridBagConstraints();
		gbc_lblCargo_1.anchor = GridBagConstraints.EAST;
		gbc_lblCargo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargo_1.gridx = 1;
		gbc_lblCargo_1.gridy = 13;
		panel_21.add(lblCargo_1, gbc_lblCargo_1);
		
		comboboxEditar_Docente_Cargo = new JComboBox();
		GridBagConstraints gbc_comboboxEditar_Docente_Cargo = new GridBagConstraints();
		gbc_comboboxEditar_Docente_Cargo.gridwidth = 5;
		gbc_comboboxEditar_Docente_Cargo.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxEditar_Docente_Cargo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxEditar_Docente_Cargo.gridx = 2;
		gbc_comboboxEditar_Docente_Cargo.gridy = 13;
		panel_21.add(comboboxEditar_Docente_Cargo, gbc_comboboxEditar_Docente_Cargo);
		
		JButton button_6 = new JButton("Limpar Formul\u00E1rio");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEditar_Docente_PalavraChave.setText("");
				txtEditar_Docente_NomeCompleto.setText("");
				txtEditar_Docente_Morada.setText("");
				txtEditar_Docente_NumeroPorta.setText("");
				txtEditar_Docente_Fracao.setText("");
				txtEditar_Docente_DataNascimento.setText("");
				txtEditar_Docente_NIF.setText("");
				txtEditar_Docente_Contacto.setText("");
				txtEditar_Docente_Email.setText("");

			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 4;
		gbc_button_6.gridy = 14;
		panel_21.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("Voltar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
			}
		});
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Editar_Docente");
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 5;
		gbc_button_7.gridy = 14;
		panel_21.add(button_7, gbc_button_7);
		
		JButton btnEditarDocente = new JButton("Editar Docente");
		btnEditarDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
				Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
				PreparedStatement instP=lig.prepareStatement("UPDATE docentes SET Palavra_Chave=?, Nome=?, Morada=?, Numero_Porta=?, Fracao=?, Data_Nascimento=?, NIF=?, Contacto=?, Email=?, Cargo=? WHERE Codigo_Docente=?");
				
					String password = new String(txtEditar_Docente_PalavraChave.getPassword());
					instP.setString(1, password);
					
					instP.setString(2, txtEditar_Docente_NomeCompleto.getText());
					
					instP.setString(3,  txtEditar_Docente_Morada.getText());
					
					instP.setInt(4, Integer.parseInt(txtEditar_Docente_NumeroPorta.getText()));
					
					instP.setString(5, txtEditar_Docente_Fracao.getText());
					
					

					SimpleDateFormat f=new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
					java.util.Date data;
					data = f.parse(txtEditar_Docente_DataNascimento.getText());
					java.sql.Date dataNascimento=new Date(data.getTime());				
					instP.setDate(6, dataNascimento);

					instP.setInt(7, Integer.parseInt(txtEditar_Docente_NIF.getText()));
					
					instP.setInt(8, Integer.parseInt(txtEditar_Docente_Contacto.getText()));
					
					instP.setString(9, txtEditar_Docente_Email.getText());
					
					instP.setString(10, comboboxEditar_Docente_Cargo.getSelectedItem().toString());
					
					instP.setString(11, comboBoxEditar_Docente_CodigoDocente.getSelectedItem().toString());
				
					int linhas=instP.executeUpdate();
				
				lig.close();
				if(linhas==1)
				JOptionPane.showMessageDialog(null,"Docente Atualizado com sucesso!");
				
				txtEditar_Docente_PalavraChave.setText("");
				txtEditar_Docente_NomeCompleto.setText("");
				txtEditar_Docente_Morada.setText("");
				txtEditar_Docente_NumeroPorta.setText("");
				txtEditar_Docente_Fracao.setText("");
				txtEditar_Docente_DataNascimento.setText("");
				txtEditar_Docente_NIF.setText("");
				txtEditar_Docente_Contacto.setText("");
				txtEditar_Docente_Email.setText("");
				
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
				
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
				}
			}
		});
		GridBagConstraints gbc_btnEditarDocente = new GridBagConstraints();
		gbc_btnEditarDocente.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarDocente.gridx = 6;
		gbc_btnEditarDocente.gridy = 14;
		panel_21.add(btnEditarDocente, gbc_btnEditarDocente);
		
		JPanel panel_Apagar_Docente = new JPanel();
		frame.getContentPane().add(panel_Apagar_Docente, "panel_Apagar_Docente");
		panel_Apagar_Docente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.BLACK);
		panel_Apagar_Docente.add(panel_22, BorderLayout.NORTH);
		GridBagLayout gbl_panel_22 = new GridBagLayout();
		gbl_panel_22.columnWidths = new int[]{80, 0, 0};
		gbl_panel_22.rowHeights = new int[]{85, 64, 0};
		gbl_panel_22.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_22.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_22.setLayout(gbl_panel_22);
		
		JLabel label_64 = new JLabel("");
		label_64.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_64 = new GridBagConstraints();
		gbc_label_64.gridheight = 2;
		gbc_label_64.insets = new Insets(0, 0, 0, 5);
		gbc_label_64.gridx = 0;
		gbc_label_64.gridy = 0;
		panel_22.add(label_64, gbc_label_64);
		
		JLabel label_65 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_65.setForeground(Color.WHITE);
		label_65.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_65 = new GridBagConstraints();
		gbc_label_65.anchor = GridBagConstraints.SOUTH;
		gbc_label_65.insets = new Insets(0, 0, 5, 0);
		gbc_label_65.gridx = 1;
		gbc_label_65.gridy = 0;
		panel_22.add(label_65, gbc_label_65);
		
		JLabel lblApagarDocente_1 = new JLabel("Apagar Docente");
		lblApagarDocente_1.setForeground(Color.WHITE);
		lblApagarDocente_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblApagarDocente_1 = new GridBagConstraints();
		gbc_lblApagarDocente_1.anchor = GridBagConstraints.NORTH;
		gbc_lblApagarDocente_1.gridx = 1;
		gbc_lblApagarDocente_1.gridy = 1;
		panel_22.add(lblApagarDocente_1, gbc_lblApagarDocente_1);
		
		JPanel panel_23 = new JPanel();
		panel_Apagar_Docente.add(panel_23, BorderLayout.CENTER);
		GridBagLayout gbl_panel_23 = new GridBagLayout();
		gbl_panel_23.columnWidths = new int[]{0, 0, 157, 131, 133, 80, 137, 0, 0};
		gbl_panel_23.rowHeights = new int[]{118, 0, 0, 0, 228, 0, 0, 0, 0};
		gbl_panel_23.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_23.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_23.setLayout(gbl_panel_23);
		
		JLabel lblApagarDocente = new JLabel("Apagar Docente");
		lblApagarDocente.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblApagarDocente.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblApagarDocente = new GridBagConstraints();
		gbc_lblApagarDocente.gridwidth = 5;
		gbc_lblApagarDocente.anchor = GridBagConstraints.WEST;
		gbc_lblApagarDocente.insets = new Insets(0, 0, 5, 5);
		gbc_lblApagarDocente.gridx = 1;
		gbc_lblApagarDocente.gridy = 1;
		panel_23.add(lblApagarDocente, gbc_lblApagarDocente);
		
		JLabel label_80 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_80 = new GridBagConstraints();
		gbc_label_80.gridwidth = 5;
		gbc_label_80.insets = new Insets(0, 0, 5, 5);
		gbc_label_80.gridx = 1;
		gbc_label_80.gridy = 2;
		panel_23.add(label_80, gbc_label_80);
		
		JLabel label_79 = new JLabel("C\u00F3digo de Docente: ");
		label_79.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_79 = new GridBagConstraints();
		gbc_label_79.insets = new Insets(0, 0, 5, 5);
		gbc_label_79.anchor = GridBagConstraints.EAST;
		gbc_label_79.gridx = 1;
		gbc_label_79.gridy = 3;
		panel_23.add(label_79, gbc_label_79);
		
		comboBoxApagar_Docente_CodigoDocente = new JComboBox();
		GridBagConstraints gbc_comboBoxApagar_Docente_CodigoDocente = new GridBagConstraints();
		gbc_comboBoxApagar_Docente_CodigoDocente.gridwidth = 4;
		gbc_comboBoxApagar_Docente_CodigoDocente.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxApagar_Docente_CodigoDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxApagar_Docente_CodigoDocente.gridx = 2;
		gbc_comboBoxApagar_Docente_CodigoDocente.gridy = 3;
		panel_23.add(comboBoxApagar_Docente_CodigoDocente, gbc_comboBoxApagar_Docente_CodigoDocente);
		
		JLabel lblMotivo_2 = new JLabel("Motivo: ");
		lblMotivo_2.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotivo_2 = new GridBagConstraints();
		gbc_lblMotivo_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMotivo_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivo_2.gridx = 1;
		gbc_lblMotivo_2.gridy = 4;
		panel_23.add(lblMotivo_2, gbc_lblMotivo_2);
		
		txtApagar_Docente_Motivo = new JTextArea();
		txtApagar_Docente_Motivo.setBorder(UIManager.getBorder("TextField.border"));
		GridBagConstraints gbc_txtApagar_Docente_Motivo = new GridBagConstraints();
		gbc_txtApagar_Docente_Motivo.gridwidth = 4;
		gbc_txtApagar_Docente_Motivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtApagar_Docente_Motivo.fill = GridBagConstraints.BOTH;
		gbc_txtApagar_Docente_Motivo.gridx = 2;
		gbc_txtApagar_Docente_Motivo.gridy = 4;
		panel_23.add(txtApagar_Docente_Motivo, gbc_txtApagar_Docente_Motivo);
		
		JButton btnLimparFormulrio_3 = new JButton("Limpar Formul\u00E1rio");
		btnLimparFormulrio_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtApagar_Docente_Motivo.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulrio_3 = new GridBagConstraints();
		gbc_btnLimparFormulrio_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimparFormulrio_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulrio_3.gridx = 3;
		gbc_btnLimparFormulrio_3.gridy = 5;
		panel_23.add(btnLimparFormulrio_3, gbc_btnLimparFormulrio_3);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Apagar_Docentes");
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 5;
		panel_23.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnApagarDocente = new JButton("Apagar Docente");
		btnApagarDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
				Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
		
				
				
				PreparedStatement instP = lig.prepareStatement("DELETE FROM docentes WHERE Codigo_Docente=?");
				instP.setString(1, comboBoxApagar_Docente_CodigoDocente.getSelectedItem().toString());
				 
				int resultado = instP.executeUpdate();
				if (resultado > 0) {
				    JOptionPane.showMessageDialog(null, "Docente eliminado com sucesso!");
				    
					Date data_docente_inserido = new Date(System.currentTimeMillis());  
		    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
		    		String nomeficheiro = "Docente - Apagado - " + formatarData.format(data_docente_inserido);
		    		
				    		File file =new File("logs/Registos/Docentes/"+nomeficheiro+".txt");
				        	if(!file.exists()){
				        	   file.createNewFile();
				        	}

				    txtApagar_Docente_Motivo.setText("");
				    comboBoxApagar_Docente_CodigoDocente.setSelectedIndex(0);
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "panel_Docentes");

				    }
				    
				    
				    
				}

				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
				}
			}
		});
		GridBagConstraints gbc_btnApagarDocente = new GridBagConstraints();
		gbc_btnApagarDocente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnApagarDocente.insets = new Insets(0, 0, 5, 5);
		gbc_btnApagarDocente.gridx = 5;
		gbc_btnApagarDocente.gridy = 5;
		panel_23.add(btnApagarDocente, gbc_btnApagarDocente);
		
		JPanel panel_Lista_Docente = new JPanel();
		frame.getContentPane().add(panel_Lista_Docente, "panel_Lista_Docente");
		panel_Lista_Docente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.BLACK);
		panel_Lista_Docente.add(panel_40, BorderLayout.NORTH);
		GridBagLayout gbl_panel_40 = new GridBagLayout();
		gbl_panel_40.columnWidths = new int[]{80, 0, 0, 0};
		gbl_panel_40.rowHeights = new int[]{85, 64, 0};
		gbl_panel_40.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_40.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_40.setLayout(gbl_panel_40);
		
		JLabel label_94 = new JLabel("");
		label_94.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_94 = new GridBagConstraints();
		gbc_label_94.gridheight = 2;
		gbc_label_94.insets = new Insets(0, 0, 0, 5);
		gbc_label_94.gridx = 0;
		gbc_label_94.gridy = 0;
		panel_40.add(label_94, gbc_label_94);
		
		JLabel label_97 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_97.setForeground(Color.WHITE);
		label_97.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_97 = new GridBagConstraints();
		gbc_label_97.gridwidth = 2;
		gbc_label_97.anchor = GridBagConstraints.SOUTH;
		gbc_label_97.insets = new Insets(0, 0, 5, 5);
		gbc_label_97.gridx = 1;
		gbc_label_97.gridy = 0;
		panel_40.add(label_97, gbc_label_97);
		
		JLabel lblListaDeDocentes = new JLabel("Lista de Docentes");
		lblListaDeDocentes.setForeground(Color.WHITE);
		lblListaDeDocentes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblListaDeDocentes = new GridBagConstraints();
		gbc_lblListaDeDocentes.gridwidth = 2;
		gbc_lblListaDeDocentes.insets = new Insets(0, 0, 0, 5);
		gbc_lblListaDeDocentes.anchor = GridBagConstraints.NORTH;
		gbc_lblListaDeDocentes.gridx = 1;
		gbc_lblListaDeDocentes.gridy = 1;
		panel_40.add(lblListaDeDocentes, gbc_lblListaDeDocentes);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(SystemColor.window);
		panel_Lista_Docente.add(panel_41, BorderLayout.CENTER);
		GridBagLayout gbl_panel_41 = new GridBagLayout();
		gbl_panel_41.columnWidths = new int[]{0, 250, 250, 250, -574, 0, 0};
		gbl_panel_41.rowHeights = new int[]{0, 379, 43, 0, 0};
		gbl_panel_41.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_41.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_41.setLayout(gbl_panel_41);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel_41.add(scrollPane, gbc_scrollPane);
		
		JTable tableListar_Docentes = new JTable(modelo_Docentes);
		tableListar_Docentes.setRowSelectionAllowed(false);
		modelo_Docentes.addColumn("Código de Docente");
		modelo_Docentes.addColumn("Palavra-Chave");
		modelo_Docentes.addColumn("Nome");
		modelo_Docentes.addColumn("Morada");
		modelo_Docentes.addColumn("Numero_Porta");
		modelo_Docentes.addColumn("Fração");
		modelo_Docentes.addColumn("Data de Nascimento");
		modelo_Docentes.addColumn("NIF");
		modelo_Docentes.addColumn("Contacto");
		modelo_Docentes.addColumn("Email");
		modelo_Docentes.addColumn("Cargo");
		
		
		scrollPane.setViewportView(tableListar_Docentes);
		
		JButton btnVoltar_2 = new JButton("Voltar");
		btnVoltar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Docentes");
				
				int rowCount = modelo_Docentes.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					modelo_Docentes.removeRow(i);
				}
			}
		});
		GridBagConstraints gbc_btnVoltar_2 = new GridBagConstraints();
		gbc_btnVoltar_2.fill = GridBagConstraints.BOTH;
		gbc_btnVoltar_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_2.gridx = 3;
		gbc_btnVoltar_2.gridy = 2;
		panel_41.add(btnVoltar_2, gbc_btnVoltar_2);
		
		JPanel panel_Aulas_Conducao = new JPanel();
		frame.getContentPane().add(panel_Aulas_Conducao, "panel_Aulas_Conducao");
		panel_Aulas_Conducao.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.BLACK);
		panel_Aulas_Conducao.add(panel_29, BorderLayout.NORTH);
		GridBagLayout gbl_panel_29 = new GridBagLayout();
		gbl_panel_29.columnWidths = new int[]{80, 0, 0};
		gbl_panel_29.rowHeights = new int[]{85, 64, 0};
		gbl_panel_29.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_29.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_29.setLayout(gbl_panel_29);
		
		JLabel label_86 = new JLabel("");
		label_86.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_86 = new GridBagConstraints();
		gbc_label_86.gridheight = 2;
		gbc_label_86.insets = new Insets(0, 0, 0, 5);
		gbc_label_86.gridx = 0;
		gbc_label_86.gridy = 0;
		panel_29.add(label_86, gbc_label_86);
		
		JLabel label_87 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_87.setForeground(Color.WHITE);
		label_87.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_87 = new GridBagConstraints();
		gbc_label_87.anchor = GridBagConstraints.SOUTH;
		gbc_label_87.insets = new Insets(0, 0, 5, 0);
		gbc_label_87.gridx = 1;
		gbc_label_87.gridy = 0;
		panel_29.add(label_87, gbc_label_87);
		
		JLabel lblAulasDeConduo = new JLabel("Aulas de Condu\u00E7\u00E3o");
		lblAulasDeConduo.setForeground(Color.WHITE);
		lblAulasDeConduo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAulasDeConduo = new GridBagConstraints();
		gbc_lblAulasDeConduo.anchor = GridBagConstraints.NORTH;
		gbc_lblAulasDeConduo.gridx = 1;
		gbc_lblAulasDeConduo.gridy = 1;
		panel_29.add(lblAulasDeConduo, gbc_lblAulasDeConduo);
		
		JPanel panel_30 = new JPanel();
		panel_Aulas_Conducao.add(panel_30, BorderLayout.CENTER);
		GridBagLayout gbl_panel_30 = new GridBagLayout();
		gbl_panel_30.columnWidths = new int[]{0, 0, 150, 0, 149, 0, 0, 0};
		gbl_panel_30.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_30.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_30.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_30.setLayout(gbl_panel_30);
		
		JLabel lblNewLabel_22 = new JLabel("");			
		lblNewLabel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Aulas_Conducao_Marcar");	
			}
		});
		lblNewLabel_22.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/marcar.png")));
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 1;
			gbc_lblNewLabel_22.gridy = 1;
			panel_30.add(lblNewLabel_22, gbc_lblNewLabel_22);
			
			JLabel lblNewLabel_23 = new JLabel("");
			lblNewLabel_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "panel_Aulas_Conducao_Desmarcar");
				}
			});
		lblNewLabel_23.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/remove.png")));
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 3;
		gbc_lblNewLabel_23.gridy = 1;
		panel_30.add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Second");
			}
		});
		lblNewLabel_24.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_24.gridx = 5;
		gbc_lblNewLabel_24.gridy = 1;
		panel_30.add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		JLabel lblMarcar = new JLabel("Marcar");
		lblMarcar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMarcar = new GridBagConstraints();
		gbc_lblMarcar.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarcar.gridx = 1;
		gbc_lblMarcar.gridy = 2;
		panel_30.add(lblMarcar, gbc_lblMarcar);
		
		JLabel lblDesmarcar = new JLabel("Desmarcar");
		lblDesmarcar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDesmarcar = new GridBagConstraints();
		gbc_lblDesmarcar.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesmarcar.gridx = 3;
		gbc_lblDesmarcar.gridy = 2;
		panel_30.add(lblDesmarcar, gbc_lblDesmarcar);
		
		JLabel lblVoltar_5 = new JLabel("Voltar");
		lblVoltar_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_5 = new GridBagConstraints();
		gbc_lblVoltar_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_5.gridx = 5;
		gbc_lblVoltar_5.gridy = 2;
		panel_30.add(lblVoltar_5, gbc_lblVoltar_5);
		
		JPanel panel_Aulas_Conducao_Marcar = new JPanel();
		frame.getContentPane().add(panel_Aulas_Conducao_Marcar, "panel_Aulas_Conducao_Marcar");
		panel_Aulas_Conducao_Marcar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.BLACK);
		panel_Aulas_Conducao_Marcar.add(panel_28, BorderLayout.NORTH);
		GridBagLayout gbl_panel_28 = new GridBagLayout();
		gbl_panel_28.columnWidths = new int[]{80, 0, 0};
		gbl_panel_28.rowHeights = new int[]{85, 64, 0};
		gbl_panel_28.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_28.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_28.setLayout(gbl_panel_28);
		
		JLabel label_89 = new JLabel("");
		label_89.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_89 = new GridBagConstraints();
		gbc_label_89.gridheight = 2;
		gbc_label_89.insets = new Insets(0, 0, 0, 5);
		gbc_label_89.gridx = 0;
		gbc_label_89.gridy = 0;
		panel_28.add(label_89, gbc_label_89);
		
		JLabel label_90 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_90.setForeground(Color.WHITE);
		label_90.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_90 = new GridBagConstraints();
		gbc_label_90.anchor = GridBagConstraints.SOUTH;
		gbc_label_90.insets = new Insets(0, 0, 5, 0);
		gbc_label_90.gridx = 1;
		gbc_label_90.gridy = 0;
		panel_28.add(label_90, gbc_label_90);
		
		JLabel lblMarcarAula_1 = new JLabel("Marcar Aula");
		lblMarcarAula_1.setForeground(Color.WHITE);
		lblMarcarAula_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblMarcarAula_1 = new GridBagConstraints();
		gbc_lblMarcarAula_1.anchor = GridBagConstraints.NORTH;
		gbc_lblMarcarAula_1.gridx = 1;
		gbc_lblMarcarAula_1.gridy = 1;
		panel_28.add(lblMarcarAula_1, gbc_lblMarcarAula_1);
		
		JPanel panel_31 = new JPanel();
		panel_Aulas_Conducao_Marcar.add(panel_31, BorderLayout.CENTER);
		GridBagLayout gbl_panel_31 = new GridBagLayout();
		gbl_panel_31.columnWidths = new int[]{148, 136, 59, 61, 86, 47, 163, 154, 31, 115, 0, 0};
		gbl_panel_31.rowHeights = new int[]{102, 21, 23, 0, -1, 32, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0};
		gbl_panel_31.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_31.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_31.setLayout(gbl_panel_31);
		
		JLabel lblMarcarAula = new JLabel("Marcar Aula");
		lblMarcarAula.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblMarcarAula.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblMarcarAula = new GridBagConstraints();
		gbc_lblMarcarAula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarcarAula.gridx = 1;
		gbc_lblMarcarAula.gridy = 1;
		panel_31.add(lblMarcarAula, gbc_lblMarcarAula);
		
		JLabel label_93 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_93 = new GridBagConstraints();
		gbc_label_93.gridwidth = 6;
		gbc_label_93.insets = new Insets(0, 0, 5, 5);
		gbc_label_93.gridx = 1;
		gbc_label_93.gridy = 2;
		panel_31.add(label_93, gbc_label_93);
		
		JLabel lblNmeroDeAula = new JLabel("N\u00FAmero de Aula: ");
		lblNmeroDeAula.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNmeroDeAula = new GridBagConstraints();
		gbc_lblNmeroDeAula.anchor = GridBagConstraints.EAST;
		gbc_lblNmeroDeAula.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDeAula.gridx = 1;
		gbc_lblNmeroDeAula.gridy = 3;
		panel_31.add(lblNmeroDeAula, gbc_lblNmeroDeAula);
		
		txtMarcar_Aula_NumeroAula = new JTextField();
		GridBagConstraints gbc_txtMarcar_Aula_NumeroAula = new GridBagConstraints();
		gbc_txtMarcar_Aula_NumeroAula.gridwidth = 3;
		gbc_txtMarcar_Aula_NumeroAula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMarcar_Aula_NumeroAula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMarcar_Aula_NumeroAula.gridx = 2;
		gbc_txtMarcar_Aula_NumeroAula.gridy = 3;
		panel_31.add(txtMarcar_Aula_NumeroAula, gbc_txtMarcar_Aula_NumeroAula);
		txtMarcar_Aula_NumeroAula.setColumns(10);
		
		JLabel lblAulasMarcadas = new JLabel("Aulas Marcadas");
		lblAulasMarcadas.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAulasMarcadas = new GridBagConstraints();
		gbc_lblAulasMarcadas.anchor = GridBagConstraints.SOUTH;
		gbc_lblAulasMarcadas.gridwidth = 2;
		gbc_lblAulasMarcadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblAulasMarcadas.gridx = 6;
		gbc_lblAulasMarcadas.gridy = 3;
		panel_31.add(lblAulasMarcadas, gbc_lblAulasMarcadas);
		aulas_marcadas.addColumn("Código de Docente");
		aulas_marcadas.addColumn("Código de Aluno");
		aulas_marcadas.addColumn("Data");
		aulas_marcadas.addColumn("Hora");
		aulas_marcadas.addColumn("Minuto");
		
		JLabel lblNmeroDoAluno = new JLabel("N\u00FAmero do(a) Aluno(a): ");
		lblNmeroDoAluno.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNmeroDoAluno = new GridBagConstraints();
		gbc_lblNmeroDoAluno.anchor = GridBagConstraints.EAST;
		gbc_lblNmeroDoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDoAluno.gridx = 1;
		gbc_lblNmeroDoAluno.gridy = 4;
		panel_31.add(lblNmeroDoAluno, gbc_lblNmeroDoAluno);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/marcar.png")));
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.gridheight = 11;
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_25.gridx = 9;
		gbc_lblNewLabel_25.gridy = 3;
		panel_31.add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		JTable tableListar_Aulas = new JTable(modelo_Aulas);
		modelo_Aulas.addColumn("Numero");
		modelo_Aulas.addColumn("Data");
		modelo_Aulas.addColumn("Docente");
		modelo_Aulas.addColumn("Aluno");
		
		txtMarcar_Aula_NumeroAluno = new JTextField();
		GridBagConstraints gbc_txtMarcar_Aula_NumeroAluno = new GridBagConstraints();
		gbc_txtMarcar_Aula_NumeroAluno.gridwidth = 3;
		gbc_txtMarcar_Aula_NumeroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_txtMarcar_Aula_NumeroAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMarcar_Aula_NumeroAluno.gridx = 2;
		gbc_txtMarcar_Aula_NumeroAluno.gridy = 4;
		panel_31.add(txtMarcar_Aula_NumeroAluno, gbc_txtMarcar_Aula_NumeroAluno);
		txtMarcar_Aula_NumeroAluno.setColumns(10);
		scrollPane_1.setViewportView(tableListar_Aulas);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 7;
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 6;
		gbc_scrollPane_1.gridy = 4;
		panel_31.add(scrollPane_1, gbc_scrollPane_1);
		
		JLabel lblInstructor = new JLabel("Instructor: ");
		lblInstructor.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblInstructor = new GridBagConstraints();
		gbc_lblInstructor.anchor = GridBagConstraints.EAST;
		gbc_lblInstructor.insets = new Insets(0, 0, 5, 5);
		gbc_lblInstructor.gridx = 1;
		gbc_lblInstructor.gridy = 5;
		panel_31.add(lblInstructor, gbc_lblInstructor);
		
		txtMarcar_Aula_Instrutor = new JTextField();
		GridBagConstraints gbc_txtMarcar_Aula_Instrutor = new GridBagConstraints();
		gbc_txtMarcar_Aula_Instrutor.gridwidth = 3;
		gbc_txtMarcar_Aula_Instrutor.insets = new Insets(0, 0, 5, 5);
		gbc_txtMarcar_Aula_Instrutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMarcar_Aula_Instrutor.gridx = 2;
		gbc_txtMarcar_Aula_Instrutor.gridy = 5;
		panel_31.add(txtMarcar_Aula_Instrutor, gbc_txtMarcar_Aula_Instrutor);
		txtMarcar_Aula_Instrutor.setColumns(10);
		
		JLabel lblData = new JLabel("Data: ");
		lblData.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblData = new GridBagConstraints();
		gbc_lblData.anchor = GridBagConstraints.EAST;
		gbc_lblData.insets = new Insets(0, 0, 5, 5);
		gbc_lblData.gridx = 1;
		gbc_lblData.gridy = 6;
		panel_31.add(lblData, gbc_lblData);
		
		try{
		
		txtMarcar_Aulas_data = new JTextField();
		} catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
		}
		GridBagConstraints gbc_txtMarcar_Aulas_data = new GridBagConstraints();
		gbc_txtMarcar_Aulas_data.gridwidth = 3;
		gbc_txtMarcar_Aulas_data.insets = new Insets(0, 0, 5, 5);
		gbc_txtMarcar_Aulas_data.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMarcar_Aulas_data.gridx = 2;
		gbc_txtMarcar_Aulas_data.gridy = 6;
		panel_31.add(txtMarcar_Aulas_data, gbc_txtMarcar_Aulas_data);
		
		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblHora = new GridBagConstraints();
		gbc_lblHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblHora.anchor = GridBagConstraints.EAST;
		gbc_lblHora.gridx = 1;
		gbc_lblHora.gridy = 7;
		panel_31.add(lblHora, gbc_lblHora);
		
		comboboxMarcar_Aula_Hora = new JComboBox();
		comboboxMarcar_Aula_Hora.setModel(new DefaultComboBoxModel(new String[] {"", "09", "10", "11", "12", "15", "16", "17", "18", "19"}));
		GridBagConstraints gbc_comboboxMarcar_Aula_Hora = new GridBagConstraints();
		gbc_comboboxMarcar_Aula_Hora.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxMarcar_Aula_Hora.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxMarcar_Aula_Hora.gridx = 2;
		gbc_comboboxMarcar_Aula_Hora.gridy = 7;
		panel_31.add(comboboxMarcar_Aula_Hora, gbc_comboboxMarcar_Aula_Hora);
		
		comboboxMarcar_Aula_Minuto = new JComboBox();
		comboboxMarcar_Aula_Minuto.setModel(new DefaultComboBoxModel(new String[] {"", "00", "30"}));
		GridBagConstraints gbc_comboboxMarcar_Aula_Minuto = new GridBagConstraints();
		gbc_comboboxMarcar_Aula_Minuto.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxMarcar_Aula_Minuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxMarcar_Aula_Minuto.gridx = 3;
		gbc_comboboxMarcar_Aula_Minuto.gridy = 7;
		panel_31.add(comboboxMarcar_Aula_Minuto, gbc_comboboxMarcar_Aula_Minuto);
		
		JButton btnMarcarAula = new JButton("Marcar Aula");
		btnMarcarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement inst=(PreparedStatement) lig.prepareStatement("INSERT INTO aulas(Numero_Aula, Data, Hora, Minuto, Docentes_Codigo_Docente, Alunos_Numero_Aluno) VALUES(?,?,?,?,?,?);");

					inst.setInt(1, Integer.parseInt(txtMarcar_Aula_NumeroAula.getText()));
					SimpleDateFormat f=new SimpleDateFormat("dd/M/yyyy");
					java.util.Date data_aula=f.parse(txtMarcar_Aulas_data.getText());
					Date aula=new Date(data_aula.getTime());
					inst.setDate(2, aula);
					inst.setInt(3, Integer.parseInt((String) comboboxMarcar_Aula_Hora.getSelectedItem()));
					inst.setInt(4, Integer.parseInt((String) comboboxMarcar_Aula_Minuto.getSelectedItem()));
					inst.setString(5, txtMarcar_Aula_Instrutor.getText());
					inst.setInt(6, Integer.parseInt(txtMarcar_Aula_NumeroAluno.getText()));

					int linhas=inst.executeUpdate();
					
					if(linhas==1){
						JOptionPane.showMessageDialog(null, "Aula marcada com sucesso!");
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Aulas_Conducao");
						
						txtMarcar_Aula_NumeroAula.setText("");
						txtMarcar_Aulas_data.setText("");
						comboboxMarcar_Aula_Hora.setSelectedIndex(0);
						comboboxMarcar_Aula_Minuto.setSelectedIndex(0);
						txtMarcar_Aula_Instrutor.setText("");
						txtMarcar_Aula_NumeroAluno.setText("");
						
					}
				}catch(Exception Ex)
				{
					JOptionPane.showMessageDialog(null, "Erro: " + Ex.getLocalizedMessage());
				}
			
			}
		});
		
		JButton btnNewButton_2 = new JButton("Limpar Formul\u00E1rio");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 8;
		panel_31.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnVoltar_7 = new JButton("Voltar");
		btnVoltar_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			CardLayout card=(CardLayout)frame.getContentPane().getLayout();
			card.show(frame.getContentPane(), "panel_Aulas_Conducao");
			}
		});
		GridBagConstraints gbc_btnVoltar_7 = new GridBagConstraints();
		gbc_btnVoltar_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_7.gridx = 3;
		gbc_btnVoltar_7.gridy = 8;
		panel_31.add(btnVoltar_7, gbc_btnVoltar_7);
		GridBagConstraints gbc_btnMarcarAula = new GridBagConstraints();
		gbc_btnMarcarAula.insets = new Insets(0, 0, 5, 5);
		gbc_btnMarcarAula.gridx = 4;
		gbc_btnMarcarAula.gridy = 8;
		panel_31.add(btnMarcarAula, gbc_btnMarcarAula);
		
		JButton btnVerificarAulas = new JButton("Verificar Aulas");
		btnVerificarAulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowCount = modelo_Aulas.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					modelo_Aulas.removeRow(i);
				}
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT au.Numero_Aula, au.Data, d.Codigo_Docente, al.Numero_Aluno from aulas au INNER JOIN docentes d ON d.Codigo_Docente = au.Docentes_Codigo_Docente INNER JOIN alunos al ON al.Numero_Aluno = au.Alunos_Numero_Aluno");
					ResultSet res=instP.executeQuery();
					
					
					if(res.next()){
						String numero_aula = res.getString("au.Numero_Aula");
						String data_aula = res.getString("au.Data");
						String codigo_docente = res.getString("d.Codigo_Docente");
						String numero_aluno = res.getString("al.Numero_Aluno");
						
						modelo_Aulas.addRow(new Object[]{numero_aula, data_aula, codigo_docente, numero_aluno});
						
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}
			}
		});
		GridBagConstraints gbc_btnVerificarAulas = new GridBagConstraints();
		gbc_btnVerificarAulas.fill = GridBagConstraints.BOTH;
		gbc_btnVerificarAulas.gridwidth = 2;
		gbc_btnVerificarAulas.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerificarAulas.gridx = 6;
		gbc_btnVerificarAulas.gridy = 11;
		panel_31.add(btnVerificarAulas, gbc_btnVerificarAulas);
		
		JPanel panel_Aulas_Conducao_Desmarcar = new JPanel();
		frame.getContentPane().add(panel_Aulas_Conducao_Desmarcar, "panel_Aulas_Conducao_Desmarcar");
		panel_Aulas_Conducao_Desmarcar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.BLACK);
		panel_Aulas_Conducao_Desmarcar.add(panel_56, BorderLayout.NORTH);
		GridBagLayout gbl_panel_56 = new GridBagLayout();
		gbl_panel_56.columnWidths = new int[]{80, 0, 0};
		gbl_panel_56.rowHeights = new int[]{85, 64, 0};
		gbl_panel_56.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_56.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_56.setLayout(gbl_panel_56);
		
		JLabel label_88 = new JLabel("");
		label_88.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_88 = new GridBagConstraints();
		gbc_label_88.gridheight = 2;
		gbc_label_88.insets = new Insets(0, 0, 0, 5);
		gbc_label_88.gridx = 0;
		gbc_label_88.gridy = 0;
		panel_56.add(label_88, gbc_label_88);
		
		JLabel label_114 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_114.setForeground(Color.WHITE);
		label_114.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_114 = new GridBagConstraints();
		gbc_label_114.anchor = GridBagConstraints.SOUTH;
		gbc_label_114.insets = new Insets(0, 0, 5, 0);
		gbc_label_114.gridx = 1;
		gbc_label_114.gridy = 0;
		panel_56.add(label_114, gbc_label_114);
		
		JLabel lblDesmarcarAula = new JLabel("Desmarcar Aula");
		lblDesmarcarAula.setForeground(Color.WHITE);
		lblDesmarcarAula.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblDesmarcarAula = new GridBagConstraints();
		gbc_lblDesmarcarAula.anchor = GridBagConstraints.NORTH;
		gbc_lblDesmarcarAula.gridx = 1;
		gbc_lblDesmarcarAula.gridy = 1;
		panel_56.add(lblDesmarcarAula, gbc_lblDesmarcarAula);
		
		JPanel panel_57 = new JPanel();
		panel_Aulas_Conducao_Desmarcar.add(panel_57, BorderLayout.CENTER);
		GridBagLayout gbl_panel_57 = new GridBagLayout();
		gbl_panel_57.columnWidths = new int[]{69, 87, 121, 192, 192, 51, 112, 119, 130, 0};
		gbl_panel_57.rowHeights = new int[]{0, 0, 0, 0, 0, 201, 0, 0, 0};
		gbl_panel_57.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_57.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_57.setLayout(gbl_panel_57);
		
		JLabel lblDesmarcarAula_1 = new JLabel("Desmarcar Aula");
		lblDesmarcarAula_1.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/seta.png")));
		lblDesmarcarAula_1.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDesmarcarAula_1 = new GridBagConstraints();
		gbc_lblDesmarcarAula_1.gridwidth = 8;
		gbc_lblDesmarcarAula_1.anchor = GridBagConstraints.WEST;
		gbc_lblDesmarcarAula_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblDesmarcarAula_1.gridx = 1;
		gbc_lblDesmarcarAula_1.gridy = 1;
		panel_57.add(lblDesmarcarAula_1, gbc_lblDesmarcarAula_1);
		
		JLabel label_115 = new JLabel("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
		GridBagConstraints gbc_label_115 = new GridBagConstraints();
		gbc_label_115.anchor = GridBagConstraints.WEST;
		gbc_label_115.insets = new Insets(0, 0, 5, 5);
		gbc_label_115.gridwidth = 6;
		gbc_label_115.gridx = 1;
		gbc_label_115.gridy = 2;
		panel_57.add(label_115, gbc_label_115);
		
		JLabel lblNDeAula = new JLabel("N\u00BA de Aula: ");
		lblNDeAula.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNDeAula = new GridBagConstraints();
		gbc_lblNDeAula.anchor = GridBagConstraints.EAST;
		gbc_lblNDeAula.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeAula.gridx = 1;
		gbc_lblNDeAula.gridy = 4;
		panel_57.add(lblNDeAula, gbc_lblNDeAula);
		
		txtDesmarcar_Aula_NumeroAula = new JTextField();
		GridBagConstraints gbc_txtDesmarcar_Aula_NumeroAula = new GridBagConstraints();
		gbc_txtDesmarcar_Aula_NumeroAula.gridwidth = 3;
		gbc_txtDesmarcar_Aula_NumeroAula.insets = new Insets(0, 0, 5, 5);
		gbc_txtDesmarcar_Aula_NumeroAula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDesmarcar_Aula_NumeroAula.gridx = 2;
		gbc_txtDesmarcar_Aula_NumeroAula.gridy = 4;
		panel_57.add(txtDesmarcar_Aula_NumeroAula, gbc_txtDesmarcar_Aula_NumeroAula);
		txtDesmarcar_Aula_NumeroAula.setColumns(10);
		
		JLabel lblAulasMarcadas_1 = new JLabel("Aulas Marcadas ");
		lblAulasMarcadas_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAulasMarcadas_1 = new GridBagConstraints();
		gbc_lblAulasMarcadas_1.gridwidth = 2;
		gbc_lblAulasMarcadas_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAulasMarcadas_1.gridx = 6;
		gbc_lblAulasMarcadas_1.gridy = 4;
		panel_57.add(lblAulasMarcadas_1, gbc_lblAulasMarcadas_1);
		
		JLabel lblMotivo_4 = new JLabel("Motivo: ");
		lblMotivo_4.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotivo_4 = new GridBagConstraints();
		gbc_lblMotivo_4.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMotivo_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivo_4.gridx = 1;
		gbc_lblMotivo_4.gridy = 5;
		panel_57.add(lblMotivo_4, gbc_lblMotivo_4);
		
		txtDesmarcar_Aula_Motivo = new JTextPane();
		GridBagConstraints gbc_txtDesmarcar_Aula_Motivo = new GridBagConstraints();
		gbc_txtDesmarcar_Aula_Motivo.gridwidth = 3;
		gbc_txtDesmarcar_Aula_Motivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtDesmarcar_Aula_Motivo.fill = GridBagConstraints.BOTH;
		gbc_txtDesmarcar_Aula_Motivo.gridx = 2;
		gbc_txtDesmarcar_Aula_Motivo.gridy = 5;
		panel_57.add(txtDesmarcar_Aula_Motivo, gbc_txtDesmarcar_Aula_Motivo);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		JTable tableAulas_Desmacar = new JTable(desmarcar_aulas);
		desmarcar_aulas.addColumn("Número");
		desmarcar_aulas.addColumn("Aluno");
		desmarcar_aulas.addColumn("Data");
		desmarcar_aulas.addColumn("Docente");
		
		scrollPane_5.setViewportView(tableAulas_Desmacar);
		GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
		gbc_scrollPane_5.gridwidth = 2;
		gbc_scrollPane_5.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_5.gridx = 6;
		gbc_scrollPane_5.gridy = 5;
		panel_57.add(scrollPane_5, gbc_scrollPane_5);
		
		JButton btnLimparFormulario_2 = new JButton("Limpar Formul\u00E1rio");
		btnLimparFormulario_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDesmarcar_Aula_Motivo.setText("");
				txtDesmarcar_Aula_NumeroAula.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulario_2 = new GridBagConstraints();
		gbc_btnLimparFormulario_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimparFormulario_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulario_2.gridx = 2;
		gbc_btnLimparFormulario_2.gridy = 6;
		panel_57.add(btnLimparFormulario_2, gbc_btnLimparFormulario_2);
		
		JButton btnVoltar_8 = new JButton("Voltar");
		btnVoltar_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Aulas_Conducao");
			}
		});
		GridBagConstraints gbc_btnVoltar_8 = new GridBagConstraints();
		gbc_btnVoltar_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_8.gridx = 3;
		gbc_btnVoltar_8.gridy = 6;
		panel_57.add(btnVoltar_8, gbc_btnVoltar_8);
		
		JButton btnRemover_3 = new JButton("Desmarcar Aula");
		btnRemover_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP = lig.prepareStatement("DELETE FROM aulas WHERE Numero_Aula=?");
					instP.setString(1, txtDesmarcar_Aula_NumeroAula.getText());
					 
					int resultado = instP.executeUpdate();
					if (resultado > 0) {
					    JOptionPane.showMessageDialog(null, "Aula desmarcada com sucesso!");
					    
					    	try{
					        	Date data_aula_desmarcada = new Date(System.currentTimeMillis());  
					    		SimpleDateFormat formatarData = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
					    		String nomeficheiro = "Aula - Apagada - " + formatarData.format(data_aula_desmarcada);
					    		
					        	File file =new File("logs/Eliminados/Aulas/"+nomeficheiro+".txt");
					        	if(!file.exists()){
					        	   file.createNewFile();
					        	}
					        	FileWriter fw = new FileWriter(file,true);
					        	//BufferedWriter writer give better performance
					        	BufferedWriter bw = new BufferedWriter(fw);
					        	String conteudo = txtDesmarcar_Aula_Motivo.getText();
					        	bw.write("=========================");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write("Aula Desmarcada");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write(conteudo);
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write("=========================");
					        	bw.write(System.getProperty("line.separator"));
					        	bw.write(System.getProperty("line.separator"));
					        	bw.close();

					          }catch(IOException ex){
					             JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					          }
					    } 
					}

					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
				
			}
		});
		GridBagConstraints gbc_btnRemover_3 = new GridBagConstraints();
		gbc_btnRemover_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemover_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemover_3.gridx = 4;
		gbc_btnRemover_3.gridy = 6;
		panel_57.add(btnRemover_3, gbc_btnRemover_3);
		
		JButton btnVerificarAulas_1 = new JButton("Verificar Aulas");
		btnVerificarAulas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowCount = desmarcar_aulas.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					desmarcar_aulas.removeRow(i);
				}
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT au.Numero_Aula, au.Data, d.Codigo_Docente, al.Numero_Aluno from aulas au INNER JOIN docentes d ON d.Codigo_Docente = au.Docentes_Codigo_Docente INNER JOIN alunos al ON al.Numero_Aluno = au.Alunos_Numero_Aluno");
					ResultSet res=instP.executeQuery();
					
					
					while(res.next()){
						
						String numero_aula = res.getString("au.Numero_Aula");
						String data_aula = res.getString("au.Data");
						String codigo_docente = res.getString("d.Codigo_Docente");
						String numero_aluno = res.getString("al.Numero_Aluno");
						
						desmarcar_aulas.addRow(new Object[]{numero_aula, data_aula, codigo_docente, numero_aluno});
						
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					} 
			}
		});
		GridBagConstraints gbc_btnVerificarAulas_1 = new GridBagConstraints();
		gbc_btnVerificarAulas_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVerificarAulas_1.gridwidth = 2;
		gbc_btnVerificarAulas_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerificarAulas_1.gridx = 6;
		gbc_btnVerificarAulas_1.gridy = 6;
		panel_57.add(btnVerificarAulas_1, gbc_btnVerificarAulas_1);
		
		JPanel panel_Administradores = new JPanel();
		frame.getContentPane().add(panel_Administradores, "panel_Administradores");
		panel_Administradores.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.BLACK);
		panel_Administradores.add(panel_24, BorderLayout.NORTH);
		GridBagLayout gbl_panel_24 = new GridBagLayout();
		gbl_panel_24.columnWidths = new int[]{80, 0, 0};
		gbl_panel_24.rowHeights = new int[]{85, 64, 0};
		gbl_panel_24.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_24.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_24.setLayout(gbl_panel_24);
		
		JLabel label_84 = new JLabel("");
		label_84.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_84 = new GridBagConstraints();
		gbc_label_84.gridheight = 2;
		gbc_label_84.insets = new Insets(0, 0, 0, 5);
		gbc_label_84.gridx = 0;
		gbc_label_84.gridy = 0;
		panel_24.add(label_84, gbc_label_84);
		
		JLabel label_85 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_85.setForeground(Color.WHITE);
		label_85.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_85 = new GridBagConstraints();
		gbc_label_85.anchor = GridBagConstraints.SOUTH;
		gbc_label_85.insets = new Insets(0, 0, 5, 0);
		gbc_label_85.gridx = 1;
		gbc_label_85.gridy = 0;
		panel_24.add(label_85, gbc_label_85);
		
		JLabel lblAdministrao = new JLabel("Administrador");
		lblAdministrao.setForeground(Color.WHITE);
		lblAdministrao.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAdministrao = new GridBagConstraints();
		gbc_lblAdministrao.anchor = GridBagConstraints.NORTH;
		gbc_lblAdministrao.gridx = 1;
		gbc_lblAdministrao.gridy = 1;
		panel_24.add(lblAdministrao, gbc_lblAdministrao);
		
		JPanel panel_27 = new JPanel();
		panel_Administradores.add(panel_27, BorderLayout.CENTER);
		GridBagLayout gbl_panel_27 = new GridBagLayout();
		gbl_panel_27.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_27.rowHeights = new int[]{0, 0, 56, 0, 53, 0, 0};
		gbl_panel_27.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_27.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_27.setLayout(gbl_panel_27);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_ConsultarSessoes");
			}
		});
		lblNewLabel_18.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/sessao.png")));
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 1;
		gbc_lblNewLabel_18.gridy = 1;
		panel_27.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
			}
		});
		lblNewLabel_19.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/gerir.png")));
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 5;
		gbc_lblNewLabel_19.gridy = 1;
		panel_27.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		JLabel lblVerificarSesses = new JLabel("Consultar Sess\u00F5es");
		lblVerificarSesses.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVerificarSesses = new GridBagConstraints();
		gbc_lblVerificarSesses.anchor = GridBagConstraints.NORTH;
		gbc_lblVerificarSesses.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerificarSesses.gridx = 1;
		gbc_lblVerificarSesses.gridy = 2;
		panel_27.add(lblVerificarSesses, gbc_lblVerificarSesses);
		
		JLabel lblGerirContas = new JLabel("Gerir Contas");
		lblGerirContas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblGerirContas = new GridBagConstraints();
		gbc_lblGerirContas.anchor = GridBagConstraints.NORTH;
		gbc_lblGerirContas.insets = new Insets(0, 0, 5, 5);
		gbc_lblGerirContas.gridx = 5;
		gbc_lblGerirContas.gridy = 2;
		panel_27.add(lblGerirContas, gbc_lblGerirContas);
		
		JLabel lblVerificarRegistos = new JLabel("");
		lblVerificarRegistos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_Registos");
			}
		});
		lblVerificarRegistos.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/verificar.png")));
		GridBagConstraints gbc_lblVerificarRegistos = new GridBagConstraints();
		gbc_lblVerificarRegistos.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerificarRegistos.gridx = 2;
		gbc_lblVerificarRegistos.gridy = 3;
		panel_27.add(lblVerificarRegistos, gbc_lblVerificarRegistos);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Second");
			}
		});
		lblNewLabel_21.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 8;
		gbc_lblNewLabel_21.gridy = 3;
		panel_27.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		JLabel lblVerificarRegistos_1 = new JLabel("Verificar Registos");
		lblVerificarRegistos_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVerificarRegistos_1 = new GridBagConstraints();
		gbc_lblVerificarRegistos_1.anchor = GridBagConstraints.NORTH;
		gbc_lblVerificarRegistos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerificarRegistos_1.gridx = 2;
		gbc_lblVerificarRegistos_1.gridy = 4;
		panel_27.add(lblVerificarRegistos_1, gbc_lblVerificarRegistos_1);
		
		JLabel lblVoltar_4 = new JLabel("Voltar");
		lblVoltar_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_4 = new GridBagConstraints();
		gbc_lblVoltar_4.anchor = GridBagConstraints.NORTH;
		gbc_lblVoltar_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_4.gridx = 8;
		gbc_lblVoltar_4.gridy = 4;
		panel_27.add(lblVoltar_4, gbc_lblVoltar_4);
		
		JPanel panel_Administrador_Registos = new JPanel();
		frame.getContentPane().add(panel_Administrador_Registos, "panel_Administrador_Registos");
		panel_Administrador_Registos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.BLACK);
		panel_Administrador_Registos.add(panel_32, BorderLayout.NORTH);
		GridBagLayout gbl_panel_32 = new GridBagLayout();
		gbl_panel_32.columnWidths = new int[]{80, 0, 0};
		gbl_panel_32.rowHeights = new int[]{85, 64, 0};
		gbl_panel_32.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_32.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_32.setLayout(gbl_panel_32);
		
		JLabel label_48 = new JLabel("");
		label_48.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_48 = new GridBagConstraints();
		gbc_label_48.gridheight = 2;
		gbc_label_48.insets = new Insets(0, 0, 0, 5);
		gbc_label_48.gridx = 0;
		gbc_label_48.gridy = 0;
		panel_32.add(label_48, gbc_label_48);
		
		JLabel label_59 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_59.setForeground(Color.WHITE);
		label_59.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_59 = new GridBagConstraints();
		gbc_label_59.anchor = GridBagConstraints.SOUTH;
		gbc_label_59.insets = new Insets(0, 0, 5, 0);
		gbc_label_59.gridx = 1;
		gbc_label_59.gridy = 0;
		panel_32.add(label_59, gbc_label_59);
		
		JLabel lblRegistos = new JLabel("Registos      ");
		lblRegistos.setForeground(Color.WHITE);
		lblRegistos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblRegistos = new GridBagConstraints();
		gbc_lblRegistos.anchor = GridBagConstraints.NORTH;
		gbc_lblRegistos.gridx = 1;
		gbc_lblRegistos.gridy = 1;
		panel_32.add(lblRegistos, gbc_lblRegistos);
		
		JPanel panel_33 = new JPanel();
		panel_Administrador_Registos.add(panel_33, BorderLayout.CENTER);
		GridBagLayout gbl_panel_33 = new GridBagLayout();
		gbl_panel_33.columnWidths = new int[]{0, 132, 136, 183, 157, 0, 0, 0};
		gbl_panel_33.rowHeights = new int[]{0, 0, 0, 281, 0, 0, 0};
		gbl_panel_33.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_33.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_33.setLayout(gbl_panel_33);
		
		
		radio_Alunos = new JRadioButton("Alunos");
		radio_Alunos.setSelected(true);
		radio_Alunos.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_radio_Alunos = new GridBagConstraints();
		gbc_radio_Alunos.insets = new Insets(0, 0, 5, 5);
		gbc_radio_Alunos.gridx = 1;
		gbc_radio_Alunos.gridy = 1;
		panel_33.add(radio_Alunos, gbc_radio_Alunos);
		
		radio_Docentes = new JRadioButton("Docentes");
		radio_Docentes.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_radio_Docentes = new GridBagConstraints();
		gbc_radio_Docentes.insets = new Insets(0, 0, 5, 5);
		gbc_radio_Docentes.gridx = 2;
		gbc_radio_Docentes.gridy = 1;
		panel_33.add(radio_Docentes, gbc_radio_Docentes);
		
		radio_Administradores = new JRadioButton("Administradores");
		radio_Administradores.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_radio_Administradores = new GridBagConstraints();
		gbc_radio_Administradores.insets = new Insets(0, 0, 5, 5);
		gbc_radio_Administradores.gridx = 3;
		gbc_radio_Administradores.gridy = 1;
		panel_33.add(radio_Administradores, gbc_radio_Administradores);
		
		ButtonGroup radiobuttons = new ButtonGroup();
		radiobuttons.add(radio_Administradores);
		radiobuttons.add(radio_Docentes);
		radiobuttons.add(radio_Alunos);
		
		ButtonGroup radiobuttons_login = new ButtonGroup();
		radiobuttons_login.add(radiologin_Administrador);
		radiobuttons_login.add(radiologin_Docente);
		

		
		
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radio_Alunos.isSelected())
				{
					textArea_registos.setText("");
					File folder = new File("logs/Registos/Alunos/");
					File[] fList = folder.listFiles();
				    for (int i = 0; i < fList.length; i++) {
				      if (fList[i].isFile()) {
				    	  textArea_registos.append(fList[i].getName()+ "\n");
				      } else if (fList[i].isDirectory()) {
				    	  textArea_registos.append(fList[i].getName() + "\n");
				      }
				    }
				}
				else if(radio_Administradores.isSelected())
				{
					textArea_registos.setText("");
					File folder = new File("logs/Registos/Administradores/");
					File[] fList = folder.listFiles();
				    for (int i = 0; i < fList.length; i++) {
				      if (fList[i].isFile()) {
				    	  textArea_registos.append(fList[i].getName()+ "\n");
				      } else if (fList[i].isDirectory()) {
				    	  textArea_registos.append(fList[i].getName() + "\n");
				      }
				    }
				}
				else if(radio_Docentes.isSelected())
				{
					textArea_registos.setText("");
					File folder = new File("logs/Registos/Docentes/");
					File[] fList = folder.listFiles();
				    for (int i = 0; i < fList.length; i++) {
				      if (fList[i].isFile()) {
				    	  textArea_registos.append(fList[i].getName()+ "\n");
				      } else if (fList[i].isDirectory()) {
				    	  textArea_registos.append(fList[i].getName() + "\n");
				      }
				    }
				}
			}
		});
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 4;
		gbc_btnConsultar.gridy = 1;
		panel_33.add(btnConsultar, gbc_btnConsultar);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/Registos.png")));
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.gridheight = 6;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_26.gridx = 5;
		gbc_lblNewLabel_26.gridy = 0;
		panel_33.add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		textArea_registos = new JTextArea();
		textArea_registos.setEditable(false);
		textArea_registos.setLineWrap(true);
		GridBagConstraints gbc_textArea_registos = new GridBagConstraints();
		gbc_textArea_registos.gridwidth = 4;
		gbc_textArea_registos.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_registos.fill = GridBagConstraints.BOTH;
		gbc_textArea_registos.gridx = 1;
		gbc_textArea_registos.gridy = 3;
		panel_33.add(textArea_registos, gbc_textArea_registos);
		
		JButton btnVoltar_6 = new JButton("Voltar");
		btnVoltar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administradores");
			}
		});
		GridBagConstraints gbc_btnVoltar_6 = new GridBagConstraints();
		gbc_btnVoltar_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_6.gridx = 4;
		gbc_btnVoltar_6.gridy = 4;
		panel_33.add(btnVoltar_6, gbc_btnVoltar_6);
		
		JPanel panel_Administrador_ConsultarSessoes = new JPanel();
		frame.getContentPane().add(panel_Administrador_ConsultarSessoes, "panel_Administrador_ConsultarSessoes");
		panel_Administrador_ConsultarSessoes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.BLACK);
		panel_Administrador_ConsultarSessoes.add(panel_34, BorderLayout.NORTH);
		GridBagLayout gbl_panel_34 = new GridBagLayout();
		gbl_panel_34.columnWidths = new int[]{80, 0, 0};
		gbl_panel_34.rowHeights = new int[]{85, 64, 0};
		gbl_panel_34.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_34.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_34.setLayout(gbl_panel_34);
		
		JLabel label_70 = new JLabel("");
		label_70.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_70 = new GridBagConstraints();
		gbc_label_70.gridheight = 2;
		gbc_label_70.insets = new Insets(0, 0, 0, 5);
		gbc_label_70.gridx = 0;
		gbc_label_70.gridy = 0;
		panel_34.add(label_70, gbc_label_70);
		
		JLabel label_92 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_92.setForeground(Color.WHITE);
		label_92.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_92 = new GridBagConstraints();
		gbc_label_92.anchor = GridBagConstraints.SOUTH;
		gbc_label_92.insets = new Insets(0, 0, 5, 0);
		gbc_label_92.gridx = 1;
		gbc_label_92.gridy = 0;
		panel_34.add(label_92, gbc_label_92);
		
		JLabel lblConsultarSesses = new JLabel("Consultar Sess\u00F5es");
		lblConsultarSesses.setForeground(Color.WHITE);
		lblConsultarSesses.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblConsultarSesses = new GridBagConstraints();
		gbc_lblConsultarSesses.anchor = GridBagConstraints.NORTH;
		gbc_lblConsultarSesses.gridx = 1;
		gbc_lblConsultarSesses.gridy = 1;
		panel_34.add(lblConsultarSesses, gbc_lblConsultarSesses);
		
		JPanel panel_38 = new JPanel();
		panel_Administrador_ConsultarSessoes.add(panel_38, BorderLayout.CENTER);
		GridBagLayout gbl_panel_38 = new GridBagLayout();
		gbl_panel_38.columnWidths = new int[]{0, 0, 0};
		gbl_panel_38.rowHeights = new int[]{0, 0, 0};
		gbl_panel_38.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_38.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_38.setLayout(gbl_panel_38);
		
		JPanel panel_54 = new JPanel();
		GridBagConstraints gbc_panel_54 = new GridBagConstraints();
		gbc_panel_54.fill = GridBagConstraints.BOTH;
		gbc_panel_54.gridx = 1;
		gbc_panel_54.gridy = 1;
		panel_38.add(panel_54, gbc_panel_54);
		GridBagLayout gbl_panel_54 = new GridBagLayout();
		gbl_panel_54.columnWidths = new int[]{0, 132, 136, 183, 157, 0, 0, 0};
		gbl_panel_54.rowHeights = new int[]{0, 0, 0, 281, 0, 0, 0};
		gbl_panel_54.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_54.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_54.setLayout(gbl_panel_54);
		
		JLabel label_78 = new JLabel("");
		GridBagConstraints gbc_label_78 = new GridBagConstraints();
		gbc_label_78.gridheight = 6;
		gbc_label_78.insets = new Insets(0, 0, 0, 5);
		gbc_label_78.gridx = 5;
		gbc_label_78.gridy = 0;
		panel_54.add(label_78, gbc_label_78);
		
		radioButton_ConsultarSessoes_Administradores = new JRadioButton("Administradores");
		buttonGroup.add(radioButton_ConsultarSessoes_Administradores);
		GridBagConstraints gbc_radioButton_ConsultarSessoes_Administradores = new GridBagConstraints();
		gbc_radioButton_ConsultarSessoes_Administradores.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_ConsultarSessoes_Administradores.gridx = 1;
		gbc_radioButton_ConsultarSessoes_Administradores.gridy = 1;
		panel_54.add(radioButton_ConsultarSessoes_Administradores, gbc_radioButton_ConsultarSessoes_Administradores);
		
		radioButton_ConsultarSessoes_Docentes = new JRadioButton("Docentes");
		buttonGroup.add(radioButton_ConsultarSessoes_Docentes);
		GridBagConstraints gbc_radioButton_ConsultarSessoes_Docentes = new GridBagConstraints();
		gbc_radioButton_ConsultarSessoes_Docentes.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton_ConsultarSessoes_Docentes.gridx = 2;
		gbc_radioButton_ConsultarSessoes_Docentes.gridy = 1;
		panel_54.add(radioButton_ConsultarSessoes_Docentes, gbc_radioButton_ConsultarSessoes_Docentes);
		
		JButton button_10 = new JButton("Consultar");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_ConsultarSessoes_Administradores.isSelected())
				{
					
					txtAdministrador_ConsultarSessoes.setText("");
					File folder = new File("logs/Sessoes/Administradores/");
					File[] fList = folder.listFiles();
					for (int i = 0; i < fList.length; i++) {
					    if (fList[i].isFile()) {
					    	txtAdministrador_ConsultarSessoes.append(fList[i].getName()+ "\n");
					    } else if (fList[i].isDirectory()) {
					    	txtAdministrador_ConsultarSessoes.append(fList[i].getName() + "\n");
					    }
					    }
					
				}
				else if(radioButton_ConsultarSessoes_Docentes.isSelected())
				{
					txtAdministrador_ConsultarSessoes.setText("");
					File folder = new File("logs/Sessoes/Docentes/");
					File[] fList = folder.listFiles();
					for (int i = 0; i < fList.length; i++) {
					    if (fList[i].isFile()) {
					    	txtAdministrador_ConsultarSessoes.append(fList[i].getName()+ "\n");
					    } else if (fList[i].isDirectory()) {
					    	txtAdministrador_ConsultarSessoes.append(fList[i].getName() + "\n");
					    }
					    }
				}
			}
		});
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 1;
		panel_54.add(button_10, gbc_button_10);
		
		txtAdministrador_ConsultarSessoes = new JTextArea();
		txtAdministrador_ConsultarSessoes.setLineWrap(true);
		txtAdministrador_ConsultarSessoes.setEditable(false);
		GridBagConstraints gbc_txtAdministrador_ConsultarSessoes = new GridBagConstraints();
		gbc_txtAdministrador_ConsultarSessoes.fill = GridBagConstraints.BOTH;
		gbc_txtAdministrador_ConsultarSessoes.gridwidth = 4;
		gbc_txtAdministrador_ConsultarSessoes.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_ConsultarSessoes.gridx = 1;
		gbc_txtAdministrador_ConsultarSessoes.gridy = 3;
		panel_54.add(txtAdministrador_ConsultarSessoes, gbc_txtAdministrador_ConsultarSessoes);
		
		JButton button_11 = new JButton("Voltar");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administradores");
				
				txtAdministrador_ConsultarSessoes.setText("");
				
			
			}
		});
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 4;
		gbc_button_11.gridy = 4;
		panel_54.add(button_11, gbc_button_11);
		
		JPanel panel_Administrador_GerirContas = new JPanel();
		frame.getContentPane().add(panel_Administrador_GerirContas, "panel_Administrador_GerirContas");
		panel_Administrador_GerirContas.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.BLACK);
		panel_Administrador_GerirContas.add(panel_35, BorderLayout.NORTH);
		GridBagLayout gbl_panel_35 = new GridBagLayout();
		gbl_panel_35.columnWidths = new int[]{80, 0, 0};
		gbl_panel_35.rowHeights = new int[]{85, 64, 0};
		gbl_panel_35.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_35.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_35.setLayout(gbl_panel_35);
		
		JLabel label_95 = new JLabel("");
		label_95.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_95 = new GridBagConstraints();
		gbc_label_95.gridheight = 2;
		gbc_label_95.insets = new Insets(0, 0, 0, 5);
		gbc_label_95.gridx = 0;
		gbc_label_95.gridy = 0;
		panel_35.add(label_95, gbc_label_95);
		
		JLabel label_96 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_96.setForeground(Color.WHITE);
		label_96.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_96 = new GridBagConstraints();
		gbc_label_96.anchor = GridBagConstraints.SOUTH;
		gbc_label_96.insets = new Insets(0, 0, 5, 0);
		gbc_label_96.gridx = 1;
		gbc_label_96.gridy = 0;
		panel_35.add(label_96, gbc_label_96);
		
		JLabel lblGerirContas_1 = new JLabel("Gerir Contas");
		lblGerirContas_1.setForeground(Color.WHITE);
		lblGerirContas_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblGerirContas_1 = new GridBagConstraints();
		gbc_lblGerirContas_1.anchor = GridBagConstraints.NORTH;
		gbc_lblGerirContas_1.gridx = 1;
		gbc_lblGerirContas_1.gridy = 1;
		panel_35.add(lblGerirContas_1, gbc_lblGerirContas_1);
		
		JPanel panel_39 = new JPanel();
		panel_Administrador_GerirContas.add(panel_39, BorderLayout.CENTER);
		GridBagLayout gbl_panel_39 = new GridBagLayout();
		gbl_panel_39.columnWidths = new int[]{0, 0, 80, 0, 80, 0, 80, 0, 80, 0, 0, 0};
		gbl_panel_39.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_39.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_39.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_39.setLayout(gbl_panel_39);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas_Listar");
				
				try{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					
					PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Codigo_Administrador, Palavra_Chave, Email, Nome FROM administrador");
					
					ResultSet res = stmt.executeQuery();
					
					while(res.next()){
						
						String codigo_administrador = res.getString("Codigo_Administrador");
						String palavra_chave = res.getString("Palavra_Chave");
						String email = res.getString("Email");
						String nome = res.getString("Nome");

						administrador_listar.addRow(new Object[]{codigo_administrador, palavra_chave, email, nome});
						
					}
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		lblNewLabel_20.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/procurar2.png")));
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 1;
		gbc_lblNewLabel_20.gridy = 1;
		panel_39.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		JLabel lblAdicionar_3 = new JLabel("");
		lblAdicionar_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas_Adicionar");
			}
		});
		lblAdicionar_3.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/adicionar_veiculo.png")));
		GridBagConstraints gbc_lblAdicionar_3 = new GridBagConstraints();
		gbc_lblAdicionar_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionar_3.gridx = 3;
		gbc_lblAdicionar_3.gridy = 1;
		panel_39.add(lblAdicionar_3, gbc_lblAdicionar_3);
		
		JLabel lblEditar_3 = new JLabel("");
		lblEditar_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas_Editar");
				
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Codigo_Administrador FROM administrador ");
					ResultSet res=instP.executeQuery();
					
					
					while(res.next()){
						String codigo_administrador = res.getString("Codigo_Administrador");
						comboboxAdministrador_Editar_CodigoAdministrador.addItem(codigo_administrador);
						
						
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}
			}
		});
		lblEditar_3.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/editar_veiculo.png")));
		GridBagConstraints gbc_lblEditar_3 = new GridBagConstraints();
		gbc_lblEditar_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditar_3.gridx = 5;
		gbc_lblEditar_3.gridy = 1;
		panel_39.add(lblEditar_3, gbc_lblEditar_3);
		
		JLabel lblRemover_2 = new JLabel("");
		lblRemover_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas_Apagar");
				
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Codigo_Administrador from administrador");
					ResultSet res=instP.executeQuery();
					
					
					while(res.next()){
						String codigo_administrador = res.getString("Codigo_Administrador");
						comboboxAdministrador_Apagar_CodigoAdministrador.addItem(codigo_administrador);
						
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}
			}
		});
		lblRemover_2.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/apagar_veiculo2.png")));
		GridBagConstraints gbc_lblRemover_2 = new GridBagConstraints();
		gbc_lblRemover_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemover_2.gridx = 7;
		gbc_lblRemover_2.gridy = 1;
		panel_39.add(lblRemover_2, gbc_lblRemover_2);
		
		JLabel lblVoltar_6 = new JLabel("");
		lblVoltar_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administradores");
			}
		});
		lblVoltar_6.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/voltar.png")));
		GridBagConstraints gbc_lblVoltar_6 = new GridBagConstraints();
		gbc_lblVoltar_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_6.gridx = 9;
		gbc_lblVoltar_6.gridy = 1;
		panel_39.add(lblVoltar_6, gbc_lblVoltar_6);
		
		JLabel lblListar = new JLabel("Listar");
		lblListar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblListar = new GridBagConstraints();
		gbc_lblListar.insets = new Insets(0, 0, 5, 5);
		gbc_lblListar.gridx = 1;
		gbc_lblListar.gridy = 2;
		panel_39.add(lblListar, gbc_lblListar);
		
		JLabel lblAdicionar_4 = new JLabel("Adicionar");
		lblAdicionar_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAdicionar_4 = new GridBagConstraints();
		gbc_lblAdicionar_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdicionar_4.gridx = 3;
		gbc_lblAdicionar_4.gridy = 2;
		panel_39.add(lblAdicionar_4, gbc_lblAdicionar_4);
		
		JLabel lblEditar_4 = new JLabel("Editar");
		lblEditar_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEditar_4 = new GridBagConstraints();
		gbc_lblEditar_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditar_4.gridx = 5;
		gbc_lblEditar_4.gridy = 2;
		panel_39.add(lblEditar_4, gbc_lblEditar_4);
		
		JLabel lblRemover_3 = new JLabel("Remover");
		lblRemover_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRemover_3 = new GridBagConstraints();
		gbc_lblRemover_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemover_3.gridx = 7;
		gbc_lblRemover_3.gridy = 2;
		panel_39.add(lblRemover_3, gbc_lblRemover_3);
		
		JLabel lblVoltar_7 = new JLabel("Voltar");
		lblVoltar_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblVoltar_7 = new GridBagConstraints();
		gbc_lblVoltar_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoltar_7.gridx = 9;
		gbc_lblVoltar_7.gridy = 2;
		panel_39.add(lblVoltar_7, gbc_lblVoltar_7);
		
		JPanel panel_Administrador_GerirContas_Adicionar = new JPanel();
		frame.getContentPane().add(panel_Administrador_GerirContas_Adicionar, "panel_Administrador_GerirContas_Adicionar");
		panel_Administrador_GerirContas_Adicionar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.BLACK);
		panel_Administrador_GerirContas_Adicionar.add(panel_36, BorderLayout.NORTH);
		GridBagLayout gbl_panel_36 = new GridBagLayout();
		gbl_panel_36.columnWidths = new int[]{80, 0, 0};
		gbl_panel_36.rowHeights = new int[]{85, 64, 0};
		gbl_panel_36.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_36.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_36.setLayout(gbl_panel_36);
		
		JLabel label_98 = new JLabel("");
		label_98.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_98 = new GridBagConstraints();
		gbc_label_98.gridheight = 2;
		gbc_label_98.insets = new Insets(0, 0, 0, 5);
		gbc_label_98.gridx = 0;
		gbc_label_98.gridy = 0;
		panel_36.add(label_98, gbc_label_98);
		
		JLabel label_99 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_99.setForeground(Color.WHITE);
		label_99.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_99 = new GridBagConstraints();
		gbc_label_99.anchor = GridBagConstraints.SOUTH;
		gbc_label_99.insets = new Insets(0, 0, 5, 0);
		gbc_label_99.gridx = 1;
		gbc_label_99.gridy = 0;
		panel_36.add(label_99, gbc_label_99);
		
		JLabel lblAdicionarAdministrador = new JLabel("Adicionar Administrador");
		lblAdicionarAdministrador.setForeground(Color.WHITE);
		lblAdicionarAdministrador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblAdicionarAdministrador = new GridBagConstraints();
		gbc_lblAdicionarAdministrador.anchor = GridBagConstraints.NORTH;
		gbc_lblAdicionarAdministrador.gridx = 1;
		gbc_lblAdicionarAdministrador.gridy = 1;
		panel_36.add(lblAdicionarAdministrador, gbc_lblAdicionarAdministrador);
		
		JPanel panel_37 = new JPanel();
		panel_Administrador_GerirContas_Adicionar.add(panel_37, BorderLayout.CENTER);
		GridBagLayout gbl_panel_37 = new GridBagLayout();
		gbl_panel_37.columnWidths = new int[]{0, 204, 92, 91, 77, 0, 0};
		gbl_panel_37.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0};
		gbl_panel_37.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_37.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_37.setLayout(gbl_panel_37);
		
		JLabel lblCodigoDeAdministrador = new JLabel("Codigo de Administrador: ");
		lblCodigoDeAdministrador.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCodigoDeAdministrador = new GridBagConstraints();
		gbc_lblCodigoDeAdministrador.anchor = GridBagConstraints.EAST;
		gbc_lblCodigoDeAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoDeAdministrador.gridx = 1;
		gbc_lblCodigoDeAdministrador.gridy = 1;
		panel_37.add(lblCodigoDeAdministrador, gbc_lblCodigoDeAdministrador);
		
		txtAdministrador_Adicionar_CodigoAdministrador = new JTextField();
		GridBagConstraints gbc_txtAdministrador_Adicionar_CodigoAdministrador = new GridBagConstraints();
		gbc_txtAdministrador_Adicionar_CodigoAdministrador.gridwidth = 3;
		gbc_txtAdministrador_Adicionar_CodigoAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Adicionar_CodigoAdministrador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Adicionar_CodigoAdministrador.gridx = 2;
		gbc_txtAdministrador_Adicionar_CodigoAdministrador.gridy = 1;
		panel_37.add(txtAdministrador_Adicionar_CodigoAdministrador, gbc_txtAdministrador_Adicionar_CodigoAdministrador);
		txtAdministrador_Adicionar_CodigoAdministrador.setColumns(10);
		
		JLabel lblPalavrachave_3 = new JLabel("Palavra-Chave: ");
		lblPalavrachave_3.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPalavrachave_3 = new GridBagConstraints();
		gbc_lblPalavrachave_3.anchor = GridBagConstraints.EAST;
		gbc_lblPalavrachave_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPalavrachave_3.gridx = 1;
		gbc_lblPalavrachave_3.gridy = 3;
		panel_37.add(lblPalavrachave_3, gbc_lblPalavrachave_3);
		
		txtAdministrador_Adicionar_PalavraChave = new JPasswordField();
		GridBagConstraints gbc_txtAdministrador_Adicionar_PalavraChave = new GridBagConstraints();
		gbc_txtAdministrador_Adicionar_PalavraChave.gridwidth = 3;
		gbc_txtAdministrador_Adicionar_PalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Adicionar_PalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Adicionar_PalavraChave.gridx = 2;
		gbc_txtAdministrador_Adicionar_PalavraChave.gridy = 3;
		panel_37.add(txtAdministrador_Adicionar_PalavraChave, gbc_txtAdministrador_Adicionar_PalavraChave);
		
		JLabel lblNomeCompleto_1 = new JLabel("Email: ");
		lblNomeCompleto_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNomeCompleto_1 = new GridBagConstraints();
		gbc_lblNomeCompleto_1.anchor = GridBagConstraints.EAST;
		gbc_lblNomeCompleto_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeCompleto_1.gridx = 1;
		gbc_lblNomeCompleto_1.gridy = 5;
		panel_37.add(lblNomeCompleto_1, gbc_lblNomeCompleto_1);
		
		txtAdministrador_Adicionar_Email = new JTextField();
		GridBagConstraints gbc_txtAdministrador_Adicionar_Email = new GridBagConstraints();
		gbc_txtAdministrador_Adicionar_Email.gridwidth = 3;
		gbc_txtAdministrador_Adicionar_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Adicionar_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Adicionar_Email.gridx = 2;
		gbc_txtAdministrador_Adicionar_Email.gridy = 5;
		panel_37.add(txtAdministrador_Adicionar_Email, gbc_txtAdministrador_Adicionar_Email);
		txtAdministrador_Adicionar_Email.setColumns(10);
		
		JLabel lblNomeCompleto_2 = new JLabel("Nome Completo: ");
		lblNomeCompleto_2.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNomeCompleto_2 = new GridBagConstraints();
		gbc_lblNomeCompleto_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeCompleto_2.anchor = GridBagConstraints.EAST;
		gbc_lblNomeCompleto_2.gridx = 1;
		gbc_lblNomeCompleto_2.gridy = 7;
		panel_37.add(lblNomeCompleto_2, gbc_lblNomeCompleto_2);
		
		txtAdministrador_Adicionar_NomeCompleto = new JTextField();
		GridBagConstraints gbc_txtAdministrador_Adicionar_NomeCompleto = new GridBagConstraints();
		gbc_txtAdministrador_Adicionar_NomeCompleto.gridwidth = 3;
		gbc_txtAdministrador_Adicionar_NomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Adicionar_NomeCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Adicionar_NomeCompleto.gridx = 2;
		gbc_txtAdministrador_Adicionar_NomeCompleto.gridy = 7;
		panel_37.add(txtAdministrador_Adicionar_NomeCompleto, gbc_txtAdministrador_Adicionar_NomeCompleto);
		txtAdministrador_Adicionar_NomeCompleto.setColumns(10);
		
		JButton btnLimparFormulario = new JButton("Limpar Formulario");
		btnLimparFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAdministrador_Adicionar_CodigoAdministrador.setText("");
				txtAdministrador_Adicionar_PalavraChave.setText("");
				txtAdministrador_Adicionar_NomeCompleto.setText("");
				txtAdministrador_Adicionar_Email.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulario = new GridBagConstraints();
		gbc_btnLimparFormulario.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimparFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulario.gridx = 2;
		gbc_btnLimparFormulario.gridy = 8;
		panel_37.add(btnLimparFormulario, gbc_btnLimparFormulario);
		
		JButton btnVoltar_4 = new JButton("Voltar");
		btnVoltar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
			}
		});
		GridBagConstraints gbc_btnVoltar_4 = new GridBagConstraints();
		gbc_btnVoltar_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_4.gridx = 3;
		gbc_btnVoltar_4.gridy = 8;
		panel_37.add(btnVoltar_4, gbc_btnVoltar_4);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection lig= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement inst=(PreparedStatement) lig.prepareStatement("INSERT INTO administrador(Codigo_Administrador, Palavra_Chave, Email, Nome) VALUES(?,?,?,?);");

					inst.setString(1, txtAdministrador_Adicionar_CodigoAdministrador.getText());
					String password = new String(txtAdministrador_Adicionar_PalavraChave.getPassword());
					inst.setString(2, password);
					inst.setString(3, txtAdministrador_Adicionar_Email.getText());
					inst.setString(4, txtAdministrador_Adicionar_NomeCompleto.getText());
					int linhas=inst.executeUpdate();
					
					if(linhas==1){
						JOptionPane.showMessageDialog(null, "Administrador inserido com sucesso!");
						txtAdministrador_Adicionar_CodigoAdministrador.setText("");
						txtAdministrador_Adicionar_PalavraChave.setText("");
						txtAdministrador_Adicionar_Email.setText("");
						txtAdministrador_Adicionar_NomeCompleto.setText("");
						
						CardLayout card=(CardLayout)frame.getContentPane().getLayout();
						card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
						
						java.util.Date data = new java.util.Date();  
			    		SimpleDateFormat formatarDate = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
			    		
			    		String filename = formatarDate.format(data) + " - Administrador";

			        	File file =new File("logs/Registos/Administradores/" + filename);
			        	if(!file.exists()){
			        	   file.createNewFile();
			        	}

			          
					}
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "A conexão à base de dados não foi possível\nDescrição: " + e.getLocalizedMessage());
				}
			}
		});
		GridBagConstraints gbc_btnAdicionar = new GridBagConstraints();
		gbc_btnAdicionar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdicionar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdicionar.gridx = 4;
		gbc_btnAdicionar.gridy = 8;
		panel_37.add(btnAdicionar, gbc_btnAdicionar);
		
		JPanel panel_Administrador_GerirContas_Editar = new JPanel();
		frame.getContentPane().add(panel_Administrador_GerirContas_Editar, "panel_Administrador_GerirContas_Editar");
		panel_Administrador_GerirContas_Editar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(Color.BLACK);
		panel_Administrador_GerirContas_Editar.add(panel_47, BorderLayout.NORTH);
		GridBagLayout gbl_panel_47 = new GridBagLayout();
		gbl_panel_47.columnWidths = new int[]{80, 0, 0};
		gbl_panel_47.rowHeights = new int[]{85, 64, 0};
		gbl_panel_47.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_47.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_47.setLayout(gbl_panel_47);
		
		JLabel label_104 = new JLabel("");
		label_104.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_104 = new GridBagConstraints();
		gbc_label_104.gridheight = 2;
		gbc_label_104.insets = new Insets(0, 0, 0, 5);
		gbc_label_104.gridx = 0;
		gbc_label_104.gridy = 0;
		panel_47.add(label_104, gbc_label_104);
		
		JLabel label_105 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_105.setForeground(Color.WHITE);
		label_105.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_105 = new GridBagConstraints();
		gbc_label_105.anchor = GridBagConstraints.SOUTH;
		gbc_label_105.insets = new Insets(0, 0, 5, 0);
		gbc_label_105.gridx = 1;
		gbc_label_105.gridy = 0;
		panel_47.add(label_105, gbc_label_105);
		
		JLabel lblEditarAdministrador = new JLabel("Editar Administrador");
		lblEditarAdministrador.setForeground(Color.WHITE);
		lblEditarAdministrador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblEditarAdministrador = new GridBagConstraints();
		gbc_lblEditarAdministrador.anchor = GridBagConstraints.NORTH;
		gbc_lblEditarAdministrador.gridx = 1;
		gbc_lblEditarAdministrador.gridy = 1;
		panel_47.add(lblEditarAdministrador, gbc_lblEditarAdministrador);
		
		JPanel panel_52 = new JPanel();
		panel_Administrador_GerirContas_Editar.add(panel_52, BorderLayout.CENTER);
		GridBagLayout gbl_panel_52 = new GridBagLayout();
		gbl_panel_52.columnWidths = new int[]{0, 204, 92, 91, 77, 0, 0, 0};
		gbl_panel_52.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0};
		gbl_panel_52.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_52.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_52.setLayout(gbl_panel_52);
		
		JLabel label_110 = new JLabel("Codigo de Administrador: ");
		label_110.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_110 = new GridBagConstraints();
		gbc_label_110.anchor = GridBagConstraints.EAST;
		gbc_label_110.insets = new Insets(0, 0, 5, 5);
		gbc_label_110.gridx = 1;
		gbc_label_110.gridy = 1;
		panel_52.add(label_110, gbc_label_110);
		
		comboboxAdministrador_Editar_CodigoAdministrador = new JComboBox();
		GridBagConstraints gbc_comboboxAdministrador_Editar_CodigoAdministrador = new GridBagConstraints();
		gbc_comboboxAdministrador_Editar_CodigoAdministrador.gridwidth = 3;
		gbc_comboboxAdministrador_Editar_CodigoAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxAdministrador_Editar_CodigoAdministrador.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxAdministrador_Editar_CodigoAdministrador.gridx = 2;
		gbc_comboboxAdministrador_Editar_CodigoAdministrador.gridy = 1;
		panel_52.add(comboboxAdministrador_Editar_CodigoAdministrador, gbc_comboboxAdministrador_Editar_CodigoAdministrador);
		
		JButton btnObterInformaes_2 = new JButton("Obter Informa\u00E7\u00F5es");
		btnObterInformaes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=(PreparedStatement) lig.prepareStatement("SELECT Palavra_Chave, Email, Nome FROM administrador WHERE Codigo_Administrador=?");
					instP.setString(1,comboboxAdministrador_Editar_CodigoAdministrador.getSelectedItem().toString());
					ResultSet res=instP.executeQuery();
					
					
					while(res.next()){
						
						String palavra_chave = res.getString("Palavra_Chave");
						String email = res.getString("email");
						String nome = res.getString("nome");
						
						txtAdministrador_Editar_Email.setText(email);
						txtAdministrador_Editar_PalavraChave.setText(palavra_chave);
						txtAdministrador_Editar_NomeCompleto.setText(nome);
						
						txtAdministrador_Editar_PalavraChave.setEditable(true);
						txtAdministrador_Editar_Email.setEditable(true);
						txtAdministrador_Editar_NomeCompleto.setEditable(true);
					}
					
					
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage()+ "\n");
						ex.printStackTrace();
					}
			}
		});
		GridBagConstraints gbc_btnObterInformaes_2 = new GridBagConstraints();
		gbc_btnObterInformaes_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnObterInformaes_2.gridx = 5;
		gbc_btnObterInformaes_2.gridy = 1;
		panel_52.add(btnObterInformaes_2, gbc_btnObterInformaes_2);
		
		JLabel label_111 = new JLabel("Palavra-Chave: ");
		label_111.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_111 = new GridBagConstraints();
		gbc_label_111.anchor = GridBagConstraints.EAST;
		gbc_label_111.insets = new Insets(0, 0, 5, 5);
		gbc_label_111.gridx = 1;
		gbc_label_111.gridy = 3;
		panel_52.add(label_111, gbc_label_111);
		
		txtAdministrador_Editar_PalavraChave = new JPasswordField();
		txtAdministrador_Editar_PalavraChave.setEditable(false);
		GridBagConstraints gbc_txtAdministrador_Editar_PalavraChave = new GridBagConstraints();
		gbc_txtAdministrador_Editar_PalavraChave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Editar_PalavraChave.gridwidth = 3;
		gbc_txtAdministrador_Editar_PalavraChave.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Editar_PalavraChave.gridx = 2;
		gbc_txtAdministrador_Editar_PalavraChave.gridy = 3;
		panel_52.add(txtAdministrador_Editar_PalavraChave, gbc_txtAdministrador_Editar_PalavraChave);
		
		JLabel label_112 = new JLabel("Email: ");
		label_112.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_112 = new GridBagConstraints();
		gbc_label_112.anchor = GridBagConstraints.EAST;
		gbc_label_112.insets = new Insets(0, 0, 5, 5);
		gbc_label_112.gridx = 1;
		gbc_label_112.gridy = 5;
		panel_52.add(label_112, gbc_label_112);
		
		txtAdministrador_Editar_Email = new JTextField();
		txtAdministrador_Editar_Email.setEditable(false);
		txtAdministrador_Editar_Email.setColumns(10);
		GridBagConstraints gbc_txtAdministrador_Editar_Email = new GridBagConstraints();
		gbc_txtAdministrador_Editar_Email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Editar_Email.gridwidth = 3;
		gbc_txtAdministrador_Editar_Email.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Editar_Email.gridx = 2;
		gbc_txtAdministrador_Editar_Email.gridy = 5;
		panel_52.add(txtAdministrador_Editar_Email, gbc_txtAdministrador_Editar_Email);
		
		JLabel label_113 = new JLabel("Nome Completo: ");
		label_113.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_label_113 = new GridBagConstraints();
		gbc_label_113.anchor = GridBagConstraints.EAST;
		gbc_label_113.insets = new Insets(0, 0, 5, 5);
		gbc_label_113.gridx = 1;
		gbc_label_113.gridy = 7;
		panel_52.add(label_113, gbc_label_113);
		
		txtAdministrador_Editar_NomeCompleto = new JTextField();
		txtAdministrador_Editar_NomeCompleto.setEditable(false);
		txtAdministrador_Editar_NomeCompleto.setColumns(10);
		GridBagConstraints gbc_txtAdministrador_Editar_NomeCompleto = new GridBagConstraints();
		gbc_txtAdministrador_Editar_NomeCompleto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAdministrador_Editar_NomeCompleto.gridwidth = 3;
		gbc_txtAdministrador_Editar_NomeCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Editar_NomeCompleto.gridx = 2;
		gbc_txtAdministrador_Editar_NomeCompleto.gridy = 7;
		panel_52.add(txtAdministrador_Editar_NomeCompleto, gbc_txtAdministrador_Editar_NomeCompleto);
		
		JButton button_1 = new JButton("Limpar Formulario");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAdministrador_Editar_PalavraChave.setText("");
				txtAdministrador_Editar_NomeCompleto.setText("");
				txtAdministrador_Editar_Email.setText("");
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 8;
		panel_52.add(button_1, gbc_button_1);
		
		JButton button_8 = new JButton("Voltar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
			}
		});
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 3;
		gbc_button_8.gridy = 8;
		panel_52.add(button_8, gbc_button_8);
		
		JButton btnValidarEdio_2 = new JButton("Validar Edi\u00E7\u00E3o");
		btnValidarEdio_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
					PreparedStatement instP=lig.prepareStatement("UPDATE administrador SET Palavra_Chave=?, Email=?, Nome=? WHERE Codigo_Administrador=?");
					
					String palavra_chave = new String(txtAdministrador_Editar_PalavraChave.getPassword());
					instP.setString(1, palavra_chave);
					instP.setString(2, txtAdministrador_Editar_Email.getText());
					instP.setString(3, txtAdministrador_Editar_NomeCompleto.getText());
					instP.setString(4, comboboxAdministrador_Editar_CodigoAdministrador.getSelectedItem().toString());

					int linhas=instP.executeUpdate();
					
					lig.close();
					if(linhas==1)
					JOptionPane.showMessageDialog(null,"Administrador Atualizado com Sucesso!");
					
					txtAdministrador_Editar_PalavraChave.setText("");
					txtAdministrador_Editar_Email.setText("");
					txtAdministrador_Editar_NomeCompleto.setText("");
					comboboxAdministrador_Editar_CodigoAdministrador.setSelectedIndex(0);
					CardLayout card=(CardLayout)frame.getContentPane().getLayout();
					card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
					
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
					}
			}
		});
		GridBagConstraints gbc_btnValidarEdio_2 = new GridBagConstraints();
		gbc_btnValidarEdio_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnValidarEdio_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidarEdio_2.gridx = 4;
		gbc_btnValidarEdio_2.gridy = 8;
		panel_52.add(btnValidarEdio_2, gbc_btnValidarEdio_2);
		
		JPanel panel_Administrador_GerirContas_Apagar = new JPanel();
		frame.getContentPane().add(panel_Administrador_GerirContas_Apagar, "panel_Administrador_GerirContas_Apagar");
		panel_Administrador_GerirContas_Apagar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(Color.BLACK);
		panel_Administrador_GerirContas_Apagar.add(panel_48, BorderLayout.NORTH);
		GridBagLayout gbl_panel_48 = new GridBagLayout();
		gbl_panel_48.columnWidths = new int[]{80, 0, 0};
		gbl_panel_48.rowHeights = new int[]{85, 64, 0};
		gbl_panel_48.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_48.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_48.setLayout(gbl_panel_48);
		
		JLabel label_106 = new JLabel("");
		label_106.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_106 = new GridBagConstraints();
		gbc_label_106.gridheight = 2;
		gbc_label_106.insets = new Insets(0, 0, 0, 5);
		gbc_label_106.gridx = 0;
		gbc_label_106.gridy = 0;
		panel_48.add(label_106, gbc_label_106);
		
		JLabel label_107 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_107.setForeground(Color.WHITE);
		label_107.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_107 = new GridBagConstraints();
		gbc_label_107.anchor = GridBagConstraints.SOUTH;
		gbc_label_107.insets = new Insets(0, 0, 5, 0);
		gbc_label_107.gridx = 1;
		gbc_label_107.gridy = 0;
		panel_48.add(label_107, gbc_label_107);
		
		JLabel lblApagarAdministrador = new JLabel("Apagar Administrador");
		lblApagarAdministrador.setForeground(Color.WHITE);
		lblApagarAdministrador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblApagarAdministrador = new GridBagConstraints();
		gbc_lblApagarAdministrador.anchor = GridBagConstraints.NORTH;
		gbc_lblApagarAdministrador.gridx = 1;
		gbc_lblApagarAdministrador.gridy = 1;
		panel_48.add(lblApagarAdministrador, gbc_lblApagarAdministrador);
		
		JPanel panel_49 = new JPanel();
		panel_Administrador_GerirContas_Apagar.add(panel_49, BorderLayout.CENTER);
		GridBagLayout gbl_panel_49 = new GridBagLayout();
		gbl_panel_49.columnWidths = new int[]{0, 0, 207, 207, 207, 0, 0};
		gbl_panel_49.rowHeights = new int[]{0, 0, 250, 37, 0, 0};
		gbl_panel_49.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_49.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_49.setLayout(gbl_panel_49);
		
		JLabel lblCodigoDeAdministrador_1 = new JLabel("Codigo de Administrador: ");
		lblCodigoDeAdministrador_1.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCodigoDeAdministrador_1 = new GridBagConstraints();
		gbc_lblCodigoDeAdministrador_1.anchor = GridBagConstraints.EAST;
		gbc_lblCodigoDeAdministrador_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoDeAdministrador_1.gridx = 1;
		gbc_lblCodigoDeAdministrador_1.gridy = 1;
		panel_49.add(lblCodigoDeAdministrador_1, gbc_lblCodigoDeAdministrador_1);
		
		comboboxAdministrador_Apagar_CodigoAdministrador = new JComboBox();
		GridBagConstraints gbc_comboboxAdministrador_Apagar_CodigoAdministrador = new GridBagConstraints();
		gbc_comboboxAdministrador_Apagar_CodigoAdministrador.gridwidth = 3;
		gbc_comboboxAdministrador_Apagar_CodigoAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_comboboxAdministrador_Apagar_CodigoAdministrador.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboboxAdministrador_Apagar_CodigoAdministrador.gridx = 2;
		gbc_comboboxAdministrador_Apagar_CodigoAdministrador.gridy = 1;
		panel_49.add(comboboxAdministrador_Apagar_CodigoAdministrador, gbc_comboboxAdministrador_Apagar_CodigoAdministrador);
		
		JLabel lblMotivo_3 = new JLabel("Motivo: ");
		lblMotivo_3.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMotivo_3 = new GridBagConstraints();
		gbc_lblMotivo_3.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMotivo_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivo_3.gridx = 1;
		gbc_lblMotivo_3.gridy = 2;
		panel_49.add(lblMotivo_3, gbc_lblMotivo_3);
		
		txtAdministrador_Apagar_Motivo = new JTextPane();
		txtAdministrador_Apagar_Motivo.setBorder(UIManager.getBorder("TextField.border"));
		GridBagConstraints gbc_txtAdministrador_Apagar_Motivo = new GridBagConstraints();
		gbc_txtAdministrador_Apagar_Motivo.gridwidth = 3;
		gbc_txtAdministrador_Apagar_Motivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtAdministrador_Apagar_Motivo.fill = GridBagConstraints.BOTH;
		gbc_txtAdministrador_Apagar_Motivo.gridx = 2;
		gbc_txtAdministrador_Apagar_Motivo.gridy = 2;
		panel_49.add(txtAdministrador_Apagar_Motivo, gbc_txtAdministrador_Apagar_Motivo);
		
		JButton btnLimparFormulario_1 = new JButton("Limpar Formulario");
		btnLimparFormulario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAdministrador_Apagar_Motivo.setText("");
			}
		});
		GridBagConstraints gbc_btnLimparFormulario_1 = new GridBagConstraints();
		gbc_btnLimparFormulario_1.fill = GridBagConstraints.BOTH;
		gbc_btnLimparFormulario_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimparFormulario_1.gridx = 2;
		gbc_btnLimparFormulario_1.gridy = 3;
		panel_49.add(btnLimparFormulario_1, gbc_btnLimparFormulario_1);
		
		JButton btnVoltar_5 = new JButton("Voltar");
		btnVoltar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
			}
		});
		GridBagConstraints gbc_btnVoltar_5 = new GridBagConstraints();
		gbc_btnVoltar_5.fill = GridBagConstraints.BOTH;
		gbc_btnVoltar_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar_5.gridx = 3;
		gbc_btnVoltar_5.gridy = 3;
		panel_49.add(btnVoltar_5, gbc_btnVoltar_5);
		
		JButton btnRemover_2 = new JButton("Remover");
		btnRemover_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					Connection lig = DriverManager.getConnection("jdbc:mysql://localhost/escolaconducao_linhacerta", "root", "");
			
					
					
					PreparedStatement instP = lig.prepareStatement("DELETE FROM administrador WHERE Codigo_Administrador=?");
					instP.setString(1, comboboxAdministrador_Apagar_CodigoAdministrador.getSelectedItem().toString());
					 
					int resultado = instP.executeUpdate();
					if (resultado > 0) {
					    JOptionPane.showMessageDialog(null, "Administrador eliminado com sucesso!");
					    txtAdministrador_Apagar_Motivo.setText("");
					    comboboxAdministrador_Apagar_CodigoAdministrador.setSelectedIndex(0);
					    
					    try{
				    		java.util.Date data = new java.util.Date();  
				    		SimpleDateFormat formatarDate = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss"); 
				    		
				    		String filename = formatarDate.format(data) + " - Administrador Apagado";

				        	File file =new File("logs/Registos/Administradores/" + filename);
				        	if(!file.exists()){
				        	   file.createNewFile();
				        	}

				          }catch(IOException ex){
				             JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
				           }
				}
			}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, "Erro: " + ex.getLocalizedMessage());
				}
			}
		});
		GridBagConstraints gbc_btnRemover_2 = new GridBagConstraints();
		gbc_btnRemover_2.fill = GridBagConstraints.BOTH;
		gbc_btnRemover_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemover_2.gridx = 4;
		gbc_btnRemover_2.gridy = 3;
		panel_49.add(btnRemover_2, gbc_btnRemover_2);
		
		JPanel panel_Administrador_GerirContas_Listar = new JPanel();
		frame.getContentPane().add(panel_Administrador_GerirContas_Listar, "panel_Administrador_GerirContas_Listar");
		panel_Administrador_GerirContas_Listar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(Color.BLACK);
		panel_Administrador_GerirContas_Listar.add(panel_50, BorderLayout.NORTH);
		GridBagLayout gbl_panel_50 = new GridBagLayout();
		gbl_panel_50.columnWidths = new int[]{80, 0, 0};
		gbl_panel_50.rowHeights = new int[]{85, 64, 0};
		gbl_panel_50.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_50.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_50.setLayout(gbl_panel_50);
		
		JLabel label_108 = new JLabel("");
		label_108.setIcon(new ImageIcon(Gestao.class.getResource("/com/escoladigital/tgpsi2013/logo.png")));
		GridBagConstraints gbc_label_108 = new GridBagConstraints();
		gbc_label_108.gridheight = 2;
		gbc_label_108.insets = new Insets(0, 0, 0, 5);
		gbc_label_108.gridx = 0;
		gbc_label_108.gridy = 0;
		panel_50.add(label_108, gbc_label_108);
		
		JLabel label_109 = new JLabel("Escola de Condu\u00E7\u00E3o - Linha Certa                 ");
		label_109.setForeground(Color.WHITE);
		label_109.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_label_109 = new GridBagConstraints();
		gbc_label_109.anchor = GridBagConstraints.SOUTH;
		gbc_label_109.insets = new Insets(0, 0, 5, 0);
		gbc_label_109.gridx = 1;
		gbc_label_109.gridy = 0;
		panel_50.add(label_109, gbc_label_109);
		
		JLabel lblListarAdministrador = new JLabel("Listar Administrador");
		lblListarAdministrador.setForeground(Color.WHITE);
		lblListarAdministrador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		GridBagConstraints gbc_lblListarAdministrador = new GridBagConstraints();
		gbc_lblListarAdministrador.anchor = GridBagConstraints.NORTH;
		gbc_lblListarAdministrador.gridx = 1;
		gbc_lblListarAdministrador.gridy = 1;
		panel_50.add(lblListarAdministrador, gbc_lblListarAdministrador);
		
		JPanel panel_51 = new JPanel();
		panel_Administrador_GerirContas_Listar.add(panel_51, BorderLayout.CENTER);
		GridBagLayout gbl_panel_51 = new GridBagLayout();
		gbl_panel_51.columnWidths = new int[]{0, 0, 0};
		gbl_panel_51.rowHeights = new int[]{0, 0, 0};
		gbl_panel_51.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_51.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_51.setLayout(gbl_panel_51);
		
		JPanel panel_53 = new JPanel();
		GridBagConstraints gbc_panel_53 = new GridBagConstraints();
		gbc_panel_53.fill = GridBagConstraints.BOTH;
		gbc_panel_53.gridx = 1;
		gbc_panel_53.gridy = 1;
		panel_51.add(panel_53, gbc_panel_53);
		GridBagLayout gbl_panel_53 = new GridBagLayout();
		gbl_panel_53.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_53.rowHeights = new int[]{0, 245, 51, 0};
		gbl_panel_53.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_53.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_53.setLayout(gbl_panel_53);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		JTable tableAdministrador = new JTable(administrador_listar);
		tableListar_Alunos.setCellSelectionEnabled(true);
		tableListar_Alunos.setRowSelectionAllowed(false);
		scrollPane_4.setViewportView(tableAdministrador);
		administrador_listar.addColumn("Código de Administrador");
		administrador_listar.addColumn("Palavra-Chave");
		administrador_listar.addColumn("Email");
		administrador_listar.addColumn("Nome");
		
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.gridwidth = 3;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_4.gridx = 0;
		gbc_scrollPane_4.gridy = 1;
		panel_53.add(scrollPane_4, gbc_scrollPane_4);
		
		JButton button_9 = new JButton("Voltar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card=(CardLayout)frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "panel_Administrador_GerirContas");
				
				int rowCount = administrador_listar.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					administrador_listar.removeRow(i);
				}
			}
		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 2;
		panel_53.add(button_9, gbc_button_9);
	}
	

}
