
package tabajoenclase;


public class Propietarios {
    
    String genero,gafas;
    int nivelAlcohol;
    
    boolean ebrio() {
        if(nivelAlcohol > 1) {
            return true;
        }else{
           return false; 
        }
    }

    String generopersona() {
        return genero;
    }
    
    String gafas() {
         return gafas;
    }
}
