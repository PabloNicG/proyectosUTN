import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        /* Declaro las variables - Estas variables son declaradas como double ya que puede existir
        la necesidad de ingresar numeros decimales */
        double resultado = 0;
        double numero1;
        double numero2;

        /* El "Scanner" es una clase que nos permite obtener la entrada de datos primitivos por consola*/
        Scanner sc = new Scanner(System.in);

        /* Armado del listado de opciones */
        System.out.println("Bienvenido a la calculadora Java.");
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");

        /* El resultado de "sc" se lo asigno a la variable entera de "opcion" */
        int opcion = sc.nextInt();

        /* Declaro un bucle while con un Switch dentro el cual va a ir iterando segun se marque la
        * opcion, si es distinto de cero pero esta entre 1 y 4 realizará una accion, si es igual a cero
        * finaliza el ciclo del bucle y si es distinto de cero pero no esta entre los numeros opcionales
        * el bucle dará como la opcion por default y volverá al indice. */
        while (opcion != 0) {

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    numero1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    numero2 = sc.nextInt();

                    resultado = suma(numero1, numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 2:

                    System.out.println("Ingrese el primer número: ");
                    numero1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    numero2 = sc.nextInt();

                    resultado = resta(numero1, numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 3:

                    System.out.println("Ingrese el primer número: ");
                    numero1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    numero2 = sc.nextInt();

                    resultado = multiplicacion(numero1, numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 4:

                    System.out.println("Ingrese el primer número: ");
                    numero1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    numero2 = sc.nextInt();

                    resultado = division(numero1, numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                default:
                    System.out.println("Opción no válida.");

            }

            System.out.println("¿Qué operación desea realizar a continuación?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
        }
        System.out.println("Gracias por usar la calculadora Java.");

    }

    /* Declaro los metodos de suma(), resta(), multiplicacion() y division() que utilizo en el
    * switch. */
    public static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double division(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }
}
