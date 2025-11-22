package src.com.MAIN;

import java.awt.image.BufferedImage;

import java.io.File;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import src.com.Aritmetic.Formulari;
import src.com.DAO.Air_Lift;
import src.com.DAO.TanqueAgitado;

public class Protq extends Formulari {

	public static void main(String[] args) {
		// Presentation
		System.out.println("WELCOME INTO DIBIOR");
		// Request data input
		// We cast the POO with the name PROTOTIPE
		Scanner input3 = new Scanner(System.in);
		// Menu to choose which Bioreactor to work with
		// Select between the two options by requesting a choice
		// Select the type of Turbine
		Integer tipoBioreactorProyect1 = null;
		Integer conexts = null;
		System.out.println(
				"===================================================================================================");
		while (conexts == null) {
			System.out.println("passworkR:");
			String acces2 = input3.nextLine();
			System.out.println(
					"================================================================================================");
			if (isNumericIn(acces2)) {
				Integer accesSecound2 = Integer.parseInt(acces2);
				if (accesSecound2 == 1234) {
					conexts = accesSecound2;
					System.out.println("Is a number value");
				} else {
					System.out.println("Invalid data");
				}

			} else {
				System.out.println("Invalid value, Don't is a number");
			}
		}
		System.out.println(
				"===================================================================================================");
		System.out.println("CONNECTED");
		System.out.println(
				"===================================================================================================");
		System.out.println("WELCOME");
		while (tipoBioreactorProyect1 == null) {
			System.out.println(
					"Enter the type of Bioreactor you want to create in its numeric value:\n -1 = Air-Lift\n -2 = Stirred Tank");
			String acces2 = input3.nextLine();
			System.out.println(
					"================================================================================================");
			if (isNumericIn(acces2)) {
				Integer accesSecound2 = Integer.parseInt(acces2);
				if (accesSecound2 == -1 || accesSecound2 == -2) {
					tipoBioreactorProyect1 = accesSecound2;
					System.out.println("Is a number value");
				} else {
					System.out.println(
							"Invalid data, only the previously mentioned negative numeric options are accepted");
				}

			} else {
				System.out.println("Invalid value, Don't is a number");
			}
		}
		System.out.println(
				"===================================================================================================");
		System.out.println("Type of Bioreactor to create: " + tipoBioreactorProyect1);
		switch (tipoBioreactorProyect1) {
		case -1:

			System.out.println("Type Air-Lift");
			// We cast the POO with the name PROTOTIPE
			Air_Lift PROTOTIPE = new Air_Lift(null, null, null, null, null, null, null, null, null, null, null, null,
					null);
			// Scanner input = new Scanner(System.in);

			// Request the name of the M.O
			String microorganismoInoculo = null;
			System.out.println(
					"===================================================================================================");
			while (microorganismoInoculo == null) {
				System.out.println("Enter the name of the family and species of the M.O: ");
				String acces = input3.nextLine();
				System.out.println(
						"===================================================================================================");
				if (isString(acces)) {
					microorganismoInoculo = acces;
					System.out.println("Data stored");
				} else {
					System.out.println("Invalid value, numbers are not accepted.");
				}
			}
			System.out.println(
					"===================================================================================================");
			System.out.println("The name of the M.O is: " + microorganismoInoculo);
			PROTOTIPE.setMicroorganismoInoculo(microorganismoInoculo);

			// Request the light requirement
			String luzAplicable = null;
			System.out.println(
					"===================================================================================================");
			while (luzAplicable == null) {
				System.out.println("Does the bioreactor require light? yes or no, and what type: e.g.(Yes_Natural) (No)");
				String acces = input3.nextLine();
				System.out.println(
						"===============================================================================================");
				if (isString(acces)) {
					luzAplicable = acces;
					System.out.println("Data stored");
				} else {
					System.out.println("Invalid value, numbers are not accepted.");
				}
			}
			System.out.println(
					"===================================================================================================");
			System.out.println("Light requirement: " + luzAplicable);
			PROTOTIPE.setLuzAplicable(luzAplicable);

			// Request the developer's name
			String nombreDesarrollador = null;
			System.out.println(
					"===================================================================================================");
			while (nombreDesarrollador == null) {
				System.out.println("Enter your name: ");
				String acces = input3.nextLine();
				System.out.println(
						"===============================================================================================");
				if (isString(acces)) {
					nombreDesarrollador = acces;
					System.out.println("Data stored");
				} else {
					System.out.println("Invalid value, numbers are not accepted.");
				}
			}
			System.out.println(
					"===================================================================================================");
			System.out.println("Author: " + nombreDesarrollador);
			PROTOTIPE.setNombreDesarrollador(nombreDesarrollador);

			// Request the name of the optimal substrate
			String sustratoOptimo = null;
			System.out.println(
					"===================================================================================================");
			while (sustratoOptimo == null) {
				System.out.println("Optimal substrate for the M.O: ");
				String acces = input3.nextLine();
				System.out.println(
						"===================================================================================================");
				if (isString(acces)) {
					sustratoOptimo = acces;
					System.out.println("Data stored");
				} else {
					System.out.println("Invalid value, numbers are not accepted.");
				}
			}
			System.out.println(
					"===================================================================================================");
			System.out.println("Optimal substrate: " + sustratoOptimo);
			PROTOTIPE.setSustratoOptimo(sustratoOptimo);

			// Request optimal growth pH
			Double optimoPh = null;
			System.out.println(
			    "===================================================================================================");
			while (optimoPh == null) {
			    System.out.println("Enter the optimal growth pH: ");
			    String acces = input3.nextLine();
			    System.out.println(
			        "===================================================================================================");
			    if (isNumeric(acces)) {
			        double accesSecound = Double.parseDouble(acces);
			        if (accesSecound > 0 && accesSecound < 14.1) {
			            optimoPh = accesSecound;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers > 14 or < 1");
			        }

			    } else {
			        System.out.println("Invalid value, Don't is a number");
			    }
			}
			System.out.println(
			    "===================================================================================================");
			System.out.println("Optimal growth pH: " + optimoPh);

			PROTOTIPE.setOptimoPh(optimoPh);

			// Request what feeds the diffuser
			String difusorEntra = null;
			System.out.println(
			    "===================================================================================================");
			while (difusorEntra == null) {
			    System.out.println("What feeds the diffuser: ");
			    String acces = input3.nextLine();
			    System.out.println(
			        "=================================================================================================");
			    if (isString(acces)) {
			        difusorEntra = acces;
			        System.out.println("Data saved");
			    } else {
			        System.out.println("Invalid value, numbers are not accepted.");
			    }
			}
			System.out.println(
			    "===================================================================================================");
			System.out.println("The diffuser is fed with: " + difusorEntra);
			PROTOTIPE.setDifusorEntra(difusorEntra);

			// Request the operational percentage
			Double porcentajeOperacional = null;
			System.out.println(
			    "===================================================================================================");
			while (porcentajeOperacional == null) {
			    System.out.println("Operation percentage of AirLift: standard 0.7, 0.8, and 0.9 ");
			    String acces = input3.next();
			    System.out.println(
			        "===============================================================================================");
			    if (isNumeric(acces)) {
			        double accesSecound = Double.parseDouble(acces);
			        if (accesSecound > 0.69 && accesSecound < 0.91) {
			            porcentajeOperacional = accesSecound;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers > 0.91 or < 0.69");
			        }
			    } else {
			        System.out.println("Invalid value, Don't is a number");
			    }
			}

			System.out.println(
			    "===================================================================================================");
			System.out.println("Operation percentage is: " + porcentajeOperacional + "%");
			PROTOTIPE.setporcentajeOperacional(porcentajeOperacional);

			// Request the constant to work with operation at 80%
			Double diametroRiserConsB = null;
			System.out.println(
			    "===================================================================================================");
			while (porcentajeOperacional == 0.8) {
			    System.out.println("Select the constant Dr to work: 0.5 or 0.4");
			    String acces3 = input3.next();
			    System.out.println(
			        "===============================================================================================");
			    if (isNumeric(acces3)) {
			        double accesSecound3 = Double.parseDouble(acces3);
			        if (accesSecound3 == 0.5 || accesSecound3 == 0.4) {
			            diametroRiserConsB = accesSecound3;
			            System.out.println("Is a number value");
			            break;
			        } else {
			            System.out.println("Invalid value, don't accept numbers different from the above options");
			        }

			    } else {
			        System.out.println("Invalid value, Don't is a number");
			    }
			}

			System.out.println(
			    "===================================================================================================");
			System.out.println("Constant to work at 80 %: " + diametroRiserConsB);
			PROTOTIPE.setDiametroRiserConsB(diametroRiserConsB);

			// Request the actual Downconer diameter of the tank
			Double diametroDownconer = null;
			System.out.println(
			    "===================================================================================================");
			while (diametroDownconer == null) {
			    System.out.println("Enter the total Downconer diameter of the AirLift tank in cubic meters: ");
			    String acces2 = input3.next();
			    System.out.println(
			        "================================================================================================");
			    if (isNumeric(acces2)) {
			        double accesSecound2 = Double.parseDouble(acces2);
			        if (accesSecound2 > 0) {
			            diametroDownconer = accesSecound2;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 or < 0");
			        }

			    } else {
			        System.out.println("Invalid value, Don't is a number");
			    }
			}
			System.out.println(
			    "===================================================================================================");
			System.out.println("Total Downconer diameter: " + diametroDownconer + "m");

			PROTOTIPE.setDiametroDownconer(diametroDownconer);


			// Request the total actual height of the tank
			Double alturaTanque = null;
			System.out.println(
			    "===================================================================================================");
			while (alturaTanque == null) {
			    System.out.println("Enter the total height of the AirLift tank in meters: ");
			    String acces2 = input3.next();
			    System.out.println(
			        "================================================================================================");
			    if (isNumeric(acces2)) {
			        double accesSecound2 = Double.parseDouble(acces2);
			        if (accesSecound2 > 0) {
			            alturaTanque = accesSecound2;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 or < 0");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }
			}
			System.out.println(
			    "===================================================================================================");
			System.out.println("Total height: " + alturaTanque + "m");

			PROTOTIPE.setalturaTanque(alturaTanque);

			// Request the total actual volume of the tank
			Double pi = 3.1416;
			Double y = (PROTOTIPE.getDiametroDownconer() / 2);
			Double z = (pi * PROTOTIPE.getalturaTanque() * y);
			System.out.println("The total volume is: " + z);
			PROTOTIPE.setvolumenTotal(z);
			Double volumenOperacional = (z * porcentajeOperacional);
			PROTOTIPE.setvolumenOperacional(volumenOperacional);

			// Calculations for Dd
			if (porcentajeOperacional == 0.9) {
			    System.out.println("The downconer diameter is: " + diametroDownconer + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.5) {
			    System.out.println("The downconer diameter is: " + diametroDownconer + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.4) {
			    System.out.println("The downconer diameter is: " + diametroDownconer + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.7) {
			    System.out.println("The downconer diameter is: " + diametroDownconer + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			// Calculations for Dr
			if (porcentajeOperacional == 0.9) {
			    Double resultado = (0.6 * PROTOTIPE.getDiametroDownconer());
			    System.out.println("The riser diameter is: " + resultado + "m");
			    Double diametroRiser = resultado;
			    PROTOTIPE.setDiametroRiser(diametroRiser);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.5) {
			    Double resultado = (0.5 * PROTOTIPE.getDiametroDownconer());
			    System.out.println("The riser diameter is: " + resultado + "m");
			    Double diametroRiser = resultado;
			    PROTOTIPE.setDiametroRiser(diametroRiser);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.4) {
			    Double resultado = (0.4 * PROTOTIPE.getDiametroDownconer());
			    System.out.println("The riser diameter is: " + resultado + "m");
			    Double diametroRiser = resultado;
			    PROTOTIPE.setDiametroRiser(diametroRiser);
			}

			if (porcentajeOperacional == 0.7) {
			    Double resultado = (0.3 * PROTOTIPE.getDiametroDownconer());
			    System.out.println("The riser diameter is: " + resultado + "m");
			    Double diametroRiser = resultado;
			    PROTOTIPE.setDiametroRiser(diametroRiser);
			}

			// Calculations for total height
			if (porcentajeOperacional == 0.9) {
			    System.out.println("The total height is: " + alturaTanque + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.5) {
			    System.out.println("The total height is: " + alturaTanque + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.4) {
			    System.out.println("The total height is: " + alturaTanque + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			if (porcentajeOperacional == 0.7) {
			    System.out.println("The total height is: " + alturaTanque + "m");
			    PROTOTIPE.setDiametroDownconer(diametroDownconer);
			}

			// Calculations for riser height
			if (porcentajeOperacional == 0.9) {
			    Double resultado = (0.9 * PROTOTIPE.getalturaTanque());
			    System.out.println("The riser height is: " + resultado + "m");
			    Double alturaRiser = resultado;
			    PROTOTIPE.setAlturaRiser(alturaRiser);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.5) {
			    Double resultado = (0.8 * PROTOTIPE.getalturaTanque());
			    System.out.println("The riser height is: " + resultado + "m");
			    Double alturaRiser = resultado;
			    PROTOTIPE.setAlturaRiser(alturaRiser);
			}

			if (porcentajeOperacional == 0.8 && diametroRiserConsB == 0.4) {
			    Double resultado = (0.7 * PROTOTIPE.getalturaTanque());
			    System.out.println("The riser height is: " + resultado + "m");
			    Double alturaRiser = resultado;
			    PROTOTIPE.setAlturaRiser(alturaRiser);
			}

			if (porcentajeOperacional == 0.7) {
			    Double resultado = (0.6 * PROTOTIPE.getalturaTanque());
			    System.out.println("The riser height is: " + resultado + "m");
			    Double alturaRiser = resultado;
			    PROTOTIPE.setAlturaRiser(alturaRiser);
			}

			// Mandar a traer la POO de tipo AIRLIFT
			System.out.println(
					"===================================================================================================");
			System.out.println(PROTOTIPE);

			BufferedImage imagen = null;
			try {
				imagen = ImageIO.read(new File("C:\\\\Users\\\\LENOVO\\\\Pictures\\\\Air-Lift.jpg")); // Cambia la ruta
																										// al archivo de
																										// imagen
			} catch (Exception e) {
				System.out.println("Error al cargar la imagen: " + e.getMessage());
				return;
			}

		  	// Crear un marco para mostrar la imagen
			JFrame marco = new JFrame("Mostrar Imagen");
			marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			marco.setSize(500, 500); // Puedes ajustar el tamaño según tus necesidades

			// Agregar la imagen al marco
			JLabel etiquetaImagen = new JLabel(new ImageIcon(imagen));
			marco.add(etiquetaImagen);

			// Mostrar el marco
			marco.setVisible(true);

			break;
		case -2:
			System.out.println("You selected Stirred Tank");
			TanqueAgitado PROTOTIPEA = new TanqueAgitado(null, null, null, null, null, null, null, null, null, null,
			        null, null, null, null, null, null, null, null, null);

			// Ciclar con condiciones
			// Request the name of the M.O
			String microorganismoInoculoTA = null;
			System.out.println(
			        "===================================================================================================");
			while (microorganismoInoculoTA == null) {
			    System.out.println("Enter the family and species name of the M.O: ");
			    String acces = input3.nextLine();
			    System.out.println(
			            "===================================================================================================");
			    if (isString(acces)) {
			        microorganismoInoculoTA = acces;
			        System.out.println("Data saved");
			    } else {
			        System.out.println("Invalid value, numbers are not accepted.");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("The name of the M.O is: " + microorganismoInoculoTA);
			PROTOTIPEA.setMicroorganismoInoculo(microorganismoInoculoTA);

			// Request the operator's name
			String nombreDesarrolladorTA = null;
			System.out.println(
			        "===================================================================================================");
			while (nombreDesarrolladorTA == null) {
			    System.out.println("Enter your name: ");
			    String acces = input3.nextLine();
			    System.out.println(
			            "===============================================================================================");
			    if (isString(acces)) {
			        nombreDesarrolladorTA = acces;
			        System.out.println("Data saved");
			    } else {
			        System.out.println("Invalid value, numbers are not accepted.");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Author: " + nombreDesarrolladorTA);
			PROTOTIPEA.setNombreDesarrollador(nombreDesarrolladorTA);

			// Request the name of the optimal substrate
			String sustratoOptimoTA = null;
			System.out.println(
			        "===================================================================================================");
			while (sustratoOptimoTA == null) {
			    System.out.println("Optimal substrate of the M.O: ");
			    String acces = input3.nextLine();
			    System.out.println(
			            "===================================================================================================");
			    if (isString(acces)) {
			        sustratoOptimoTA = acces;
			        System.out.println("Data saved");
			    } else {
			        System.out.println("Invalid value, numbers are not accepted.");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Optimal substrate: " + sustratoOptimoTA);
			PROTOTIPEA.setSustratoOptimo(sustratoOptimoTA);

			// Request optimal pH
			Double optimoPhTA = null;
			System.out.println(
			        "===================================================================================================");
			while (optimoPhTA == null) {
			    System.out.println("Enter the optimal growth pH: ");
			    String acces = input3.nextLine();
			    System.out.println(
			            "===================================================================================================");
			    if (isNumeric(acces)) {
			        double accesSecound = Double.parseDouble(acces);
			        if (accesSecound > 0 && accesSecound < 14.1) {
			            optimoPhTA = accesSecound;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 and < 14.1 or > 0");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Optimal growth pH: " + optimoPhTA);

			PROTOTIPEA.setOptimoPh(optimoPhTA);

			// Request % of operation
			Double porcentajeOperacionalTa = null;
			System.out.println(
			        "===================================================================================================");
			while (porcentajeOperacionalTa == null) {
			    System.out.println("Operation percentage: standard 0.7, 0.8, and 0.9 ");
			    String acces = input3.nextLine();
			    System.out.println(
			            "===============================================================================================");
			    if (isNumeric(acces)) {
			        double accesSecound = Double.parseDouble(acces);
			        if (accesSecound > 0.69 && accesSecound < 0.91) {
			            porcentajeOperacionalTa = accesSecound;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 and < 0.15 or > 1");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }

			}

			System.out.println(
			        "===================================================================================================");
			System.out.println("Operation percentage is: " + porcentajeOperacionalTa + "%");
			PROTOTIPEA.setPorcentajeOperacionalTa(porcentajeOperacionalTa);


			// Request the actual Downconer diameter of the tank
			Double diametroTanque = null;
			System.out.println(
			        "===================================================================================================");
			while (diametroTanque == null) {
			    System.out.println("Enter the total diameter of the Agitated tank in cubic meters: ");
			    String acces2 = input3.next();
			    System.out.println(
			            "================================================================================================");
			    if (isNumeric(acces2)) {
			        double accesSecound2 = Double.parseDouble(acces2);
			        if (accesSecound2 > 0) {
			            diametroTanque = accesSecound2;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 or < 0");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Total diameter: " + diametroTanque + "m");

			PROTOTIPEA.setDiametroTanque(diametroTanque);

			// Request the actual total height of the tank
			Double alturaTanqueTa = null;
			System.out.println(
			        "===================================================================================================");
			while (alturaTanqueTa == null) {
			    System.out.println("Enter the total height of the Agitated tank in meters: ");
			    String acces2 = input3.next();
			    System.out.println(
			            "================================================================================================");
			    if (isNumeric(acces2)) {
			        double accesSecound2 = Double.parseDouble(acces2);
			        if (accesSecound2 > 0) {
			            alturaTanqueTa = accesSecound2;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println("Invalid value, don't accept numbers = 0 or < 0");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Total height: " + alturaTanqueTa + "m");

			PROTOTIPEA.setalturaTanqueTa(alturaTanqueTa);

			// Request the total volume of the tank
			Double piA = 3.1416;
			Double r = (PROTOTIPEA.getDiametroTanque() / 2);
			Double r2 = (r * r);
			Double volumenTotalTax = (piA * (PROTOTIPEA.getalturaTanqueTa() * r2));
			Double volumenTotalTa = volumenTotalTax;
			PROTOTIPEA.setVolumenTotalTa(volumenTotalTa);

			// Select the type of Turbine
			Integer tipoTurbinaTanque = null;
			System.out.println(
			        "===================================================================================================");
			while (tipoTurbinaTanque == null) {
			    System.out.println(
			            "Enter the type of turbine to be used in its numerical value:\n -1 = Disk Turbine\n -2 = Flat Blade Turbine\n -3 = Propeller Turbine");
			    String acces2 = input3.nextLine();
			    System.out.println(
			            "================================================================================================");
			    if (isNumericIn(acces2)) {
			        Integer accesSecound2 = Integer.parseInt(acces2);
			        if (accesSecound2 < 0 && accesSecound2 > -4) {
			            tipoTurbinaTanque = accesSecound2;
			            System.out.println("Is a number value");
			        } else {
			            System.out.println(
			                    "Invalid value, only the previous options are accepted in negative numerical value");
			        }

			    } else {
			        System.out.println("Invalid value, Not a number");
			    }
			}
			System.out.println(
			        "===================================================================================================");
			System.out.println("Turbine type: " + tipoTurbinaTanque);

			// *PROTOTIPEA.setVolumenTotal(tipoTurbinaTanque);

			switch (tipoTurbinaTanque) {
			case -1:
			    System.out.println("Disk Turbine");
			    // Attach calculations
			    // number of deflectors
			    Integer numeroDeflectores = 4;
			    System.out.println("Number of deflectors: " + numeroDeflectores);
			    PROTOTIPEA.setNumeroDeflectores(numeroDeflectores);
			    // operation volume
			    Double volumenOperacionalTa = (PROTOTIPEA.getVolumenTotalTa()
			            * PROTOTIPEA.getPorcentajeOperacionalTa());
			    PROTOTIPEA.setVolumenOperacionalTa(volumenOperacionalTa);
			    // tank diameter
			    System.out.println("(DT)The tank diameter is: " + diametroTanque + " meters");
			    PROTOTIPEA.setDiametroTanque(diametroTanque);
			    // tank height
			    System.out.println("(hT)The tank height is: " + alturaTanqueTa + " meters");
			    PROTOTIPEA.setalturaTanqueTa(alturaTanqueTa);
			    // liquid height
			    System.out.println("(hL)The liquid height is:" + PROTOTIPEA.getDiametroTanque() + " meters");
			    PROTOTIPEA.setAlturaLiquido(PROTOTIPEA.getDiametroTanque());
			    // impeller diameter
			    System.out
			            .println("(Di)The impeller diameter is:" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setDiametroImpulsor((PROTOTIPEA.getDiametroTanque()) / 3);
			    // Wb
			    System.out.println(
			            "(Wb)The width of the deflectors is:" + (PROTOTIPEA.getDiametroTanque()) / 12 + " meters");
			    PROTOTIPEA.setAnchuraDeflectores((PROTOTIPEA.getDiametroTanque()) / 12);
			    // Sb
			    System.out
			            .println("(sb)Wall-deflector separation:" + (PROTOTIPEA.getDiametroTanque()) / 60 + " meters");
			    PROTOTIPEA.setSeparacionPared_Deflectores((PROTOTIPEA.getDiametroTanque()) / 60);
			    // S
			    System.out.println(
			            "(S)Effective agitator length:" + (2 * PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setLongitudUtilAgitador((2 * PROTOTIPEA.getDiametroTanque()) / 3);
			    // C
			    System.out.println("(C)Agitator-base distance" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setDistanciaAgitador_Base((PROTOTIPEA.getDiametroTanque()) / 3);
			    // n
			    System.out.println("Number of blades" + 6);
			    PROTOTIPEA.setNumeroAlabes(6.0);
			    // W
			    System.out.println("Blade width" + ((PROTOTIPEA.getDiametroTanque()) / (3)) / 5 + " meters");
			    PROTOTIPEA.setAnchuraAlabes(((PROTOTIPEA.getDiametroTanque()) / (3)) / 5);
			    // L
			    System.out.println("Blade length" + ((PROTOTIPEA.getDiametroTanque()) / (3)) / 4 + " meters");
			    PROTOTIPEA.setLongitudAlabes(((PROTOTIPEA.getDiametroTanque()) / (3)) / 4);
			    // Send to bring the POO of TA
			    System.out.println(PROTOTIPEA);
			    // Display prototype image
			    break;

			case -2:
			    System.out.println("Flat Blade Turbine");
			    // Attach calculations
			    // number of deflectors
			    Integer numeroDeflectoresP = 4;
			    System.out.println("Number of deflectors: " + numeroDeflectoresP);
			    // operation volume
			    Double volumenOperacionalTa1 = (PROTOTIPEA.getVolumenTotalTa()
			            * PROTOTIPEA.getPorcentajeOperacionalTa());
			    PROTOTIPEA.setVolumenOperacionalTa(volumenOperacionalTa1);
			    // tank diameter
			    System.out.println("(DT)The tank diameter is: " + diametroTanque + " meters");
			    PROTOTIPEA.setDiametroTanque(diametroTanque);
			    // tank height
			    System.out.println("(hT)The tank height is: " + alturaTanqueTa + " meters");
			    PROTOTIPEA.setalturaTanqueTa(alturaTanqueTa);
			    // impeller diameter
			    System.out
			            .println("(Di)The impeller diameter is:" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setDiametroImpulsor((PROTOTIPEA.getDiametroTanque()) / 3);
			    // Wb
			    System.out.println(
			            "(Wb)The width of the deflectors is:" + (PROTOTIPEA.getDiametroTanque()) / 12 + " meters");
			    PROTOTIPEA.setAnchuraDeflectores((PROTOTIPEA.getDiametroTanque()) / 12);
			    // Sb
			    System.out
			            .println("(sb)Wall-deflector separation:" + (PROTOTIPEA.getDiametroTanque()) / 60 + " meters");
			    PROTOTIPEA.setSeparacionPared_Deflectores((PROTOTIPEA.getDiametroTanque()) / 60);
			    // S
			    System.out.println(
			            "(S)Effective agitator length:" + (2 * PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setLongitudUtilAgitador((2 * PROTOTIPEA.getDiametroTanque()) / 3);
			    // C
			    System.out.println("(C)Agitator-base distance" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
			    PROTOTIPEA.setDistanciaAgitador_Base((PROTOTIPEA.getDiametroTanque()) / 3);
			    // n
			    System.out.println("Number of blades" + 6);
			    PROTOTIPEA.setNumeroAlabes(6.0);
			    // W
			    System.out.println("Blade width" + ((PROTOTIPEA.getDiametroTanque()) / (3)) / 5 + " meters");
			    PROTOTIPEA.setAnchuraAlabes(((PROTOTIPEA.getDiametroTanque()) / (3)) / 5);
			    // L
			    System.out.println("Blade length N/A");
			    PROTOTIPEA.setLongitudAlabes(0.0);

			    // Send to bring the POO of TA
			    System.out.println(PROTOTIPEA);
			    // Display prototype image
				break;
			case -3:
				System.out.println("Disk Turbine");
				// Attach calculations
				// number of deflectors
				Integer numeroDeflectoresS = 4;
				System.out.println("Number of deflectors: " + numeroDeflectoresS);
				PROTOTIPEA.setNumeroDeflectores(numeroDeflectoresS);
				// operation volume
				Double volumenOperacionalTa3 = (PROTOTIPEA.getVolumenTotalTa()
				        * PROTOTIPEA.getPorcentajeOperacionalTa());
				PROTOTIPEA.setVolumenOperacionalTa(volumenOperacionalTa3);
				// tank diameter
				System.out.println("(DT)The tank diameter is: " + diametroTanque + " meters");
				PROTOTIPEA.setDiametroTanque(diametroTanque);
				// tank height
				System.out.println("(hT)The tank height is: " + alturaTanqueTa + " meters");
				PROTOTIPEA.setalturaTanqueTa(alturaTanqueTa);
				// liquid height
				System.out.println("(hL)The liquid height is:" + PROTOTIPEA.getDiametroTanque() + " meters");
				PROTOTIPEA.setAlturaLiquido(PROTOTIPEA.getDiametroTanque());
				// impeller diameter
				System.out
				        .println("(Di)The impeller diameter is:" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
				PROTOTIPEA.setDiametroImpulsor((PROTOTIPEA.getDiametroTanque()) / 3);
				// Wb
				System.out.println(
				        "(Wb)The width of the deflectors is:" + (PROTOTIPEA.getDiametroTanque()) / 10 + " meters");
				PROTOTIPEA.setAnchuraDeflectores((PROTOTIPEA.getDiametroTanque()) / 12);
				// Sb
				System.out
				        .println("(sb)Wall-deflector separation:" + (PROTOTIPEA.getDiametroTanque()) / 60 + " meters");
				PROTOTIPEA.setSeparacionPared_Deflectores((PROTOTIPEA.getDiametroTanque()) / 60);
				// S
				System.out.println(
				        "(S)Effective agitator length:" + (2 * PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
				PROTOTIPEA.setLongitudUtilAgitador((2 * PROTOTIPEA.getDiametroTanque()) / 3);
				// C
				System.out.println("(C)Agitator-base distance" + (PROTOTIPEA.getDiametroTanque()) / 3 + " meters");
				PROTOTIPEA.setDistanciaAgitador_Base((PROTOTIPEA.getDiametroTanque()) / 3);
				// n
				System.out.println("Number of blades" + 3);
				PROTOTIPEA.setNumeroAlabes(3.0);
				// W
				System.out.println("Blade width N/A ");
				PROTOTIPEA.setAnchuraAlabes(0.0);
				// L
				System.out.println("Blade length N/A");
				PROTOTIPEA.setLongitudAlabes(0.0);

				// Send to bring the POO of TA
				System.out.println(PROTOTIPEA);
				// Display prototype image
				break;
				default:
				    System.out.println("Error");
				    break;
				}

				break;

				default:
				    System.out.println("Error");
				    break;

		}

	}

}
