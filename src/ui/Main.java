package ui;

import java.util.Scanner;

import exceptions.NoDayException;
import exceptions.UnderAgeException;
import model.Minimarket;

public class Main {
	private Minimarket minimarket;
	private Scanner sc;
	
	public Main() {
		sc= new Scanner(System.in);
		minimarket=new Minimarket();
	}
	
	
	public static void main(String[] args) {
		Main objMain=new Main();
		int option;
		do {
			option=objMain.menu();
			
			switch(option) {
			case 1:
				objMain.register();	
				break;
			case 2:
				
				break;
				
			}
			
		}while(option!=3);
	    	
	}
	
	public int menu() {
		System.out.println("***Minimercado Mi Barrio Te Quiere***");
		System.out.println("Elija una opcion: \n"+
				"	(1) Registrar el ingreso de una nueva persona\n"+
				"	(2) Consultar la cantidad de personas que han intentado ingresar \n"+
				"	(3) Salir del programa\n");
		
		int option = sc.nextInt();
		return option;
	}
	
	public  void register() {
		int op;
		do {
			System.out.println("***Registrar el ingreso de una nueva persona***\n"+
					"Elija el tipo de documento de identificacion: \n"+
					"	(1) TI - Tarjeta de Identidad\n"+
					"	(2) CC - Cedula de Ciudadania \n"+
					"	(3) PP - Pasaporte\n"+
					"	(4) CE - Cedula de Extranjeria\n");
			op=sc.nextInt();
		}while(op<1 || op>4);

		System.out.println("Digite el numero de su documento de identificacion: ");
		sc.nextLine();
		String id=sc.nextLine();
		
		try {
			minimarket.register(op, id);
		}catch(UnderAgeException uae) {

		}catch(NoDayException nde) {
			
		}
	}

}
