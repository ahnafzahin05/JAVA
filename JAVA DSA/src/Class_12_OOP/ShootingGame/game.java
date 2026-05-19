package Class_12_OOP.ShootingGame;

public class game {
    public static void main(String[] args) {
        Player1 p1 = new Player1("Wasif", 60);
        Player2 p2 = new Player2("Nafisa", 80, false);

        p1.damageByGun2();
        p1.damageByGun1();
        p1.heal();
        p2.damageByGun1();
        p2.heal();
        p2.damageByGun2();
        p2.damageByGun2();
        p2.damageByGun2();

    }
}
