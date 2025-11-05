import jdk.jshell.execution.Util;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*Si lees esto es que está editado*/
/* Comento para comprobar que funciona*/

public class arrays1
{
    static int ejercicio;

    public static void main()
    {
        Utils.sc = new Scanner(System.in);
        ejercicio = 0;
        menu();
    }

    public static void menu()
    {
        int ejercicios;
        do
        {
            System.out.println("------------------------Archivo modificado-------------------------------");
            System.out.println("Hola");
            System.out.println("Ejercicios de Arrays: \n ---Nivel Padawan---");
            System.out.println("1. Números reales");
            System.out.println("2. Suma de valores");
            System.out.println("3. Máximo y mínimo");
            System.out.println("4. Suma de veinte números");
            System.out.println("5. Media de veinte números");
            System.out.println("6. Crea una arrays con dos valores");
            System.out.println("7. Arrays desde A hasta B");
            System.out.println("---Nivel Jedi---\n8. Random");
            System.out.println("9. Llena de manera aleatoria");
            System.out.println("10. Alturas");
            System.out.println("11. Invierte los arrays");
            System.out.println("12. Menú de arrays");
            System.out.println("13. Secuencia de números");
            System.out.println("14. Secuencia");
            System.out.println("--Clases Arrays--\n15. Tamaño N y posiciones M");
            System.out.println("16. Secuencia fill");
            System.out.println("17. Veinte valores");
            System.out.println("18. Llenar de valores aleatorios");
            System.out.println("19. Ranking ajedrez");
            System.out.println("20. Buscar un valor");
            ejercicios = Utils.validaInt();
            switch (ejercicios)
            {
                case 1:
                    numerosReales();
                    break;

                case 2:
                    sumaDeValores();
                    break;

                case 3:
                    maximoMinimo();
                    break;

                case 4:
                    sumaVeinteNumeros();
                    break;

                case 5:
                    mediaNumeros();
                    break;

                case 6:
                    arraysDoble();
                    break;

                case 7:
                    arraysAB();
                    break;

                case 8:
                    random();
                    break;

                case 9:
                    arraysRandom();
                    break;

                case 10:
                    alturas();
                    break;

                case 11:
                    invertido();
                    break;

                case 12:
                    menuArrays();
                    break;

                case 13:
                    secuencia();
                    break;

                case 14:
                    secuenciaNumerosEnteros();
                    break;

                case 15:
                    tamanyoYPosiciones();
                    break;

                case 16:
                    fill();
                    break;

                case 17:
                    veinteValores();
                    break;

                case 18:
                    rellenarValoresAleatorios();
                    break;

                case 19:
                    rankingAjedrez();
                    break;

                case 20:
                    buscarValor();
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (ejercicios!=20);
    }

    /* Ejercicio1*/ public static void numerosReales()
    {
        /* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores. */
        int[] numeros = new int[10];

        for (int i = 0; i<10;i++)
        {
            System.out.print("Introduce diez números reales " + (i+1) + " :");
            numeros[i] = Utils.validaInt();
        }
        System.out.print("Los valores de los números son: \n");

        for (int i = 0; i < 10; i++)
        {
            System.out.print(numeros[i] + " ");
        }
    }

    /* Ejercicio2 */ public static void sumaDeValores()
    {
        /* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores. */

        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i<10;i++)
        {
            System.out.print("Introduce diez números para después sumarlos" + (i+1)+ ": ");
            numeros[i] = Utils.validaInt();
            suma += numeros[i];
        }

        System.out.print("\nLa suma de los números es: " + suma);
        System.out.println();
    }

    /* Ejercicio3 */ public static void maximoMinimo()
    {
        /* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */
        int [] numeros = new int[10];

        for (int i = 0; i<10; i++)
        {
            System.out.print("Introduce diez números, te mostraré el valor más alto y el más bajo --> Numero " + (i+1) +": ");
            numeros[i] = Utils.validaInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int i = 1; i<10; i++)
        {
            if (maximo>numeros[i])
            {
                maximo = numeros[i];
            }

            else
            {
                minimo = numeros[i];
            }
        }

        System.out.println("El valor máximo es: " + maximo + " y el valor mínimo es: " + minimo);
    }

    /* Ejercicio4 */ public static void sumaVeinteNumeros()
    {
        /* Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.  */
        int [] numeros = new int[20];
        int suma = 0;
        System.out.println("Introduce veinte números, luego los sumaré: ");

        for (int i=0; i<20;i++)
        {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = Utils.validaInt();
            suma +=Math.abs(numeros[i]);
        }

        System.out.print("La suma de los números es: " + suma);
        System.out.println();
    }

    /* Ejercicio5 */ public static void mediaNumeros()
    {
        /* Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. */
        int []numeros = new int[20];
        double media = 0;
        int suma = 0;
        System.out.println("Introduce veinte números, luego calcularé la media");

        for (int i = 0; i <20; i++)
        {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = Utils.validaInt();
            suma += numeros[i];
            media = (double) (suma/numeros.length);
        }

        System.out.println("El resultado de la suma de los valores es: " + suma + " y la media de estos es: " + media);
        System.out.println();
    }

    /* Ejercicio6 */ public static void arraysDoble()
    {
        /* Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla. */
        System.out.println("Introduce el valor de N(tamaño del arrays): ");
        int n = Utils.validaInt();

        System.out.println("Introduce el valor de M(valor a rellenar): ");
        int m = Utils.validaInt();

        int []numeros = new int[n];

        for (int i = 0; i < n; i++)
        {
            numeros[i] = m;
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(numeros[i] + " ");
        }
    }

    /* Ejercicio7 */ public static void arraysAB()
    {
        /* Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla. */
        System.out.print("Introduce el primer valor: ");
        int p = Utils.validaInt();

        System.out.print("Introduce el segundo valor: ");
        int q = Utils.validaInt();

        if (p>q)
        {
            System.out.println("ERROR: El segundo valor debe ser mayor que el primero");
        }

        else
        {
            int tamanyoArrays = q - p +1;
            int numeros[] = new int[tamanyoArrays];

            for (int i = 0; i < tamanyoArrays; i++)
            {
                numeros[i] = p+i;
            }

            for (int i = 0; i < tamanyoArrays; i++)
            {
                System.out.println(numeros[i]+ " ");
            }
        }
    }

    /* Ejercicio8 */ public static void random()
    {
        /* Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R. */
        double numerosAleatorios[] = new double[100];
        for (int i = 1; i < numerosAleatorios.length; i++)
        {
            numerosAleatorios[i] = Math.random();
        }

        System.out.print("Introduce un valor para comprobar los del arrays: ");
        double r = Utils.validaDouble();

        int contador = 0;
        for (int i = 1; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] >= r) {
                contador++;
            }
        }

