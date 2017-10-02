package com.cs2340.team6.totallyratticalapp;

/**
 * Created by dylan on 10/2/2017.
 */

public class User {
    private String name;
    private String username;
    private String password;
    private Role role;

    public User (String name, String username, String password, Role role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getName() {return name;}

    public String getUsername() {return username;}

    public String getPassword() {return password;}

    public Role getRole() {return role;}

    public void setRole(Role role) {
        this.role = role;
    }

    public enum Role {
        USER ("User"),
        ADMIN ("Admin");

        private String roleString;
        Role(String string) {
            roleString = string;
        }

        public String toString() {return roleString;}
    }

    public String toString() {
        return name + " " + username + " " + password + " " + role.toString();
    }
}
