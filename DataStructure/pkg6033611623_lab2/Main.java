/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab2;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList a=new LinkedList();
        a.add((Object)20);
        a.add((Object)30);
        a.add(0, 70);
        a.add(2, 90);
        a.remove((Object)20);
        System.out.println(a.size());
        System.out.println(a.contain(30));
        System.out.println(a.get(2));
        System.out.println(a.get(0));
        a.set(0, 100);
        a.set(2, 200);
        a.remove((Object)50);
        a.remove(0);
        
        a.remove(2);
        a.printL();
    }
    
}
