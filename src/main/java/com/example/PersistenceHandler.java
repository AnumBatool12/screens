package com.example;

public interface PersistenceHandler{

    PersistenceHandler getInstance();
    boolean verifyExistence(String username);
    boolean checkPassword(String username, String password);
    char userIS(String usernamae);
    void testing();
}