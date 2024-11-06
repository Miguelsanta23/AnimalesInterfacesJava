package co.edu.umanizales;

import co.edu.umanizales.interfaces.NadarAble;
import co.edu.umanizales.interfaces.RespirarAble;

public class Tiburon implements RespirarAble, NadarAble {
    @Override
    public void nadar() {
        System.out.println("El tiburon nada");
    }

    @Override
    public void respirar() {
        System.out.println("El tiburon respira");
    }
}
