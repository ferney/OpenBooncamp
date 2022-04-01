import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona x = new Persona("claudio", 25, "3002345678");
        System.out.println(x.toString());
        
        Cliente c= new Cliente("c", "25", 30,25000);
       
        System.out.println("el cliente c =>" );
         System.out.println(c.toString());
       
        
        
        
        Trabajador t= new Trabajador("t",  "25", 30,25000);
        
        System.out.println("el trabajador t =>");
        System.out.println(t.toString());
       
        
        
        
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


class Cliente extends Persona{
    
    private double credito;
    
    
	public Cliente(String nombre, String telefono, int edad, double credito) {
		super( nombre, edad, telefono);
		this.credito = credito;
		
	}
	
	// método 1
    public double getCredito()
    {
        return credito;
    }
  @Override
    public String toString()
    {
        return("Hola mi nombre es "+ this.getNombre()+".\nMi edad es "+this.getEdad()+" y mi telefono es " +this.getTelefono()+"y tengo un credito por "+getCredito());
    }
}

class Trabajador extends Persona{
    private double salario;
    
    
	
	public Trabajador(String nombre, String telefono, int edad, double salario) {
		super( nombre, edad, telefono);
		this.salario = salario;
		
	}
	
	
	public double getSalario()
    {
        return salario;
    }
     @Override
    public String toString()
    {
        return("Hola mi nombre es "+ this.getNombre()+".\nMi edad es "+this.getEdad()+" y mi telefono es " +this.getTelefono()+"y tengo un salario de "+getSalario());
    }
}
