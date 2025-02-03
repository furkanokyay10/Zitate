import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();


        String[] motivationZitate = {
                "Gib niemals auf, egal wie schwer es wird.",
                "Erfolg ist das Ergebnis harter Arbeit.",
                "Der einzige Weg, großartige Arbeit zu leisten, ist zu lieben, was du tust. - Steve Jobs",
                "Motivation bringt dich weiter, Gewohnheit bringt dich ans Ziel.",
                "Erfolg hat drei Buchstaben: TUN. - Johann Wolfgang von Goethe",
                "Das Leben beginnt am Ende deiner Komfortzone.",
                "Der Unterschied zwischen einem Traum und einem Ziel ist ein Plan.",
                "Jeder Tag ist eine neue Chance, um anzufangen.",
                "Was du heute tust, kann alle deine Morgen verändern.",
                "Du bist stärker als du denkst, mutiger als du glaubst und fähiger als du es dir jemals vorstellen kannst."
        };

        String[] weisheitenZitate = {
                "Dankbarkeit ist der Anfang aller Größe.\n\nSeneca",
                "In einem dankbaren Herzen herrscht ewiger Sommer.",
                "Es ist immer Zeit für einen neuen Anfang.\n\nKonrad Adenauer",
                "Die Jugend wäre unsere schönste Zeit, wenn sie erst später im Leben käme.\n\nCharlie Chaplin",
                "Es gibt keine Probleme, nur Herausforderungen.",
                "Der kluge Mensch lässt sich belehren, der Unkluge weiß alles besser.",
                "Geduld ist der Schlüssel zum Erfolg.",
                "Lerne aus der Vergangenheit, träume von der Zukunft und lebe in der Gegenwart.",
                "Nicht die Dinge selbst beunruhigen die Menschen, sondern die Meinungen und Urteile über die Dinge. - Epiktet",
                "Das Geheimnis des Glücks ist Freiheit, und das Geheimnis der Freiheit ist Mut. - Thukydides"
        };

        // Endlose Schleife
        while (true) {

            System.out.println("Welche Zitat möchten Sie haben? Motivation, Weisheiten oder doch lieber Zufällig (oder 'exit' zum Beenden)?");
            String zitatAusgabe = s.nextLine().toLowerCase();

            // "exit"
            if (zitatAusgabe.equals("exit")) {
                System.out.println("Programm beendet.");
                break;
            }

        // Listezum Speichern der Zitate !!
            List<String> list = new ArrayList<>();

            //
            if (zitatAusgabe.equals("motivation")) {
                list.addAll(Arrays.asList(motivationZitate));
            } else if (zitatAusgabe.equals("weisheiten")) {
                list.addAll(Arrays.asList(weisheitenZitate));
            } else if (zitatAusgabe.equals("zufällig")) {

                list.addAll(Arrays.asList(motivationZitate));
                list.addAll(Arrays.asList(weisheitenZitate));
            } else {
                System.out.println("Ungültige Eingabe, bitte versuche es erneut.");
                continue;
            }

            //zufälliges Zitat aus der Liste
            int randomIndex = random.nextInt(list.size());
            String randomQuote = list.get(randomIndex);

            //zufällige Zitat ausgeben
            System.out.println("\nHier ist dein Zitat:\n" + randomQuote + "\n");
        }

        s.close();  
    }
}
