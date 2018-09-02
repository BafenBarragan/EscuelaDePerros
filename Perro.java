import java.util.*;

/**
 * Write a description of class Perros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
   public Perro()
   {
       nombrePerro = ""; 
       raza = ""; 
       localidad = "";
       cédula = ""; 
       nombreDueño = ""; 
       díaDeAsistencia = ""; 
       teléfono = "";
   }
   
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
   
   public void cambiarNombrePerro(String nombreP)
    {
        this.nombrePerro = nombreP; 
    }
    
   public String obtenerNombrePerro()
   {
       return this.nombrePerro;
   }
   
   public void cambiarRaza(String raza)
    {
        this.raza = raza; 
    }
    
   public String obtenerRaza()
   {
       return this.raza;
   }
   
   public void cambiarLocalidad(String localidad)
    {
        this.localidad = localidad; 
    } 
    
   public String obtenerLocalidad()
   {
       return this.localidad; 
   }
   
   public void cambiarCédula(String cédula)
    {
        this.cédula = cédula; 
    }
    
   public String obtenerCédula()
   {
       return this.cédula;
   }
   
   public void cambiarNombreDueño(String nombreD)
    {
        this.nombreDueño = nombreD; 
    }
   
   public String obtenerNombreDueño()
   {
       return this.nombreDueño;
   }
   
   public void cambiarDía(String día)
    {
        this.díaDeAsistencia = día; 
    }
       
   public String obtenerDía()
   {
       return this.díaDeAsistencia;
   }
   
   public void cambiarTeléfono(String tel)
    {
        this.teléfono = tel; 
    }
    
   public String obtenerTeléfono()
   {
       return this.teléfono; 
   }
   
   public void mostrar()
   {
       System.out.println("- " + nombrePerro + "    " + raza + "    " + localidad + "          " + nombreDueño + "    " + cédula + "    " + 
                    teléfono + "            " +   díaDeAsistencia);
   }
   
  
}
