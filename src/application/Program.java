package application;

import entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Kaime");
        p1.abrirConta("CC");
        p1.depositar(600);
        p1.sacar(850);
        p1.estadoAtual();



    }
}