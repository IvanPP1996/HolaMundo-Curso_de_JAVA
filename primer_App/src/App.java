// Librería para usar arreglos
import java.util.Arrays;
// Librería para insertar datos desde teclado
import java.util.Scanner;
// Librería para usar formatod e numeros
import java.text.NumberFormat;
// Librería para usar Locale Code de los países
import java.util.Locale;

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
        
        /* // Formas para definir un array
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
        System.out.println(Arrays.toString(numeros)); */
        
        
        /* Multiples dimensiones ------------------------------------------------------------------------------------------------------ */
        
        /* int[][] numeros = {{0, 1}, {2, 3}};
        // Otra Forma de definir un array (2 dimensiones)
        int[][] numeros2 = new int[3][2];
        // Otra Forma de definir un array (3 dimensiones)
        int[][][] numeros3 = new int[4][2][3];
        
        numeros2[2][1] = 67;
        numeros3[2][1][0] = -87;
        System.out.println(Arrays.deepToString(numeros));
        System.out.println(Arrays.deepToString(numeros2));
        System.out.println(Arrays.deepToString(numeros3)); */
        

        /* Constantes ------------------------------------------------------------------------------------------------------------------- */
        
        /* final String empresa = "Hola Confidetech Limited";
        System.out.println(empresa);  */
        
        
        /* Comentarios ------------------------------------------------------------------------------------------------------------------- */
        
        // Comentrio de una línea
        /* 
        Comentario de varias líneas
        1
        2
        3
        4
        */

        
        /* Operadores aritmeticos --------------------------------------------------------------------------------------------------------- */
        
        /* int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        float d = 10f / 5f;
        double e = 10.0 / 3.0;
        int modulo = 4 % 3;
        
        int x = 5;
        x += 5;
        int y = x++;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(modulo);
        System.out.println(x);
        System.out.println(y); */


        /* Orden de las operaciones --------------------------------------------------------------------------------------------------------- */
        
        /**
         * parentesis
         * potencia
         * multiplicación
         * división
         * suma
         * resta
        */
       /* int r = (5 + 3) * 2;
       int y = 5 + 3 * 2;
       
       System.out.println(r);
       System.out.println(y); */

       
       /* Conversión tipos -------------------------------------------------------------------------------------------------------------------- */
       
       /* byte a = 1;
        float b = 15.15f;
        // Conversión implicita:
        // a) byte -> short -> int -> long -> float -> double
        // b) float -> double
        double c = a + b;
        
        int x = 15;
        double y = 15.015;
        
        // Conversión explicita:
        int z = (int) (x + y);
        int u = x + (int) y;

        String o = "1.1";
        int k = 5;
        
        // String a number
        double l = Double.parseDouble(o) + k;

        System.out.println(c);
        System.out.println(z);
        System.out.println(u);
        System.out.println(l); */


        /* Clase Math -------------------------------------------------------------------------------------------------------------------------- */
        
        /* // Valor absoluto
        System.out.println(Math.abs(-15));
        // redondear al número mas arriba
        System.out.println(Math.ceil(3.2));
        // redondear al número mas abajo
        System.out.println(Math.floor(5.8));
        // redondear al número de acuerdo a su cercanía del decimal si es mayor a 5 a su número mator si es menor de 5 a su número menor
        System.out.println(Math.round(78.4));
        System.out.println(Math.round(78.9));
        // Númer de mayor valor
        System.out.println(Math.max(15, 25));
        // Númer de mmenor valor
        System.out.println(Math.min(15, 25));
        // Número aleatorio entre 0 - 1
        System.out.println(Math.random());
        // Número aleatorio entre 0 - 100
        System.out.println(Math.random() * 100);
        // transformando el número a entero
        System.out.println((int) (Math.random() * 100)); */
        
        
        /* Formato de números ------------------------------------------------------------------------------------------------------------------- */
        
        /* // Clase NumberFormat para convertir un número a moneda
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String result = numberFormat.format(10785990.90);
        System.out.println(result);
        
        // Convertir la moneda a otra moneda
        // NOTA: Para conocer la local(languageTag) code de un pais busca en google poniendo "nombre del pais locale code"
        Locale local = Locale.forLanguageTag("es-CO");
        NumberFormat nummeroFormatColombia = NumberFormat.getCurrencyInstance(local);
        String resultColombia = nummeroFormatColombia.format(10785990.90);
        System.out.println(resultColombia);

        // Moneda de chile
        Locale localChile = Locale.forLanguageTag("es-CL");
        NumberFormat nummeroFormatCL = NumberFormat.getCurrencyInstance(localChile);
        String resultChile = nummeroFormatCL.format(10785990.90);
        System.out.println(resultChile);
        
        //Formatear un número a porcentaje
        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.print(porcentaje.format(0.15));*/


        /* Clase Scanner --------------------------------------------------------------------------------------------------------------------------- */
        
        /* Scanner insertandoDato = new Scanner(System.in);
        
        String valor = insertandoDato.nextLine();
        System.out.print("Ingresa tu edad: ");
        Byte valor2 = insertandoDato.nextByte();
        System.out.println(valor);
        System.out.print("Tu edad es: ");
        System.out.print(valor2);
        
        insertandoDato.close(); */


        /* Ejercicio calculadora -------------------------------------------------------------------------------------------------------------------- */
    
        

    }
}
