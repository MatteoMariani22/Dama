package com.Matteo.dama;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class Action {

	JLabel labelSelezionata;
	boolean click = false;
	boolean clickPedinaNera = false;
	boolean clickPedinaRossa = false;
	boolean clickPedinaNeraDoppia = false;
	boolean clickPedinaRossaDoppia = false;
	boolean togliPedinaNeraMangiata = false;
	boolean togliPedinaRossaMangiata = false;
	boolean vittoriaNera = false;
	boolean vittoriaRossa = false;
	boolean error = false;
	Icon icona;

	LoadImage l = new LoadImage();
	String pedinaNera = l.pedinaNera.toString();
	String pedinaRossa = l.pedinaRossa.toString();
	String pedinaNeraDoppia = l.pedinaNeraDoppia.toString();
	String pedinaRossaDoppia = l.pedinaRossaDoppia.toString();

	Icon iconaPassata;
	JLabel labelPassata;

	public void colorPanel(JLabel label, JPanel panel) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
				panel.setBackground(new java.awt.Color(165, 77, 0));
				if (label.getIcon() != null) {
					iconaPassata = label.getIcon();
					labelPassata = label;
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.setBackground(new Color(205, 133, 63));
			}
		});
	}

	public void selectPanel(JLabel label, JPanel panel, JLabel titolo, JLabel mangiati1N, JLabel mangiati2N,
			JLabel mangiati3N, JLabel mangiati4N, JLabel mangiati5N, JLabel mangiati6N, JLabel mangiati7N,
			JLabel mangiati8N, JLabel mangiati9N, JLabel mangiati10N, JLabel mangiati11N, JLabel mangiati12N,
			JLabel mangiati1R, JLabel mangiati2R, JLabel mangiati3R, JLabel mangiati4R, JLabel mangiati5R,
			JLabel mangiati6R, JLabel mangiati7R, JLabel mangiati8R, JLabel mangiati9R, JLabel mangiati10R,
			JLabel mangiati11R, JLabel mangiati12R) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (click == true && clickPedinaNera == true) {
					System.out.println("secondo click con pedina nera");

					if (label.getIcon() == null) {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.GREEN));

						if (panel.getX() == 119 && panel.getY() == 533) {
							label.setIcon(l.pedinaNeraDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaNeraMangiata = true;
						} else if (panel.getX() == 257 && panel.getY() == 533) {
							label.setIcon(l.pedinaNeraDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaNeraMangiata = true;
						} else if (panel.getX() == 395 && panel.getY() == 533) {
							label.setIcon(l.pedinaNeraDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaNeraMangiata = true;
						} else if (panel.getX() == 533 && panel.getY() == 533) {
							label.setIcon(l.pedinaNeraDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaNeraMangiata = true;
						} else {
							label.setIcon(icona);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
						}
					} else {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.RED));
						labelSelezionata = null;
						icona = null;
						click = false;
						clickPedinaNera = false;
						clickPedinaRossa = false;
						clickPedinaNeraDoppia = false;
						clickPedinaRossaDoppia = false;
						error = true;
					}

					if (iconaPassata != null && iconaPassata.toString() != l.pedinaNera.toString()
							&& iconaPassata.toString() != l.pedinaNeraDoppia.toString() && error == false) {

						if (iconaPassata.toString().equals(l.pedinaRossaDoppia.toString())) {
							System.out.println("trovata una pedina doppia");
							if (mangiati1N.getIcon() == null) {
								mangiati1N.setIcon(l.pedinaRossa);
								mangiati2N.setIcon(l.pedinaRossa);
							} else if (mangiati2N.getIcon() == null) {
								mangiati2N.setIcon(l.pedinaRossa);
								mangiati3N.setIcon(l.pedinaRossa);
							} else if (mangiati3N.getIcon() == null) {
								mangiati3N.setIcon(l.pedinaRossa);
								mangiati4N.setIcon(l.pedinaRossa);
							} else if (mangiati4N.getIcon() == null) {
								mangiati4N.setIcon(l.pedinaRossa);
								mangiati5N.setIcon(l.pedinaRossa);
							} else if (mangiati5N.getIcon() == null) {
								mangiati5N.setIcon(l.pedinaRossa);
								mangiati6N.setIcon(l.pedinaRossa);
							} else if (mangiati6N.getIcon() == null) {
								mangiati6N.setIcon(l.pedinaRossa);
								mangiati7N.setIcon(l.pedinaRossa);
							} else if (mangiati7N.getIcon() == null) {
								mangiati7N.setIcon(l.pedinaRossa);
								mangiati8N.setIcon(l.pedinaRossa);
							} else if (mangiati8N.getIcon() == null) {
								mangiati8N.setIcon(l.pedinaRossa);
								mangiati9N.setIcon(l.pedinaRossa);
							} else if (mangiati9N.getIcon() == null) {
								mangiati9N.setIcon(l.pedinaRossa);
								mangiati10N.setIcon(l.pedinaRossa);
							} else if (mangiati10N.getIcon() == null) {
								mangiati10N.setIcon(l.pedinaRossa);
								mangiati11N.setIcon(l.pedinaRossa);
							} else if (mangiati11N.getIcon() == null) {
								mangiati11N.setIcon(l.pedinaRossa);
								mangiati12N.setIcon(l.pedinaRossa);

								vittoriaNera = true;
							}

						} else {

							if (mangiati1N.getIcon() == null) {
								mangiati1N.setIcon(iconaPassata);
							} else if (mangiati2N.getIcon() == null) {
								mangiati2N.setIcon(iconaPassata);
							} else if (mangiati3N.getIcon() == null) {
								mangiati3N.setIcon(iconaPassata);
							} else if (mangiati4N.getIcon() == null) {
								mangiati4N.setIcon(iconaPassata);
							} else if (mangiati5N.getIcon() == null) {
								mangiati5N.setIcon(iconaPassata);
							} else if (mangiati6N.getIcon() == null) {
								mangiati6N.setIcon(iconaPassata);
							} else if (mangiati7N.getIcon() == null) {
								mangiati7N.setIcon(iconaPassata);
							} else if (mangiati8N.getIcon() == null) {
								mangiati8N.setIcon(iconaPassata);
							} else if (mangiati9N.getIcon() == null) {
								mangiati9N.setIcon(iconaPassata);
							} else if (mangiati10N.getIcon() == null) {
								mangiati10N.setIcon(iconaPassata);
							} else if (mangiati11N.getIcon() == null) {
								mangiati11N.setIcon(iconaPassata);
							} else if (mangiati12N.getIcon() == null) {
								mangiati12N.setIcon(iconaPassata);
								vittoriaNera = true;
							}
						}
						iconaPassata = null;
						labelPassata.setIcon(null);
					}

				} else if (click == true && clickPedinaNeraDoppia == true) {
					System.out.println("secondo click con pedina nera Doppia");

					if (label.getIcon() == null) {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.GREEN));

						label.setIcon(icona);
						click = false;
						clickPedinaNeraDoppia = false;
						labelSelezionata.setIcon(null);

					} else {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.RED));
						labelSelezionata = null;
						icona = null;
						click = false;
						clickPedinaNera = false;
						clickPedinaRossa = false;
						clickPedinaNeraDoppia = false;
						clickPedinaRossaDoppia = false;
						error = true;
					}

					if (iconaPassata != null && iconaPassata.toString() != l.pedinaNeraDoppia.toString()
							&& iconaPassata.toString() != l.pedinaNera.toString() && error == false) {

						if (iconaPassata.toString().equals(l.pedinaRossaDoppia.toString())) {
							System.out.println("trovata una pedina doppia");
							if (mangiati1N.getIcon() == null) {
								mangiati1N.setIcon(l.pedinaRossa);
								mangiati2N.setIcon(l.pedinaRossa);
							} else if (mangiati2N.getIcon() == null) {
								mangiati2N.setIcon(l.pedinaRossa);
								mangiati3N.setIcon(l.pedinaRossa);
							} else if (mangiati3N.getIcon() == null) {
								mangiati3N.setIcon(l.pedinaRossa);
								mangiati4N.setIcon(l.pedinaRossa);
							} else if (mangiati4N.getIcon() == null) {
								mangiati4N.setIcon(l.pedinaRossa);
								mangiati5N.setIcon(l.pedinaRossa);
							} else if (mangiati5N.getIcon() == null) {
								mangiati5N.setIcon(l.pedinaRossa);
								mangiati6N.setIcon(l.pedinaRossa);
							} else if (mangiati6N.getIcon() == null) {
								mangiati6N.setIcon(l.pedinaRossa);
								mangiati7N.setIcon(l.pedinaRossa);
							} else if (mangiati7N.getIcon() == null) {
								mangiati7N.setIcon(l.pedinaRossa);
								mangiati8N.setIcon(l.pedinaRossa);
							} else if (mangiati8N.getIcon() == null) {
								mangiati8N.setIcon(l.pedinaRossa);
								mangiati9N.setIcon(l.pedinaRossa);
							} else if (mangiati9N.getIcon() == null) {
								mangiati9N.setIcon(l.pedinaRossa);
								mangiati10N.setIcon(l.pedinaRossa);
							} else if (mangiati10N.getIcon() == null) {
								mangiati10N.setIcon(l.pedinaRossa);
								mangiati11N.setIcon(l.pedinaRossa);
							} else if (mangiati11N.getIcon() == null) {
								mangiati11N.setIcon(l.pedinaRossa);
								mangiati12N.setIcon(l.pedinaRossa);

								vittoriaNera = true;
							}

						} else {

							if (mangiati1N.getIcon() == null) {
								mangiati1N.setIcon(iconaPassata);
							} else if (mangiati2N.getIcon() == null) {
								mangiati2N.setIcon(iconaPassata);
							} else if (mangiati3N.getIcon() == null) {
								mangiati3N.setIcon(iconaPassata);
							} else if (mangiati4N.getIcon() == null) {
								mangiati4N.setIcon(iconaPassata);
							} else if (mangiati5N.getIcon() == null) {
								mangiati5N.setIcon(iconaPassata);
							} else if (mangiati6N.getIcon() == null) {
								mangiati6N.setIcon(iconaPassata);
							} else if (mangiati7N.getIcon() == null) {
								mangiati7N.setIcon(iconaPassata);
							} else if (mangiati8N.getIcon() == null) {
								mangiati8N.setIcon(iconaPassata);
							} else if (mangiati9N.getIcon() == null) {
								mangiati9N.setIcon(iconaPassata);
							} else if (mangiati10N.getIcon() == null) {
								mangiati10N.setIcon(iconaPassata);
							} else if (mangiati11N.getIcon() == null) {
								mangiati11N.setIcon(iconaPassata);
							} else if (mangiati12N.getIcon() == null) {
								mangiati12N.setIcon(iconaPassata);
								vittoriaNera = true;
							}
						}
						iconaPassata = null;
						labelPassata.setIcon(null);
					}

				} else if (click == true && clickPedinaRossa == true) {
					System.out.println("secondo click con pedina rossa");

					if (label.getIcon() == null) {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.GREEN));

						if (panel.getX() == 50 && panel.getY() == 50) {
							label.setIcon(l.pedinaRossaDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaRossaMangiata = true;
						} else if (panel.getX() == 188 && panel.getY() == 50) {
							label.setIcon(l.pedinaRossaDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaRossaMangiata = true;
						} else if (panel.getX() == 326 && panel.getY() == 50) {
							label.setIcon(l.pedinaRossaDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaRossaMangiata = true;
						} else if (panel.getX() == 464 && panel.getY() == 50) {
							label.setIcon(l.pedinaRossaDoppia);
							click = false;
							clickPedinaNera = false;
							labelSelezionata.setIcon(null);
							togliPedinaRossaMangiata = true;
						} else {
							label.setIcon(icona);
							click = false;
							clickPedinaRossa = false;
							labelSelezionata.setIcon(null);
						}
					} else {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.RED));
						labelSelezionata = null;
						icona = null;
						click = false;
						clickPedinaNera = false;
						clickPedinaRossa = false;
						clickPedinaNeraDoppia = false;
						clickPedinaRossaDoppia = false;
						error = true;
					}

					if (iconaPassata != null && iconaPassata.toString() != l.pedinaRossa.toString()
							&& iconaPassata.toString() != l.pedinaRossaDoppia.toString() && error == false) {

						if (iconaPassata.toString().equals(l.pedinaNeraDoppia.toString())) {
							System.out.println("trovata una pedina doppia");
							if (mangiati1R.getIcon() == null) {
								mangiati1R.setIcon(l.pedinaNera);
								mangiati2R.setIcon(l.pedinaNera);
							} else if (mangiati2R.getIcon() == null) {
								mangiati2R.setIcon(l.pedinaNera);
								mangiati3R.setIcon(l.pedinaNera);
							} else if (mangiati3R.getIcon() == null) {
								mangiati3R.setIcon(l.pedinaNera);
								mangiati4R.setIcon(l.pedinaNera);
							} else if (mangiati4R.getIcon() == null) {
								mangiati4R.setIcon(l.pedinaNera);
								mangiati5R.setIcon(l.pedinaNera);
							} else if (mangiati5R.getIcon() == null) {
								mangiati5R.setIcon(l.pedinaNera);
								mangiati6R.setIcon(l.pedinaNera);
							} else if (mangiati6R.getIcon() == null) {
								mangiati6R.setIcon(l.pedinaNera);
								mangiati7R.setIcon(l.pedinaNera);
							} else if (mangiati7R.getIcon() == null) {
								mangiati7R.setIcon(l.pedinaNera);
								mangiati8R.setIcon(l.pedinaNera);
							} else if (mangiati8R.getIcon() == null) {
								mangiati8R.setIcon(l.pedinaNera);
								mangiati9R.setIcon(l.pedinaNera);
							} else if (mangiati9R.getIcon() == null) {
								mangiati9R.setIcon(l.pedinaNera);
								mangiati10R.setIcon(l.pedinaNera);
							} else if (mangiati10R.getIcon() == null) {
								mangiati10R.setIcon(l.pedinaNera);
								mangiati11R.setIcon(l.pedinaNera);
							} else if (mangiati11R.getIcon() == null) {
								mangiati11R.setIcon(l.pedinaNera);
								mangiati12R.setIcon(l.pedinaNera);

								vittoriaRossa = true;
							}
						} else {

							if (mangiati1R.getIcon() == null) {
								mangiati1R.setIcon(iconaPassata);
							} else if (mangiati2R.getIcon() == null) {
								mangiati2R.setIcon(iconaPassata);
							} else if (mangiati3R.getIcon() == null) {
								mangiati3R.setIcon(iconaPassata);
							} else if (mangiati4R.getIcon() == null) {
								mangiati4R.setIcon(iconaPassata);
							} else if (mangiati5R.getIcon() == null) {
								mangiati5R.setIcon(iconaPassata);
							} else if (mangiati6R.getIcon() == null) {
								mangiati6R.setIcon(iconaPassata);
							} else if (mangiati7R.getIcon() == null) {
								mangiati7R.setIcon(iconaPassata);
							} else if (mangiati8R.getIcon() == null) {
								mangiati8R.setIcon(iconaPassata);
							} else if (mangiati9R.getIcon() == null) {
								mangiati9R.setIcon(iconaPassata);
							} else if (mangiati10R.getIcon() == null) {
								mangiati10R.setIcon(iconaPassata);
							} else if (mangiati11R.getIcon() == null) {
								mangiati11R.setIcon(iconaPassata);
							} else if (mangiati12R.getIcon() == null) {
								mangiati12R.setIcon(iconaPassata);
								vittoriaRossa = true;
							}
						}
						iconaPassata = null;
						labelPassata.setIcon(null);
					}

				} else if (click == true && clickPedinaRossaDoppia == true) {
					System.out.println("secondo click con pedina rossa Doppia");

					if (label.getIcon() == null) {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.GREEN));

						label.setIcon(icona);
						click = false;
						clickPedinaRossaDoppia = false;
						labelSelezionata.setIcon(null);

					} else {
						panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.RED));
						labelSelezionata = null;
						icona = null;
						click = false;
						clickPedinaNera = false;
						clickPedinaRossa = false;
						clickPedinaNeraDoppia = false;
						clickPedinaRossaDoppia = false;
						error = true;
					}

					if (iconaPassata != null && iconaPassata.toString() != l.pedinaRossaDoppia.toString()
							&& iconaPassata.toString() != l.pedinaRossa.toString() && error == false) {

						if (iconaPassata.toString().equals(l.pedinaNeraDoppia.toString())) {
							System.out.println("trovata una pedina doppia");
							if (mangiati1R.getIcon() == null) {
								mangiati1R.setIcon(l.pedinaNera);
								mangiati2R.setIcon(l.pedinaNera);
							} else if (mangiati2R.getIcon() == null) {
								mangiati2R.setIcon(l.pedinaNera);
								mangiati3R.setIcon(l.pedinaNera);
							} else if (mangiati3R.getIcon() == null) {
								mangiati3R.setIcon(l.pedinaNera);
								mangiati4R.setIcon(l.pedinaNera);
							} else if (mangiati4R.getIcon() == null) {
								mangiati4R.setIcon(l.pedinaNera);
								mangiati5R.setIcon(l.pedinaNera);
							} else if (mangiati5R.getIcon() == null) {
								mangiati5R.setIcon(l.pedinaNera);
								mangiati6R.setIcon(l.pedinaNera);
							} else if (mangiati6R.getIcon() == null) {
								mangiati6R.setIcon(l.pedinaNera);
								mangiati7R.setIcon(l.pedinaNera);
							} else if (mangiati7R.getIcon() == null) {
								mangiati7R.setIcon(l.pedinaNera);
								mangiati8R.setIcon(l.pedinaNera);
							} else if (mangiati8R.getIcon() == null) {
								mangiati8R.setIcon(l.pedinaNera);
								mangiati9R.setIcon(l.pedinaNera);
							} else if (mangiati9R.getIcon() == null) {
								mangiati9R.setIcon(l.pedinaNera);
								mangiati10R.setIcon(l.pedinaNera);
							} else if (mangiati10R.getIcon() == null) {
								mangiati10R.setIcon(l.pedinaNera);
								mangiati11R.setIcon(l.pedinaNera);
							} else if (mangiati11R.getIcon() == null) {
								mangiati11R.setIcon(l.pedinaNera);
								mangiati12R.setIcon(l.pedinaNera);

								vittoriaRossa = true;
							}
						} else {

							if (mangiati1R.getIcon() == null) {
								mangiati1R.setIcon(iconaPassata);
							} else if (mangiati2R.getIcon() == null) {
								mangiati2R.setIcon(iconaPassata);
							} else if (mangiati3R.getIcon() == null) {
								mangiati3R.setIcon(iconaPassata);
							} else if (mangiati4R.getIcon() == null) {
								mangiati4R.setIcon(iconaPassata);
							} else if (mangiati5R.getIcon() == null) {
								mangiati5R.setIcon(iconaPassata);
							} else if (mangiati6R.getIcon() == null) {
								mangiati6R.setIcon(iconaPassata);
							} else if (mangiati7R.getIcon() == null) {
								mangiati7R.setIcon(iconaPassata);
							} else if (mangiati8R.getIcon() == null) {
								mangiati8R.setIcon(iconaPassata);
							} else if (mangiati9R.getIcon() == null) {
								mangiati9R.setIcon(iconaPassata);
							} else if (mangiati10R.getIcon() == null) {
								mangiati10R.setIcon(iconaPassata);
							} else if (mangiati11R.getIcon() == null) {
								mangiati11R.setIcon(iconaPassata);
							} else if (mangiati12R.getIcon() == null) {
								mangiati12R.setIcon(iconaPassata);
								vittoriaRossa = true;
							}
						}
						iconaPassata = null;
						labelPassata.setIcon(null);
					}

				} else if (click == false) {
					System.out.println("primo click");
					panel.setBorder(new MatteBorder(6, 6, 6, 6, Color.GREEN));
					togliPedinaNeraMangiata = false;
					togliPedinaRossaMangiata = false;
					if (label.getIcon() != null) {
						labelSelezionata = label;
						icona = label.getIcon();
						click = true;
						error = false;
						if (icona.toString().equals(pedinaNera)) {
							clickPedinaNera = true;
						} else if (icona.toString().equals(pedinaRossa)) {
							clickPedinaRossa = true;
						} else if (icona.toString().equals(pedinaNeraDoppia)) {
							clickPedinaNeraDoppia = true;
						} else if (icona.toString().equals(pedinaRossaDoppia)) {
							clickPedinaRossaDoppia = true;
						}
					}
				}

				if (togliPedinaNeraMangiata == true) {

					if (mangiati12R.getIcon() != null) {
						mangiati12R.setIcon(null);
					} else if (mangiati11R.getIcon() != null) {
						mangiati11R.setIcon(null);
					} else if (mangiati10R.getIcon() != null) {
						mangiati10R.setIcon(null);
					} else if (mangiati9R.getIcon() != null) {
						mangiati9R.setIcon(null);
					} else if (mangiati8R.getIcon() != null) {
						mangiati8R.setIcon(null);
					} else if (mangiati7R.getIcon() != null) {
						mangiati7R.setIcon(null);
					} else if (mangiati6R.getIcon() != null) {
						mangiati6R.setIcon(null);
					} else if (mangiati5R.getIcon() != null) {
						mangiati5R.setIcon(null);
					} else if (mangiati4R.getIcon() != null) {
						mangiati4R.setIcon(null);
					} else if (mangiati3R.getIcon() != null) {
						mangiati3R.setIcon(null);
					} else if (mangiati2R.getIcon() != null) {
						mangiati2R.setIcon(null);
					} else if (mangiati1R.getIcon() != null) {
						mangiati1R.setIcon(null);
					}

				} else if (togliPedinaRossaMangiata == true) {

					if (mangiati12N.getIcon() != null) {
						mangiati12N.setIcon(null);
					} else if (mangiati11N.getIcon() != null) {
						mangiati11N.setIcon(null);
					} else if (mangiati10N.getIcon() != null) {
						mangiati10N.setIcon(null);
					} else if (mangiati9N.getIcon() != null) {
						mangiati9N.setIcon(null);
					} else if (mangiati8N.getIcon() != null) {
						mangiati8N.setIcon(null);
					} else if (mangiati7N.getIcon() != null) {
						mangiati7N.setIcon(null);
					} else if (mangiati6N.getIcon() != null) {
						mangiati6N.setIcon(null);
					} else if (mangiati5N.getIcon() != null) {
						mangiati5N.setIcon(null);
					} else if (mangiati4N.getIcon() != null) {
						mangiati4N.setIcon(null);
					} else if (mangiati3N.getIcon() != null) {
						mangiati3N.setIcon(null);
					} else if (mangiati2N.getIcon() != null) {
						mangiati2N.setIcon(null);
					} else if (mangiati1N.getIcon() != null) {
						mangiati1N.setIcon(null);
					}
				}

				if (vittoriaNera == true) {
					titolo.setFont(new Font("Beautiful Heart", Font.PLAIN, 70));
					titolo.setText("Ha vinto la squadra nera");
					vittoriaNera = false;
				} else if (vittoriaRossa == true) {
					titolo.setFont(new Font("Beautiful Heart", Font.PLAIN, 70));
					titolo.setText("Ha vinto la squadra rossa");
					vittoriaRossa = false;
				}

			}
		});
	}

	public void newGame(JLabel label, JFrame display, JLabel a1, JLabel a3, JLabel a5, JLabel a7, JLabel b2, JLabel b4,
			JLabel b6, JLabel b8, JLabel c1, JLabel c3, JLabel c5, JLabel c7, JLabel d2, JLabel d4, JLabel d6,
			JLabel d8, JLabel e1, JLabel e3, JLabel e5, JLabel e7, JLabel f2, JLabel f4, JLabel f6, JLabel f8,
			JLabel g1, JLabel g3, JLabel g5, JLabel g7, JLabel h2, JLabel h4, JLabel h6, JLabel h8, JLabel mangiati1N,
			JLabel mangiati2N, JLabel mangiati3N, JLabel mangiati4N, JLabel mangiati5N, JLabel mangiati6N,
			JLabel mangiati7N, JLabel mangiati8N, JLabel mangiati9N, JLabel mangiati10N, JLabel mangiati11N,
			JLabel mangiati12N, JLabel mangiati1R, JLabel mangiati2R, JLabel mangiati3R, JLabel mangiati4R,
			JLabel mangiati5R, JLabel mangiati6R, JLabel mangiati7R, JLabel mangiati8R, JLabel mangiati9R,
			JLabel mangiati10R, JLabel mangiati11R, JLabel mangiati12R, JLabel titolo) {
		LoadImage l = new LoadImage();
		label.setFont(new Font("Beautiful Heart", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(700, 27, 200, 80);
		display.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.GREEN);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.BLACK);
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				a1.setIcon(l.pedinaNera);
				a3.setIcon(l.pedinaNera);
				a5.setIcon(l.pedinaNera);
				a7.setIcon(l.pedinaNera);
				b2.setIcon(l.pedinaNera);
				b4.setIcon(l.pedinaNera);
				b6.setIcon(l.pedinaNera);
				b8.setIcon(l.pedinaNera);
				c1.setIcon(l.pedinaNera);
				c3.setIcon(l.pedinaNera);
				c5.setIcon(l.pedinaNera);
				c7.setIcon(l.pedinaNera);
				d2.setIcon(null);
				d4.setIcon(null);
				d6.setIcon(null);
				d8.setIcon(null);
				e1.setIcon(null);
				e3.setIcon(null);
				e5.setIcon(null);
				e7.setIcon(null);
				f2.setIcon(l.pedinaRossa);
				f4.setIcon(l.pedinaRossa);
				f6.setIcon(l.pedinaRossa);
				f8.setIcon(l.pedinaRossa);
				g1.setIcon(l.pedinaRossa);
				g3.setIcon(l.pedinaRossa);
				g5.setIcon(l.pedinaRossa);
				g7.setIcon(l.pedinaRossa);
				h2.setIcon(l.pedinaRossa);
				h4.setIcon(l.pedinaRossa);
				h6.setIcon(l.pedinaRossa);
				h8.setIcon(l.pedinaRossa);

				mangiati1N.setIcon(null);
				mangiati2N.setIcon(null);
				mangiati3N.setIcon(null);
				mangiati4N.setIcon(null);
				mangiati5N.setIcon(null);
				mangiati6N.setIcon(null);
				mangiati7N.setIcon(null);
				mangiati8N.setIcon(null);
				mangiati9N.setIcon(null);
				mangiati10N.setIcon(null);
				mangiati11N.setIcon(null);
				mangiati12N.setIcon(null);

				mangiati1R.setIcon(null);
				mangiati2R.setIcon(null);
				mangiati3R.setIcon(null);
				mangiati4R.setIcon(null);
				mangiati5R.setIcon(null);
				mangiati6R.setIcon(null);
				mangiati7R.setIcon(null);
				mangiati8R.setIcon(null);
				mangiati9R.setIcon(null);
				mangiati10R.setIcon(null);
				mangiati11R.setIcon(null);
				mangiati12R.setIcon(null);

				labelSelezionata = null;
				click = false;
				clickPedinaNera = false;
				clickPedinaRossa = false;
				clickPedinaNeraDoppia = false;
				clickPedinaRossaDoppia = false;
				error = false;
				icona = null;
				iconaPassata = null;
				labelPassata = null;
				vittoriaNera = false;
				vittoriaRossa = false;

				titolo.setFont(new Font("Beautiful Heart", Font.PLAIN, 90));
				titolo.setText("Gioco della dama");

			}
		});
	}

	public void resetGame(JLabel label, JFrame display, JLabel a1, JLabel a3, JLabel a5, JLabel a7, JLabel b2,
			JLabel b4, JLabel b6, JLabel b8, JLabel c1, JLabel c3, JLabel c5, JLabel c7, JLabel d2, JLabel d4,
			JLabel d6, JLabel d8, JLabel e1, JLabel e3, JLabel e5, JLabel e7, JLabel f2, JLabel f4, JLabel f6,
			JLabel f8, JLabel g1, JLabel g3, JLabel g5, JLabel g7, JLabel h2, JLabel h4, JLabel h6, JLabel h8,
			JLabel mangiati1N, JLabel mangiati2N, JLabel mangiati3N, JLabel mangiati4N, JLabel mangiati5N,
			JLabel mangiati6N, JLabel mangiati7N, JLabel mangiati8N, JLabel mangiati9N, JLabel mangiati10N,
			JLabel mangiati11N, JLabel mangiati12N, JLabel mangiati1R, JLabel mangiati2R, JLabel mangiati3R,
			JLabel mangiati4R, JLabel mangiati5R, JLabel mangiati6R, JLabel mangiati7R, JLabel mangiati8R,
			JLabel mangiati9R, JLabel mangiati10R, JLabel mangiati11R, JLabel mangiati12R, JLabel titolo) {
		label.setFont(new Font("Beautiful Heart", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(960, 27, 145, 80);
		display.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.BLACK);
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				a1.setIcon(null);
				a3.setIcon(null);
				a5.setIcon(null);
				a7.setIcon(null);
				b2.setIcon(null);
				b4.setIcon(null);
				b6.setIcon(null);
				b8.setIcon(null);
				c1.setIcon(null);
				c3.setIcon(null);
				c5.setIcon(null);
				c7.setIcon(null);
				d2.setIcon(null);
				d4.setIcon(null);
				d6.setIcon(null);
				d8.setIcon(null);
				e1.setIcon(null);
				e3.setIcon(null);
				e5.setIcon(null);
				e7.setIcon(null);
				f2.setIcon(null);
				f4.setIcon(null);
				f6.setIcon(null);
				f8.setIcon(null);
				g1.setIcon(null);
				g3.setIcon(null);
				g5.setIcon(null);
				g7.setIcon(null);
				h2.setIcon(null);
				h4.setIcon(null);
				h6.setIcon(null);
				h8.setIcon(null);

				mangiati1N.setIcon(null);
				mangiati2N.setIcon(null);
				mangiati3N.setIcon(null);
				mangiati4N.setIcon(null);
				mangiati5N.setIcon(null);
				mangiati6N.setIcon(null);
				mangiati7N.setIcon(null);
				mangiati8N.setIcon(null);
				mangiati9N.setIcon(null);
				mangiati10N.setIcon(null);
				mangiati11N.setIcon(null);
				mangiati12N.setIcon(null);

				mangiati1R.setIcon(null);
				mangiati2R.setIcon(null);
				mangiati3R.setIcon(null);
				mangiati4R.setIcon(null);
				mangiati5R.setIcon(null);
				mangiati6R.setIcon(null);
				mangiati7R.setIcon(null);
				mangiati8R.setIcon(null);
				mangiati9R.setIcon(null);
				mangiati10R.setIcon(null);
				mangiati11R.setIcon(null);
				mangiati12R.setIcon(null);

				labelSelezionata = null;
				click = false;
				clickPedinaNera = false;
				clickPedinaRossa = false;
				clickPedinaNeraDoppia = false;
				clickPedinaRossaDoppia = false;
				error = false;
				icona = null;
				iconaPassata = null;
				labelPassata = null;
				vittoriaNera = false;
				vittoriaRossa = false;

				titolo.setFont(new Font("Beautiful Heart", Font.PLAIN, 90));
				titolo.setText("");

			}
		});
	}
}