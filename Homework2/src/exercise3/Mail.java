package exercise3;

public class Mail {

    private String sender;
    private String subject;
    private String message;
    private String datetime;
    private boolean isRead;

    public Mail(String sender, String subject, String message, String date) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
    }

    public void setIsRead(){
        isRead = true;
    }


    public void print(){
        System.out.println(subject + " from " + sender + " on " + datetime + ": " + message);
    }


    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getDatetime(){
        return datetime;
    }

    public boolean getIsRead(){
        return isRead;
    }

}
