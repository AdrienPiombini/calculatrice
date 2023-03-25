import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WinCalc extends JFrame implements ActionListener {

	private JButton bt0 = new JButton("0");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");

	private JButton btAdd = new JButton("+");
	private JButton btSous = new JButton("-");
	private JButton btMult = new JButton("*");
	private JButton btDiv = new JButton("/");
	private JButton btPour = new JButton("%");
	private JButton btCarre = new JButton("x2");
	private JButton btInverse = new JButton("1/x");
	private JButton btRacine = new JButton("Rx");
	private JButton btPlusMoins = new JButton("+/-");
	private JButton btAc = new JButton("C");
	private JButton btEffacer = new JButton("<-");

	private JButton btPoint = new JButton(".");
	private JButton btEgal = new JButton("=");

	private JTextField txtNombre = new JTextField();

	private float nb1, nb2, result;
	private char operateur;

	public WinCalc() {

		this.setTitle("Ma Calc Window 2023");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setBounds(100, 100, 290, 340);
		this.getContentPane().setBackground(Color.cyan);

		this.txtNombre.setBounds(20, 10, 250, 30);
		this.add(this.txtNombre);
		this.bt7.setBounds(20, 100, 50, 50);
		this.add(this.bt7);
		this.bt8.setBounds(70, 100, 50, 50);
		this.add(this.bt8);
		this.bt9.setBounds(120, 100, 50, 50);
		this.add(this.bt9);

		this.add(this.txtNombre);
		this.bt4.setBounds(20, 150, 50, 50);
		this.add(this.bt4);
		this.bt5.setBounds(70, 150, 50, 50);
		this.add(this.bt5);
		this.bt6.setBounds(120, 150, 50, 50);
		this.add(this.bt6);

		this.add(this.txtNombre);
		this.bt1.setBounds(20, 200, 50, 50);
		this.add(this.bt1);
		this.bt2.setBounds(70, 200, 50, 50);
		this.add(this.bt2);
		this.bt3.setBounds(120, 200, 50, 50);
		this.add(this.bt3);

		this.bt0.setBounds(20, 250, 100, 50);
		this.add(this.bt0);
		this.btPoint.setBounds(120, 250, 50, 50);
		this.add(this.btPoint);

		this.btEgal.setBounds(170, 250, 100, 50);
		this.add(this.btEgal);

		this.btAdd.setBounds(170, 200, 50, 50);
		this.add(this.btAdd);
		this.btPour.setBounds(220, 200, 50, 50);
		this.add(this.btPour);

		this.btSous.setBounds(170, 150, 50, 50);
		this.add(this.btSous);
		this.btRacine.setBounds(220, 150, 50, 50);
		this.add(this.btRacine);

		this.btMult.setBounds(170, 100, 50, 50);
		this.add(this.btMult);
		this.btCarre.setBounds(220, 100, 50, 50);
		this.add(this.btCarre);

		this.btDiv.setBounds(170, 50, 50, 50);
		this.add(this.btDiv);
		this.btInverse.setBounds(220, 50, 50, 50);
		this.add(this.btInverse);

		this.btEffacer.setBounds(20, 50, 50, 50);
		this.add(this.btEffacer);
		this.btAc.setBounds(70, 50, 50, 50);
		this.add(this.btAc);
		this.btPlusMoins.setBounds(120, 50, 50, 50);
		this.add(this.btPlusMoins);

		// rendre les boutons cliquable
		this.bt0.addActionListener(this); // fait
		this.bt1.addActionListener(this); // fait
		this.bt2.addActionListener(this); // fait
		this.bt3.addActionListener(this); // fait
		this.bt4.addActionListener(this); // fait
		this.bt5.addActionListener(this); // fait
		this.bt6.addActionListener(this); // fait
		this.bt7.addActionListener(this); // fait
		this.bt8.addActionListener(this); // fait
		this.bt9.addActionListener(this); // fait
		this.btAdd.addActionListener(this);
		this.btMult.addActionListener(this);
		this.btSous.addActionListener(this);
		this.btDiv.addActionListener(this);
		this.btPoint.addActionListener(this);
		this.btInverse.addActionListener(this);
		this.btCarre.addActionListener(this);
		this.btRacine.addActionListener(this);
		this.btPour.addActionListener(this);
		this.btPlusMoins.addActionListener(this);
		this.btAc.addActionListener(this);
		this.btEgal.addActionListener(this);
		this.btEffacer.addActionListener(this);
		this.setVisible(true);
	}

	public static void main(String args[]) {
		new WinCalc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.btAc) {
			this.txtNombre.setText("");
		} else if (e.getSource() == this.btEffacer) {
			String chaine = this.txtNombre.getText();
			if (!chaine.equals("")) {
				chaine = chaine.substring(0, chaine.length() - 1);
				this.txtNombre.setText(chaine);
			}
		} else if (e.getSource() == this.bt0) {
			this.txtNombre.setText(this.txtNombre.getText() + "0");
		} else if (e.getSource() == this.bt1) {
			this.txtNombre.setText(this.txtNombre.getText() + "1");
		} else if (e.getSource() == this.bt2) {
			this.txtNombre.setText(this.txtNombre.getText() + "2");
		} else if (e.getSource() == this.bt3) {
			this.txtNombre.setText(this.txtNombre.getText() + "3");
		} else if (e.getSource() == this.bt4) {
			this.txtNombre.setText(this.txtNombre.getText() + "4");
		} else if (e.getSource() == this.bt5) {
			this.txtNombre.setText(this.txtNombre.getText() + "5");
		} else if (e.getSource() == this.bt6) {
			this.txtNombre.setText(this.txtNombre.getText() + "6");
		} else if (e.getSource() == this.bt7) {
			this.txtNombre.setText(this.txtNombre.getText() + "7");
		} else if (e.getSource() == this.bt8) {
			this.txtNombre.setText(this.txtNombre.getText() + "8");
		} else if (e.getSource() == this.bt9) {
			this.txtNombre.setText(this.txtNombre.getText() + "9");
		}
		// opérations unaires :
		else if (e.getSource() == this.btCarre) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				nb = (float) Math.pow(nb, 2); // nb * nb
				this.txtNombre.setText(nb + "");
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btRacine) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				if (nb >= 0) {
					nb = (float) Math.sqrt(nb);
					this.txtNombre.setText(nb + "");
				} else {
					JOptionPane.showMessageDialog(this, "Erreur de saisie (NBR < 0 !");
					this.txtNombre.setText("");
				}

			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btInverse) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				if (nb != 0) {
					nb = 1 / nb;
					this.txtNombre.setText(nb + "");
				} else {
					JOptionPane.showMessageDialog(this, "Erreur de saisie (NTB == 0)");
					this.txtNombre.setText("");
				}
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btPour) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				nb = nb / 100;
				this.txtNombre.setText(nb + "");
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btPlusMoins) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				nb = nb * (-1);
				this.txtNombre.setText(nb + "");
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btPoint) {
			String chaine = this.txtNombre.getText();
			if (!chaine.contains(".")) {
				this.txtNombre.setText(this.txtNombre.getText() + ".");
			}
		}

		// operattion binaire
		else if (e.getSource() == this.btAdd) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.txtNombre.setText("");
				this.operateur = '+';
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btSous) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.txtNombre.setText("");
				this.operateur = '-';
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btMult) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.txtNombre.setText("");
				this.operateur = '*';
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btDiv) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.txtNombre.setText("");
				this.operateur = '/';
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		} else if (e.getSource() == this.btEgal) {
			try {
				this.nb2 = Float.parseFloat(this.txtNombre.getText());
				switch (this.operateur) {
				case '+':
					this.result = this.nb1 + this.nb2;
					break;
				case '-':
					this.result = this.nb1 - this.nb2;
					break;
				case '*':
					this.result = this.nb1 * this.nb2;
					break;
				case '/':
					if (this.nb2 == 0) {
						this.result = 0;
						JOptionPane.showMessageDialog(this, "impossible division par 0");
					} else {
						this.result = this.nb1 / this.nb2;
					}
					break;
				}
				this.txtNombre.setText(this.result + "");
			} catch (NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie !");
				this.txtNombre.setText("");
			}
		}
	}

}
