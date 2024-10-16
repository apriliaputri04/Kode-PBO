package UTS.Soal3;

public class UserProfile {  
    private int userId;  
    private String password;  
    private String name;  
    private int age;  
    private String email;  
   
    public UserProfile(int userId, String password, String name, int age, String email) {  
       this.userId = userId;  
       this.password = password;  
       this.name = name;  
       this.age = age;  
       this.email = email;  
    }  
   
    public int getUserId() {  
       return userId;  
    }  
   
    public String getPassword() {  
       return password;  
    }  
   
    public String getName() {  
       return name;  
    }  
   
    public int getAge() {  
       return age;  
    }  
   
    public void setEmail(String email) {  
       this.email = email;  
    }  
   
    public void setDob(String dob) {  
       // Assuming dob is a string representation of date of birth  
       // You may want to use a Date or LocalDate object instead  
       // this.dob = dob;  
    }  
 }  