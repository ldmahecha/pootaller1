package intro;

import java.util.Scanner;

public class animal{
   public String nombre;
   int edad;
private Scanner lectura=new Scanner(System.in);
   
public static void registraranimal() {

    System.out.println("ingrese el nombre del animal");
    nombre=lectura.nextline();

    
    System.out.println("ingrese la edad del animal");
    edad=lectura.nextInt();
    
   }
   
 }