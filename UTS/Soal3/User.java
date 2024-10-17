package UTS.Soal3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public String userID;
    public String password;

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
}