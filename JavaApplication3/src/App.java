/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.ArrayList;
import com.charizard.TenorGIF.Tenor;

/**
 *
 * @author pepou
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Url url;
        Tenor.setAPIKey("Q33RWN4MXL29");
        System.out.println(Tenor.returnRandomGIF("Charizard", 10));
        System.out.println(Tenor.returnGIF("Charizard"));
        ArrayList<String> list = Tenor.returnGIFs("Charizard", 10);
        String links = "";
        for (int i = 0; i < list.size(); i++) {
            links += list.get(i) + "\n";
        }
        System.out.println(links);
    }
    
}
