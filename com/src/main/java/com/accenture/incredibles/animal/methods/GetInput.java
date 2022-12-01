package com.accenture.incredibles.animal.methods;

import java.util.Scanner;

public class GetInput {
    Scanner scanner = new Scanner(System.in);

    public String execute() {
        System.out.print(">> ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        return input;
    }
}
