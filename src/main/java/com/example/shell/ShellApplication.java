package com.example.shell;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ShellApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShellApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void beginInShellApplication() {
        System.out.println("EL in Main");
    }
}

@Component
class EL {

    @EventListener(ApplicationReadyEvent.class)
    public void begin() {
        System.out.println("EL");
    }
}

@Component
class AL implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("AL");
    }
}

@Component
class CLR implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CLR");
    }
}

@Component
class AR implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("AR");
    }
}

@ShellComponent
class MyCommands {

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }
}
