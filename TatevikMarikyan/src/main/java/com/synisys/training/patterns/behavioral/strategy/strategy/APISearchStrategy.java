package com.synisys.training.patterns.behavioral.strategy.strategy;

import com.synisys.training.patterns.behavioral.strategy.domain.Filter;
import com.synisys.training.patterns.behavioral.strategy.domain.Person;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public class APISearchStrategy implements SearchStrategy {
    @Override
    public Person searchPerson(Filter searchFilter) {
        System.out.println("Person Searched by API");
        return new Person();
    }
}
