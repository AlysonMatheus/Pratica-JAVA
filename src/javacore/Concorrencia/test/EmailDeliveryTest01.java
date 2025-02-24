package javacore.Concorrencia.test;

import javacore.Threads.dominio.Membros;
import javacore.Threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Membros membros = new Membros();
        Thread jiraya = new Thread(new EmailDeliveryService(membros), " Jiraya ");
        Thread kakashi = new Thread(new EmailDeliveryService(membros), " Kakashi ");
        jiraya.start();
        kakashi.start();
        while (true){
            String email = JOptionPane.showInputDialog( " Entre com seu email");
            if (email == null || email.isEmpty()){
                membros.close();
                break;
            }
            membros.addMemberEmail(email);

        }
    }
}
