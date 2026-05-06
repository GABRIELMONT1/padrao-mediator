package hospital;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();
    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioEnfermaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Enfermaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEnfermaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Enfermaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEnfermaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Enfermaria.getInstancia().receberSugestao(mensagem);
    }
}