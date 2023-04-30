package kushal;

public class Customer {
    String name;
    String phone;

    public String getAccount_photo() {
        return account_photo;
    }

    public void setAccount_photo(String account_photo) {
        this.account_photo = account_photo;
    }

    String account_photo;
    String address;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
