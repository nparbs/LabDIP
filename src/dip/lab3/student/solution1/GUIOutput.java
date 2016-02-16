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
public class GUIOutput implements OutputMessage {
	
        @Override
	public void writeln( InputMessage output ) {
            JOptionPane.showMessageDialog(null, output.readln());
	}
}
