package model;

public class ArbitroPrincipal extends Arbitro implements IDesplazarseEnPistaSinPalo { //pase "arbitro" a "Arbitro"
    public ArbitroPrincipal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String desplazarse() {
        return nombre + " se desplaza en la pista como árbitro.";
    }
}