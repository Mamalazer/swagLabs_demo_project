package swaglabs.data;

import lombok.Getter;

@Getter
public class User {

    private String login;
    private String password = "secret_sauce";

    public User(String login) {
        this.login = login;
    }
}
