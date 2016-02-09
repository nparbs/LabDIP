/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author nparbs
 */
public class GUIReader implements Reader {

    @Override
    public String readln() {
        return JOptionPane.showInputDialog(null, "Enter message here:");
    }
    
}
