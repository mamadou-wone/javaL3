// #  ___       __   ________  ________   _______      
// # |\  \     |\  \|\   __  \|\   ___  \|\  ___ \     
// # \ \  \    \ \  \ \  \|\  \ \  \\ \  \ \   __/|    
// #  \ \  \  __\ \  \ \  \\\  \ \  \\ \  \ \  \_|/__  
// #   \ \  \|\__\_\  \ \  \\\  \ \  \\ \  \ \  \_|\ \ 
// #    \ \____________\ \_______\ \__\\ \__\ \_______\
// #     \|____________|\|_______|\|__| \|__|\|_______|

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // **************************CENTER*******************************
        Centre centre1 = new Centre(1, "Fiesta", "Rufisque", "HLM");
        Centre centre2 = new Centre(2, "Arch", "Rufisque", "Diogua");
        Centre centre3 = new Centre(3, "Fiesta", "Rufisque", "Bargny");
        Centre centre4 = new Centre(4, "Fiesta", "Rufisque", "Cité Millionnaire");

        // **************************ACTIVITE*******************************
        Activite activite1 = new Activite(1, "Chasse au Trésors");
        Activite activite2 = new Activite(2, "Golf");
        Activite activite3 = new Activite(3, "Football");
        Activite activite4 = new Activite(4, "Tenis");
        Activite activite5 = new Activite(5, "Billiard");

        // **************************MEMBRES*******************************
        Membre membre1 = new Membre(1, "Mamadou WONE");
        membre1.setCentre(centre3);

        Membre membre2 = new Membre(2, "Kinza ZalTouba");
        membre2.setCentre(centre1);

        Membre membre3 = new Membre(3, "Thioro THIAM");
        membre3.setCentre(centre3);

        Membre membre4 = new Membre(4, "Mouhamed TOURE");
        membre4.setCentre(centre2);

        Membre membre5 = new Membre(5, "L3TDS JAVA");
        membre5.setCentre(centre4);

        // **************************DATE*******************************
        LocalDate date = LocalDate.parse("30-04-2021", DateTimeFormatter.ofPattern("d-M-y"));
        LocalDate date2 = LocalDate.parse("29-04-2021", DateTimeFormatter.ofPattern("d-M-y"));
        LocalDate date3 = LocalDate.parse("28-04-2021", DateTimeFormatter.ofPattern("d-M-y"));
        LocalDate date4 = LocalDate.parse("27-04-2021", DateTimeFormatter.ofPattern("d-M-y"));

        // **************************LIST PARTICIPANTS*******************************
        Membre list1[] = { membre2, membre3 };
        Membre list2[] = { membre1, membre4 };
        Membre list3[] = { membre5, membre3 };
        Membre list4[] = { membre3, membre4 };

        Pratiquer pratiquer = new Pratiquer(activite1);
        pratiquer.addMemberToActivite(date, list1);

        Pratiquer pratiquer1 = new Pratiquer(activite3);
        pratiquer1.addMemberToActivite(date2, list3);

        Pratiquer pratiquer2 = new Pratiquer(activite2);
        pratiquer2.addMemberToActivite(date3, list4);

        Pratiquer pratiquer3 = new Pratiquer(activite4);
        pratiquer3.addMemberToActivite(date, list3);

    }
}
