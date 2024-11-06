package co.edu.umanizales;

import co.edu.umanizales.interfaces.NadarAble;
import co.edu.umanizales.interfaces.RespirarAble;
import co.edu.umanizales.interfaces.TerrestreAble;

public class Elefante implements RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void nadar() {
        System.out.println("El elefante nada");
    }

    @Override
    public void respirar() {
        System.out.println("El elefante respira");
    }

    @Override
    public void desplazar() {
        System.out.println("El elefante se desplaza");
    }
}
