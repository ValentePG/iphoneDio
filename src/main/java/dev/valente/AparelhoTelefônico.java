package dev.valente;

public class AparelhoTelefônico implements InterfaceTelefônico {
    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE..."); ;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");;
    }

    @Override
    public void ligar() {
        System.out.println("FAZENDO LIGAÇÃO...");;
    }
}
