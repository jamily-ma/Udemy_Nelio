package application;

import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.print("HOW MANY ROOM WILL BE RENTED? ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("RENT #" + (i + 1) + " :");
            System.out.print("NAME: ");
            String name = in.next();
            System.out.print("EMAIL: ");
            String email = in.next();
            System.out.print("ROOM: ");
            int room = in.nextInt();

            rents[room] = new Rent(name, email);

        }

        System.out.println("BUSY ROOMS:");

        for (int i = 0; i < rents.length; i++) {

            if (rents[i] != null) {

                System.out.println(i + ": " + rents[i]);

            }
        }
    }
}