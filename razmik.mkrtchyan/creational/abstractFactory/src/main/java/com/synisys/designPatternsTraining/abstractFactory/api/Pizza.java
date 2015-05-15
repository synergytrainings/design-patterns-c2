package main.java.com.synisys.designPatternsTraining.abstractFactory.api;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * Created by Razmik on 5/15/2015.
 */
public abstract class Pizza {
    @NotNull
    private String name;
    @NotNull
    private Dough dough;
    @NotNull
    private Sauce cheese;


    public abstract void prepare();

    public Pizza(@NotNull String name) {
        //PreCondition
        this.name = Objects.requireNonNull(name);
    }


    public String getName() {
        return name;
    }
}
