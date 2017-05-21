package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private String endereco;
    private Item item;
    private List<Item> itens = new ArrayList<>();
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public List<Item> getItens(){
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public Double getTotal() {
        Double aux = 0.0;
        
        for(Item i : itens) {
            aux += i.getTotalPreco();
        }
        
        return aux;
    }
    
}
