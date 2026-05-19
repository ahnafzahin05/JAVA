package Class_12_OOP.ShootingGame;

public class Player2 extends Player1{
    private boolean armor;

    Player2(){}
    Player2(String name, int health, boolean armor){
        super(name, health);
        this.armor = armor;
    }

    @Override
    void damageByGun1(){
        if(!armor){
            this.health -=30;
            boolean isDead = false;

            if(this.health<=0){
                this.health = 0;
                isDead = true;
            }

            if(isDead) System.out.println(getName()+" is DEAD");
            else System.out.println(getName()+" is hit by Gun-1. Health reduced by 30. New HEALTH = "+this.health);
        }
        else{
            this.health-=20;
            boolean isDead = false;

            if(this.health<=0){
                this.health = 0;
                isDead = true;
            }

            if(isDead) System.out.println(getName()+" is DEAD");
            else System.out.println(getName()+" is hit by Gun-1. Health reduced by 20. New HEALTH = "+this.health);
        }
    }

    @Override
    void damageByGun2(){
        if(!armor){
            this.health-=50;
            boolean isDead = false;

            if(this.health<=0){
                this.health = 0;
                isDead = true;
            }

            if(isDead) System.out.println(getName()+" is DEAD");
            else System.out.println(getName()+" is hit by Gun-2. Health reduced by 50. New HEALTH = "+this.health);
        }
        else{
            this.health-=40;
            boolean isDead = false;

            if(this.health<=0){
                this.health = 0;
                isDead = true;
            }

            if(isDead) System.out.println(getName()+" is DEAD");
            else System.out.println(getName()+" is hit by Gun-2. Health reduced by 40. New HEALTH = "+this.health);
        }
    }

}
