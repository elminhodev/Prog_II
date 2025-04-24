package Coxinha;

public class Maquinadecoxinhas {
    private int estoque;

    public Maquinadecoxinhas() {
        this.estoque = 0;
    }
    get int getEstoque() {
        return estoque;
    }
    public void setEstoque(int abastecer) {
        if(abastecer > 0) {
            estoque += abastecer;
        }
    }
    
}
