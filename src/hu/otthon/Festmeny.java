package hu.otthon;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }

    public Festmeny() {
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }

    public String getCim() {
        return cim;
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public boolean isElkelt() {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }
    
    public void licit(){
        double szam;
        if (this.elkelt = true){
            System.out.println("Hibás próbálkozás, a tárgy már elkelt");
        } else if (this.licitekSzama == 0) {
            this.legmagasabbLicit = 100;
            this.licitekSzama++;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        }else{
            szam = (this.legmagasabbLicit*1.1);
            this.legmagasabbLicit = Integer.parseInt(String.valueOf(Math.round(legmagasabbLicit*1.1)));
        }
    }
}
