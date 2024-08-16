package dispositivos;

import dispositivos.tiposdespositivos.NavegadorInternet;

public class Macintosh implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo a pagina " + url + " no macintosh");
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova pagina no macintosh");
    }

    public void atualizarPagina() {
        System.out.println("atualizando pagina no macintosh");
    }
    
}
