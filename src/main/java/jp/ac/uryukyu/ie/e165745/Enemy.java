package jp.ac.uryukyu.ie.e165745;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
class Enemy extends LivingThing {

    void damage_base(int damage, LivingThing opponent, String n){
        if (damage == 0) {
            System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
        } else {
            System.out.printf("%sの攻撃！%s%sに%dのダメージを与えた！！\n", getName(), n, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    @Override
    void attack(LivingThing opponent) {
        if (!(isDead())) {
            if (Math.random() > 0.2) {
                String n = "";
                int damage = (int) (Math.random() * getAttack());
                damage_base(damage, opponent, n);
            } else {
                String n = "痛恨の一撃!!";
                int damage = ((int) (Math.random() * getAttack() * 2));
                damage_base(damage, opponent, n);
            }
        }
    }
    Enemy(String look, int take, int suta) {
        super(look, take, suta); // 必ず先頭で呼び出す

    }

}


