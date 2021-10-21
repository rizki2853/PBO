package modul1_pbo;

public class Player extends Entity{
    Weapon weapon;
    Pet pet;
    
    Player(String nama_player){
        super.name = nama_player;
        weapon = null;
        pet = null;
    }
    
    public void menyerangMonster(Monster nama_mosnter){
        if(nama_mosnter.hp >0){
            if(weapon == null && pet==null){
                nama_mosnter.hp -= super.base_attack;
                super.exp += nama_mosnter.drop_xp();

            }else if(pet==null){
                nama_mosnter.hp -= super.base_attack+ weapon.base_attack;
                weapon.hp -= weapon.base_attack;
                int exp = nama_mosnter.drop_xp()/2;
                super.exp += exp;
                weapon.exp += exp;

            }else if(weapon == null){
                nama_mosnter.hp -= super.base_attack+ pet.base_attack;
                int exp = nama_mosnter.drop_xp()/2;
                super.exp += exp;
                pet.exp += exp;
            }else{
                nama_mosnter.hp -= super.base_attack+ weapon.base_attack +pet.base_attack;
                weapon.hp -= weapon.base_attack;
                int exp = nama_mosnter.drop_xp()/3;
                super.exp += exp;
                weapon.exp += exp;
                pet.exp += exp;
            }
            nama_mosnter.serangPlayer(this);
            if(pet != null){
                pet.healing(this);
                pet.naiklevel();
            }if(weapon != null){
                weapon.naiklevel();
                weapon.kondisi_weapon(this);
            }
            super.naiklevel();

            gameOver();
        }
    }
    
    public void menangkapPet(Pet nama_pet){
        if(nama_pet.player == null && pet == null){
            pet = nama_pet;
            pet.player = this;
        }else{
            System.out.println("pet sudah memiliki tuan");
        }
    }
    
    public void menggunakanWeapon(Weapon nama_senjata){
        if(nama_senjata.player == null && weapon == null){
            weapon = nama_senjata;
            weapon.player = this;
        }else{
            System.out.println("senjata sudah dipakai");
        }
    }
    
    
    public void gameOver(){
        if(hp<=0){
            System.out.println("Game Over");
        }
    }
    
    public void getplayer(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nama          : "+super.name+
                           "\nBase attack : "+super.base_attack+
                           "\nlevel       : "+super.level+
                           "\nHP          : "+super.hp+
                           "\nEXP         : "+super.exp+"\n\n");
        System.out.println("----------------------------------------------------");
    }
    
    public void getSenjata(){
        if(weapon == null){
            System.out.println("No Weapon");
        }else{
            System.out.println("----------------------------------------------------");
            System.out.println("Nama          : "+weapon.name+
                               "\nBase attack : "+weapon.base_attack+
                               "\nlevel       : "+weapon.level+
                               "\nHP          : "+weapon.hp+
                               "\nEXP         : "+weapon.exp+"\n\n");
            System.out.println("----------------------------------------------------");            
        }
    }
    
    public void getPet(){
        if(pet == null){
            System.out.println("No Pet");
        }else{
            System.out.println("----------------------------------------------------");
            System.out.println("Nama          : "+pet.name+
                               "\nBase attack : "+pet.base_attack+
                               "\nlevel       : "+pet.level+
                               "\nHP          : "+pet.hp+
                                "\nEXP         : "+pet.exp+"\n\n");
            System.out.println("----------------------------------------------------");
        }
    }
}
