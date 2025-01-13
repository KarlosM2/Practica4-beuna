package com.example.practica_4;

/**
 * Esta clase contiene el método principal y un ejemplo de función de división.
 * El constructor por defecto no realiza ninguna operación adicional por ahora.
 */
public class App {

    /**
     * Constructor de la clase {@link App}.
     * Este constructor no realiza ninguna operación adicional en este momento,
     * pero es útil para crear instancias de la clase {@link App}.
     */
    public App() {
        // TODO Auto-generated constructor stub
    }

    /**
     * El método principal que arranca la ejecución del programa.
     *
     * @param args Los argumentos que se pasan al programa desde la línea de comandos.
     */
    public static void main(String[] args) {
        // Código aquí
    }

    /**
     * Realiza una operación de división entre dos números.
     *
     * @param a El numerador.
     * @param b El denominador.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el denominador es cero.
     */
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}



