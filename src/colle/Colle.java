/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colle;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 *
 * @author Subin
 */
public class Colle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        List list1 = new ArrayList();
//        List list2 = new ArrayList();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        Subin
//        list1.add("4");
//        list1.add("5");
//        list2.add("1");
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//        list1.removeAll(list2);
//        System.out.println(list1);

try
        {
            InetAddress addr = InetAddress.getByName("0.0.0.0");
            System.out.println("InetAddress => " + addr);
            System.out.println("InetAddress.isAnyLocalAddress = " + addr.isAnyLocalAddress());
            System.out.println("InetAddress.isLinkLocalAddress = " + addr.isLinkLocalAddress());
            System.out.println("InetAddress.isLoopbackAddress = " + addr.isLoopbackAddress());

            InetSocketAddress isockaddr = new InetSocketAddress(addr,8080);
            System.out.println("InetSocketAddr = " + isockaddr);
            System.out.println("InetSocketAddr.isUnresolved = " + isockaddr.isUnresolved());
            System.out.println("Subin");
            System.out.println("Punnet");
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
        
     }
    
}
