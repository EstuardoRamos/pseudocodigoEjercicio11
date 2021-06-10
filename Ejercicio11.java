import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int edad, numAleatorio, nPar = 0, nImpar = 0, nCero = 0, numMayor = 0, tPar = 0, nDoce = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            numAleatorio = (int) (Math.random() * 36);
            System.out.println(numAleatorio);
            if (numAleatorio % 2 == 0) {
                nPar += 1;
            }
            if (numAleatorio > 12 && numAleatorio < 25) {
                nDoce += 1;
            }
            if (numAleatorio > numMayor) {
                numMayor = numAleatorio;
            }

            if (numAleatorio % 2 == 0 && numAleatorio != 0) {
                nPar += 1;
                tPar += numAleatorio;

            } else if (numAleatorio == 0) {
                int canCero = 1;
            } else {
                nImpar += 1;
            }

        }
        System.out.println("La cantidad de numeros impares es " + nImpar);
        float promedioPar = tPar / nPar;
        System.out.println("El promedio de numeros pares es " + promedioPar);
        System.out.println("La cantidad de numeros que se encuntran en la segunda dicena (13 al 24) es " + nDoce);
        System.out.println("El numero mayor es " + numMayor);
    }
}

