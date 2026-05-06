package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteTeste {

    @Test
    void deveElogiarEnfermaria() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Enfermaria agradece a mensagem: Otimo atendimento",
                paciente.elogiarEnfermaria("Otimo atendimento"));
    }

    @Test
    void deveReclamarEnfermaria() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Enfermaria vai procurar melhorar o servico da reclamacao: Demora no atendimento",
                paciente.reclamarEnfermaria("Demora no atendimento"));
    }

    @Test
    void deveSugerirEnfermaria() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "A Enfermaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Enfermaria vai analisar a sugestao: Ampliar horario de visitas",
                paciente.sugerirEnfermaria("Ampliar horario de visitas"));
    }
}