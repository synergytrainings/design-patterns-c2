package proxy;

import proxy.domain.Application;
import proxy.domain.ProxyShortcut;


public class ProxyPatternDemo {
    public static void main(String[] args) {
        Application program = new ProxyShortcut("ProgramName");
        program.run();
    }
}


