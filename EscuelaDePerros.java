import java.util.*; 

/**
 * A partir de esta clase se ejecuta como tal el programa, contiene el método principal que es el que establece las órdenes que debe 
 seguir el usuario. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * @author Bafen Ricardo Barragán Sánchez
 * @version 1
 */
public class EscuelaDePerros
{
    static Scanner teclado = new Scanner (System.in);
    static ArrayList<Perro> perros = new ArrayList<Perro>(); 
    static int opción = 0; 
    
    public static void main (String [] args)
    {
        String nombrePerro = "Toby"; 
        String raza = "Labrador"; 
        String localidad = "Puente Aranda"; 
        String cédula = "1561486524"; 
        String nombreDueño = "Carlos"; 
        String teléfono = "3165484545"; 
        String díaDeAsistencia = "Jueves";
        perros.add(new Perro(nombrePerro, raza, localidad, cédula, nombreDueño, díaDeAsistencia, teléfono)); 
        
        Perro calvin = new Perro(); 
        calvin.cambiarNombrePerro("Calvin");
        calvin.cambiarRaza("Beagle"); 
        calvin.cambiarLocalidad("Suba"); 
        calvin.cambiarCédula("1032492548");
        calvin.cambiarNombreDueño("Daniela");
        calvin.cambiarTeléfono("3154879654");
        calvin.cambiarDía("Martes"); 
        perros.add(calvin); 
        
        Perro andy = new Perro(); 
        andy.cambiarNombrePerro("Andy");
        andy.cambiarRaza("Pastor Alemán"); 
        andy.cambiarLocalidad("Usme"); 
        andy.cambiarCédula("1036784548");
        andy.cambiarNombreDueño("Antonio");
        andy.cambiarTeléfono("3189568741");
        andy.cambiarDía("Lunes"); 
        perros.add(andy); 
        
        Perro bartolo = new Perro(); 
        bartolo.cambiarNombrePerro("Bartolo");
        bartolo.cambiarRaza("Pug"); 
        bartolo.cambiarLocalidad("Kennedy"); 
        bartolo.cambiarCédula("1025986475");
        bartolo.cambiarNombreDueño("Marlon");
        bartolo.cambiarTeléfono("320489621");
        bartolo.cambiarDía("Martes"); 
        perros.add(bartolo); 
        
        Perro thor = new Perro(); 
        thor.cambiarNombrePerro("Thor");
        thor.cambiarRaza("Cocker"); 
        thor.cambiarLocalidad("Usaquén"); 
        thor.cambiarCédula("110516545");
        thor.cambiarNombreDueño("Paula");
        thor.cambiarTeléfono("3158746955");
        thor.cambiarDía("Lunes"); 
        perros.add(thor); 
        
        Perro bruce = new Perro(); 
        bruce.cambiarNombrePerro("Bruce");
        bruce.cambiarRaza("Rottweiler"); 
        bruce.cambiarLocalidad("Suba"); 
        bruce.cambiarCédula("1658987458");
        bruce.cambiarNombreDueño("Marlene");
        bruce.cambiarTeléfono("3226895478");
        bruce.cambiarDía("Miércoles"); 
        perros.add(bruce); 
        
        Perro terry = new Perro(); 
        terry.cambiarNombrePerro("Terry");
        terry.cambiarRaza("Husky"); 
        terry.cambiarLocalidad("Mártires"); 
        terry.cambiarCédula("91589654");
        terry.cambiarNombreDueño("Diana");
        terry.cambiarTeléfono("3008956247");
        terry.cambiarDía("Lunes"); 
        perros.add(terry); 
        
        Perro mambo = new Perro(); 
        mambo.cambiarNombrePerro("Mambo");
        mambo.cambiarRaza("Chow chow"); 
        mambo.cambiarLocalidad("Puente Aranda"); 
        mambo.cambiarCédula("96358456");
        mambo.cambiarNombreDueño("Marta");
        mambo.cambiarTeléfono("36958745");
        mambo.cambiarDía("Jueves"); 
        perros.add(mambo); 
        
        Perro laki = new Perro(); 
        laki.cambiarNombrePerro("Laki");
        laki.cambiarRaza("Mastín Inglés"); 
        laki.cambiarLocalidad("Chapinero"); 
        laki.cambiarCédula("1035896252");
        laki.cambiarNombreDueño("Juan");
        laki.cambiarTeléfono("3164668596");
        laki.cambiarDía("Viernes"); 
        perros.add(laki); 
        
        Perro hulk = new Perro(); 
        hulk.cambiarNombrePerro("Hulk");
        hulk.cambiarRaza("Bull Dog"); 
        hulk.cambiarLocalidad("Puente Aranda"); 
        hulk.cambiarCédula("1032492725");
        hulk.cambiarNombreDueño("Ricardo");
        hulk.cambiarTeléfono("3209181156");
        hulk.cambiarDía("Sábado"); 
        perros.add(hulk); 
        
        
              
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
                   
                   perros.add (new Perro(nombrePerro, raza, localidad, cédula, nombreDueño, teléfono, díaDeAsistencia));  
                   
                   
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
                    
                                         
                    /**{
                        for (int i = 0; i < perros.size(); i++)
                        {
                            System.out.printf("- %s %s %s      %s %s %s     %s\n", perros.get(i).obtenerNombrePerro(), 
                                        perros.get(i).obtenerRaza(), perros.get(i).obtenerLocalidad(), perros.get(i).obtenerNombreDueño(), 
                                        perros.get(i).obtenerCédula(), perros.get(i).obtenerTeléfono(), perros.get(i).obtenerDía()); 
                        }       
                    }
                    
                    
                    
                    break; */
                    
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
                    int n; 
                    n = perros.size(); 
                    System.out.println("El número de perros en la escuela es: " + n);
              
                    break; 
                    
              case 0: 
                    
                    System.out.println("<<< HASTA LUEGO >>>");
                   
                   
            }
            
        }while (opción != 0);
    }
}
