package modul1_pbo;

import java.util.Scanner;

public class Modul1_pbo {

    public static void main(String[] args) {
        
        //membuat player
        Player p1 = new Player("Rizki");
        Player p2 = new Player("zero");
        
        //membuat senjata
        Weapon w1 = new Weapon("pedang");
        Weapon w2 = new Weapon("tombak");
        Weapon w3 = new Weapon("Pisau");
        
        //membuat pet
        Pet pet1 = new Pet("Pikachu",5);
        Pet pet2 = new Pet("raiju",5);
        Pet pet3 = new Pet("togepi",3);
        
        //membuat monster
        Monster m1 = new Monster("Kaijuu",15);
        Monster m2 = new Monster("Kaijuu no kodomo",10);
        Monster m3 = new Monster("Ghoul",12);
        Monster m4 = new Monster("Titan",20);
        Monster m5 = new Monster("Hollow",18);
        
        gameover:
        p1.getplayer();
        
        //menyerang tanpa senjata
        p1.menyerangMonster(m2);
        
        //mengambil weapon
        p1.menggunakanWeapon(w1);
        
        //menyerang dengan senjata
        p1.menyerangMonster(m2);
        
        //menangkap pet
        p1.menangkapPet(pet2);
        
        //menyerang menggunakan pet dan weapon
        p1.menyerangMonster(m2);
        
        //status player
        
        //status senjata
//        p1.getSenjata();
        
        //serang sampai level 2 dan pet mati

        //status pemain
//        p1.getplayer();
//        p1.getSenjata();
//        p1.getPet();
        
        p1.menyerangMonster(m1);
        p1.menyerangMonster(m1);
        
//        p1.getplayer();
//        p1.getSenjata();
//        p1.getPet();
        
        p1.menyerangMonster(m3);
        p1.menyerangMonster(m3);
        p1.menyerangMonster(m3);
        
        p1.getplayer();
        p1.getSenjata();
        p1.getPet();
        
        p1.menyerangMonster(m4);
        p1.menyerangMonster(m4);
        p1.menyerangMonster(m4);
        p1.menyerangMonster(m5);
//        p1.menyerangMonster(m5);

        
        //detail monster
        m4.detailmonster();   
    }
    
    
}
