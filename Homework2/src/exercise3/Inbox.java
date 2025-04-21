package exercise3;

import java.util.ArrayList;

public class Inbox {

    private ArrayList<Mail> mails;

    public Inbox(Mail mail){
        mails.add(mail);
    }

    public void printAllMails(){
        for(int i = 0; i<mails.size(); i++ ){
            System.out.println(mails.get(i).getIsRead() + " | " + mails.get(i).getSubject() + " | " + mails.get(i).getSender() + " | " + mails.get(i).getDatetime());
        }

    }

    public void open(int index){
        if(index < mails.size() && index >= 0){
            Mail recentMail = mails.get(index);
            recentMail.setIsRead();
            recentMail.print();
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public int countUnread(){
        int unread = 0;
        for(int i = 0; i<mails.size(); i++){
            if (mails.get(i).getIsRead() == false){
                unread++;
            }
        }
        return unread;
    }


}
