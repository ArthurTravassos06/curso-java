
public class App {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarPasta();

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.abrirNovaAba();
    }
}
