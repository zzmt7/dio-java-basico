package edu.matheus.segundasemana;
public class MinhaClasse {
    public static void main(String [] args){
        String primeiroNome = "Matheus";
        String ultimoNome = "Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome);
    }
}
