package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CargarDatos extends JFrame implements ActionListener {

	private JPanel contentPane;
	public JPanel panel;
	public JLabel newLabelLabel_1;
	public JLabel baseDeDatosLabel;
	public JPanel panel_1;
	public JButton btnGuardar;
	public JButton btnLimpiar;
	public JButton btnSalir;
	public JLabel newLabelLabel_2;
	public JTextField txtNombre;
	public JLabel nombreLabel_1;
	public JPanel panel_2;
	public JLabel colorLabel;
	public JLabel razaLabel;
	public JLabel alergicoLabel;
	public JLabel tratamientoEspecialLabel;
	public JLabel nombreDueoLabel;
	public JLabel telefonoLabel;
	public JLabel observacionesLabel;
	public JTextArea txtObservaciones;
	public JTextField txtRaza;
	public JTextField txtColor;
	public JTextField txtNombDuenio;
	public JTextField TxtTelefono;
	public JComboBox cmbAlergico;
	public JComboBox cmbTratamientoEsp;


	public CargarDatos() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1019, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1010, 508);
		panel.setName("panel");
		contentPane.add(panel);
		
		baseDeDatosLabel = new JLabel("Base de Datos de Mascotas");
		baseDeDatosLabel.setForeground(Color.WHITE);
		baseDeDatosLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		baseDeDatosLabel.setBounds(588, 385, 266, 44);
		baseDeDatosLabel.setName("baseDeDatosLabel");
		panel.add(baseDeDatosLabel);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(459, 419, 557, 89);
		panel_1.setName("panel_1");
		panel.add(panel_1);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setIcon(new ImageIcon(CargarDatos.class.getResource("/img/salvar (1).png")));
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(25, 16, 166, 55);
		btnGuardar.setName("btnGuardar");
		panel_1.add(btnGuardar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setIcon(new ImageIcon(CargarDatos.class.getResource("/img/computadora.png")));
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpiar.setBounds(202, 16, 166, 55);
		btnLimpiar.setName("btnLimpiar");
		panel_1.add(btnLimpiar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setIcon(new ImageIcon(CargarDatos.class.getResource("/img/boton.png")));
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(376, 16, 166, 55);
		btnSalir.setName("btnSalir");
		panel_1.add(btnSalir);
		
		newLabelLabel_2 = new JLabel("");
		newLabelLabel_2.setIcon(new ImageIcon(CargarDatos.class.getResource("/img/cardadatos.png")));
		newLabelLabel_2.setBounds(25, 16, 467, 96);
		newLabelLabel_2.setName("newLabelLabel_2");
		panel.add(newLabelLabel_2);
		
		newLabelLabel_1 = new JLabel("");
		newLabelLabel_1.setBounds(637, 229, 208, 174);
		panel.add(newLabelLabel_1);
		newLabelLabel_1.setIcon(new ImageIcon(CargarDatos.class.getResource("/img/aaaaaaaaa.png")));
		newLabelLabel_1.setName("newLabelLabel_1");
		
		txtNombre = new JTextField();
		txtNombre.setBounds(175, 130, 272, 26);
		txtNombre.setName("txtNombre");
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(15, 130, 159, 350);
		panel_2.setName("panel_2");
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		nombreLabel_1 = new JLabel("Nombre:");
		nombreLabel_1.setForeground(Color.WHITE);
		nombreLabel_1.setBackground(Color.WHITE);
		nombreLabel_1.setBounds(0, 0, 69, 20);
		panel_2.add(nombreLabel_1);
		nombreLabel_1.setName("nombreLabel_1");
		
		colorLabel = new JLabel("Color:");
		colorLabel.setForeground(Color.WHITE);
		colorLabel.setBackground(Color.WHITE);
		colorLabel.setBounds(0, 62, 69, 20);
		colorLabel.setName("colorLabel");
		panel_2.add(colorLabel);
		
		razaLabel = new JLabel("Raza:");
		razaLabel.setForeground(Color.WHITE);
		razaLabel.setBackground(Color.WHITE);
		razaLabel.setBounds(0, 28, 69, 20);
		razaLabel.setName("razaLabel");
		panel_2.add(razaLabel);
		
		alergicoLabel = new JLabel("Alergico:");
		alergicoLabel.setForeground(Color.WHITE);
		alergicoLabel.setBackground(Color.WHITE);
		alergicoLabel.setBounds(0, 97, 69, 20);
		alergicoLabel.setName("alergicoLabel");
		panel_2.add(alergicoLabel);
		
		tratamientoEspecialLabel = new JLabel("Tratamiento Especial:");
		tratamientoEspecialLabel.setForeground(Color.WHITE);
		tratamientoEspecialLabel.setBackground(Color.WHITE);
		tratamientoEspecialLabel.setBounds(0, 133, 170, 20);
		tratamientoEspecialLabel.setName("tratamientoEspecialLabel");
		panel_2.add(tratamientoEspecialLabel);
		
		nombreDueoLabel = new JLabel("Nombre Dueño:");
		nombreDueoLabel.setForeground(Color.WHITE);
		nombreDueoLabel.setBackground(Color.WHITE);
		nombreDueoLabel.setBounds(0, 170, 122, 20);
		nombreDueoLabel.setName("nombreDueoLabel");
		panel_2.add(nombreDueoLabel);
		
		telefonoLabel = new JLabel("Telefono:");
		telefonoLabel.setForeground(Color.WHITE);
		telefonoLabel.setBackground(Color.WHITE);
		telefonoLabel.setBounds(0, 213, 69, 20);
		telefonoLabel.setName("telefonoLabel");
		panel_2.add(telefonoLabel);
		
		observacionesLabel = new JLabel("Observaciones:");
		observacionesLabel.setForeground(Color.WHITE);
		observacionesLabel.setBackground(Color.WHITE);
		observacionesLabel.setBounds(681, 33, 129, 20);
		observacionesLabel.setName("observacionesLabel");
		panel.add(observacionesLabel);
		
		txtObservaciones = new JTextArea();
		txtObservaciones.setBounds(562, 69, 365, 163);
		txtObservaciones.setName("txtObservaciones");
		panel.add(txtObservaciones);
		
		txtRaza = new JTextField();
		txtRaza.setColumns(10);
		txtRaza.setBounds(175, 159, 272, 26);
		txtRaza.setName("txtRaza");
		panel.add(txtRaza);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(175, 188, 272, 26);
		txtColor.setName("txtColor");
		panel.add(txtColor);
		
		txtNombDuenio = new JTextField();
		txtNombDuenio.setColumns(10);
		txtNombDuenio.setBounds(175, 300, 272, 26);
		txtNombDuenio.setName("txtNombDuenio");
		panel.add(txtNombDuenio);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(175, 336, 272, 26);
		TxtTelefono.setName("TxtTelefono");
		panel.add(TxtTelefono);
		
		cmbAlergico = new JComboBox();
		cmbAlergico.setModel(new DefaultComboBoxModel(new String[] {"--", "SI", "NO"}));
		cmbAlergico.setBounds(189, 229, 49, 20);
		cmbAlergico.setName("cmbAlergico");
		panel.add(cmbAlergico);
		
		cmbTratamientoEsp = new JComboBox();
		cmbTratamientoEsp.setModel(new DefaultComboBoxModel(new String[] {"--", "SI", "NO"}));
		cmbTratamientoEsp.setBounds(189, 264, 49, 20);
		cmbTratamientoEsp.setName("cmbTratamientoEsp");
		panel.add(cmbTratamientoEsp);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			doBtnLimpiarActionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			doBtnSalirActionPerformed(e);
		}
	}
	protected void doBtnSalirActionPerformed(ActionEvent e) {
		 int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
	        if (confirm == JOptionPane.YES_OPTION) {
	            System.exit(0);
	}
}
	protected void doBtnLimpiarActionPerformed(ActionEvent e) {
		txtColor.setText("");
		txtNombDuenio.setText("");
		txtNombre.setText("");
		txtObservaciones.setText("");
		txtRaza.setText("");
		TxtTelefono.setText("");
		cmbAlergico.setSelectedIndex(0);
		cmbTratamientoEsp.setSelectedIndex(0);
		
	}
}