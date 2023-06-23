package org.example.task1;

public class UserEntity {
    private int id;
    private String name;
    private String username;
    private String email;
    private AddressEntity address;


    private UserEntity(int id, String name, String username, String email, AddressEntity address) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public static UserEntity createUserEntity(int id, String name, String username, String email, AddressEntity address) {
        return new UserEntity(id, name, username, email, address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;

    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" +  address +
                '}';
    }
}

