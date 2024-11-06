package co.edu.umanizales;

import co.edu.umanizales.interfaces.RespirarAble;
import co.edu.umanizales.interfaces.TerrestreAble;
import co.edu.umanizales.interfaces.VolarAble;

public class Aguila implements RespirarAble, VolarAble, TerrestreAble {
    @Override
    public void respirar() {
        System.out.println("El aguila respira");
    }

    @Override
    public void desplazar() {
        System.out.println("El aguila se desplaza");
    }

    @Override
    public void volar() {
        System.out.println("El aguila vuela");
    }
}
