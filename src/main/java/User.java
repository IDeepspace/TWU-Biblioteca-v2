public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String library_number;
    private String password;

    public User() {}

    public User(String name, String email, String phoneNumber, String library_number, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.library_number = library_number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLibrary_number() {
        return library_number;
    }

    public void setLibrary_number(String library_number) {
        this.library_number = library_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserDetailInfo() {
        return String.format("name:%-4s email:%-4s phoneNumber:%s", name, email, phoneNumber);
    }

    public boolean checkVoucher(String input_library_number, String input_password) {
        return library_number.equals(input_library_number) && password.equals(input_password);
    }
}
