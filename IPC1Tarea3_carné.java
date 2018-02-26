/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_carné;

import java.util.Scanner;
public class IPC1Tarea3_carné {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
                Scanner digitos = new Scanner (System.in);
                Scanner teclado=new Scanner(System.in);
		read = new Scanner (System.in);
                Scanner neme=new Scanner(System.in);
                
		int opc=0; 
		int Abonar =0;
 

		System.out.println("\n 1.Usuarios");
		System.out.println("\n 2.Contador de dígitos");
		System.out.println("\n 3.Tres números de mayor a menor");
                System.out.println("\n 4.Calcular promedio");
                System.out.println("\n 5.Salir");
		System.out.println("");
        
		opc=read.nextInt();
		switch (opc){
		case 2:
			int var=0;
	do {
				
				System.out.println("\n 1.ingresar numeros.");
				System.out.println("\n 2.mostrar digitos");
				System.out.println("\n 3.Menu principal");
				System.out.println("\n 4. volver Atras.");
				var= read.nextInt();
			switch (var){
			case 1: 
                            System.out.println("ingrese numero"); 
                        
			int num=digitos.nextInt();
                        String numero=Integer.toString(num);
                        
    System.out.println("El numero "+num +" tiene: "+ numero.length ()+"digitos ");
    break;
                       
                            
			}
 
}while (var>3);
			break;
		case 3:
			int var1 = 0;
			
			do {
				
				System.out.println("\n 1.ingresar numeros.");
				System.out.println("\n 2.mostrar ordenados");
				System.out.println("\n 4.menu principal");
				
				 System.out.println("");
                 
				var1 = read.nextInt();
			switch (var1){
			case 1: 
                        int a,b,c,Mayor,Medio,Menor;
                
                
System.out.println("Ingreseº numero");
a=teclado.nextInt();
System.out.println("Ingreseº numero");
b=teclado.nextInt();
System.out.println("ingreseº numeero");
c=teclado.nextInt();
           if(a>b&&a>c)
Mayor=a;
else
if(b>a&&b>c)
Mayor=b;
else
Mayor=c;

if(a<b&&a<c)
Menor=a;
else
if(b<a&&b<c)
Menor=b;
else
Menor=c;
Medio=(a+b+c)-(Mayor+Menor);
System.out.println("");
System.out.println("eln ascendente de los numeros ingresados es: ");
System.out.println(Mayor+" "+Medio+" "+Menor);
                        
                        break;
			
			}
			}while (var1 >3);
                        break;
                case 4:           
String nom;System.out.println("ingresar id");
                    nom=neme.next();
                    int ncal;
                    System.out.println("ingrese el numero de calificaciones");
                    ncal=neme.nextInt();
                    double i=1.0,prom=0.0,suma=0.0;
                    while(i>=1 && i<=ncal){
                        double cal;
                        System.out.println("ingrese la calificacion");
                        cal=neme.nextDouble();
                        suma=suma+cal;
                        i++;
                        }
prom=suma/ncal;
System.out.println("el promedio del alumno"+nom+"es: "+prom);
                    }
                        
		
	
		
}

}
