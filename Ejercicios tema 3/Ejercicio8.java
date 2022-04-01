import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona x = new Persona("claudio", 25, "3002345678");
        System.out.println(x.toString());
        
        
    }
}

class Persona{
   private int edad;
   private String nombre, telefono;
   
   
  
    public Persona(String nombre, int edad, String telefono )
    {
        this.nombre = nombre;
        this.telefono= telefono;
        this.edad = edad;
        
    }
 
    // método 1
    public String getNombre()
    {
        return nombre;
    }
 
    // método 2
    public String getTelefono()
    {
        return telefono;
    }
 
    // método 3
    public int getEdad()
    {
        return edad;
    }
 
   
 
    @Override
    public String toString()
    {
        return("Hola mi nombre es "+ this.getNombre()+".\nMi edad es "+this.getEdad()+" y mi telefono es " +this.getTelefono());
    }
}
