
package jp.ac.uryukyu.ie.e165745;

/**
 * Created by e165745 on 2016/11/21.
 **/
class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    boolean isDead() {
        return dead;
    }
    String getName(){
        return name;
    }
    int gethitPoint() { return hitPoint;}
    void setisDead() {this.dead = true;}
    void attack(LivingThing opponent){
        if(!(dead)){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }

    void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ){
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}