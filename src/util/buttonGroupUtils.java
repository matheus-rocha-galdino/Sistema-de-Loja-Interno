/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Enumeration;
import javax.swing.AbstractButton;

/**
 *
 * @author mathr
 */
public class buttonGroupUtils {
    
    public static void setButtonGroup(String rdValue, Enumeration elements ){
    while (elements.hasMoreElements()){
        AbstractButton button = (AbstractButton)elements.nextElement();
        if(button.getActionCommand().equals(rdValue)){
            button.setSelected(true);
        }
    }
}
}
