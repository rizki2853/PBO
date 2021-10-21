
package modul1_pbo;

public class Weapon extends Entity{
    Player player;
    
    Weapon(String nama_senjata){
        super.name = nama_senjata;
        player = null;
    }
    
    public void mengganti_senjata(Weapon new_weapon, Player p){
        this.player = player;
        player.weapon = new_weapon;
    }
    
    public void membuang_senjata(Player player){
        this.player = player;
        player.weapon = null;
    }
    
    public void mendapatkan_senjata(Weapon weapon, Player player){
        this.player = player;
        player.weapon = weapon;
    }
    
    public void kondisi_weapon(Player player){
        if(player.weapon.hp <=0){
            System.out.println("weapon broken");
            player.weapon = null;
        }
    }
    
}
