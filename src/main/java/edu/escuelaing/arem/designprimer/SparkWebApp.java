package edu.escuelaing.arem.designprimer;

import static spark.Spark.*;

public class SparkWebApp {
	
    public static void main(String[] args) {
        
        
        
        String index = "<!DOCTYPE html>\n" +
"<html>\n" +
"   \n" +
"   <head>\n" +
"      <title>Calculos Estadisticos</title>\n" +
"   </head>\n" +
"	\n" +
"   <body>\n" +
"      <p><b>Hello Heroku!</b></p>\n" +
"      <p>Aplicación Web para calcular la media y la desviacion estandar de un conjunto de datos.</p>\n" +
"      <a href = \"http://localhost:4567/calculodata\" target = \"_self\">Calcular Data</a>\n" +                
"   </body>\n" +
"	\n" +
"</html>";
        
        String calculodata = "<!DOCTYPE html>\n" +
"<html>\n" +
"   \n" +
"   <head>\n" +
"      <title>Calculos Estadisticos</title>\n" +
"   </head>\n" +
"	\n" +
"   <body>\n" +
"      <p><b>Calculo de Datos</b></p>\n" +
"      <p>Ingrese sus Datos a la Aplicacion</p>\n" +  
                
                
"       Cadena de numeros a calcular: <input type=\"text\" id=\"myText\" value=\"Sus datos separados por espacios en blanco\">\n" +
"\n" +
"       <p>Click the button bellow to display the captured data.</p>\n" +
"\n" +
"       <button onclick=\"myFunction()\">Calcular!</button>\n" +
"\n" +
"       <p id=\"demo\"></p>\n" +
"\n" +
"       <script>\n" +
"       function myFunction() {\n" +
"           var x = document.getElementById(\"myText\").value;\n" +
"           document.getElementById(\"demo\").innerHTML = x;\n" +
"}\n" +
"       </script>" +    
                
                
                
                
"      <a href = \"http://localhost:4567/resultados\" target = \"_self\">Ver Resultados</a>\n" +  
"   </body>\n" +
"	\n" +
"</html>";
        
        String resultados = "<!DOCTYPE html>\n" +
"<html>\n" +
"   \n" +
"   <head>\n" +
"      <title>Calculos Estadisticos</title>\n" +
"   </head>\n" +
"	\n" +
"   <body>\n" +
"      <p><b>Resultados</b></p>\n" +
"      <p>Valor de Media y Mediana</p>\n" +                
"   </body>\n" +
"	\n" +
"</html>";
        
        
        //setPort(6666);
	get("/index", (req, res) -> index);
        get("/calculodata", (req, res) -> calculodata);
        get("/resultados", (req, res) -> resultados);
        
        

        
        
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
    /*
    public static void get() {
	get("/hello/form", (r, s) -> formulario());
    }*/
    
    public static String formulario(){
        
        return "Formulario";
    }
    
}
