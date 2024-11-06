package co.edu.umanizales;

import co.edu.umanizales.interfaces.NadarAble;
import co.edu.umanizales.interfaces.RespirarAble;
import co.edu.umanizales.interfaces.TerrestreAble;
import co.edu.umanizales.interfaces.VolarAble;

public class Pato implements NadarAble, RespirarAble, TerrestreAble, VolarAble {
    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }

    @Override
    public void respirar() {
        System.out.println("El pato respira");
    }

    @Override
    public void desplazar() {
        System.out.println("El pato se desplaza");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }
}
