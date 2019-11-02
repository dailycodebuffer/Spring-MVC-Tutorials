package com.dailycodebuffer.example.SpringBootCustomBanner;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class MyCustomBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("================================================");
        out.println("      ##  I LOVE DAILY CODE BUFFER  ##        ");
        out.println("================================================");
    }
}
