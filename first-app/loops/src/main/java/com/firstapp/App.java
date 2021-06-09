package com.firstapp;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Please enter the input:");
        String name = System.console().readLine();

        System.out.println("You entered: "+ name);
    }
}
