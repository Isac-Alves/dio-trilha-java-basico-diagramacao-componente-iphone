package dispositivos;

import dispositivos.tiposdespositivos.ReprodutorMusical;
import dispositivos.tiposdespositivos.AparelhoTelefonico;
import dispositivos.tiposdespositivos.NavegadorInternet;;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Metodos do ReprodutorMusical
    public void pausar() {
        System.out.println("Pausando a musica no iphone");
        
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica + " no iphone");
        
    }

    public void tocar() {
        System.out.println("Tocando musica no iphone");
        
    }


    //Metodos de Aparelho telefonico
    public void atender() {
        System.out.println("Atendendo o iphone");
        
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone");
        
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o núumero " + numero + " no iphone");
        
    }

    //Metodos de Navegador de internet
    public void adicionarNovaAba() {
        System.out.println("adicionando uma nova aba no iphone");
        
    }

    public void atualizarPagina() {
        System.out.println("atualizando a pagina no iphone");
        
    }

    public void exibirPagina(String url) {
        System.out.println("exibindo a pagina " + url + " no iphone");
        
    }
    
}
