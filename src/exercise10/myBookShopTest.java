/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10;

import java.io.IOException;

/**
 *
 * @author debrsa01
 */
public class myBookShopTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BookShop shop2 = new BookShop("data/library2.txt");
        System.out.println(shop2.getCatalog().get(0).getPrice());
        shop2.discountAll(20.0);
        System.out.println(shop2.getCatalog().get(0).getPrice());
    }
    
}
