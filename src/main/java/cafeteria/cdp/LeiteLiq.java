/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.cdp;

/**
 *
 * @author IzabelyFurtado
 */
public class LeiteLiq extends Leite{

    public LeiteLiq(float quantidade) {
        super(quantidade);
    }
    
    @Override
    public String toString(){
        return super.toString() + "Líquido: " + this.getQuantidade() + "\n";
    }
}
