package hu.otthon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Festmeny> festmenyek = new ArrayList<>();

    public static void main(String[] args) {
        Festmeny festmeny = new Festmeny("Hómező", "Bálint Ferenc", "Expresszionizmus");
        Festmeny festmeny1 = new Festmeny("Havas", "Balint Ferenc", "Reneszánsz");

        Festmeny a = new Festmeny("Hómező", "Bálint Ferenc", "Expresszionizmus");

        a.getKerekitettLicitMatematikaiMuveletekkel(10);

        try {
            festmenyekFelveteleKonzolról();
        } catch (InputMismatchException e) {
            System.out.println("Nem megfelelő számot adott meg, nem lesz felvéve a festmény");
        }

        try {
            Festmenyek emberek2 = new Festmenyek("festmenyek.csv");
            System.out.println(emberek2);
        } catch (FileNotFoundException e) {
            System.err.printf("Hiba nem található az %s fájl\n", "festmenyek.csv");
        } catch (IOException e) {
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");
        }
    }


    private static void festmenyekFelveteleKonzolról(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg mennyi fetményt szeretne hozzáadni");
        int db = sc.nextInt();
        for (int i = 0; i < db; i++) {
            System.out.printf("Kérem adja meg a %d festmény címét", (i +1));
            String cim = sc.nextLine();
            System.out.printf("Kérem adja meg a %d festmény festőjét", (i +1));
            String festo = sc.nextLine();
            System.out.printf("Kérem adja meg a %d festmény stylusát", (i +1));
            String stilus = sc.nextLine();
            festmenyek.add(new Festmeny(cim, festo, stilus));
        }

    }

}
