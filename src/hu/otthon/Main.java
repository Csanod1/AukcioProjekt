package hu.otthon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Festmeny a = new Festmeny("Hómező", "Bálint Ferenc", "Expresszionizmus");

        a.getKerekitettLicitMatematikaiMuveletekkel(10);

        try {
            Festmenyek emberek2 = new Festmenyek("festmenyek.csv");
            System.out.println(emberek2);
        } catch (FileNotFoundException e) {
            System.err.printf("Hiba nem található az %s fájl\n", "festmenyek.csv");
        } catch (IOException e) {
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");
        }
    }

}
