/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.cafes;

import cafeteria.cdp.*;

/**
 *
 * @author 20121bsi0040
 */

/* O normal é composto pelos seguintes ingredientes: 
    50 g de café solúvel, 
    2 xícaras de açúcar, 
    1 xícara de leite com 100 ml.*/
public class FabricaCafeExpresso extends FabricaCafe{
    private final Acucar acucar;
    private final CafeSoluvel cafeSoluvel;
    private final LeiteLiq leiteLiq;

    private FabricaCafeExpresso() {
        super(2);
        this.acucar = this.criarAcucar();
        this.cafeSoluvel = this.criarCafeSoluvel();
        this.leiteLiq = this.criarLeiteLiq();
    }
    
    public synchronized static FabricaCafe getInstance() {
        if(fabCafe == null) {
            fabCafe = new FabricaCafeExpresso();
        }
        return fabCafe;
    }
    
    @Override
    public final Acucar criarAcucar() {
        return new Acucar(200);
    }

    @Override
    public final CafeSoluvel criarCafeSoluvel() {
        return new CafeSoluvel(50);
    }

    @Override
    public final LeiteLiq criarLeiteLiq() {
        return new LeiteLiq(100);
    }
    
    @Override
    public String toString(){
        return super.toString() + "Café Expresso: \n" +
               this.criarAcucar().toString() +
               this.criarCafeSoluvel().toString() + 
               this.criarLeitePo().toString();
    }
}
