package Class_12_OOP.ShootingGame;

public class Player1 {
    private String name;
    protected int health;

    String getName(){
        return this.name;
    }

    int getHealth(){
        return this.health;
    }

    Player1(){}
    Player1(String name, int health){
        this.name = name;
        this.health = health;

        if(this.health<0) this.health = 0;
        else if(this.health>100) this.health = 100;
    }

    void damageByGun1(){
        this.health-=30;
        boolean isDead = false;

        if(this.health<=0){
            this.health = 0;
            isDead = true;
        }

        if(isDead) System.out.println(this.name+" is DEAD");
        else System.out.println(this.name+" is hit by Gun-1. Health reduced by 30. New HEALTH = "+this.health);
    }

    void damageByGun2(){
        this.health-=50;
        boolean isDead = false;

        if(this.health<=0){
            this.health = 0;
            isDead = true;
        }

        if(isDead) System.out.println(this.name+" is DEAD");
        else System.out.println(this.name+" is hit by Gun-2. Health reduced by 50. New HEALTH = "+this.health);
    }

    void heal(){
        if(this.health>0) {
            this.health = 100;
            System.out.println("Successfully HEALED. New HEALTH = 100");
        }
        else System.out.println("Heal not possible. "+getName()+" is already DEAD");
    }
}
