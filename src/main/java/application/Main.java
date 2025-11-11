package application;

import java.util.List;
import java.util.ArrayList;

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

        objPriorizavel = new NotificacaoEmail("Beltrano", "beltrano@email.com", "Teste", "Olá Mundo", 3);

        Arquivavel objArquivavel = new NotificacaoEmail("Nicollas", "nicollas@email.com", " New Teste", "Olá Mundinho", 3);

        ((Notificacao) objArquivavel).enviar();

        System.out.println("----------");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);
        objetos.add(new NotificacaoSMS("Ciclano", "1234567890", "Novo teste", 2));

        objetos.add(new NotificacaoSMS("Maria", "1234567890", "Testando", 4));

        for(Priorizavel item : objetos) {
            System.out.println(item.obterNivelPrioridade());
        }

    }
}

