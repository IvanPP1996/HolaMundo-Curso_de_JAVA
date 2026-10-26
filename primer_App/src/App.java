public class App {
    public static void main(String[] args) throws Exception {
        



        /* Tipos de datos primitivos ---------------------------------------------------------------------------------------------- */
        

        byte edad = 18;
        // System.out.println(edad);
        int numeroGrande = 1000;
        // System.out.println(numeroGrande);
        float numeroFlotante = 15.5f;
        // System.out.println(numeroFlotante);
        double numeroDouble = 15.6;
        // System.out.println(numeroDouble);
        boolean activo = true;
        // System.out.println(activo);
        char caracter = 'y';
        // System.out.println(caracter);




        /* Tipos de datos por referencia ------------------------------------------------------------------------------------------- */
        

        // Texto ----------------------------------------------------
        String texto = "Hola mundo!";
        // System.out.println(texto); 
        
        // Metodos de texto
        // System.out.println(texto.length()); // Largo del texto
        
        // System.out.println(texto.replace("Hola", "Chao")); // Remplazar parte del texto
        // System.out.println(texto); // NOTA: Los strings son inmutables

        // System.out.println(texto.endsWith("undo!")); // Devuelve true o false de acuerdo a la palabra con la que termine si es la misma
        // System.out.println(texto.startsWith("Hol")); // Devuelve true o false de acuerdo a la palabra con la que empiece si es la misma
        // System.out.println(texto.contains("a mun")); // Devuelve true o false si la frase contiene esa palabra o palabras
        // System.out.println(texto.indexOf("do")); // Devuelve la posicion de donde inicia la palabra
        
        // System.out.println(texto.toUpperCase()); // Devuelve todo en mayuscula
        // System.out.println(texto.toLowerCase()); // Devuelve todo en minuscula
        
        
        String Espacios = "       Chanchito feliz          ";
        // System.out.println(Espacios.trim()); // Devuelve la frase sin espacios del principio y fin
        
        


        /* Caracteres de escape ----------------------------------------------------------------------------------------------------- */
        
        
        String texto2 = "\\Nuevo uso de \n\tlíneas de \"comando\" para programar";  
        System.out.println(texto2);




        /* Arrays (Arreglos) -------------------------------------------------------------------------------------------------------- */
    

        
    }
}
