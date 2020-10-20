package Exercicio4;

public class CasaMain{
    public static void main( String[] args ){
        Casa c1 = new Casa();
        Porta p1 = new Porta();
        c1.porta1 = p1;
        c1.porta2 = p1;
        c1.porta3 = p1;

        c1.porta1.fecha();
        c1.porta1.pinta( "verde" );
        c1.porta1.dimensaoX = 1.80;
        c1.porta1.dimensaoY = 0.80;
        c1.porta1.dimensaoZ = 0.04;
        c1.porta1.mostra();

        c1.porta2.fecha();
        c1.porta2.pinta( "azul" );
        c1.porta2.dimensaoX = 2.10;
        c1.porta2.dimensaoY = 0.90;
        c1.porta2.dimensaoZ = 0.05;
        c1.porta2.mostra();

        c1.porta3.abre();
        c1.porta3.pinta( "amarela" );
        c1.porta3.dimensaoX = 2.00;
        c1.porta3.dimensaoY = 0.85;
        c1.porta3.dimensaoZ = 0.03;
        c1.porta3.mostra();

        c1.pinta( "Branca" );

        c1.mostrar();
// esta ocorrendo um erro com a quantidade de portas abertas
// modifique a propriedade c1.portaX.abre/fecha e verifique o resultado.
// ainda não descobri o motivo desta falha!

    }
}