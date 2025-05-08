package edu.rodrigo.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        double mediaFinal = 5.95;
        if (mediaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}
