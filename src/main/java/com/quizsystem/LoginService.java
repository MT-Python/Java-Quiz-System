package com.quizsystem;

import java.util.*;

public class LoginService {

    public static User login() throws Exception {
        Scanner sc = new Scanner(System.in);
        List<User> users = JsonUtil.readUsers();

        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        for (User u : users) {
            if (u.username.equals(uname) && u.password.equals(pass)) {
                return u;
            }
        }
        System.out.println("Invalid login!");
        return null;
    }
}
