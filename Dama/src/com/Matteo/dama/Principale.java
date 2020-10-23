package com.Matteo.dama;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Principale {

	private JFrame display;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale window = new Principale();
					window.display.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principale() {
		initialize();
	}

	private void initialize() {
		display = new JFrame("GIOCO DELLA DAMA");
		display.getContentPane().setBackground(new Color(255, 248, 220));
		display.setBounds(100, 100, 1200, 650);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setLocationRelativeTo(null);
		display.getContentPane().setLayout(null);

		Action a = new Action();
		BodyElement b = new BodyElement();

// ________________________ PANNELLI A _____________________________________________________________________
		JPanel a1 = new JPanel();
		a1.setBounds(50, 50, 70, 70);

		JLabel lbl_a1 = new JLabel("");

		JPanel a2 = new JPanel();
		a2.setBounds(119, 50, 70, 70);

		JPanel a3 = new JPanel();
		a3.setBounds(188, 50, 70, 70);

		JLabel lbl_a3 = new JLabel("");

		JPanel a4 = new JPanel();
		a4.setBounds(257, 50, 70, 70);

		JPanel a5 = new JPanel();
		a5.setBounds(326, 50, 70, 70);

		JLabel lbl_a5 = new JLabel("");

		JPanel a6 = new JPanel();
		a6.setBounds(395, 50, 70, 70);

		JPanel a7 = new JPanel();
		a7.setBounds(464, 50, 70, 70);

		JLabel lbl_a7 = new JLabel("");

		JPanel a8 = new JPanel();
		a8.setBounds(533, 50, 70, 70);
// ________________________ FINE PANNELLI A ________________________________________________________________

// ________________________ PANNELLI B _____________________________________________________________________
		JPanel b1 = new JPanel();
		b1.setBounds(50, 119, 70, 70);

		JPanel b2 = new JPanel();
		b2.setBounds(119, 119, 70, 70);

		JLabel lbl_b2 = new JLabel("");

		JPanel b3 = new JPanel();
		b3.setBounds(188, 119, 70, 70);

		JPanel b4 = new JPanel();
		b4.setBounds(257, 119, 70, 70);

		JLabel lbl_b4 = new JLabel("");

		JPanel b5 = new JPanel();
		b5.setBounds(326, 119, 70, 70);

		JPanel b6 = new JPanel();
		b6.setBounds(395, 119, 70, 70);

		JLabel lbl_b6 = new JLabel("");

		JPanel b7 = new JPanel();
		b7.setBounds(464, 119, 70, 70);

		JPanel b8 = new JPanel();
		b8.setBounds(533, 119, 70, 70);

		JLabel lbl_b8 = new JLabel("");
// ________________________ FINE PANNELLI B ________________________________________________________________

// ________________________ PANNELLI C _____________________________________________________________________
		JPanel c1 = new JPanel();
		c1.setBounds(50, 188, 70, 70);

		JLabel lbl_c1 = new JLabel("");

		JPanel c2 = new JPanel();
		c2.setBounds(119, 188, 70, 70);

		JPanel c3 = new JPanel();
		c3.setBounds(188, 188, 70, 70);

		JLabel lbl_c3 = new JLabel("");

		JPanel c4 = new JPanel();
		c4.setBounds(257, 188, 70, 70);

		JPanel c5 = new JPanel();
		c5.setBounds(326, 188, 70, 70);

		JLabel lbl_c5 = new JLabel("");

		JPanel c6 = new JPanel();
		c6.setBounds(395, 188, 70, 70);

		JPanel c7 = new JPanel();
		c7.setBounds(464, 188, 70, 70);

		JLabel lbl_c7 = new JLabel("");

		JPanel c8 = new JPanel();
		c8.setBounds(533, 188, 70, 70);
// ________________________ FINE PANNELLI C ________________________________________________________________

// ________________________ PANNELLI D _____________________________________________________________________
		JPanel d1 = new JPanel();
		d1.setBounds(50, 257, 70, 70);

		JPanel d2 = new JPanel();
		d2.setBounds(119, 257, 70, 70);

		JLabel lbl_d2 = new JLabel("");

		JPanel d3 = new JPanel();
		d3.setBounds(188, 257, 70, 70);

		JPanel d4 = new JPanel();
		d4.setBounds(257, 257, 70, 70);

		JLabel lbl_d4 = new JLabel("");

		JPanel d5 = new JPanel();
		d5.setBounds(326, 257, 70, 70);

		JPanel d6 = new JPanel();
		d6.setBounds(395, 257, 70, 70);

		JLabel lbl_d6 = new JLabel("");

		JPanel d7 = new JPanel();
		d7.setBounds(464, 257, 70, 70);

		JPanel d8 = new JPanel();
		d8.setBounds(533, 257, 70, 70);

		JLabel lbl_d8 = new JLabel("");
// ___________________ FINE PANNELLI D ________________________________________________________________

// ________________________ PANNELLI E _____________________________________________________________________
		JPanel e1 = new JPanel();
		e1.setBounds(50, 326, 70, 70);

		JLabel lbl_e1 = new JLabel("");

		JPanel e2 = new JPanel();
		e2.setBounds(119, 326, 70, 70);

		JPanel e3 = new JPanel();
		e3.setBounds(188, 326, 70, 70);

		JLabel lbl_e3 = new JLabel("");

		JPanel e4 = new JPanel();
		e4.setBounds(257, 326, 70, 70);

		JPanel e5 = new JPanel();
		e5.setBounds(326, 326, 70, 70);

		JLabel lbl_e5 = new JLabel("");

		JPanel e6 = new JPanel();
		e6.setBounds(395, 326, 70, 70);

		JPanel e7 = new JPanel();
		e7.setBounds(464, 326, 70, 70);

		JLabel lbl_e7 = new JLabel("");

		JPanel e8 = new JPanel();
		e8.setBounds(533, 326, 70, 70);
// ________________________ FINE PANNELLI E ________________________________________________________________

// ________________________ PANNELLI F _____________________________________________________________________
		JPanel f1 = new JPanel();
		f1.setBounds(50, 395, 70, 70);

		JPanel f2 = new JPanel();
		f2.setBounds(119, 395, 70, 70);

		JLabel lbl_f2 = new JLabel("");

		JPanel f3 = new JPanel();
		f3.setBounds(188, 395, 70, 70);

		JPanel f4 = new JPanel();
		f4.setBounds(257, 395, 70, 70);

		JLabel lbl_f4 = new JLabel("");

		JPanel f5 = new JPanel();
		f5.setBounds(326, 395, 70, 70);

		JPanel f6 = new JPanel();
		f6.setBounds(395, 395, 70, 70);

		JLabel lbl_f6 = new JLabel("");

		JPanel f7 = new JPanel();
		f7.setBounds(464, 395, 70, 70);

		JPanel f8 = new JPanel();
		f8.setBounds(533, 395, 70, 70);

		JLabel lbl_f8 = new JLabel("");
// ________________________ FINE PANNELLI F ________________________________________________________________

// ________________________ PANNELLI G _____________________________________________________________________
		JPanel g1 = new JPanel();
		g1.setBounds(50, 464, 70, 70);

		JLabel lbl_g1 = new JLabel("");

		JPanel g2 = new JPanel();
		g2.setBounds(119, 464, 70, 70);

		JPanel g3 = new JPanel();
		g3.setBounds(188, 464, 70, 70);

		JLabel lbl_g3 = new JLabel("");

		JPanel g4 = new JPanel();
		g4.setBounds(257, 464, 70, 70);

		JPanel g5 = new JPanel();
		g5.setBounds(326, 464, 70, 70);

		JLabel lbl_g5 = new JLabel("");

		JPanel g6 = new JPanel();
		g6.setBounds(395, 464, 70, 70);

		JPanel g7 = new JPanel();
		g7.setBounds(464, 464, 70, 70);

		JLabel lbl_g7 = new JLabel("");

		JPanel g8 = new JPanel();
		g8.setBounds(533, 464, 70, 70);
// ________________________ FINE PANNELLI G ________________________________________________________________

// ________________________ PANNELLI H _____________________________________________________________________
		JPanel h1 = new JPanel();
		h1.setBounds(50, 533, 70, 70);

		JPanel h2 = new JPanel();
		h2.setBounds(119, 533, 70, 70);

		JLabel lbl_h2 = new JLabel("");

		JPanel h3 = new JPanel();
		h3.setBounds(188, 533, 70, 70);

		JPanel h4 = new JPanel();
		h4.setBounds(257, 533, 70, 70);

		JLabel lbl_h4 = new JLabel("");

		JPanel h5 = new JPanel();
		h5.setBounds(326, 533, 70, 70);

		JPanel h6 = new JPanel();
		h6.setBounds(395, 533, 70, 70);

		JLabel lbl_h6 = new JLabel("");

		JPanel h7 = new JPanel();
		h7.setBounds(464, 533, 70, 70);

		JPanel h8 = new JPanel();
		h8.setBounds(533, 533, 70, 70);

		JLabel lbl_h8 = new JLabel("");
// ________________________ FINE PANNELLI H ________________________________________________________________

		JLabel lblMangiatiNeri1 = new JLabel("");
		lblMangiatiNeri1.setBounds(650, 120, 70, 70);
		b.bodyMangiati(lblMangiatiNeri1, display);

		JLabel lblMangiatiNeri2 = new JLabel("");
		lblMangiatiNeri2.setBounds(680, 149, 70, 70);
		b.bodyMangiati(lblMangiatiNeri2, display);

		JLabel lblMangiatiNeri3 = new JLabel("");
		lblMangiatiNeri3.setBounds(717, 98, 70, 70);
		b.bodyMangiati(lblMangiatiNeri3, display);

		JLabel lblMangiatiNeri4 = new JLabel("");
		lblMangiatiNeri4.setBounds(717, 149, 70, 70);
		b.bodyMangiati(lblMangiatiNeri4, display);

		JLabel lblMangiatiNeri5 = new JLabel("");
		lblMangiatiNeri5.setBounds(773, 149, 70, 70);
		b.bodyMangiati(lblMangiatiNeri5, display);

		JLabel lblMangiatiNeri6 = new JLabel("");
		lblMangiatiNeri6.setBounds(786, 114, 70, 70);
		b.bodyMangiati(lblMangiatiNeri6, display);

		JLabel lblMangiatiNeri7 = new JLabel("");
		lblMangiatiNeri7.setBounds(832, 98, 70, 70);
		b.bodyMangiati(lblMangiatiNeri7, display);

		JLabel lblMangiatiNeri8 = new JLabel("");
		lblMangiatiNeri8.setBounds(855, 120, 70, 70);
		b.bodyMangiati(lblMangiatiNeri8, display);

		JLabel lblMangiatiNeri9 = new JLabel("");
		lblMangiatiNeri9.setBounds(832, 166, 70, 70);
		b.bodyMangiati(lblMangiatiNeri9, display);

		JLabel lblMangiatiNeri10 = new JLabel("");
		lblMangiatiNeri10.setBounds(880, 149, 70, 70);
		b.bodyMangiati(lblMangiatiNeri10, display);

		JLabel lblMangiatiNeri11 = new JLabel("");
		lblMangiatiNeri11.setBounds(902, 98, 70, 70);
		b.bodyMangiati(lblMangiatiNeri11, display);

		JLabel lblMangiatiNeri12 = new JLabel("");
		lblMangiatiNeri12.setBounds(927, 127, 70, 70);
		b.bodyMangiati(lblMangiatiNeri12, display);

		JLabel lblMangiatiRossi1 = new JLabel("");
		lblMangiatiRossi1.setBounds(650, 474, 70, 70);
		b.bodyMangiati(lblMangiatiRossi1, display);

		JLabel lblMangiatiRossi2 = new JLabel("");
		lblMangiatiRossi2.setBounds(680, 503, 70, 70);
		b.bodyMangiati(lblMangiatiRossi2, display);

		JLabel lblMangiatiRossi3 = new JLabel("");
		lblMangiatiRossi3.setBounds(717, 452, 70, 70);
		b.bodyMangiati(lblMangiatiRossi3, display);

		JLabel lblMangiatiRossi4 = new JLabel("");
		lblMangiatiRossi4.setBounds(717, 503, 70, 70);
		b.bodyMangiati(lblMangiatiRossi4, display);

		JLabel lblMangiatiRossi5 = new JLabel("");
		lblMangiatiRossi5.setBounds(773, 503, 70, 70);
		b.bodyMangiati(lblMangiatiRossi5, display);

		JLabel lblMangiatiRossi6 = new JLabel("");
		lblMangiatiRossi6.setBounds(786, 468, 70, 70);
		b.bodyMangiati(lblMangiatiRossi6, display);

		JLabel lblMangiatiRossi7 = new JLabel("");
		lblMangiatiRossi7.setBounds(832, 452, 70, 70);
		b.bodyMangiati(lblMangiatiRossi7, display);

		JLabel lblMangiatiRossi8 = new JLabel("");
		lblMangiatiRossi8.setBounds(855, 474, 70, 70);
		b.bodyMangiati(lblMangiatiRossi8, display);

		JLabel lblMangiatiRossi9 = new JLabel("");
		lblMangiatiRossi9.setBounds(832, 520, 70, 70);
		b.bodyMangiati(lblMangiatiRossi9, display);

		JLabel lblMangiatiRossi10 = new JLabel("");
		lblMangiatiRossi10.setBounds(891, 452, 70, 70);
		b.bodyMangiati(lblMangiatiRossi10, display);

		JLabel lblMangiatiRossi11 = new JLabel("");
		lblMangiatiRossi11.setBounds(919, 435, 70, 70);
		b.bodyMangiati(lblMangiatiRossi11, display);

		JLabel lblMangiatiRossi12 = new JLabel("");
		lblMangiatiRossi12.setBounds(944, 464, 70, 70);
		b.bodyMangiati(lblMangiatiRossi12, display);

		JLabel lblTitolo = new JLabel("Gioco della dama");
		b.bodyTitolo(lblTitolo, display);

// ________________________ CORPO LABEL e PANNELLI _________________________________________________________
		b.bodyCombo(display, a1, lbl_a1);
		b.bodyPanel(display, a2);
		b.bodyCombo(display, a3, lbl_a3);
		b.bodyPanel(display, a4);
		b.bodyCombo(display, a5, lbl_a5);
		b.bodyPanel(display, a6);
		b.bodyCombo(display, a7, lbl_a7);
		b.bodyPanel(display, a8);

		b.bodyPanel(display, b1);
		b.bodyCombo(display, b2, lbl_b2);
		b.bodyPanel(display, b3);
		b.bodyCombo(display, b4, lbl_b4);
		b.bodyPanel(display, b5);
		b.bodyCombo(display, b6, lbl_b6);
		b.bodyPanel(display, b7);
		b.bodyCombo(display, b8, lbl_b8);

		b.bodyCombo(display, c1, lbl_c1);
		b.bodyPanel(display, c2);
		b.bodyCombo(display, c3, lbl_c3);
		b.bodyPanel(display, c4);
		b.bodyCombo(display, c5, lbl_c5);
		b.bodyPanel(display, c6);
		b.bodyCombo(display, c7, lbl_c7);
		b.bodyPanel(display, c8);

		b.bodyPanel(display, d1);
		b.bodyCombo(display, d2, lbl_d2);
		b.bodyPanel(display, d3);
		b.bodyCombo(display, d4, lbl_d4);
		b.bodyPanel(display, d5);
		b.bodyCombo(display, d6, lbl_d6);
		b.bodyPanel(display, d7);
		b.bodyCombo(display, d8, lbl_d8);

		b.bodyCombo(display, e1, lbl_e1);
		b.bodyPanel(display, e2);
		b.bodyCombo(display, e3, lbl_e3);
		b.bodyPanel(display, e4);
		b.bodyCombo(display, e5, lbl_e5);
		b.bodyPanel(display, e6);
		b.bodyCombo(display, e7, lbl_e7);
		b.bodyPanel(display, e8);

		b.bodyPanel(display, f1);
		b.bodyCombo(display, f2, lbl_f2);
		b.bodyPanel(display, f3);
		b.bodyCombo(display, f4, lbl_f4);
		b.bodyPanel(display, f5);
		b.bodyCombo(display, f6, lbl_f6);
		b.bodyPanel(display, f7);
		b.bodyCombo(display, f8, lbl_f8);

		b.bodyCombo(display, g1, lbl_g1);
		b.bodyPanel(display, g2);
		b.bodyCombo(display, g3, lbl_g3);
		b.bodyPanel(display, g4);
		b.bodyCombo(display, g5, lbl_g5);
		b.bodyPanel(display, g6);
		b.bodyCombo(display, g7, lbl_g7);
		b.bodyPanel(display, g8);

		b.bodyPanel(display, h1);
		b.bodyCombo(display, h2, lbl_h2);
		b.bodyPanel(display, h3);
		b.bodyCombo(display, h4, lbl_h4);
		b.bodyPanel(display, h5);
		b.bodyCombo(display, h6, lbl_h6);
		b.bodyPanel(display, h7);
		b.bodyCombo(display, h8, lbl_h8);

// ____________________________________ LABEL COORDINATE __________________________________________________
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(6, 50, 43, 70);
		display.getContentPane().add(lblA);

		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(6, 119, 43, 70);
		display.getContentPane().add(lblB);

		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(6, 188, 43, 70);
		display.getContentPane().add(lblC);

		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setBounds(6, 257, 43, 70);
		display.getContentPane().add(lblD);

		JLabel lblE = new JLabel("E");
		lblE.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setBounds(6, 326, 43, 70);
		display.getContentPane().add(lblE);

		JLabel lblF = new JLabel("F");
		lblF.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setBounds(6, 395, 43, 70);
		display.getContentPane().add(lblF);

		JLabel lblG = new JLabel("G");
		lblG.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setBounds(6, 464, 43, 70);
		display.getContentPane().add(lblG);

		JLabel lblH = new JLabel("H");
		lblH.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setBounds(6, 533, 43, 70);
		display.getContentPane().add(lblH);

		JLabel lbl1 = new JLabel("1");
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(50, 20, 70, 24);
		display.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("2");
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(119, 20, 70, 24);
		display.getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("3");
		lbl3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(188, 20, 70, 24);
		display.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("4");
		lbl4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(257, 20, 70, 24);
		display.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("5");
		lbl5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setBounds(326, 20, 70, 24);
		display.getContentPane().add(lbl5);

		JLabel lbl6 = new JLabel("6");
		lbl6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setBounds(395, 20, 70, 24);
		display.getContentPane().add(lbl6);

		JLabel lbl7 = new JLabel("7");
		lbl7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setBounds(464, 20, 70, 24);
		display.getContentPane().add(lbl7);

		JLabel lbl8 = new JLabel("8");
		lbl8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setBounds(533, 20, 70, 24);
		display.getContentPane().add(lbl8);

		JLabel lblNewGame = new JLabel("New Game");

		JLabel lblReset = new JLabel("Cancel");

// ________________________ INTERAZIONI LABEL e PANNELLI ___________________________________________________
		a.colorPanel(lbl_a1, a1);
		a.colorPanel(lbl_a3, a3);
		a.colorPanel(lbl_a5, a5);
		a.colorPanel(lbl_a7, a7);

		a.colorPanel(lbl_b2, b2);
		a.colorPanel(lbl_b4, b4);
		a.colorPanel(lbl_b6, b6);
		a.colorPanel(lbl_b8, b8);

		a.colorPanel(lbl_c1, c1);
		a.colorPanel(lbl_c3, c3);
		a.colorPanel(lbl_c5, c5);
		a.colorPanel(lbl_c7, c7);

		a.colorPanel(lbl_d2, d2);
		a.colorPanel(lbl_d4, d4);
		a.colorPanel(lbl_d6, d6);
		a.colorPanel(lbl_d8, d8);

		a.colorPanel(lbl_e1, e1);
		a.colorPanel(lbl_e3, e3);
		a.colorPanel(lbl_e5, e5);
		a.colorPanel(lbl_e7, e7);

		a.colorPanel(lbl_f2, f2);
		a.colorPanel(lbl_f4, f4);
		a.colorPanel(lbl_f6, f6);
		a.colorPanel(lbl_f8, f8);

		a.colorPanel(lbl_g1, g1);
		a.colorPanel(lbl_g3, g3);
		a.colorPanel(lbl_g5, g5);
		a.colorPanel(lbl_g7, g7);

		a.colorPanel(lbl_h2, h2);
		a.colorPanel(lbl_h4, h4);
		a.colorPanel(lbl_h6, h6);
		a.colorPanel(lbl_h8, h8);

		a.selectPanel(lbl_a1, a1, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_a3, a3, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_a5, a5, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_a7, a7, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_b2, b2, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_b4, b4, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_b6, b6, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_b8, b8, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_c1, c1, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_c3, c3, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_c5, c5, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_c7, c7, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_d2, d2, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_d4, d4, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_d6, d6, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_d8, d8, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_e1, e1, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_e3, e3, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_e5, e5, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_e7, e7, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_f2, f2, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_f4, f4, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_f6, f6, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_f8, f8, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_g1, g1, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_g3, g3, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_g5, g5, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_g7, g7, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.selectPanel(lbl_h2, h2, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_h4, h4, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_h6, h6, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);
		a.selectPanel(lbl_h8, h8, lblTitolo, lblMangiatiNeri1, lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4,
				lblMangiatiNeri5, lblMangiatiNeri6, lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9,
				lblMangiatiNeri10, lblMangiatiNeri11, lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2,
				lblMangiatiRossi3, lblMangiatiRossi4, lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7,
				lblMangiatiRossi8, lblMangiatiRossi9, lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12);

		a.newGame(lblNewGame, display, lbl_a1, lbl_a3, lbl_a5, lbl_a7, lbl_b2, lbl_b4, lbl_b6, lbl_b8, lbl_c1, lbl_c3,
				lbl_c5, lbl_c7, lbl_d2, lbl_d4, lbl_d6, lbl_d8, lbl_e1, lbl_e3, lbl_e5, lbl_e7, lbl_f2, lbl_f4, lbl_f6,
				lbl_f8, lbl_g1, lbl_g3, lbl_g5, lbl_g7, lbl_h2, lbl_h4, lbl_h6, lbl_h8, lblMangiatiNeri1,
				lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4, lblMangiatiNeri5, lblMangiatiNeri6,
				lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9, lblMangiatiNeri10, lblMangiatiNeri11,
				lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2, lblMangiatiRossi3, lblMangiatiRossi4,
				lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7, lblMangiatiRossi8, lblMangiatiRossi9,
				lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12, lblTitolo);

		a.resetGame(lblReset, display, lbl_a1, lbl_a3, lbl_a5, lbl_a7, lbl_b2, lbl_b4, lbl_b6, lbl_b8, lbl_c1, lbl_c3,
				lbl_c5, lbl_c7, lbl_d2, lbl_d4, lbl_d6, lbl_d8, lbl_e1, lbl_e3, lbl_e5, lbl_e7, lbl_f2, lbl_f4, lbl_f6,
				lbl_f8, lbl_g1, lbl_g3, lbl_g5, lbl_g7, lbl_h2, lbl_h4, lbl_h6, lbl_h8, lblMangiatiNeri1,
				lblMangiatiNeri2, lblMangiatiNeri3, lblMangiatiNeri4, lblMangiatiNeri5, lblMangiatiNeri6,
				lblMangiatiNeri7, lblMangiatiNeri8, lblMangiatiNeri9, lblMangiatiNeri10, lblMangiatiNeri11,
				lblMangiatiNeri12, lblMangiatiRossi1, lblMangiatiRossi2, lblMangiatiRossi3, lblMangiatiRossi4,
				lblMangiatiRossi5, lblMangiatiRossi6, lblMangiatiRossi7, lblMangiatiRossi8, lblMangiatiRossi9,
				lblMangiatiRossi10, lblMangiatiRossi11, lblMangiatiRossi12, lblTitolo);
	}
}
