public class Email {
 private String sender;
 private String receiver;

    public String getSender() {
            return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public Email(){
        this("sender","receiver");

    }
    public Email(String sender,String receiver){
        setSender(sender);
        setReceiver(receiver);
    }
@Override
    public String toString(){
        return new String("Hello");
}

}



