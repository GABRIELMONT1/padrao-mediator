package hospital;

public class Enfermaria implements Departamento {

    private static Enfermaria instancia = new Enfermaria();
    private Enfermaria() {}

    public static Enfermaria getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Enfermaria vai procurar melhorar o servico da reclamacao: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Enfermaria agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Enfermaria vai analisar a sugestao: " + mensagem;
    }
}