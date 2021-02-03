package eu.flrkv.schoolmanagement;

import java.io.IOException;

public class Menu {

    public static final String softwareName = "SMP - Schulmanager Pro";

    public Language l;

    public Menu(Language l) {
        this.l = l;
    }


    public void printSoftwareName()
    {
        System.out.println("--------------------->> " + Menu.softwareName + " <<---------------------");
    }

    public void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public void welcomeNotConfigured()
    {
        this.clearConsole();
        this.printSoftwareName();
        System.out.println("Hallo,");
        System.out.println();
        System.out.println("vielen Dank, dass Sie sich für " + Menu.softwareName + " entschieden haben!");
        System.out.println();
        System.out.println("Es wurde festgestellt, dass bisher noch keine Schule angelegt wurde.");
        System.out.println("Um jetzt eine Schule anzulegen drücken Sie bitte [ENTER]");
        System.out.println();
        System.out.println("[ENTER] -> Neue Schule anlegen");
        this.printSoftwareName();
    }

    public void schoolCreation()
    {
        this.printSoftwareName();
        System.out.println();
    }

}
