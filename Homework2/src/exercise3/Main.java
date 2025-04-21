package exercise3;

public class Main {
    public static void main(String[] args) {

    Mail mail1 = new Mail("carol@studi.com", "Projekt", "Bitte schick mir das Dokument.", "12:49");
    Mail mail2 = new Mail("jonas@studi.com", "Treffen", "Wollen wir uns morgen treffen?", "18:55");
    Mail mail3 = new Mail("isa@studi.com", "Hallo", "Wie geht's?", "9:46");
    Mail mail4 = new Mail("julius@studi.com", "Uni", "Um wie viel Uhr haben wir morgen Vorlesung?", "22:56");

    mail1.markAsRead();

    Inbox inbox1 = new Inbox();
    inbox1.addMail(mail1);
    inbox1.addMail(mail2);
    inbox1.addMail(mail3);
    inbox1.addMail(mail4);

    inbox1.countUnread();
    inbox1.open(0);
    inbox1.open(3);
    inbox1.open(6);
    inbox1.printAllMails();


    }
}