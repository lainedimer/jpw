package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private Double preco;
    private Double quantidade;
    private String produto;
    DecimalFormat decimal = new DecimalFormat( "0.00" );
            
    public Double getTotalPreco() {
        return  quantidade * preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }
  
    
}
