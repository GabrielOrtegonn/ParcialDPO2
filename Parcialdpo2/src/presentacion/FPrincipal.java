package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener{
	private JLabel lA;
	private JLabel lB;
	private JLabel lC;
	private JTextField tA;
	private JTextField tB;
	private JTextField tC;
	private JButton bCalcular;
	private JLabel lResultado;
	private Parcial parcial;
	
	public FPrincipal() {
		this.parcial = new Parcial();
		this.setLayout(new GridLayout(4, 2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Examen Gabriel Ortegon");
		this.setBounds(500, 300, 400, 250);
		
		this.lA = new JLabel("a: ");
		this.lA.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lA);
		this.tA = new JTextField();
		this.add(this.tA);
		
		this.lB = new JLabel("b: ");
		this.lB.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lB);
		this.tB = new JTextField();
		this.add(this.tB);
		
		this.lC = new JLabel("c: ");
		this.lC.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lC);
		this.tC = new JTextField();
		this.add(this.tC);
		
		this.bCalcular = new JButton("Calcular");
		this.bCalcular.addActionListener(this);
		this.add(this.bCalcular);
		this.lResultado = new JLabel("");
		this.add(this.lResultado);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int a = Integer.parseInt(this.tA.getText());
			int b = Integer.parseInt(this.tB.getText());
			int c = Integer.parseInt(this.tC.getText());
			this.lResultado.setText(this.parcial.raices(a, b, c));
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}