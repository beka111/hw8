package src;
import java.util.Random;


public class RPG_Game {
    public static Random random = new Random();
    private static int roundNumber;

    public static void startGame() {
        Boss boss = new Boss(2500, 50, "Kraken");

        Warrior warrior1 = new Warrior(270, 10, "Luntik");
        Warrior warrior2 = new Warrior(280, 15, "Hercules");
        Magic magic = new Magic(290, 10, "Merlin");
        Berserk berserk = new Berserk(260, 10, "Kruella");
        Medic doc = new Medic(250, 5, 15, "Haus");
        Medic assistant = new Medic(290, 5, 5, "Avicenna");
        Witcher witcher = new Witcher(200, 0, "Hyrrem");
        Hacer hacer = new Hacer(155, 16, "Sumbyl aga");
        Avrora avrora = new Avrora(200, 10, "Avrora");
        Bomber bomber = new Bomber(200, 10, "Bomb");
        Reaper reaper = new Reaper(230, 10, "Ratatui");

        Hero[] heroes = {warrior1, warrior2, doc, magic, berserk, assistant, witcher, hacer, avrora, bomber, reaper};
        showStatistics(boss, heroes);

        while (!playRound(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static boolean playRound(Boss boss, Hero[] heroes) {

        return false;
    }

    private static void showStatistics(Boss boss, Hero[] heroes) {

    }
}

