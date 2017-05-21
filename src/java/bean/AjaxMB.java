package bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Item;
import model.Pedido;


@ManagedBean
@ViewScoped
public class AjaxMB {
  
    private Item item;
    private Pedido pedido;
    List<Pedido> pedidos = new ArrayList<>();
    
    public void adicionaItem(){
        if(!pedido.getItens().contains(item)){
            pedido.getItens().add(item);        
        }
        novoItem();
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
    public void salvar(){
       if(!pedidos.contains(pedido)){
         pedidos.add(pedido);  
       } 
       novoPedido();
    }
    
    public void remover(Item item){
        pedido.getItens().remove(item);
    }
    
    public void editar(Item item){
        this.item = item;
    }
    
    public void cancelar(){
        pedido.setCliente("");
        pedido.setEndereco("");
        pedido.getItens().clear();
    }
    
    
    @PostConstruct
    public void inicializar(){
        item = new Item();
        pedido = new Pedido();
    }
  
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }    

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public void novoItem() {
        item = new Item();
    }
     public void novoPedido() {
        pedido = new Pedido();
    }
    
    public List<Item> getListaItens() {
        return pedido.getItens();
    }
    public AjaxMB() {
    }
    
  
    

}
