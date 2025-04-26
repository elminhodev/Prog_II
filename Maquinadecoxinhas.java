package Coxinha;

public class Maquinadecoxinhas {
    private int estoque;

    public Maquinadecoxinhas() {
        this.estoque = 0;
    }

    public void setEstoque(int estoque) {
        if(estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Valor negativo nao é válido.");
        }
    }
    public int getEstoque() {
        return estoque;
    }
    public void abastecer(int qtd) {
        if (qtd > 0) {
            estoque += qtd;
            System.out.println("Máquina abastecida com " + qtd + " coxinhas. Estoque atual: " + estoque);
        } else {
            System.out.println("Voce usou um valor inválido para o abastecimento");
            
        }
    }
    
    public void venderCoxinha() {
        if (estoque > 0) {
        estoque --;
        System.out.println("1 coxinha vendida. Estoque atual: " + estoque);
        } else {
            System.out.println("Nao há coxinhas para serem vendidas.");
        }
    }
    public void venderCoxinha(int qtdvenda) {
        if(qtdvenda <= 0) {
            System.out.println("Nao há possibilidade de vender essa quantidade de coxinha");
            } else if (qtdvenda > estoque) {
                System.out.println("Nao há essa quantidade de coxinhas no estoque.");
            } else {                
            estoque -= qtdvenda;
            System.out.println(qtdvenda + " coxinhas vendidas. Estoque atual: " + estoque);
        }
    }
    public void zerarMaquina() {
        estoque = 0;
        System.out.println("Estoque zerado, até a próxima.");
    }    
}
