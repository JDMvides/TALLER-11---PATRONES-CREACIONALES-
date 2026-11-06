import java.util.Map;

public class ServicioNotificaciones {

    private final Map<String, FabricaNotificacion> fabricas = Map.of(
        "SMS", new FabricaSms(),
        "EMAIL", new FabricaEmail(),
        "PUSH", new FabricaPush(),
        "WHATSAPP", new FabricaWhatsApp()
    );

    public void notificarTransferencia(String canal, String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        enviar(canal, usuario, mensaje);
    }

    public void notificarCodigoSeguridad(String canal, String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        enviar(canal, usuario, mensaje);
    }

    private void enviar(String canal, String usuario, String mensaje) {
        FabricaNotificacion fabrica = fabricas.get(canal);
        if (fabrica == null) {
            throw new IllegalArgumentException("Canal no soportado: " + canal);
        }
        fabrica.crearNotificacion().enviar(usuario, mensaje);
    }
}
