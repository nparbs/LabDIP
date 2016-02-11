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
           r.readln();
        }
        
        InputReader input = new InputReader();
        OutputWriter output = new OutputWriter();
//        MessageOutputStrategy output = new JOptionPaneMessageOutputStrategy();
        
        // If you want to hear the audio output you need a computer that has
        // speakers and an audio card.
//        MessageInputStrategy input = new HelloAdvancedJavaAudioMessageInputStrategy();
//        MessageOutputStrategy output = new HelloAdvJavaAudioMessageOutputStrategy();
    
        CopyService copy = new CopyService(input, output);
        copy.produceMessage();

        
    }
    
}
