package com.cristobalbernal.PiedraPapelTijera.EjercicioPiedraPapelTijera;

import com.cristobalbernal.PiedraPapelTijera.Lib.Lib;

public class EjercicioPiedraPapelTijera {
    private static final int N_ELEMENTOS = 3;
    private static final int MIN = 1;
    private static final int MAX = 3;
    private static final int[] PUNTUACIONES = new int[N_ELEMENTOS];
    private static String nombre = "";
    public void execute(){
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("Escribe un nombre para el jugador");
                    nombre = Lib.leerLinea();
                    nuevaPartida();
                break;
                case 2: mostrarPuntuacion();
                break;
            }
        }while (opcion !=0);
    }

    public static void mostrarPuntuacion() {
        System.out.println("EMPATE: " + PUNTUACIONES[0]);
        System.out.println("El jugador " + nombre +  " lleva una puntuacion de: " + PUNTUACIONES[1]);
        System.out.println("CPU: " + PUNTUACIONES[2]);
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
                            PUNTUACIONES[0]++;
                    break;
                    case 2: System.out.println("Ha ganado " + nombre);
                            System.out.println("El PAPEL envuelve la PIEDRA");
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                    case 3: System.out.println("Ha ganado la CPU");
                            System.out.println("La PIEDRA rompe las TIJERAS");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                }break;
            case 2:
                System.out.println("La CPU ha sacado PAPEL!!");
                switch (opcion){
                    case 1: System.out.println("Ha ganado la CPU");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                    case 2: System.out.println("Empate");
                            PUNTUACIONES[0]++;
                            Lib.intro();
                    break;
                    case 3: System.out.println("Ha ganado " + nombre);
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                }break;
            case 3:
                System.out.println("La CPU ha sacado TIJERA");
                switch (opcion){
                    case 1: System.out.println("Ha ganado " + nombre);
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                    case 2: System.out.println("Ha ganado la CPU");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                    case 3: System.out.println("Empate!");
                            PUNTUACIONES[0]++;
                            Lib.intro();
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
