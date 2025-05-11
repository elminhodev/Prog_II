package Marciano;

public class TesteMarciano {
    public static void main (String[] args){
        Marciano[] marcianos = new Marciano[5];
        marcianos[0] = new Marciano("Junin");
        marcianos[1] = new Marciano("Claudin");
        marcianos[2] = new Marciano("Silvin");
        marcianos[3] = new Marciano("Bolin");
        marcianos[4] = new Marciano("Olavin");
        
        marcianos[3].atacar();
        marcianos[3].atacar();
        
        System.out.println("Total de marcianos no jogo: "+marcianos[2].getTotalmarcianos());
        
        marcianos[1].levarDano();
        marcianos[1].levarDano();
        marcianos[1].levarDano();
        marcianos[1].levarDano();
        
        System.out.println("Total de marcianos no jogo: "+marcianos[2].getTotalmarcianos());
        
    }
}
