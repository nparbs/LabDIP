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
public class TextOutput implements OutputWriter {

	public void writeln( String line ) {
            System.out.println( line );
	}

    @Override
    public void writeln(InputReader reader) {
        System.out.println( reader.readln() );
    }
}
