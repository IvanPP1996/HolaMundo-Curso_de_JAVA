// Librería para usar arreglos
import java.util.Arrays;

public class Tipos_basicos {
    public static void main(String[] args) throws Exception {
        



        /* Tipos de datos primitivos ---------------------------------------------------------------------------------------------- */
        

        /* byte edad = 18;
        System.out.println(edad);
        int numeroGrande = 1000;
        System.out.println(numeroGrande);
        float numeroFlotante = 15.5f;
        System.out.println(numeroFlotante);
        double numeroDouble = 15.6;
        System.out.println(numeroDouble);
        boolean activo = true;
        System.out.println(activo);
        char caracter = 'y';
        System.out.println(caracter); */




        /* Tipos de datos por referencia ------------------------------------------------------------------------------------------- */
        

        // Texto ----------------------------------------------------
        /* String texto = "Hola mundo!";
        System.out.println(texto); 
        
        // Metodos de texto
        System.out.println(texto.length()); // Largo del texto
        
        System.out.println(texto.replace("Hola", "Chao")); // Remplazar parte del texto
        System.out.println(texto); // NOTA: Los strings son inmutables

        System.out.println(texto.endsWith("undo!")); // Devuelve true o false de acuerdo a la palabra con la que termine si es la misma
        System.out.println(texto.startsWith("Hol")); // Devuelve true o false de acuerdo a la palabra con la que empiece si es la misma
        System.out.println(texto.contains("a mun")); // Devuelve true o false si la frase contiene esa palabra o palabras
        System.out.println(texto.indexOf("do")); // Devuelve la posicion de donde inicia la palabra
        
        System.out.println(texto.toUpperCase()); // Devuelve todo en mayuscula
        System.out.println(texto.toLowerCase()); // Devuelve todo en minuscula
        
        
        String Espacios = "       Chanchito feliz          ";
        System.out.println(Espacios.trim()); // Devuelve la frase sin espacios del principio y fin */
        
        


        /* Caracteres de escape ----------------------------------------------------------------------------------------------------- */
        
        
        /* String texto2 = "\\Nuevo uso de \n\tlíneas de \"comando\" para programar";  
        System.out.println(texto2); */




        /* Arrays (Arreglos) -------------------------------------------------------------------------------------------------------- */
        
        
        /* // Definiendo un arreglo sin datos pero con su largo que va a tener
        int[] numeros = new int[5];
        // Definiendo un arreglo con datos
        int[] numeros2 = {0, 1, 2, 3, 4, 5};
        // Agregando valores
        numeros[0] = 5;
        numeros[4] = 7;
        // Mostrando arreglos
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length); // Devuelve el largo del arreglo
        
        Arrays.sort(numeros); 
        System.out.println(Arrays.toString(numeros)); // Devuelve un arreglo ordenado de menor a mayor */




        /* Arreglos multiples dimensiones ------------------------------------------------------------------------------------------- */
        
        
        /* int[][] numeros = {{0, 1}, {2, 3}};
        int[][] numeros2 = new int[3][2];
        int[][][] numeros3 = new int[3][2][2];
        numeros2[0][1] = 5;
        numeros3[0][1][0] = 5;
        System.out.println(Arrays.deepToString(numeros));
        System.out.println(Arrays.deepToString(numeros2));
        System.out.println(Arrays.deepToString(numeros3)); */
        



        /* Constantes ---------------------------------------------------------------------------------------------------------------- */
        
        
        /* final String empresa = "Hola mundo Limited";
        System.out.println(empresa); */




        /* Operadores aritmeticos ----------------------------------------------------------------------------------------------------- */
        
        
        /* int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        float d = 10f / 3f;
        int modulo = 4 % 3;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(modulo);
        
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        
        x = x + 5;
        System.out.println(x);
        x += 5;
        System.out.println(x); */
        



        /* Orden de las operaciones -------------------------------------------------------------------------------------------------- */
        
        
        /*
        * parentesis
        * potencias
        * multiplicación
         * división
         * suma
         * resta
        */
       /* int r = 5 + 3 * 2;
       System.out.println(r);
       r = (5 + 3) * 2;
       System.out.println(r); */
       



       /* Conversión de tipos --------------------------------------------------------------------------------------------------------- */
       
        /* // Conversión implicita
        byte a = 1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);
        // byte -> short -> int -> long -> float -> double
        
        // Conversión eplicita
        int x = 15;
        double y = 15.20;
        int z = (int) (x + y);
        System.out.println(z);
        z =  x + (int) y;
        System.out.println(z);
        
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;
        System.out.println(l); */




        /* Clase Math ------------------------------------------------------------------------------------------------------------------ */
        
        
        /* System.out.println(Math.abs(-15)); // Metodo math valor absoluto
        System.out.println(Math.ceil(10.000001)); // Metodo math redondear numero al mas alto
        System.out.println(Math.floor(7.88888)); // Metodo math redondear numero al mas bajo
        System.out.println(Math.max(15, 25)); // Metodo math para saber el número mayor entre dos números
        System.out.println(Math.min(15, 25)); // Metodo math para saber el número menor entre dos números
        System.out.println(Math.round(15.7)); // Metodo math redondear numero al mas cercano de acuerdo a su decimal
        System.out.println(Math.round(15.2));
        System.out.println(Math.random()); // Metodo math sacar un número aleatorio entre 0 y 1
        System.out.println((Math.random()) * 100); // Metodo math sacar un número aleatorio entre 0 y un número maximo que uno elija
        System.out.println((int) ((Math.random()) * 100)); */




        /* Formato de números ----------------------------------------------------------------------------------------------------------- */
    

        
    }
}
