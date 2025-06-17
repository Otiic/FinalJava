package model;

import java.time.LocalDate;

public class Patient extends User {
    private String name;
    private LocalDate birthDate;
    private boolean gender;
    private String email;
    private String phone;

    public Patient(String name, LocalDate birthDate, boolean gender, String email, String phone, int id, String username, String passwordHash, String role, int linked_id) {
        super(id, username, passwordHash, role, linked_id);
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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
