package br.com.rafaelestima;
import java.util.Scanner;
//X: errado | 0: certa no lugar errado | 1: certa no lugar certo
public class Teste {
    public static void main(String[] args) {
        Senha oSenha = new Senha();
        oSenha.geraSenha();
        oSenha.setNumeroTentativas(10);
        Scanner oScanner = new Scanner(System.in);
        String senha = "XXXX";

        while (!(senha.equals("1111"))&&oSenha.getTentativasRestantes() != 0){
            System.out.printf("De seu palpite para a senha, restam "+oSenha.getTentativasRestantes()+": ");

            String palpite = oScanner.next();
            senha = oSenha.palpitaSenha(palpite);
            System.out.println(senha);
        }

        if (senha.equals("1111")) {
            System.out.println("Parabens! A senha está correta!");

        } else {
            System.out.println("Você perdeu! A senha correta é: "+oSenha.getSenha());
        }

    }
}
