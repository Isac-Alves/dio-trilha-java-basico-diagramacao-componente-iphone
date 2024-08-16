import dispositivos.Iphone;
import dispositivos.Macintosh;
import dispositivos.tiposdespositivos.NavegadorInternet;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        NavegadorInternet dispositivo = new Macintosh();
        dispositivo.exibirPagina("www.google.com");
        dispositivo.atualizarPagina();
        dispositivo.adicionarNovaAba();

        dispositivo = new Iphone();
        dispositivo.exibirPagina("www.google.com");
        dispositivo.atualizarPagina();
        dispositivo.adicionarNovaAba();

        
        
    }
}
