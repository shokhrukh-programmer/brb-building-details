package uz.brb.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class TemplateApp { // You should change name of main class
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tashkent")); // Setting timezone to local
        SpringApplication.run(TemplateApp.class, args);
    }
}
