package com.synisys.de.peru.proxy;

import java.io.File;
import java.util.ArrayList;

/**
 * Author: Hasmik Ghazaryan on 1/21/2016.
 */
public class ProxyTest {
    public static void main(String[] arguments) {

        if (!(new File("addressBook").exists())) {
            //Create file
        }
        AddressBookProxy proxy = new AddressBookProxy("addressBook");
        proxy.add(new Address("Synergy Int Systems", "Armenakyan",
                "2/5", "Yerevan", "00000"));
        System.out.println(proxy.getAddress("Synergy Int Systems").getAddress());
        ArrayList<Address> addresses = proxy.getAllAddresses();
        System.out.println(addresses);
    }
}
