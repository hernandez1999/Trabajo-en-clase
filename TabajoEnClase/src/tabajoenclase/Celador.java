
package tabajoenclase;

public class Celador {
   
   String saludo()
   {
       return "Buenos dias";
   }
   
    String saludo(boolean ebrio)
   {
       return "Por favor retirese";
   }
    
   String saludo(String genero)
   {
       if(genero=="Mujer")
       {
           return "Aunque el lugar de los ángeles es el cielo, si te vas te echaré demasiado de menos";
       }
       else
       {
           return "Buenas doctor";
       }    
   }
   
   String saludo(int gafas)
   {
       if(gafas==1)
       {
           return ".";
       }
       else
       {
           return "Que no se le olviden las gafas";
       }    
   }
}
