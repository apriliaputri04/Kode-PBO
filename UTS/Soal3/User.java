package UTS.Soal3;

public class User {  
    private int userId;  
    private String password;  
   
    public User(int userId, String password) {  
       this.userId = userId;  
       this.password = password;  
    }  
   
    public void logIn(int userId, String password) {  
       if (this.userId == userId && this.password.equals(password)) {  
         System.out.println("Login successful");  
       } else {  
         System.out.println("Invalid credentials");  
       }  
    }  
   
    public void recoverPassword() {  
       System.out.println("Password recovery process");  
    }  
   
    public void logOut() {  
       System.out.println("Logged out");  
    }  
 } 