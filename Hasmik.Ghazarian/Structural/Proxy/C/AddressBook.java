package com.synisys.de.peru.proxy;

import java.util.ArrayList;

/**
 * Author: Hasmik Ghazaryan on 1/21/2016.
 */
public interface AddressBook {
    public void add(Address address);
    public ArrayList getAllAddresses();
    public Address getAddress(String description);
    public void open();
    public void save();
}
