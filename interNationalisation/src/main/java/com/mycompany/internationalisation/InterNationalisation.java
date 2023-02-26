/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.internationalisation;

/**
 *
 * @author tusha
 */
import java.util.*;
public class InterNationalisation {

    public static void main(String[] args) {
        Locale enl = new Locale("en","US");
        Locale frl = new Locale("fr","FR");
        Locale esl = new Locale("es","ES");
        System.out.println("English laguage name " + enl.getDisplayLanguage());
        System.out.println("English laguage name in french " + enl.getDisplayLanguage(frl));
        System.out.println("English laguage name int Spnaish " + enl.getDisplayLanguage(esl));
    }
}
