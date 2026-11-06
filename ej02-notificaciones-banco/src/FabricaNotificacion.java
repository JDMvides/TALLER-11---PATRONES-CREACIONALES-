public abstract class FabricaNotificacion {

    public abstract Notificacion crearNotificacion();
}

class FabricaSms extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new Sms();
    }
}

class FabricaEmail extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}

class FabricaPush extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new Push();
    }
}

class FabricaWhatsApp extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new WhatsApp();
    }
}
