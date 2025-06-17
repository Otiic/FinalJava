package model;

public abstract class User {
    private int id;
    private String username;
    private String passwordHash;
    private String role;
    private int linked_id;

    public User(int id, String username, String passwordHash, String role, int linked_id) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
        this.linked_id = linked_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLinked_id() {
        return linked_id;
    }

    public void setLinked_id(int linked_id) {
        this.linked_id = linked_id;
    }
    
    
}
