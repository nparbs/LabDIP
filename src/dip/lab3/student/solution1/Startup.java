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
        
        
 
        //InputReader input = new GUIInput();
        InputReader input = new TextInput();
        OutputWriter output = new TextOutput();
        
        MessageService msgService = new MessageService(input, output);
        msgService.produceMessage();

        
        
        //loop
        InputReader[] readers = {new GUIInput(), new TextInput()};
        OutputWriter output2 = new GUIOutput();
        for(InputReader r : readers) {
            MessageService msgService2 = new MessageService(r, output2);
        msgService2.produceMessage();
        }
   
    }
    
}
