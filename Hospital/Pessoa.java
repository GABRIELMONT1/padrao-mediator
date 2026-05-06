package hospital;

public class Pessoa {

    public String elogiarEnfermaria(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioEnfermaria(mensagem);
    }

    public String reclamarEnfermaria(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoEnfermaria(mensagem);
    }

    public String sugerirEnfermaria(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoEnfermaria(mensagem);
    }
}