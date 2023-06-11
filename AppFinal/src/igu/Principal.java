package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	public JPanel panel;
	public JLabel newLabelLabel;
	public JLabel newLabelLabel_1;
	public JLabel baseDeDatosLabel;
	public JPanel panel_1;
	public JButton btnCargarDatos;
	public JButton BtnVerDatos;
	public JButton btnSalir;

	
	public Principal() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1031, 508);
		panel.setName("panel");
		contentPane.add(panel);
		panel.setLayout(null);
		
		newLabelLabel = new JLabel("");
		newLabelLabel.setIcon(new ImageIcon(Principal.class.getResource("/img/tovis pet shop.png")));
		newLabelLabel.setBounds(289, 16, 454, 105);
		newLabelLabel.setName("newLabelLabel");
		panel.add(newLabelLabel);
		
		newLabelLabel_1 = new JLabel("");
		newLabelLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/img/dog hui2.png")));
		newLabelLabel_1.setBounds(647, 193, 245, 212);
		newLabelLabel_1.setName("newLabelLabel_1");
		panel.add(newLabelLabel_1);
		
		baseDeDatosLabel = new JLabel("Base de Datos de Mascotas");
		baseDeDatosLabel.setForeground(Color.WHITE);
		baseDeDatosLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		baseDeDatosLabel.setBounds(390, 116, 266, 44);
		baseDeDatosLabel.setName("baseDeDatosLabel");
		panel.add(baseDeDatosLabel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBounds(75, 267, 557, 189);
		panel_1.setName("panel_1");
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCargarDatos = new JButton("CARGAR  DATOS");
		btnCargarDatos.addActionListener(this);
		btnCargarDatos.setIcon(new ImageIcon(Principal.class.getResource("/img/carga-en-la-nube (1).png")));
		btnCargarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCargarDatos.setBounds(25, 69, 166, 55);
		btnCargarDatos.setName("btnCargarDatos");
		panel_1.add(btnCargarDatos);
		
		BtnVerDatos = new JButton("VER DATOS");
		BtnVerDatos.setIcon(new ImageIcon(Principal.class.getResource("/img/ver.png")));
		BtnVerDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BtnVerDatos.setBounds(202, 69, 166, 55);
		BtnVerDatos.setName("BtnVerDatos");
		panel_1.add(BtnVerDatos);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setIcon(new ImageIcon(Principal.class.getResource("/img/boton.png")));
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(376, 69, 166, 55);
		btnSalir.setName("btnSalir");
		panel_1.add(btnSalir);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			doBtnSalirActionPerformed(e);
		}
		if (e.getSource() == btnCargarDatos) {
			doBtnCargarDatosActionPerformed(e);
		}
	}
	protected void doBtnCargarDatosActionPerformed(ActionEvent e) {
		CargarDatos cargarDatos = new CargarDatos();
		cargarDatos.setVisible(true);
		cargarDatos.setLocationRelativeTo(null);
	}
	protected void doBtnSalirActionPerformed(ActionEvent e) {
		int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
	}
}
}
