package com.Singleton;

public class Fila2{
    private static Fila2 instance;

    private void Fila(){

    }
    public static Fila2 getInstance(){
        return getInstance();
    }
    public static void ImprimeDocumento(){
        System.out.println("O documento está sendo impresso.");
    }
    public static void RemoveDocumento(){
        System.out.println("O documento foi retirado da fila de impressão.");
    }
    public static void RemoveTodosDocumentos(){
        System.out.println("Não há documento na fila para ser impresso.");
    }
}