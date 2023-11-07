import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mutante {
    public static void main(String[] args) {

        //String[] dna1 = {"ATGCGA", "CAGTGC3", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        System.out.println("Ingrese las secuencias de ADN (6 filas x 6 letras cada una):");

        //Declaracion de Variables y estructuras
        String[][] matriz = new String[6][6];
        Scanner scanner = new Scanner(System.in);


        //Expresion regular que solo admite los caracteres A,T,C,G
        String expresionRegular = "^[ATCG]*$";

        Pattern pattern = Pattern.compile(expresionRegular);
        //Matcher matcher = pattern.matcher(matriz[i][j]);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduzca el carácter en la posición (" + i + "," + j + "): ");
                matriz[i][j] = scanner.nextLine().toUpperCase();

                Matcher matcher = pattern.matcher(matriz[i][j]);

                // Compruebo si el carácter cumple
                if (!matcher.matches()) {

                    System.out.println("El carácter introducido no es válido. Vuelva a introducirlo: ");
                    matriz[i][j] = scanner.nextLine(); //Vuelvo a pedir ingresar el caracter

                    // Crea un nuevo matcher a partir del patrón y el carácter introducido
                    matcher = pattern.matcher(matriz[i][j]);

                    // Repito hasta que ingrese la letra correcta
                    while (!matcher.matches()) {

                        System.out.println("El carácter introducido no es válido. Vuelva a introducirlo: ");
                        matriz[i][j] = scanner.nextLine().toUpperCase();//Pido el ingreso
                        matcher = pattern.matcher(matriz[i][j]);//recreo el matcher

                    }
                }
            }
        }


        //IMPRIMIR MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" '" + matriz[i][j] + "' ");
            }
            System.out.println();

        }


        if (isMutant(matriz)) {
            System.out.println("El humano es mutante.");
        } else {
            System.out.println("El humano no es mutante.");
        }
    }

    public static boolean isMutant(String[][] dna) {
        int n = dna.length;
        int secuenciasMutantes = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Verificar horizontal
                if (j + 3 < n) {
                    if (dna[i][j].equals(dna[i][j + 1]) &&
                            dna[i][j].equals(dna[i][j + 2]) &&
                            dna[i][j].equals(dna[i][j + 3])) {
                        secuenciasMutantes++;
                    }
                }

                // Verificar vertical
                if (i + 3 < n) {
                    if (dna[i][j].equals(dna[i + 1][j]) &&
                            dna[i][j].equals(dna[i + 2][j]) &&
                            dna[i][j].equals(dna[i + 3][j])) {
                        secuenciasMutantes++;
                    }
                }

                // Verificar diagonal hacia la derecha
                if (i + 3 < n && j + 3 < n) {
                    if (dna[i][j].equals(dna[i + 1][j + 1]) &&
                            dna[i][j].equals(dna[i + 2][j + 2]) &&
                            dna[i][j].equals(dna[i + 3][j + 3])) {
                        secuenciasMutantes++;
                    }
                }

                // Verificar diagonal hacia la izquierda
                if (i + 3 < n && j - 3 >= 0) {
                    if (dna[i][j].equals(dna[i + 1][j - 1]) &&
                            dna[i][j].equals(dna[i + 2][j - 2]) &&
                            dna[i][j].equals(dna[i + 3][j - 3])) {
                        secuenciasMutantes++;
                    }
                }
            }
        }

        return secuenciasMutantes > 1;
    }
}
/*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 3; j++) {
                // Comprueba si la secuencia actual es igual a la secuencia anterior
                int contadorSecuencias = 1;
                for (int k = 1; k < 4; k++) {
                    if (matriz[i][j] == matriz[i][j + k]) {
                        contadorSecuencias++;
                    } else {
                        break;
                    }
                }

                // Si el contador de secuencias es mayor que 1, imprime la secuencia
                if (contadorSecuencias > 1) {
                    System.out.println("1"+Arrays.copyOfRange(matriz[i], j, j + contadorSecuencias));
                }
            }
        }


        // Vertical
        for (int i = 0; i < matriz.length - 3; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Comprueba si la secuencia actual es igual a la secuencia anterior
                int contadorSecuencias = 1;
                for (int k = 1; k < 4; k++) {
                    if (matriz[i][j] == matriz[i + k][j]) {
                        contadorSecuencias++;
                    } else {
                        break;
                    }
                }

                // Si el contador de secuencias es mayor que 1, imprime la secuencia
                if (contadorSecuencias > 1) {
                    System.out.println("2"+Arrays.copyOfRange(matriz[i], j, j + contadorSecuencias));
                }
            }
        }

        // Diagonal
        for (int i = 0; i < matriz.length - 3; i++) {
            for (int j = 0; j < matriz[i].length - 3; j++) {
                // Comprueba si la secuencia actual es igual a la secuencia anterior
                int contadorSecuencias = 1;
                for (int k = 1; k < 4; k++) {
                    if (matriz[i][j] == matriz[i + k][j + k]) {
                        contadorSecuencias++;
                    } else {
                        break;
                    }
                }

                // Si el contador de secuencias es mayor que 1, imprime la secuencia
                if (contadorSecuencias > 1) {
                    System.out.println("3"+Arrays.copyOfRange(matriz[i], j, j + contadorSecuencias));
                }
            }
        }
*/
//}
//}
