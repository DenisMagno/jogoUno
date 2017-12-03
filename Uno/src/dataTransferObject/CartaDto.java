
package dataTransferObject;

public class CartaDto {
    public int cor;
    public int numero;
    public int status;
    
    public CartaDto(int cor, int numero){
        this.cor = cor;
        this.numero = numero;
        this.status = 1;
    }
}
