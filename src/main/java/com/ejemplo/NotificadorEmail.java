package com.ejemplo;

public class NotificadorEmail {
    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        if (direccion == null || direccion.isEmpty()) {
            System.out.println("La dirección de correo es inválida.");
            return;
        }
        if (mensaje == null) {
            System.out.println("El mensaje es nulo.");
            return;
        }
        emailCliente.enviarCorreo(direccion, mensaje);
    }
}