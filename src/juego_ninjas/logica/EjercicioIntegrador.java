package juego_ninjas.logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Naruto naruto = new Naruto();
        Sasuke sasuke = new Sasuke();

        naruto.pelearCuerpoACuerpo();
        sasuke.usoSharingan();
    }
}
