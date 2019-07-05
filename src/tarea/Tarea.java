//Programa que calcule la edad de una persona y me diga si es mayor o menor de edad
package tarea;
import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
        int a,act;
        System.out.println("Ingrese año de nacimiento");
        a = x.nextInt();
        System.out.println("Ingrese año actual");
        act=x.nextInt();
        int edad=act-a;
if (edad>0 && edad<18)
  System.out.println("La persona tiene "+edad+ " años es menor de edad");
  else  if (edad>18 && edad<100)
  System.out.println("La persona tiene "+edad+ " años es mayor de edad");
  else if (edad>100)
  System.out.println("edad incorrecta por favor ingrese nuevamente el año de nacimiento");

    }

}
