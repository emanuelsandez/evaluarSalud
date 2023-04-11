//Proyecto que permite evaluar IMC y Presión de la persona
package cl.emanuelsandez;

import java.util.Scanner;

public class evaluarSalud {

	static Scanner sc = new Scanner(System.in); //Variable de clase
	
	public static void main(String[] args) {
	int op = 0;
	//Ciclo do while para desplegar menú
		do {
			System.out.println("-----------------------------------------");
			System.out.println("                 MENÚ                    ");
			System.out.println("-----------------------------------------");
			System.out.println("1-Cálculo IMC");
			System.out.println("2-Presión");
			System.out.println("3-Salir");
			System.out.println("-----------------------------------------");
			System.out.println("Ingrese una opción");
			op = sc.nextInt();
			
			switch (op) {
			
			case 1:
				
				imc();
				break;
				
			case 2:
				presion();
				break;
				
			case 3:
				salir();
			default:
				System.out.println("Opción inválida");
			}
			
			
		}while(op!=3);
		
				

	
	}
	
	static void imc () {
		System.out.println("Cálculo IMC");
		System.out.println("Ingrese su peso");
		float peso = sc.nextFloat();
		System.out.println("Ingrese su altura");
		float altura = sc.nextFloat();
		float imc = (float)(peso/Math.pow(altura, 2));
		System.out.printf("Su IMC es %.2f", imc);
		evaluaImc(imc);
		
		}
	static void evaluaImc(float valor) {
		if (valor<18.5 && valor!=0f) {
			System.out.println("Bajo peso y riesgo cardiovascular mínimo");
		}else if(valor>=18.5 && valor<24.9) {
			System.out.println("Peso normal y riesgo cardiovascular promedio");
		}else if(valor>=25 && valor<=29.9) {
			System.out.println("Sobre peso y riesgo cardiovascular levemente aumentado");
		}else if(valor>=30) {
			System.out.println("Obesidad y riesgo cardiovascular aumentado");
		}else {
			System.out.println("Debe ingresar peso y altura");
		}
		
		}
	static void presion() {
		System.out.println("Evalúa Presión");
		System.out.println("Ingrese su presión sistólica");
		int psistolica = sc.nextInt();
		System.out.println("Ingrese su presión diastólica");
		int pdiastolica = sc.nextInt();
		
		evaluapresion(psistolica, pdiastolica);
	
	}
	static void evaluapresion(int valor1, int valor2 ) {
		
		if(valor1<=120 && valor2<=80) {
			System.out.println("Presión arterial óptima.");
		}else if (valor1>120&&valor1<130&&valor2>80&&valor2<85) {
			System.out.println("Presión arterial normal.");
		}else if (valor1>=130&&valor1<139&&valor2>=85&&valor2<89) {
			System.out.println("Presión arterial normal alta.");
		}else if (valor1>=140&&valor2>=90) {
			System.out.println("Hipertensión arterial.");
		}else {
			System.out.println("Debe ingresar presión sistólica y diastólica!!!.");
		}
	}
	static void salir() {
		
	}
	
	}
	

