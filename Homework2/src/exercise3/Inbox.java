package exercise3;

import java.util.ArrayList;

public class Inbox {

    private ArrayList<Mail> mails;

    public Inbox(){
        mails = new ArrayList<>();
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public void printHeaders(){
        for(int i = 0; i<mails.size(); i++ ){
            Mail mail = mails.get(i);
            String readStatus = mail.getIsRead() ? "READ" : "NOT READ"; //Wenn true --> readStatus = "READ"
            System.out.println(readStatus + " | " + mail.getSubject() + " | " + mail.getSender() + " | " + mail.getDatetime());
        }

    }

    public void open(int index){
        if(index < mails.size() && index >= 0){
            Mail recentMail = mails.get(index);
            recentMail.markAsRead();
            recentMail.print();
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public void countUnread(){
        int unread = 0;
        for(Mail mail : mails){ //braucht index nicht
            if (mail.getIsRead() == false){
                unread++;
            }
        }
        System.out.println("Ungelesene Mails: " +unread);
    }


}
