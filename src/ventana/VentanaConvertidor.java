package ventana;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import convertidor.Medidas;
import convertidor.Moneda;
import convertidor.Temperatura;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Toolkit;

public class VentanaConvertidor {

	private JFrame frmConversor;
	private JTextField field_cantidad;
	private JTextField field_resultado;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaConvertidor window = new
	 * VentanaConvertidor(); window.getFrame().setVisible(true); } catch (Exception
	 * e) { e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the application.
	 */
	public VentanaConvertidor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setTitle("Conversor");
		getFrame().setBounds(0, 0, 400, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {50, 120, 30, 120, 50};
		gridBagLayout.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getFrame().getContentPane().setLayout(gridBagLayout);
		
		JLabel label_tipo_conversion = new JLabel("Elija tipo de conversi\u00F3n:");
		label_tipo_conversion.setToolTipText("");
		GridBagConstraints gbc_label_tipo_conversion = new GridBagConstraints();
		gbc_label_tipo_conversion.insets = new Insets(20, 0, 5, 5);
		gbc_label_tipo_conversion.gridx = 1;
		gbc_label_tipo_conversion.gridy = 1;
		getFrame().getContentPane().add(label_tipo_conversion, gbc_label_tipo_conversion);
		
		JComboBox combobox_tipo_conversion = new JComboBox();
		combobox_tipo_conversion.addItem("Elija Opción");
		combobox_tipo_conversion.addItem("Moneda");
		combobox_tipo_conversion.addItem("Temperatura");
		combobox_tipo_conversion.addItem("Medidas");
		GridBagConstraints gbc_combobox_tipo_conversion = new GridBagConstraints();
		gbc_combobox_tipo_conversion.insets = new Insets(20, 0, 5, 0);
		gbc_combobox_tipo_conversion.fill = GridBagConstraints.HORIZONTAL;
		gbc_combobox_tipo_conversion.gridx = 3;
		gbc_combobox_tipo_conversion.gridy = 1;
		getFrame().getContentPane().add(combobox_tipo_conversion, gbc_combobox_tipo_conversion);
		
		JLabel label_convertir_de = new JLabel("Convertir de:");
		label_convertir_de.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_convertir_de = new GridBagConstraints();
		gbc_label_convertir_de.insets = new Insets(40, 0, 5, 5);
		gbc_label_convertir_de.gridx = 1;
		gbc_label_convertir_de.gridy = 3;
		getFrame().getContentPane().add(label_convertir_de, gbc_label_convertir_de);
		
		JComboBox combobox_convertir_de = new JComboBox();
		GridBagConstraints gbc_combobox_convertir_de = new GridBagConstraints();
		gbc_combobox_convertir_de.insets = new Insets(40, 0, 5, 0);
		gbc_combobox_convertir_de.fill = GridBagConstraints.HORIZONTAL;
		gbc_combobox_convertir_de.gridx = 3;
		gbc_combobox_convertir_de.gridy = 3;
		getFrame().getContentPane().add(combobox_convertir_de, gbc_combobox_convertir_de);
		
		JLabel label_cantidad = new JLabel("Cantidad:");
		GridBagConstraints gbc_label_cantidad = new GridBagConstraints();
		gbc_label_cantidad.insets = new Insets(40, 0, 5, 5);
		gbc_label_cantidad.gridx = 1;
		gbc_label_cantidad.gridy = 5;
		getFrame().getContentPane().add(label_cantidad, gbc_label_cantidad);
		
		field_cantidad = new JTextField();
		field_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_field_cantidad = new GridBagConstraints();
		gbc_field_cantidad.insets = new Insets(40, 0, 5, 0);
		gbc_field_cantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_field_cantidad.gridx = 3;
		gbc_field_cantidad.gridy = 5;
		getFrame().getContentPane().add(field_cantidad, gbc_field_cantidad);
		field_cantidad.setColumns(10);
		
		JLabel label_convertir_a = new JLabel("Convertir a:");
		GridBagConstraints gbc_label_convertir_a = new GridBagConstraints();
		gbc_label_convertir_a.insets = new Insets(40, 0, 5, 5);
		gbc_label_convertir_a.gridx = 1;
		gbc_label_convertir_a.gridy = 7;
		getFrame().getContentPane().add(label_convertir_a, gbc_label_convertir_a);
		
		JComboBox combobox_convertir_a = new JComboBox();
		GridBagConstraints gbc_combobox_convertir_a = new GridBagConstraints();
		gbc_combobox_convertir_a.insets = new Insets(40, 0, 5, 0);
		gbc_combobox_convertir_a.fill = GridBagConstraints.HORIZONTAL;
		gbc_combobox_convertir_a.gridx = 3;
		gbc_combobox_convertir_a.gridy = 7;
		getFrame().getContentPane().add(combobox_convertir_a, gbc_combobox_convertir_a);
		
		JButton boton_limpiar = new JButton("Limpiar");
		GridBagConstraints gbc_boton_limpiar = new GridBagConstraints();
		gbc_boton_limpiar.insets = new Insets(40, 0, 5, 5);
		gbc_boton_limpiar.gridx = 1;
		gbc_boton_limpiar.gridy = 10;
		getFrame().getContentPane().add(boton_limpiar, gbc_boton_limpiar);
		
		JButton boton_convertir = new JButton("Convertir");
		GridBagConstraints gbc_boton_convertir = new GridBagConstraints();
		gbc_boton_convertir.insets = new Insets(40, 0, 5, 0);
		gbc_boton_convertir.gridx = 3;
		gbc_boton_convertir.gridy = 10;
		getFrame().getContentPane().add(boton_convertir, gbc_boton_convertir);
		
		boton_convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				Double cantidad=Double.parseDouble(field_cantidad.getText());
					if(combobox_tipo_conversion.getSelectedItem().toString().equals("Moneda")) {
						double valor1=new Moneda().getMoneda_valor().get(combobox_convertir_de.getSelectedItem().toString());
						double valor2=new Moneda().getMoneda_valor().get(combobox_convertir_a.getSelectedItem().toString());
						String total=String.format("%.3f", new Moneda().convertir(valor1, cantidad, valor2));
						field_resultado.setText(total);
					}
					
					if(combobox_tipo_conversion.getSelectedItem().toString().equals("Temperatura")) {
						double valor1=new Temperatura().getTemperatura().get(combobox_convertir_de.getSelectedItem().toString());
						double valor2=new Temperatura().getTemperatura().get(combobox_convertir_a.getSelectedItem().toString());
						System.out.println(valor1+"----"+valor2);
						String total=String.format("%.2f", new Temperatura().convertir(valor1, cantidad, valor2));
						field_resultado.setText(total);
					}
					
					if(combobox_tipo_conversion.getSelectedItem().toString().equals("Medidas")) {
						double valor1=new Medidas().getMedidas().get(combobox_convertir_de.getSelectedItem().toString());
						double valor2=new Medidas().getMedidas().get(combobox_convertir_a.getSelectedItem().toString());
						String total=String.format("%.3f", new Medidas().convertir(valor1, cantidad, valor2));
						field_resultado.setText(total);
					}
					
				}
				catch (Exception ex){				
					JOptionPane.showMessageDialog(null, "Debe ingresar solo números mayores a 0", "Alerta", JOptionPane.WARNING_MESSAGE);
					field_cantidad.setText(null);
					field_resultado.setText(null);
				}
			}
		
		});
		
		JLabel label_resultado = new JLabel("Resultado:");
		GridBagConstraints gbc_label_resultado = new GridBagConstraints();
		gbc_label_resultado.insets = new Insets(40, 0, 0, 5);
		gbc_label_resultado.gridx = 1;
		gbc_label_resultado.gridy = 13;
		getFrame().getContentPane().add(label_resultado, gbc_label_resultado);
		
		field_resultado = new JTextField();
		field_resultado.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_field_resultado = new GridBagConstraints();
		field_resultado.setEditable(false);
		gbc_field_resultado.insets = new Insets(40, 0, 0, 0);
		gbc_field_resultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_field_resultado.gridx = 3;
		gbc_field_resultado.gridy = 13;
		getFrame().getContentPane().add(field_resultado, gbc_field_resultado);
		field_resultado.setColumns(10);
		
		combobox_tipo_conversion.addItemListener(new ItemListener() {
		String item_convertir=combobox_tipo_conversion.getSelectedItem().toString();	
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					if(combobox_tipo_conversion.getSelectedIndex()>=0) {
						combobox_convertir_a.setModel(new DefaultComboBoxModel(cargar(combobox_tipo_conversion.getSelectedItem().toString())));
						combobox_convertir_de.setModel(new DefaultComboBoxModel(cargar(combobox_tipo_conversion.getSelectedItem().toString())));
					}
				}
			}
		});
		
		
		boton_limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combobox_tipo_conversion.setSelectedItem("Elija Opción");
				field_cantidad.setText(null);
				field_resultado.setText(null);	
			}
		});
	}
	
	public String[] cargar(String item_seleccionado) {
		String [] lista = null;
		
		if(item_seleccionado.equals("Elija Opción")) {
			lista= new String[0];
		}
		
		if (item_seleccionado.equals("Moneda")) {
			lista= new String[new Moneda().lista_monedas().size()];
			int i=0;
			for (String m : new Moneda().lista_monedas()) {
				lista[i]=m.strip();
				i++;
			}
			}
		
		if (item_seleccionado.equals("Temperatura")) {
			lista = new String [new Temperatura().lista_temperaturas().size()];
			int i=0;
			for (String t : new Temperatura().lista_temperaturas()) {
				lista[i]=t.strip();
				i++;
			}
			}
		
		if (item_seleccionado.equals("Medidas")) {
			lista= new String[new Medidas().lista_medidas().size()];
			int i=0;
			for (String m : new Medidas().lista_medidas()) {
				lista[i]=m.strip();
				i++;
			}
			}				
		return lista;
	}

	public JFrame getFrame() {
		return frmConversor;
	}

	public void setFrame(JFrame frame) {
		this.frmConversor = frame;
		frmConversor.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaConvertidor.class.getResource("/ventana/images.png")));
	}

}
