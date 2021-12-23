package com.cristobalbernal.PiedraPapelTijera.EjercicioPiedraPapelTijera;

import com.cristobalbernal.PiedraPapelTijera.Lib.Lib;

public class EjercicioPiedraPapelTijera {
    private static final int MIN = 1;
    private static final int MAX = 3;

    public void execute(){

        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1: nuevaPartida();
                break;
                case 2: mostrarPuntuacion();
                break;
            }
        }while (opcion !=0);
    }

    public static void mostrarPuntuacion() {

    }

    public static void nuevaPartida() {
        int opcion = menuJuego();
        int numeroCpu = Lib.numeroAleatorio(MIN,MAX);
        switch (numeroCpu){
            case 1:
                System.out.println("La CPU ha sacado PIEDRA!!");
                switch (opcion){
                    case 1: System.out.println("Empate");
                            Lib.intro();
                    break;
                    case 2: System.out.println("Ha ganado el Player");
                            System.out.println("El PAPEL envuelve la PIEDRA");
                            Lib.intro();
                    break;
                    case 3: System.out.println("Ha ganado la CPU");
                            System.out.println("La PIEDRA rompe las TIJERAS");
                            Lib.intro();
                    break;
                }break;
            case 2:
                System.out.println("La CPU ha sacado PAPEL!!");
                switch (opcion){
                    case 1: System.out.println("Ha ganado la CPU");
                    break;
                    case 2: System.out.println("Empate");
                    break;
                    case 3: System.out.println("Ha ganado el Player");
                    break;
                }break;
            case 3:
                System.out.println("La CPU ha sacado TIJERA");
                switch (opcion){
                    case 1: System.out.println("Ha ganado el Player");
                    break;
                    case 2: System.out.println("Ha ganado la CPU");
                    break;
                    case 3: System.out.println("Empate!");
                    break;
                }break;
        }
    }


    public static int menuPrincipal() {
        int opcion = 0;

        System.out.println("---------------------");
        System.out.println("PIEDRA, PAPEL, TIJERA");
        System.out.println("---------------------");
        System.out.println("1. Nueva Partida...");
        System.out.println("2. Mostrar puntuaciones...");
        System.out.println("--------------------------");
        System.out.println("0. Salir");
        System.out.println("Elige una opcion: ");
        opcion = Lib.leerInt();

        return opcion;

    }
    public static int menuJuego(){
        int opcion = 0;
        System.out.println("**************");
        System.out.println("*   ELIGE    *");
        System.out.println("**************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("Indica tu opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
}
