package com.synisys.training.patterns.structural.adapter;

/**
 * @author Tatevik.Marikyan
 * @since 09-Jun-15.
 */
public class AdapterTest {
    public static void main(String[] args) {

        AbstractAccount sa = new StandardAccount(2000);
        System.out.println("Account Balance= " + sa.getBalance());

        //Calling getBalance() on Adapter
        AbstractAccount adapter = new AccountAdapter(new OffshoreAccount(2000));
        System.out.println("Account Balance= " + adapter.getBalance());
    }
}
