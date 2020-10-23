package com.Matteo.dama;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class BodyElement {

	public void bodyCombo(JFrame display, JPanel panel, JLabel label) {
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(205, 133, 63));
		display.getContentPane().add(panel);
		panel.setLayout(null);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 70, 70);
		panel.add(label);
	}

	public void bodyPanel(JFrame display, JPanel panel) {
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		panel.setBackground(new Color(255, 228, 181));
		display.getContentPane().add(panel);
	}

	public void bodyTitolo(JLabel label, JFrame display) {
		label.setFont(new Font("Beautiful Heart", Font.PLAIN, 90));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(618, 257, 576, 166);
		display.getContentPane().add(label);
	}

	public void bodyMangiati(JLabel label, JFrame display) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		display.getContentPane().add(label);
	}

}
