package app;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Tipo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIBegazo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumAtencion;
	private JTextField txtFecha;
	private JTextField txtNombre;
	private JComboBox<String> cboTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBegazo frame = new GUIBegazo();
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
	public GUIBegazo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero de Atencion :");
		lblNewLabel.setBounds(41, 53, 146, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha :");
		lblNewLabel_1.setBounds(41, 91, 146, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Nombre Paciente :");
		lblNewLabel_2.setBounds(41, 130, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo :");
		lblNewLabel_3.setBounds(41, 168, 146, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNumAtencion = new JTextField();
		txtNumAtencion.setBounds(197, 50, 211, 20);
		contentPane.add(txtNumAtencion);
		txtNumAtencion.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(197, 88, 211, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 127, 211, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		cboTipo = new JComboBox<String>();
		cboTipo.setBounds(197, 164, 173, 22);
		contentPane.add(cboTipo);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(482, 87, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 206, 581, 205);
		contentPane.add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		comboTipo();
	}

	private void comboTipo() {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_baseDAWI");
		EntityManager em = fabrica.createEntityManager();
		String jpql = "select t from Tipo t";
		List<Tipo> lstTipo = em.createQuery(jpql, Tipo.class).getResultList();
		cboTipo.addItem("Seleccione...");
		for(Tipo t: lstTipo) {
			cboTipo.addItem(t.getNom_tipo_atencion());
		}
		em.close();
	}
}
