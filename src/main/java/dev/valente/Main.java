package dev.valente;

public class Main {
    public static void main(String[] args) {

        var iphone1 = new ReprodutorMusical();
        var iphone2 = new AparelhoTelefônico();
        var iphone3 = new Navegador();

        System.out.println("====================");
        System.out.println("REPRODUTOR MUSICAL");
        System.out.println("====================");
        iphone1.selecionarMusica();
        iphone1.tocarMusica();
        iphone1.pausarMusica();


        System.out.println("=====================");
        System.out.println("APARELHO TELEFÔNICO");
        System.out.println("=====================");
        iphone2.ligar();
        iphone2.atender();
        iphone2.iniciarCorreioVoz();


        System.out.println("==============");
        System.out.println("NAVEGADOR");
        System.out.println("==============");
        iphone3.adicionarNovaAba();
        iphone3.atualizarPagina();
        iphone3.exibirPagina();
    }
}