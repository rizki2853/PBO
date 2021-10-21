package modul1_pbo;

public class Monster extends Mob{
        
        Monster(String nama_monster, int max_hp){
            super.name = nama_monster;
            super.max_hp = max_hp;
        }
        
        public void serangPlayer(Player p){
            if(super.hp > 0){
                p.hp -= super.base_attack;
                if(p.pet != null){
                    p.pet.hp -= super.base_attack;
                    if(super.hp >0){
                        super.exp +=p.pet.drop_xp_pet(p);
                    } 
                }
            }
        }
        
        
}
