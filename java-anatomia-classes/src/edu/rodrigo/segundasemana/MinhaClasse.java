package edu.rodrigo.segundasemana;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Rodrigo";
        String segundoNome = "Vieira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Seu nome completo é " + nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}