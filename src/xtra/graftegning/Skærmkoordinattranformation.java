/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.graftegning;

/**
 *
 * @author j
 */
public class Skærmkoordinattranformation {

	double offsetX = 10;
	double skalaX = 50;
	double offsetY = 150;
	double skalaY = -100;

	public Skærmkoordinattranformation() {
	}

	int tilSkærmX(double x) {
		return (int) Math.round(offsetX + skalaX*x);
	}


	int tilSkærmY(double y) {
		return (int) Math.round(offsetY + skalaY*y);
	}

}
