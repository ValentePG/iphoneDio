package dev.valente;

public class ReprodutorMusical implements InterfaceReprodutor {

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA...");;
    }

    @Override
    public void pausarMusica() {
        System.out.println("PAUSANDO MÚSICA...");;
    }

    @Override
    public void selecionarMusica() {
        System.out.println("ESCOLHENDO UMA MÚSICA...");;
    }
}
