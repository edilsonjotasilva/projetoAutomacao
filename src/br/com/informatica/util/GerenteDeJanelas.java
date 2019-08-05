/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class GerenteDeJanelas {
    private static JDesktopPane desktopPane;
    
    public GerenteDeJanelas(JDesktopPane jDesktopPane){
        GerenteDeJanelas.desktopPane = jDesktopPane;
    }
    public void abrirJanelas(JInternalFrame jInternalFrame){
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        }else{
            desktopPane.add(jInternalFrame);
            jInternalFrame.isVisible();
        }
    }
}
