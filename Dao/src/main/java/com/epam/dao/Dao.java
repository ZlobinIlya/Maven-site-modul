package com.epam.dao;

/** 
 * This is Dao class for Product system
 * @autor Zlobin Ilya
 * @version 1.0
 *  
 */
public class Dao {

	Prod prod = new Prod();
	
	/** Additional Value */
	int a = 20;
	
	/** Cost price */
	int b = 40;
	/** 
     * Full Price of product for China
     * @return  int 
     */
	public int fullAnswer(int a, int b) {
		int c = prod.getPrice(a, b);
		return c;
		
	}
}
