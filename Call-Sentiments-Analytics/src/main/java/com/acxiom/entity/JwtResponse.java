package com.acxiom.entity;

public class JwtResponse {

    private MainDB user;
    private String jwtToken;


    public JwtResponse(MainDB user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    public MainDB getUser() {
        return user;
    }

    public void setUser(MainDB user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
