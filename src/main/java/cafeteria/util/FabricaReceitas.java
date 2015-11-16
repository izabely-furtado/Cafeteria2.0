/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util;

import cafeteria.util.cafes.*;

/**
 *
 * @author IzabelyFurtado
 */
public class FabricaReceitas {
    
    public static String receitaCafeExpresso(){
        return FabricaCafeExpresso.getInstance().toString();
    }
    
    public static String receitaCafeSemCafeina(){
        return FabricaCafeSemCafeina.getInstance().toString();
    }
    
    public static String receitaCafeCappuccino(){
        return FabricaCafeCappuccino.getInstance().toString();
    }
    
}
