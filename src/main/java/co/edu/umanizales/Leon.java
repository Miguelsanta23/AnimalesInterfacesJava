package co.edu.umanizales;

import co.edu.umanizales.interfaces.RespirarAble;
import co.edu.umanizales.interfaces.TerrestreAble;

public class Leon implements RespirarAble, TerrestreAble {
    @Override
    public void respirar() {
        System.out.println("El leon respira");
    }

    @Override
    public void desplazar() {
        System.out.println("El leon se desplaza");
    }
}
