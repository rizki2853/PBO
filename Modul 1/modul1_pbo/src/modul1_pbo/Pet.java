/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1_pbo;

import java.util.Random;

/**
 *
 * @author user
 */
public class Pet extends Mob{
        Random random = new Random();
        Player player;
        

        Pet(String name, int max_hp){
            super.name = name;
            super.max_hp = max_hp;
            player = null;
        }
        
        public void ditangkap(Player nama_player){
            player = nama_player;
        }
        
        public void healing(Player p){
            if(p.hp<p.max_hp){
                int num = random.nextInt(2);
                if(num==1){
                    p.hp +=super.level*2;
                }
            }
        }
        
        public int drop_xp_pet(Player p){
        if(p.pet.hp <= 0){
            System.out.println("Pet Mati");
            int drop_exp = p.pet.level*3;
            p.pet = null;
            return drop_exp;
        }
        return 0;
    }
}
