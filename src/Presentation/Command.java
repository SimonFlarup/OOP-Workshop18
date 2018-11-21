/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.Commands;
import java.util.Scanner;

/**
 *
 * @author askel
 */
public class Command {

    Scanner scanner;

    public Command() {
        this.scanner = new Scanner(System.in);
    }

    public void getInput() {
        String input = scanner.next();

        if (input.equalsIgnoreCase(Commands.ADD.toString())) {
            

        } else if ("remove".equalsIgnoreCase(input)) {

        } else if ("get".equalsIgnoreCase(input)) {

        } else if ("set".equalsIgnoreCase(input)) {

        } else {
            System.out.println("Stupid input!!");
        }
    }

}
