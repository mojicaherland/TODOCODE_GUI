package clases_abstractas;

public class Cuadrado implements Figura,Dibujable{
    private double lado;

    public Cuadrado() {
    }

//    public Cuadrado(double x, double y, double lado) {
//        super(x, y);
//        this.lado = lado;
//    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando un cuadrado");
    }
}
