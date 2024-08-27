package SmartPhone.SmartPhoneIphone;

import SmartPhone.SmartPhoneIphone.Navegacao.NavegadorNaInternet;
import SmartPhone.SmartPhoneIphone.Navegacao.NavegadorNaInternetImpl;
import SmartPhone.SmartPhoneIphone.Reproducao.ReprodutorMusical;
import SmartPhone.SmartPhoneIphone.Reproducao.ReprodutorMusicalImpl;
import SmartPhone.SmartPhoneIphone.Telefonia.AparelhoTelefonico;
import SmartPhone.SmartPhoneIphone.Telefonia.AparelhoTelefonicoImpl;


public class SmartPhone {
    public static void main(String[] args) {
        NavegadorNaInternet naInternet = new NavegadorNaInternetImpl();
        ReprodutorMusical rm = new ReprodutorMusicalImpl();
        AparelhoTelefonico at = new AparelhoTelefonicoImpl();

        naInternet.exibirPagina("www.meusite01.com");
        rm.selecionarMusica("Astronalta de Mármore.");
        at.atender();
    }
}
