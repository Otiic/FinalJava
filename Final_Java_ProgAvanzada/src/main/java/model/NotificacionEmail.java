package model;

public class NotificacionEmail extends Notification {
    private String email;
    
    public NotificacionEmail(String recipient, String message) {
        super(recipient, message);
    }
    
}
