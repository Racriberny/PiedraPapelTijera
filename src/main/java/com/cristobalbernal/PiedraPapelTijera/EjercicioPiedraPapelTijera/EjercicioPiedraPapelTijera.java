package com.cristobalbernal.PiedraPapelTijera.EjercicioPiedraPapelTijera;

import com.cristobalbernal.PiedraPapelTijera.Lib.Lib;

public class EjercicioPiedraPapelTijera {
    private static final int N_ELEMENTOS = 3;
    private static final int MIN = 1;
    private static final int MAX = 3;
    private static final int[] PUNTUACIONES = new int[N_ELEMENTOS];
    private static final int[] PUNTUACION_PARTIDA_DE_DOS = new int[N_ELEMENTOS];
    private static String nombre = "";
    private static String jugadorUno = "";
    private static String jugadorDos = "";
    public void execute(){
        int opcion;
        int contador = 0;
        int contadoJugadores = 0;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    if (contador == 0){
                        System.out.println("Escribe un nombre para el jugador: ");
                        nombre = Lib.leerLinea();
                        contador++;
                    }else {
                        System.out.println("El jugador se llama " + nombre);
                    }
                    nuevaPartida();
                break;
                case 2: mostrarPuntuacion();
                break;
                case 3:
                    if (contadoJugadores == 0){
                        System.out.println("Escribe el nombre del jugador uno: ");
                        jugadorUno = Lib.leerLinea();
                        contadoJugadores++;
                        System.out.println("Escribe el nombre del jugador dos: ");
                        jugadorDos = Lib.leerLinea();
                        contadoJugadores++;
                    }else {
                        System.out.println("El primer jugador se llama " + jugadorUno);
                        System.out.println("El segundo jugador se llama " + jugadorDos);
                    }
                    juegoDosPersonas();
                break;
                case 4:
                    mostrarPuntuacionJuegoDosPersonas();
                break;
            }
        }while (opcion !=0);
    }

    public static void mostrarPuntuacionJuegoDosPersonas() {
        System.out.println("EMPATE: " + PUNTUACION_PARTIDA_DE_DOS[0]);
        System.out.println("El jugador uno " + jugadorUno +  " lleva una puntuacion de: " + PUNTUACION_PARTIDA_DE_DOS[2]);
        System.out.println("El jugador dos " + jugadorDos +  " lleva una puntuacion de: " + PUNTUACION_PARTIDA_DE_DOS[1]);
    }

    public static void juegoDosPersonas() {
        int opcionJugadorUno = menuJugadorUno(jugadorUno);
        int opcionJugadorDos = menuJugadorDos(jugadorDos);
        switch (opcionJugadorUno){
            case 1:
                switch (opcionJugadorDos){
                    case 1: System.out.println("Empate");
                        Lib.intro();
                        PUNTUACION_PARTIDA_DE_DOS[0]++;
                        break;
                    case 2: System.out.println("Ha ganado " + jugadorDos);
                        System.out.println("El PAPEL envuelve la PIEDRA");
                        PUNTUACION_PARTIDA_DE_DOS[1]++;
                        Lib.intro();
                        break;
                    case 3: System.out.println("Ha ganado " + jugadorUno);
                        System.out.println("La PIEDRA rompe las TIJERAS");
                        PUNTUACION_PARTIDA_DE_DOS[2]++;
                        Lib.intro();
                        break;
                }
            break;
            case 2:
                switch (opcionJugadorDos){
                    case 1: System.out.println("Ha ganado " + jugadorUno);
                        System.out.println("El PAPEL envuelve la PIEDRA");
                        PUNTUACION_PARTIDA_DE_DOS[2]++;
                        Lib.intro();
                        break;
                    case 2: System.out.println("Empate");
                        PUNTUACION_PARTIDA_DE_DOS[0]++;
                        Lib.intro();
                        break;
                    case 3: System.out.println("Ha ganado " + jugadorDos);
                        System.out.println("La TIJERA corta el PAPEL");
                        PUNTUACION_PARTIDA_DE_DOS[1]++;
                        Lib.intro();
                        break;
                }
            break;
            case 3:
                switch (opcionJugadorDos){
                    case 1: System.out.println("Ha ganado " + jugadorDos);
                        System.out.println("La PIEDRA rompe el TIJERA");
                        PUNTUACION_PARTIDA_DE_DOS[2]++;
                        Lib.intro();
                        break;
                    case 2: System.out.println("Ha ganado " + jugadorUno);
                        System.out.println("La TIJERA corta el PAPEL");
                        PUNTUACION_PARTIDA_DE_DOS[1]++;
                        Lib.intro();
                        break;
                    case 3: System.out.println("Empate!");
                        PUNTUACION_PARTIDA_DE_DOS[0]++;
                        Lib.intro();
                        break;
                }
            break;
        }
    }

    public static void mostrarPuntuacion() {
        System.out.println("EMPATE: " + PUNTUACIONES[0]);
        System.out.println("El jugador " + nombre +  " lleva una puntuacion de: " + PUNTUACIONES[1]);
        System.out.println("CPU: " + PUNTUACIONES[2]);
    }

    public static void nuevaPartida() {
        int opcion = menuJuego(nombre);
        int numeroCpu = Lib.numeroAleatorio(MIN,MAX);
        switch (numeroCpu){
            case 1:
                System.out.println("La CPU ha sacado PIEDRA!!");
                switch (opcion){
                    //Piedra
                    case 1: System.out.println("Empate");
                            Lib.intro();
                            PUNTUACIONES[0]++;
                    break;
                    //Papel
                    case 2: System.out.println("Ha ganado " + nombre);
                            System.out.println("El PAPEL envuelve la PIEDRA");
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                    //Tijera
                    case 3: System.out.println("Ha ganado la CPU");
                            System.out.println("La PIEDRA rompe las TIJERAS");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                }
            break;
            case 2:
                System.out.println("La CPU ha sacado PAPEL!!");
                switch (opcion){
                    //Piedra
                    case 1: System.out.println("Ha ganado la CPU");
                            System.out.println("El PAPEL envuelve la PIEDRA");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                    //Papel
                    case 2: System.out.println("Empate");
                            PUNTUACIONES[0]++;
                            Lib.intro();
                    break;
                    //Tijera
                    case 3: System.out.println("Ha ganado " + nombre);
                            System.out.println("La TIJERA rompe el PAPEL");
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                }
            break;
            case 3:
                System.out.println("La CPU ha sacado TIJERA");
                switch (opcion){
                    //Piedra
                    case 1: System.out.println("Ha ganado " + nombre);
                            System.out.println("la PIEDRA rompe la TIJERA");
                            PUNTUACIONES[1]++;
                            Lib.intro();
                    break;
                    //Papel
                    case 2: System.out.println("Ha ganado la CPU");
                            System.out.println("La TIJERA corta el PAPEL");
                            PUNTUACIONES[2]++;
                            Lib.intro();
                    break;
                    //Tijera
                    case 3: System.out.println("Empate!");
                            PUNTUACIONES[0]++;
                            Lib.intro();
                    break;
                }
            break;
        }
    }


    public static int menuPrincipal() {
        int opcion = 0;

        System.out.println("---------------------");
        System.out.println("PIEDRA, PAPEL, TIJERA");
        System.out.println("---------------------");
        System.out.println("1. Nueva Partida...");
        System.out.println("2. Mostrar puntuaciones...");
        System.out.println("3. Juego dos personas...");
        System.out.println("4. Puntuacion Juego Dos Personas...");
        System.out.println("--------------------------");
        System.out.println("0. Salir");
        System.out.println("Elige una opcion: ");
        opcion = Lib.leerInt();

        return opcion;

    }
    public static int menuJuego(String nombre){
        int opcion = 0;
        System.out.println("**************");
        System.out.println("*   ELIGE  * " + nombre);
        System.out.println("**************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("Indica tu opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
    public static int menuJugadorUno(String nombre){
        int opcion = 0;
        System.out.println("**************");
        System.out.println("*   ELIGE  * " + nombre);
        System.out.println("**************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("Indica tu opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
    public static int menuJugadorDos(String nombre){
        int opcion = 0;
        System.out.println("**************");
        System.out.println("*   ELIGE  * " + nombre);
        System.out.println("**************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("Indica tu opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
}
