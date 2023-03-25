import javax.swing.*;
import javax.swing.plaf.synth.SynthScrollBarUI;

import org.w3c.dom.ls.LSInput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	
	public Frame() {
		super("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,300));
		Conversiones conversionesDefault = new Conversiones();
		
		setLayout(new BorderLayout());
		
		int bucle = 0;
		
		do {
			Object seleccionPesoOMasa = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión: ",				//da la opcion principal "menu de opciones"
					"Menu",JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de monedas","Conversor de Masas"}, "Selecciona");
			
			
			
			if (seleccionPesoOMasa!= null) {				//En caso de seleccionar cancelar esto no correra
				
				String seleccionPesoMasa = seleccionPesoOMasa.toString();
				if (seleccionPesoMasa == "Conversor de monedas") {
					
					String convertirAMonedas = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir");
					
					if(convertirAMonedas.matches("[0-9]+")) {
						
						 Double convertirAMonedas1 = Double.parseDouble(convertirAMonedas);
						Object seleccionDeMoneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero: ", "Monedas",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {"MXN a USD","MXN a EUR","MXN a GBP","MXN a JPY","MXN a KRW","USD a MXN","EUR a MXN","GBP a MXN","JPY a MXN", "KRW a MXN"},"MXN a EUR");
						if (seleccionDeMoneda!= null) {
							String seleccionMoneda = seleccionDeMoneda.toString();
							
							switch (seleccionMoneda) {
							case "MXN a USD":JOptionPane.showMessageDialog(null, "La conversión de Pesos Mexicanos a Dolares es: "+ conversionesDefault.MxaDolar(convertirAMonedas1) + " Dolares");
								break;
							case "MXN a EUR": JOptionPane.showMessageDialog(null, "La conversión de Pesos Mexicanos a Euros es: "+ conversionesDefault.MxaEuro(convertirAMonedas1) + " Euros");
								break;
							case "MXN a GBP": JOptionPane.showMessageDialog(null, "La conversión de Pesos Mexicanos a Libras Esterlinas es: "+ conversionesDefault.MxaLibrasEsterlinas(convertirAMonedas1) + " Libras Esterlinas");
								break;
							case "MXN a JPY": JOptionPane.showMessageDialog(null, "La conversión de Pesos Mexicanos a Yenes es: "+ conversionesDefault.MxaYenes(convertirAMonedas1) + " Yenes");
								break;
							case "MXN a KRW": JOptionPane.showMessageDialog(null, "La conversión de Pesos Mexicanos a Won es: "+ conversionesDefault.MxaWones(convertirAMonedas1) + " Wones");
								break;
							case "USD a MXN": JOptionPane.showMessageDialog(null, "La conversión de Dolares a Pesos Mexicanos es: "+ conversionesDefault.DolaraMx(convertirAMonedas1) + " Pesos Mexicanos");
								break;
							case "EUR a MXN": JOptionPane.showMessageDialog(null, "La conversión de Euros a Pesos Mexicanos es: "+ conversionesDefault.YenesaMx(convertirAMonedas1) + " Pesos Mexicanos");
								break;
							case "GBP a MXN": JOptionPane.showMessageDialog(null, "La conversión de Libras Esterlinas a Pesos Mexicanos es:: "+ conversionesDefault.LibrasEsterlinasaMx(convertirAMonedas1) + " Pesos Mexicanos");
								break;
							case "JPY a MXN": JOptionPane.showMessageDialog(null, "La conversión de Yenes a Pesos Mexicanos es: "+ conversionesDefault.YenesaMx(convertirAMonedas1) + " Pesos Mexicanos");
								break;
							case "KRW a MXN": JOptionPane.showMessageDialog(null, "La conversión de Wones a Pesos Mexicanos es: "+ conversionesDefault.WonesaMx(convertirAMonedas1) + " Pesos Mexicanos");
							break;
							default:
								break;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado"); // En caso de presionar "cancel" en el segundo showinput
							break;
						}
						
						}else {
							JOptionPane.showMessageDialog(null, "valor no válido"); //En caso de no ingresar valores numericos
						}
					
					
					
					
				}
				else {
					String convertirAMasa = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Masa que desea convertir");
					
					
					if(convertirAMasa.matches("[0-9]+")) {
						Object seleccionDeMasa = JOptionPane.showInputDialog(null, "Elije el tipo de masa a la que deseas convertir: ", "Masas",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {"Gramos a Onzas","Gramos a Libras","Gramos a Kilogramos","Gramos a Toneladas","Gramos a Libras","Onzas a Gramos","Onzas a Libras"
										,"Onzas a Kilogramos","Onzas a Toneladas","Libras a Gramos", "Libras a Onzas","Libras a Kilogramos", "Libras a Toneladas"
										, "Kilogramos a Gramos", "Kilogramos a Onzas", "Kilogramos a Libras", "Kilogramos a Toneladas", "Toneladas a Gramos", "Toneladas a Onzas"
										, "Toneladas a Libras", "Toneladas a Kilogramos"}, "Gramos a Onzas");
						Double convertirMasa = Double.parseDouble(convertirAMasa);
						
						if (seleccionDeMasa!=null) {
							String seleccionMasa = seleccionDeMasa.toString();
							
							switch (seleccionMasa) {
							case "Gramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Onzas es: "+ conversionesDefault.gramosAOz(convertirMasa) + " Onzas");
								break;
							case "Gramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Libras es: "+ conversionesDefault.gramosALibras(convertirMasa) + " Libras");
							break;
							case "Gramos a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Kilogramos es: "+ conversionesDefault.gramosAKg(convertirMasa) + " Kilogramos");
							break;
							case "Gramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Toneladas es: "+ conversionesDefault.gramosATon(convertirMasa) + " Toneladas");
							break;
							case "Onzas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Gramos es: "+ conversionesDefault.ozAgramos(convertirMasa) + " Gramos");
							break;
							case "Onzas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Libras es: "+ conversionesDefault.ozALibras(convertirMasa) + " Libras");
							break;
							case "Onzas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Kilogramos es: "+ conversionesDefault.ozAKg(convertirMasa) + " Kilogramos");
							break;
							case "Onzas a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Toneladas es: "+ conversionesDefault.ozATon(convertirMasa) + " Toneladas");
							break;
							case "Libras a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Gramos es: "+ conversionesDefault.librasaGramos(convertirMasa) + " Gramos");
							break;
							case "Libras a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Onzas es: "+ conversionesDefault.librasaOnzas(convertirMasa) + " Onzas");
							break;
							case "Libras a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Kilogramos es: "+ conversionesDefault.librasaKilos(convertirMasa) + " Kilograos");
							break;
							case "Libras a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Toneladas es: "+ conversionesDefault.librasaToneladas(convertirMasa) + " Toneladas");
							break;
							case "Kilogramos a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Gramos es: "+ conversionesDefault.kgAgramos(convertirMasa) + " Gramos");
							break;
							case "Kilogramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Onzas es: "+ conversionesDefault.kgAOz(convertirMasa) + " Onzas");
							break;
							case "Kilogramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Libras es: "+ conversionesDefault.kgALibras(convertirMasa) + " Libras");
							break;
							case "Kilogramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Toneladas es: "+ conversionesDefault.kgATon(convertirMasa) + " Toneladas");
							break;
							case "Toneladas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Gramos es: "+ conversionesDefault.tonAgramos(convertirMasa) + " Gramos");
							break;
							case "Toneladas a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Onzas es: "+ conversionesDefault.tonAoz(convertirMasa) + " Onzas");
							break;
							case "Toneladas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Libras: "+ conversionesDefault.tonALibras(convertirMasa) + " Libras");
							break;
							case "Toneladas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Kilogramos es: "+ conversionesDefault.tonaKg(convertirMasa) + " Kilogramos");
							break;
							
							default:
								break;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							break;
						}
					}else {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					
					
				
					
				}
				bucle = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				if (bucle >0) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado"); //en caso de cancelar el primer showinput
				break;
			}
			
			
		} while (bucle == 0);
		
		
		
		
	}
}