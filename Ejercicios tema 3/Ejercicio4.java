public class MyClass {
    public static void main(String args[]) {
      int numeroIf=0,numeroWhile=0,numeroFor=0;
      String estacion="verano";
      
      if(numeroIf<0){
          System.out.println("es negativo");
      }else if(numeroIf >0){
           System.out.println("es positivo");
      }else {
           System.out.println("es cero");
      }
      
      
      while(numeroWhile <3) {
          numeroWhile++;
      System.out.println(numeroWhile);
    }
      
      
      
    do {
      System.out.println(numeroWhile); 
    } while(numeroWhile == 0);
      
    
    for(int i=0;i<=3;i++){
        numeroFor++;
        System.out.println(numeroFor);
    } 
     
     switch (estacion) 
        {
            case "verano":System.out.println("Estamos en verano"); break;
            case "otoño":System.out.println("Estamos en otoño"); break;
            case "invierno":System.out.println("Estamos en invierno");break;
            case "primavera":System.out.println("Estamos en primavera"); break;
           default: System.out.println("El valor de la variable no sea una estación");
                     break;
        }
        
     
}
}
