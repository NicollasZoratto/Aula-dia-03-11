package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSMS notSMS = new NotificacaoSMS("Marco", "14991883595", "Mensagem de teste", 1);

        notSMS.exibirInformacoesRemetente();
        notSMS.enviar();
        notSMS.registrarLog();

        notSMS.definirPrioridade(8);
        System.out.println(notSMS.obterNivelPrioridade());
        notSMS.definirPrioridade(0);
    }
}

