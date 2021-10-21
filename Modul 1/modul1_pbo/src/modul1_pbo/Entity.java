package modul1_pbo;

public abstract class Entity {
    String name;
    int level = 1;
    int base_attack = level*2;
    int max_hp = 10;
    int hp = max_hp;
    int exp = 0;
    int max_exp = 2*level;
    
    public void naiklevel(){
        if(exp >= max_exp){
            level++;
            exp -= max_exp;
        }
    }
}
