package model;

import java.util.Random;

public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;

    private int contadorEquipos = 0;

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[CANTIDAD_ARBITROS];
    }

    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(4);
        int equipo2;
        do {
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2;
        fixture += "\n";

        do {
            equipo1 = random.nextInt(4);
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }

    public Equipo crearEquipo(String nombre) {
        Equipo equipo = new Equipo(nombre);
        return equipo;
    }

    public boolean asignarEquipo(Equipo equipo) {
        for(int i = 0; i < equipos.length; i++) {
            if(equipos[i] == null) {
                equipos[i] = equipo;
                return true;
            }
        }
        return false;
    }


    public boolean crearJugador(Equipo equipo, String nombre, int edad, Posicion posicion) {

        return equipo.agregarJugador(equipo.crearJugador(nombre,edad, posicion));
    }

    public boolean anadirArbitro(Arbitro arbitro) {
        for(int i = 0; i < arbitros.length; i++) {
            if(arbitros[i] == null) {
                arbitros[i] = arbitro;
                return true;
            }
        }
        return false;
    }


    public Arbitro crearArbitroPrincipal(String nombre, int edad) {
        Arbitro arbitro = new ArbitroPrincipal(nombre, edad);
        return arbitro;
    }

    public Arbitro crearJuezDeLinea(String nombre, int edad) {
        Arbitro arbitro = new JuezDeLinea(nombre, edad);
        return arbitro;
    }

    public void informacionPorDefecto() {
        Equipo equipo1 = crearEquipo("Equipo 1");
        asignarEquipo(equipo1);
        crearJugador(equipo1, "Jugador 1", 23, Posicion.PORTERO);
        crearJugador(equipo1, "Jugador 2", 26, Posicion.DEFENSA);
        crearJugador(equipo1, "Jugador 3", 22, Posicion.DEFENSA);
        crearJugador(equipo1, "Jugador 4", 24, Posicion.DEFENSA);
        crearJugador(equipo1, "Jugador 5", 23, Posicion.DEFENSA);
        crearJugador(equipo1, "Jugador 6", 27, Posicion.ALA);

        Arbitro arbitro1 = crearArbitroPrincipal("Arbitro 1", 24);
        anadirArbitro(arbitro1);
        Arbitro arbitro2 = crearArbitroPrincipal("Abitro 2", 31);
        anadirArbitro(arbitro2);
        Arbitro juezDeLinea1 = crearJuezDeLinea("Juez de linea 1", 29);
        anadirArbitro(juezDeLinea1);
        Arbitro juezDeLinea2 = crearJuezDeLinea("Juez de linea 2", 34);
        anadirArbitro(juezDeLinea2);
    }

    public String ejecutarPartido() {
        String mensaje = "";
        Equipo equipo = equipos[0];
        Random index = new Random();
        int jugador1;
        int jugador2;
        int jugador3 =0;

        for(int i = 0; i < 5; i++) {

            do {
                jugador1 = index.nextInt(6);
                jugador2 = index.nextInt(6);
                jugador3 = index.nextInt(6);
            } while (jugador1 == jugador2);

            mensaje = mensaje + equipos[0].getJugadores()[jugador1].getNombre() + equipos[0].getJugadores()[jugador1].getNombre() + equipos[0].getJugadores()[jugador1].paseDelDisco() + equipos[0].getJugadores()[jugador2].getNombre()+"\n";

            mensaje = mensaje + arbitros[0].desplazarse()+"\n";

            jugador3 = jugador2;
        }

        mensaje = mensaje + equipos[0].getJugadores()[jugador3].getNombre() + equipos[0].getJugadores()[jugador3].jugadorHaceGol();

        return mensaje;
    }


}