package Exercicio3;

public class Executar {

    public static void main(String[] args) {

        Porta p1 = new Porta();

        p1.dimensaoX = 18;
        p1.dimensaoY = 26;
        p1.dimensaoZ = 27;

        p1.pinta();
        p1.abre();
        p1.fecha();

        System.out.println("Sua cor é " + p1.cor + ", suas dimensões XYZ são : " + p1.dimensaoX + "," + p1.dimensaoY + "," + p1.dimensaoZ);
    }
}