        System.out.println("\nHay " + contador + " números iguales o mayores que " + r);
    }

    /* Ejercicio9 */ public static void arraysRandom()
    {
        /* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.  */
        int [] numerosAleatorios = new int[100];
        for (int i = 1; i < numerosAleatorios.length; i++)
        {
            numerosAleatorios[i]=(int)(1+Math.random()*10);
        }

        System.out.println("Introduce un número para saber si aparece en el arrays");
        int numero = Utils.validaInt();

        System.out.println("El número introducido aparece en las posiciones: ");
        boolean aparece = false;
        for (int i = 0; i < numerosAleatorios.length; i++)
        {
            if (numerosAleatorios[i] == numero)
            {
                System.out.println(i + " ");
                aparece = true;
            }
        }

        if (!aparece)
        {
            System.out.println("No aparece en el arrays");
        }
    }

    /* Ejercicio10 */ public static void alturas()
    {
        /* Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y por debajo de la media.*/

        System.out.print("Introduce el número de personas cuyas alturas queremos conocer: ");
        int personas = Utils.validaInt();
        double[] alturas = new double[personas];

        for (int i = 0; i < personas; i++)
        {
            System.out.println("Introduce la altura de las personas: ");
            alturas[i] = Utils.validaDouble();
        }

        double suma = 0;
        double alturaMaxima = alturas[0];
        double alturaMinima = alturas[0];

        for (int i =0;i<personas;i++)
        {
            suma += alturas[i];
            if (alturas[i]>alturaMaxima)
            {
                alturaMaxima = alturas[i];
            }

            if (alturas[i]<alturaMinima)
            {
                alturaMinima =alturas[i];
            }
        }

        double media = suma/personas;
        int encimaMedia = 0;
        int debajoMedia = 0;

        for (int i = 0; i < personas; i++)
        {
            if (alturaMaxima>alturas[i])
            {
                encimaMedia++;
            }

            if (alturaMinima<alturas[i])
            {
                debajoMedia++;
            }
        }
        System.out.println("Se han resistrado los datos de " + personas + " personas.");
        System.out.println("La altura media es: " + media + "m");
        System.out.println("La altura máxima registrada es: " + alturaMaxima + "m");
        System.out.println("La altura mínima registrada es: " + alturaMinima + "m");
        System.out.println("Hay " + debajoMedia + " personas por debajo de la media, y " + encimaMedia + " personas por encima de la media");
    }

    /* Ejercicio11 */ public static void invertido()
    {
        /* Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla. */
        int []arrays1= new int[100];
        int [] arrays2 = new int[100];

        for (int i=0; i<arrays1.length;i++)
        {
            arrays1[i] = i+1;
        }

        for (int i = 0; i < arrays2.length; i++)
        {
            arrays2[i] =arrays1[arrays1.length-1-i];
        }

        System.out.println("Array1 del 1 al 100");
        for (int i = 0; i < arrays1.length; i++)
        {
            System.out.println(arrays1[i] + " ");
        }

        System.out.println("Array2 del 100 al 1");
        for (int i = 0; i < arrays2.length; i++)
        {
            System.out.println(arrays2[i] + " ");
        }
    }

    /* Ejercicio12 */ public static void menuArrays()
    {
        /* Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
        a. Mostrar valores.
        b. Introducir valor.
        c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.*/
        char opciones;
        int [] numeros = new int[10];

        do
        {
            System.out.print("Escoja una opción");
            System.out.println("\n---Menú---");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            opciones = Utils.sc.next().toLowerCase().charAt(0);
            switch (opciones)
            {
                case 'a':
                    System.out.println("Muestra todos los valores del arrays: ");
                    for (int i =0;i<numeros.length;i++)
                    {
                        System.out.println("Posición " + i + ": " + numeros[i]);
                    }
                break;

                case 'b':
                    System.out.print("Introduce el valor de V: ");
                    int valor = Utils.validaInt();
                    System.out.print("Dime en qué posición quieres dicho valor: ");
                    int posicion = Utils.validaInt();
                    if (posicion>=0 && posicion< numeros.length)
                    {
                        numeros[posicion]=valor;
                        System.out.println("Valor actualizado");
                    }

                    else
                    {
                        System.out.println("Error la posición no es válida, debe encontrarse entre 0 y 9");
                    }
                break;

                case 'c':
                    System.out.println("Está saliendo del programa ¡Hasta la vista!");
                    break;
            }
        }while (opciones!='c');
    }

    /* Ejercicio13 */ public static void secuencia()
    {
        /* Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de N (nº de valores a crear).*/

        System.out.print("Introduce el valor inicial de la secuencia(V): ");
        int valorInicial = Utils.validaInt();

        System.out.print("Introduce el incremento que tendrá la secuencia(I): ");
        int incremento = Utils.validaInt();

        System.out.print("Introduce el número de valores que quieres que genere el arrays(N): ");
        int numero = Utils.validaInt();

        int[] secuencia = new int[numero];
        for (int i = 0; i < numero; i++)
        {
            secuencia[i] = valorInicial+(incremento*i);
        }

        System.out.print("La secuencia generada es: ");
        for (int i = 0; i<numero;i++)
        {
            System.out.print(secuencia[i] + " ");
        }
        System.out.println();
    }

    /* Ejercicio14 */ public static void secuenciaNumerosEnteros()
    {
        /* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla. */
        int tamanyo = (10*(10+1))/2;
        int[] numeros = new int[tamanyo];

        int secuencia = 0;

        for (int i = 0;i<=10;i++)
        {
            for (int j = 0; j < i; j++)
            {
                numeros[secuencia]=i;
                secuencia++;
            }
        }

        System.out.print("Secuencia de números: ");
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    /* Ejercicio15 */ public static void tamanyoYPosiciones()
    {
        /* Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas sus posiciones. Luego muestra el array por pantalla. */
        System.out.print("Introduce el tamaño del arrays: ");
        int tamanyo = Utils.validaInt();

        System.out.print("Introduce el valor que quieres que se repita: ");
        int valorRepetible = Utils.validaInt();
        int [] arrays = new int[tamanyo];

        for (int i = 0; i < tamanyo; i++)
        {
            arrays[i] = valorRepetible;
        }

        Arrays.fill(arrays, valorRepetible);
        System.out.print("El arrays quedaría así: " + Arrays.toString(arrays) + " ");
        System.out.println();
    }

    /* Ejercicio16 */ public static void fill()
    {
        /* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla */
        int tamanyo = (10*(10+1))/2;
        int [] numeros = new int[tamanyo];
        int secuencia = 0;

        for (int i = 0; i <=10; i++)
        {
            Arrays.fill(numeros, secuencia, secuencia+i,i);
            secuencia += i;
        }

        System.out.print("La secuencia quedaría así: " + Arrays.toString(numeros));
        System.out.println();
    }

    /* Ejercicio17 */ public static void veinteValores()
    {
        /* Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no. */
        int [] numeros = new int[20];
        int [] primeros = new int[10];
        int [] ultimos = new int[10];

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Número " + (i+1) + " ");
            numeros[i] = Utils.validaInt();
        }

        primeros = Arrays.copyOfRange(numeros,0,10);
        ultimos = Arrays.copyOfRange(numeros, 10,20);

        System.out.println("\nLa primera secuencia: " + Arrays.toString(primeros));
        System.out.println("La última secuencia: " + Arrays.toString(ultimos));

        if (Arrays.equals(primeros,ultimos))
        {
            System.out.println("Las secuencias son iguales");
        }

        else
        {
            System.out.println("Las secuencias son distintas");
        }
    }

    /* Ejercicio18 */ public static void rellenarValoresAleatorios()
    {
        /* Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla. */
        int numeros[] =new int[30];

        for (int i = 0;i<numeros.length;i++)
        {
            numeros[i] = (int) (Math.random()*10);
        }

        System.out.println("El arrays original es: " + Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("El arrays con los números ordenados es: " + Arrays.toString(numeros));
    }

    /* Ejercicio19 */ public static void rankingAjedrez()
    {
        /* Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja). */
        Integer [] puntuacion = new Integer[8];

        for (int i = 0; i < puntuacion.length; i++)
        {
            int puntos;
            do
            {
                System.out.print("Puntuación del jugador" + (i+1) + ": ");
                puntos = Utils.validaInt();

                if (puntos<1000 || puntos>2000)
                {
                    System.out.println("ERROR la puntuación debe estar entre 1000 y 2000");
                }
            }while (puntos<1000 || puntos>2000);

            puntuacion[i] = puntos;
        }

        Arrays.sort(puntuacion, Collections.reverseOrder());

        for (int i = 0; i < puntuacion.length; i++)
        {
            System.out.print((i+1) + " posición: " + puntuacion[i] + " puntos\n");
        }
    }

    /* Ejercicio20 */ public static void buscarValor()
    {
        /* Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces. */
        int [] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = (int) (Math.random()*100);
        }

        System.out.print("Introduce el valor a buscar(N): ");
        int n = Utils.validaInt();

        int contador = 0;
        for (int valor : numeros)
        {
            if (valor == n)
            {
                contador++;
            }
        }

        if (contador>0)
        {
            System.out.println("El número " + n + " aparece " + contador + " veces en la secuencia");
        }

        else
        {
            System.out.println("El número " + n + " no aparece en la secuencia");
        }
    }
}
