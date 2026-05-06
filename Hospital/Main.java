package hospital;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();

        System.out.println(paciente.elogiarEnfermaria("Otimo atendimento"));
        System.out.println();
        System.out.println(paciente.reclamarEnfermaria("Demora no atendimento"));
        System.out.println();
        System.out.println(paciente.sugerirEnfermaria("Ampliar horario de visitas"));
    }
}