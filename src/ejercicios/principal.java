package ejercicios;

import java.util.Scanner;

public class principal {
    public static void main(String[]args){ 
    float lado,area,altura,base;
    Scanner captura=new Scanner(System.in);
    System.out.println("Ingrese el valor del lado del cuadrado");
   lado=captura.nextFloat();
   
   cuadrado c2=new cuadrado(lado);
   c2.calcularArea();


   System.out.println("Ingrese el area del triangulo:");
   area=captura.nextFloat();
   
   System.out.println("Ingrese la altura del triangulo:");
   altura=captura.nextFloat();

   triangulo r3=new triangulo (area, altura);
   r3.calcularArea();


   System.out.println("Ingrese el area del rectangulo:");
   area=captura.nextFloat();
   
   System.out.println("Ingrese la altura del rectangulo:");
   altura=captura.nextFloat();

   System.out.println("Ingrese la base del rectangulo:");
   base=captura.nextFloat();

   rectangulo c3=new rectangulo(lado, altura, base);
   c3.calcularArea();


   System.out.println("Ingrese el area del circulo:");
   area=captura.nextFloat();


circulo f1=new circulo(area);
f1.calcularArea();



   captura.close();

}

    
}
