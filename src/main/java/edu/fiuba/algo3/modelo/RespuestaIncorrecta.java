package edu.fiuba.algo3.modelo;

public class RespuestaIncorrecta implements Respuesta {
    @Override
    public int calificar() {
        return 0;
    }

    @Override
    public boolean esCorrecta() {
        return false;
    }
}
