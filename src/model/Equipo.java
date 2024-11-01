package model;

public class Equipo {

    private final int CANTIDAD_JUGADORES = 6;

    protected String nombreEquipo;

    private JugadorHockey[] jugadores = new JugadorHockey[CANTIDAD_JUGADORES];

    public Equipo() {
        jugadores = new JugadorHockey[CANTIDAD_JUGADORES];
        this.nombreEquipo = nombre;
    }

    public boolean agregarJugador(JugadorHockey jugador) {

        for(int = 0; i < jugadores.length; i++) {
            if(jugadores[i] == null) {
                jugadores [i = jugador;]
                return true;
            }
        }
        return false;
    }

    public JugadorHockey crearJugador(String nombre, int edad, Posicion posicion) {
        JugadorHockey jugador = new JugadorHockey(jugador, edad, posicion);
        return jugador;
    }

    public JugadorHockey[] getJugadores() {
        return jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo; 
    }
}