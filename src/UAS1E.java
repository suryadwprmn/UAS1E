import java.util.ArrayList;
import java.util.Scanner;
public class UAS1E {

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYourPost() {
        return WhatYouPosts;
    }

    public void setWhatYourPost(String whatYourPost) {
    this.WhatYouPosts=whatYourPost;
    }

    public String getWhatYouPosts() {
        return WhatYouPosts;
    }

    public UAS1E (String userid,String username,String whatYourPosts, ArrayList<String> WhatYourPosts){
        this.UserID = userid;
        this.UserName = username;
        this.WhatYouPosts = whatYourPosts;

    }


    private String UserID;
    private String UserName;
    private String WhatYouPosts;
    static class Messages{
        public void setUserID(String userID) {
        }

        public void setUserName(String userName) {
        }

        public void setWhatYouPosts(String msg) {
        }
    }

    private void setMY_MESSAGES(ArrayList<Messages> xMsg) {
    }
    public UAS1E(){}

    public static void main(String[] args) {
        UAS1E social = new UAS1E();
        social.setUserID("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS1E.Messages> xMsg = new ArrayList<>();
        for(int index=0;index<jum_msg;index++){
            Messages msg = new Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index+1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);

}

}


