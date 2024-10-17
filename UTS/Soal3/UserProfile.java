package UTS.Soal3;

public class UserProfile {
    public int userId;
    public String password;
    public String name;
    public int age;
    public String email;
    public String[] documents;

    public UserProfile(int userId, String password, String name, int age, String email, String[] documents) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.documents = documents;
    }

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String displayInfo() {
        return "ID: " + userId + ", Nama: " + name + ", Umur: " + age + ", Email: " + email;
    }
}
