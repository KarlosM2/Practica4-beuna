package com.example.practica_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento de la clase {@link App}.
 */
public class AppTest {
    
    /**
     * Prueba unitaria para verificar que el método {@link App#division(int, int)} 
     * divide correctamente dos números.
     */
    @Test
    public void shouldAnswerWithTrue() {
        // Se crea una instancia de la clase App
        App app = new App();

        // Se prueba la función division con los valores 10 y 5,
        // el resultado esperado es 2.
        assertEquals(2, app.division(10, 5));
    }
}

