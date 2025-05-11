/*Suponha um jogo com objetos do tipo Marciano e outras criaturas do espaço. Um marciano
é corajoso quando existem mais de três marcianos no jogo. Quando ele está corajoso, ele
pode atacar. Se existirem três ou menos, todos ficam covardes. Assim, cada um precisa
saber a quantidade de marcianos no jogo. Cada criatura marciana tem nome e quantidade
de vidas, que inicialmente são três.
Este é um caso que pode ser resolvido utilizando um campo estático (contador). Cada vez
que um marciano é criado, o contador é incrementado.*/

package Marciano;

public class Marciano {
    private String nome;
    private int vidas;
    private static int totalmarcianos = 0;
    
    public Marciano(String nome){
        this.nome = nome;
        vidas = 3;
        totalmarcianos++;
    }
    public boolean corajoso(){
        if(totalmarcianos >3){
            return true;
        } else {
            return false;
        }
    }
    
    public void atacar(){
        if(corajoso()){
            System.out.println("O marciano: " + nome + " atacou!");
        } else {
            System.out.println("O marciano: " + nome + " está covarde e não atacou!");
        }
    }
    public void levarDano(){
        if(vidas > 0){
            vidas--;
            System.out.println("O marciano: " + nome + " perdeu uma vida!");
            System.out.println("Vidas restantes: "+vidas);
        if(vidas == 0){
            totalmarcianos--;
            System.out.println("O marciano: " + nome + " morreu!");
        }
        } else {
            System.out.println("O marciano: " + nome + " já está morto!");
        }
    }
    public int getVidas(){
        return vidas;
    }
    public String getNome(){
        return nome;
    }
    public int getTotalmarcianos(){
        return totalmarcianos;
    }
    
}
