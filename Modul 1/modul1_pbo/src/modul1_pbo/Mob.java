
package modul1_pbo;

public class Mob extends Entity{
    public int drop_xp(){
        if(super.hp <= 0){
            System.out.println("Monster Mati");
            return super.level*3;
        }
        return 0;
    }
    
    
    public void detailmonster(){
        System.out.println("Nama          : "+super.name+
                           "\nBase attack : "+super.base_attack+
                           "\nlevel       : "+super.level+
                           "\nHP          : "+super.hp+
                           "\nEXP         : "+super.exp);
    }
}
