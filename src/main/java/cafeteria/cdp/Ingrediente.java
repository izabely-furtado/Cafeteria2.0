/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.cdp;

/**
 *
 * @author 20121bsi0040
 */
public abstract class Ingrediente {
    private float quantidade;
    
    Ingrediente(float quantidade){
        this.setQuant(quantidade);
    }
    
    //valida a inserção da quantidade de ingrediente
    public final void setQuant(float quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
        else{
            throw new RuntimeException("Só um palpite: \n" + 
                                       "dando tudo errado, grite. \n"  +
                                       "Ulisses Tavares \n" +
                                       "(Pare de ser tão muquirana)");
        }
    }
    
    public float getQuantidade(){
        return this.quantidade;
    }
    
}
