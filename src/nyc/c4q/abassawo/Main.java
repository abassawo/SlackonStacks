package nyc.c4q.abassawo;

public class Main {

    public static void main(String[] args) {
       StackAPIHelper helper = StackAPIHelper.getInstance();
       helper.listChannels();
       helper.joinChatRoom("general");
    }

}
