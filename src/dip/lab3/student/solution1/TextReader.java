/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class TextReader implements Reader {

	public String readln() {
            System.out.println("Please enter text, then press enter.");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
