package clases_abstractas;

public class Circulo implements Figura,Dibujable,Rotable{
    private double radio;

    public Circulo() {
    }

//    public Circulo(double x, double y, double radio) {
//        super(x, y);
//        this.radio = radio;
//    }


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("hola estoy rotando un circulo");
    }
}
