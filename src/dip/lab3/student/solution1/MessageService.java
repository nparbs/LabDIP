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
public class MessageService {
    private InputMessage input;
    private OutputMessage output;
    
    public MessageService(InputMessage input, OutputMessage output) {
        this.input = input;
        this.output = output;
    }
    
    public void produceMessage() {
        output.writeln(input);
    }
}
