package co.edu.umanizales;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Aguila aguila = new Aguila();
        Cocodrilo cocodrilo = new Cocodrilo();
        Elefante elefante = new Elefante();
        Leon leon = new Leon();
        Tiburon tiburon = new Tiburon();


        System.out.println("Pato:");
        pato.volar();
        pato.nadar();
        pato.desplazar();
        pato.respirar();

        System.out.println("Elefante:");
        elefante.desplazar();
        elefante.respirar();
        elefante.nadar();

        System.out.println("Cocodrilo:");
        cocodrilo.nadar();
        cocodrilo.desplazar();
        cocodrilo.respirar();

        System.out.println("León:");
        leon.desplazar();
        leon.respirar();

        System.out.println("Águila:");
        aguila.volar();
        aguila.respirar();
        aguila.desplazar();

        System.out.println("Tiburón:");
        tiburon.nadar();
        tiburon.respirar();
    }

}