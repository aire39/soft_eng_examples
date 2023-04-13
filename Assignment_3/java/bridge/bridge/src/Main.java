public class Main {
    public static void main(String[] args) {

        FacebookMessageApp facebook_app = new FacebookMessageApp();
        TelegramMessageApp telegram_app = new TelegramMessageApp();
        WhatsAppMessageApp whatsapp_app = new WhatsAppMessageApp();

        facebook_app.SendMessage(new TextMessage(), telegram_app);
        facebook_app.SendMessage(new ImageMessage(), whatsapp_app);
        facebook_app.SendMessage(new VideoMessage(), whatsapp_app);

        telegram_app.SendMessage(new TextMessage(), facebook_app);
        telegram_app.SendMessage(new ImageMessage(), facebook_app);
        telegram_app.SendMessage(new VideoMessage(), whatsapp_app);

        whatsapp_app.SendMessage(new TextMessage(), telegram_app);
        whatsapp_app.SendMessage(new ImageMessage(), telegram_app);
        whatsapp_app.SendMessage(new VideoMessage(), facebook_app);
    }
}