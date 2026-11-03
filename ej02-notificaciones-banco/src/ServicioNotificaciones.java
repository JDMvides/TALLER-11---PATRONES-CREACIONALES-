public class ServicioNotificaciones {

    public void notificarTransferencia(String canal, String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        if (canal.equals("SMS")) {
            Sms sms = new Sms();
            sms.enviar(usuario, mensaje);
        } else if (canal.equals("EMAIL")) {
            Email email = new Email();
            email.enviar(usuario, mensaje);
        } else if (canal.equals("PUSH")) {
            Push push = new Push();
            push.enviar(usuario, mensaje);
        }
    }

    public void notificarCodigoSeguridad(String canal, String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        if (canal.equals("SMS")) {
            Sms sms = new Sms();
            sms.enviar(usuario, mensaje);
        } else if (canal.equals("EMAIL")) {
            Email email = new Email();
            email.enviar(usuario, mensaje);
        } else if (canal.equals("PUSH")) {
            Push push = new Push();
            push.enviar(usuario, mensaje);
        }
    }
}
