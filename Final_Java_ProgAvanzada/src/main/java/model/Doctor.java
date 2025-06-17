package model;

public class Doctor extends User{
    private String name;
    private String specialization;
    private String email;
    private String phone;

    public Doctor(String name, String specialization, String email, String phone, int id, String username, String passwordHash, String role, int linked_id) {
        super(id, username, passwordHash, role, linked_id);
        this.name = name;
        this.specialization = specialization;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
