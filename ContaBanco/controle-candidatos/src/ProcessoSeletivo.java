import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
         else 
            System.out.println("Nào conseguimos contato com " + candidato + ", número máximo tentativas " + tentativasRealizadas + " realizada.");
        
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORDAN","JOAO"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        int candidatosAtual = 0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) { 
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
        for(int i=0;i<candidatos.length;i++){
            System.out.println("O candidato de número " + (i+1) + " é " + candidatos[i]);
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){ 
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) { 
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else { 
            System.out.println("Aguardar o retorno dos demais candidatos");
        }
    }

}
