package com.example.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.Availability;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class ShellApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShellApplication.class, args);
    }
}

@Service
class LoginService {

    private final AtomicReference<String> loggedIn = new AtomicReference<>();

    void login(String user, String pw) {
        this.loggedIn.set(user);
    }

    void logout() {
        this.loggedIn.set(null);
    }

    boolean loggedIn() {
        return this.loggedIn.get() != null;
    }

    String loggedInUser() {
        return this.loggedIn() ?  this.loggedIn.get() :  null;
    }

}

@ShellComponent
record LoginCommands(LoginService loginService) {

    @ShellMethod("Login")
    public void login(String username, String password) {
        this.loginService.login(username, password);
    }

    @ShellMethodAvailability("logoutAvailability")
    @ShellMethod("Logout")
    public void logout() {
        this.loginService.logout();
    }

    public Availability logoutAvailability() {
        return this.loginService.loggedIn() ? Availability.available() : Availability.unavailable("you must login!");
    }


}

@Component
record LoginPromptProvider(LoginService loginService) implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return this.loginService.loggedIn() ?
                new AttributedString(this.loginService.loggedInUser() + ":>",
                        AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW)) :
                new AttributedString("unknown:>",
                        AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }
}