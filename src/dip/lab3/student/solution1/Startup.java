/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Nick
 */
public class Startup {
    
    public static void main(String[] args) {
        
        
        // InputReader input = new TextInput();
        // OutputWriter output = new TextOutput();
        InputReader input = new GUIInput();
        OutputWriter output = new GUIOutput();
        
        //MessageService msg = new MessageService(input, output);
        //msg.produceMessage();

        InputReader[] readers = {new GUIInput(), new TextInput()};
        for(InputReader r : readers) {
            MessageService msg = new MessageService(r, output);
        msg.produceMessage();
        }
   
    }
    
}
