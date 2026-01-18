package com.quizsystem;

public class Main {
    public static void main(String[] args) throws Exception {

        User user = LoginService.login();
        if (user == null) return;

        if (user.role.equals("admin")) {
            System.out.println("Welcome Admin!");
            AdminService.start();
        } else {
            System.out.println("Welcome " + user.username + "!");
            StudentService.start(user.username);
        }
    }
}
