import java.util.*;

/**
 * Esta es la clase donde se reciben y manejan todos los datos de los perros de la escuela. 
 * 
 * @author Bafen Ricardo Barragán Sánchez 
 * @version 1
 */
public class Perro
{
   private String nombrePerro; 
   private String raza; 
   private String localidad; 
   private String cédula; 
   private String nombreDueño; 
   private String teléfono; 
   private String díaDeAsistencia; 
   static Scanner teclado = new Scanner (System.in);
   //Método constructor para la clase Perros 
   public Perro(String nomP, String raz, String loc, String ced, String nomD, String día, String tel)
   {
       this.nombrePerro = nomP; 
       this.raza = raz; 
       this.localidad = loc;
       this.cédula = ced; 
       this.nombreDueño = nomD; 
       this.díaDeAsistencia = día; 
       this.teléfono = tel;
   }
   
   public String obtenerNombrePerro()
   {
       return this.nombrePerro;
   }
   
   public String obtenerRaza()
   {
       return this.raza;
   }
   
   public String obtenerLocalidad()
   {
       return this.localidad; 
   }
   
   public String obtenerCédula()
   {
       return this.cédula;
   }
   
   public String obtenerNombreDueño()
   {
       return this.nombreDueño;
   }
    
   public String obtenerDía()
   {
       return this.díaDeAsistencia;
   }
   
   public String obtenerTeléfono()
   {
       return this.teléfono; 
   }
   
   public void mostrar()
   {
       System.out.println(nombrePerro + "    " + raza + "    " + localidad + "    " + nombreDueño + "    " + cédula + "    " +
                  díaDeAsistencia + "    " + teléfono);
   }
   
  
}
