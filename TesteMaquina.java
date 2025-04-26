package Coxinha;

public class TesteMaquina {
    public static void main (String[] args) {
        Maquinadecoxinhas maquina = new Maquinadecoxinhas();
        
        maquina.abastecer(30);
        maquina.venderCoxinha();
        maquina.venderCoxinha(3);
        maquina.venderCoxinha(-1);
        maquina.zerarMaquina();
    }    
}
