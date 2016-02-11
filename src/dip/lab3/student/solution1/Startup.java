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
        
        InputReader[] readers = {new GUIInput(), new TextInput()};
        
        for(InputReader r : readers) {
           //r.readln();
        }
        
       // InputReader input = new TextInput();
       // OutputWriter output = new TextOutput();
        InputReader input = new GUIInput();
        OutputWriter output = new GUIOutput();

        

        CopyService copy = new CopyService(input, output);
        copy.produceMessage();

        
    }
    
}
