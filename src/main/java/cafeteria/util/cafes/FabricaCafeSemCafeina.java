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

/* O cafe sem cafeina é composto pelos seguintes ingredientes: 
    50 g de café sem cafeína, 
    2 xícaras de açúcar, 
    1 xícara de leite com 100 ml.*/
public class FabricaCafeSemCafeina extends FabricaCafe{
    private final Acucar acucar;
    private final LeiteLiq leiteLiq;
    private final CafeSemCafeina cafeSem;

    private FabricaCafeSemCafeina() {
        super(3);
        this.acucar = this.criarAcucar();
        this.leiteLiq = this.criarLeiteLiq();
        this.cafeSem = this.criarCafeSemCafeina();
        
    }
    
    public synchronized static FabricaCafe getInstance() {
        if(fabCafe == null) {
            fabCafe = new FabricaCafeSemCafeina();
        }
        return fabCafe;
    }
    
    @Override
    public final CafeSemCafeina criarCafeSemCafeina() {
        return new CafeSemCafeina(50);
    }
        @Override
    public final Acucar criarAcucar() {
        return new Acucar(200);
    }

    @Override
    public final LeiteLiq criarLeiteLiq() {
        return new LeiteLiq(100);
    }
    
    @Override
    public String toString(){
        return super.toString() + "Café Sem Cafeína: \n" +
               this.criarAcucar().toString() +
               this.criarCafeSemCafeina().toString() + 
               this.criarLeitePo().toString() + "\n";
    }


}
