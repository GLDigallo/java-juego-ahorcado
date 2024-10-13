package javajuegoahorcado;

import java.util.Scanner;

public class JavaJuegoAhorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "INTELIGENCIA";
        int intentosMax = 15;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMax) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor: ");
            char letra = Character.toUpperCase(teclado.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! te quedan: " + (intentosMax - intentos) + " Intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("¡Que pena, te has quedado sin intentos! GAME OVER, GRACIAS POR JUGAR");
        }
        teclado.close();
    }

}
