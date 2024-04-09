package org.example;

public enum AnsiColor {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    BLUE("\u001B[38;2;40;177;249m"),
    RED("\u001B[38;2;255;100;100m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private String ansiColor;

    AnsiColor(String code){
        this.ansiColor = code;
    }

    public String getCode(){
        return this.ansiColor;
    }

}
