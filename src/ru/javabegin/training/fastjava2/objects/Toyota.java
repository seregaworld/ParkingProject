package ru.javabegin.training.fastjava2.objects;

import java.io.IOException;
import java.util.logging.*;

public class Toyota extends Object{

    private String name;
    private double volume;

    private static Logger log = Logger.getLogger(Toyota.class.getName());

    public Toyota(String name, double volume) {
        try {
            FileHandler fh = new FileHandler("Toyota");
            log.addHandler(fh);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.name = name;
        this.volume = volume;
        //System.out.println("Toyota constr");
        log.severe("Constructor1");
    }

    public Toyota(String name) {
        this.name = name;
        log.info("Constructor2");
    }

    public Toyota(double volume) {
        this.volume = volume;
        log.info("Constructor2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
