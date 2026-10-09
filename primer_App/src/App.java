import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        

        /* Tipos de datos primitivos ---------------------------------------------------------------------------------------------- */
        
        // byte edad = 18;
        // int numeroGrande = 1000;
        // long numeroNuevo = 15; // Usar este tipo de dato para un nùmero pequeño ocupa mucha memorìa RAM
        // float numeroDecimalFloat = 15.5f;
        // double numeroDecimalDouble = 12.6;
        // boolean esPositivo = true;
        // boolean esNegativo = false;
        // char unCaracter = 'A';
        // Para escribir rapido usa snipet escribiendo "sout"
        // System.out.println(edad);
        // System.out.println(numeroGrande);
        // System.out.println(numeroDecimalFloat);
        // System.out.println(numeroDecimalDouble);
        // System.out.println(esPositivo);
        // System.out.println(esNegativo);
        // System.out.println(unCaracter);


        /* Tipos de referencias ----------------------------------------------------------------------------------------------------- */
        
        // NOTA: Los Strings son inmutables

        // String texto = "Hola mundo!";
        // System.out.println(texto);
        // //Largo del texto
        // System.out.println(texto.length());
        // // Remplazar parte del texto
        // String textoNuevo = texto.replace("Hola", "Adios");
        // System.out.println(textoNuevo);
        // // Método para saber si el texto tiene parte de ese conteido pero devuelve true o false
        // System.out.println(texto.endsWith("undo!"));
        // // Metodo para saber si el texto contiene una serie de caracteres en especifico "Hola = Hola"
        // System.out.println(texto.startsWith("hola"));
        // // Metodo para saber si el texto contiene una serie de caracteres "mundo = und"
        // System.out.println(texto.contains("und"));
        // // Metodo para saber donde se encuentra la posicion del texto desde la primera letra
        // System.out.println(texto.indexOf("do!"));
        // // Convertir letras a mayusculas y minusculas
        // System.out.println(texto.toUpperCase());
        // System.out.println(texto.toLowerCase());
        // // Eliminar espacios que estan alcomienzo y al final del string
        // String espacios = "          Chanchito feliz                ";
        // System.out.println(espacios);
        // System.out.println(espacios.trim());


        /* Caracteres de escape ----------------------------------------------------------------------------------------------------- */
        
        // String texto = "C: \\Hola \"mundo\">";
        // // salto de línea
        // String texto2 = "Hola \nmundo";
        // // tabulación
        // String texto3 = "Hola \tmundo";
        // System.out.println(texto);
        // System.out.println(texto2);
        // System.out.println(texto3);
        
        
        /* Arrays (arreglos) --------------------------------------------------------------------------------------------------------- */
        
        // Formas para definir un array
        int[] numeros2 = {6,7,8,9,10};
        int[] numeros = new int[5];
        // Asignar valores a un array
        numeros[0] = 5;
        numeros[1] = 4;
        numeros[2] = 3;
        numeros[3] = 2;
        numeros[4] = 1;
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros2));
        //Mostrar el largo de un array
        System.out.println(numeros.length);
        // ordenar un array
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
        
        /* Multiples dimensiones ------------------------------------------------------------------------------------------------------ */
    
        
    }
}
