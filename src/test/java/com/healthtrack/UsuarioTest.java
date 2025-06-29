package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testActualizarPeso_ErrorDetectado() {
        // Creamos un usuario con peso inicial 75.0
        Usuario usuario = new Usuario("Carlos", 75.0);

        // Actualizamos el peso a 80.0 (valor correcto esperado)
        usuario.actualizarPeso(80.0);

        // Obtenemos el peso luego de actualizar
        double pesoActual = usuario.getPeso();

        // Aquí esperamos 80.0 pero la implementación actual falla y devuelve 74.0
        assertEquals(80.0, pesoActual, "El peso actualizado debería ser 80.0 kg");
    }
}
