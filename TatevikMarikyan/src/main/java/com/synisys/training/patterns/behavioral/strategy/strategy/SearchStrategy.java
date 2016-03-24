package com.synisys.training.patterns.behavioral.strategy.strategy;

import com.synisys.training.patterns.behavioral.strategy.domain.Filter;
import com.synisys.training.patterns.behavioral.strategy.domain.Person;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public interface SearchStrategy {

    Person searchPerson(Filter searchFilter);

}
