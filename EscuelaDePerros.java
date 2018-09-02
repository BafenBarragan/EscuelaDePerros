import java.util.*; 

/**
 * Write a description of class EscuelaDePerros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscuelaDePerros
{
    static Scanner teclado = new Scanner (System.in);
    public static void main (String [] args)
    {
        ArrayList<Perro> perros = new ArrayList<>(); 
        int opción = 0; 
        String nombrePerro; 
        String raza; 
        String localidad; 
        String cédula; 
        String nombreDueño; 
        String teléfono; 
        String díaDeAsistencia;
        int n; 
        Perro perro; 
        
        System.out.println("---> BIENVENIDO A SU ESCUELA DE PERROS <---"); 
        
        do{
          System.out.println();
          System.out.println("Presione 1 para añadir un nuevo perro.");
          System.out.println("Presione 2 para ver la lista de los perros.");
          System.out.println("Presione 3 para ver los perros por localidad.");
          System.out.println("Presione 4 para ver cuántos perros tiene la escuela.");
          System.out.println("Presione 0 para salir de la base de datos.");
          opción = teclado.nextInt(); 
          System.out.println(); 
          
          switch (opción)
          {
              case 1: 
                   teclado.nextLine(); 
                   System.out.print("Ingrese el nombre del perro: ");
                   nombrePerro = teclado.nextLine();
                   System.out.print("Ingrese la raza del perro: ");
                   raza = teclado.nextLine(); 
                   System.out.print("Ingrese la localidad en la que está ubicado: ");
                   localidad = teclado.nextLine(); 
                   System.out.print("Ingrese el nombre del dueño: ");
                   nombreDueño = teclado.nextLine(); 
                   System.out.print("Ingrese el número de cédula del dueño: ");
                   cédula = teclado.nextLine(); 
                   System.out.print("Ingrese el número de teléfono de contacto: ");
                   teléfono = teclado.nextLine(); 
                   System.out.print("Ingrese el día que va a asistir el perro a la escuela: ");
                   díaDeAsistencia = teclado.nextLine();    
                   System.out.println();
                   
                   perro = new Perro(nombrePerro, raza, localidad, cédula, nombreDueño, teléfono, díaDeAsistencia);  
                   perros.add(perro); 
                   
                   break; 
                   
              case 2: 
                                  
                    if (perros.size() == 0)
                    {
                        System.out.println("Aún no hay datos para mostrar"); 
                    }
                    else 
                    {
                        for (Perro p : perros)
                        {
                            p.mostrar();
                        }       
                    }
                    System.out.println(); 
                    
                    break; 
                    
              case 3: 
                    teclado.nextLine(); 
                    System.out.print("Ingrese la localidad a averiguar: ") ; 
                    localidad = teclado.nextLine(); 
                    System.out.println();
       
                    for (Perro p : perros)
                    {
                       if (p.obtenerLocalidad().equals(localidad))
                       {
                           p.mostrar(); 
                       }
                    }
                    
                    System.out.println("\n");      
              
                    break; 
                    
              case 4: 
              
                    n = perros.size(); 
                    System.out.println("El número de perros en la escuela es: " + n);
              
                    break; 
                    
              case 0: 
                    
                    System.out.println("<<< HASTA LUEGO >>>");
                   
                   
            }
            
        }while (opción != 0);
    }
}
