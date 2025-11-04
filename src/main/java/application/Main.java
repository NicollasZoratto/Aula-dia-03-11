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

        Notificacao notif = new NotificacaoSMS(
            "Fulano", "14991883595", "Testando", 3);

        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSMS(
            "Ciclano", "1234567890", "Novo teste", 2);

        objPriorizavel.definirPrioridade(6);

    }
}

