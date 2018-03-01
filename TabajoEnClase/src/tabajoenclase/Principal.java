
package tabajoenclase;


public class Principal {

    public static void main(String[] args) {
        
       
        String saludo,saludo1;
        Celador miCelador=new Celador();
        Propietarios propietario1 = new Propietarios();
        Propietarios propietario2 = new Propietarios();
        Propietarios propietario3 = new Propietarios();
        Propietarios propietario4 = new Propietarios();
        
        propietario1.nivelAlcohol=0;
        propietario1.genero="Mujer";
        propietario1.gafas="No";
        saludo=miCelador.saludo("Mujer");
        saludo1 = miCelador.saludo(1);
        System.out.println(saludo1);
        System.out.println(saludo);
        
      
        propietario2.nivelAlcohol=10;
        propietario2.genero="Mujer";
        saludo=miCelador.saludo("Mujer");
        saludo1 = miCelador.saludo(1);
        System.out.println(saludo1);
        System.out.println(saludo);
        saludo=miCelador.saludo(true);
        System.out.println(saludo);
        
        propietario3.nivelAlcohol=0;
        propietario3.genero="Hombre";
        saludo=miCelador.saludo("Hombre");
        saludo1 = miCelador.saludo(1);
        System.out.println(saludo1);
        System.out.println(saludo);
        
        propietario4.nivelAlcohol=10;
        propietario4.genero="Hombre";
        saludo=miCelador.saludo("Hombre");
        saludo1 = miCelador.saludo(0);
        System.out.println(saludo1);
        System.out.println(saludo);
        saludo=miCelador.saludo(true);
        System.out.println(saludo);
    }
}

