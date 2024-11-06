package co.edu.umanizales;

import co.edu.umanizales.interfaces.NadarAble;
import co.edu.umanizales.interfaces.RespirarAble;
import co.edu.umanizales.interfaces.TerrestreAble;

public class Cocodrilo implements RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void nadar() {
        System.out.println("El cocodrilo nada");
    }

    @Override
    public void respirar() {
        System.out.println("El cocodrilo respira");
    }

    @Override
    public void desplazar() {
        System.out.println("El cocodrilo se desplaza");
    }
}
