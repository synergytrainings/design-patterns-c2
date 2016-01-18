package com.synisys.de.deu_gdt.proxy1;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public class ProxyDemo {

    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        FastThing fastThing = new FastThing();
        fastThing.sayHello();

        proxy.sayHello();

    }

}