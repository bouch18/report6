package jp.ac.uryukyu.ie.e165745;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
/*public class Hero extends LivingThing{
    LivingThing hero = super.LivingThing("勇者", 10, 5);*/

class Hero extends LivingThing {

    Hero(String look, int take ,int manu){
        super(look, take, manu); // 必ず先頭で呼び出す


    }
}