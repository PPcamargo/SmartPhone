package SmartPhone.SmartPhoneIphone.Reproducao;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Música está tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
