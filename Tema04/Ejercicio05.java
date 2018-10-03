/**
* Sentencia condicional ( if y switch )
*
* Programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio05{
  public static void main(String[] args){
    
    String a1;
    String b1;
    double a;
    double b;
    double x;
    
    System.out.printf("\nEste programa resuelve ecuaciones de primer grado");
        System.out.printf(" tipo ax + b = 0 ");
        
    System.out.printf("\nPorfavor, introduzca el valor de a: ");
        a1= System.console().readLine();
        a = Integer.parseInt(a1);
    
        System.out.printf("\nAhora introduzca el valor de b: ");
        b1 = System.console().readLine();
        b = Integer.parseInt(b1);
    
    if (a == 0){
      
      System.out.printf("\nEsa ecuación no tiene solución real.");
      
      
    } else {
    
        x = -b / a;
    
        System.out.printf("\nx = %.2f ",x);
    
    }
    
  }

}
