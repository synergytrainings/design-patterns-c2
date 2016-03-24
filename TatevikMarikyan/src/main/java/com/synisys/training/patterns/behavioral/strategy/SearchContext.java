package com.synisys.training.patterns.behavioral.strategy;

import com.synisys.training.patterns.behavioral.strategy.domain.Filter;
import com.synisys.training.patterns.behavioral.strategy.domain.Person;
import com.synisys.training.patterns.behavioral.strategy.strategy.SearchStrategy;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public class SearchContext {

    private SearchStrategy searchStrategy;

    public SearchContext(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public Person search(Filter searchFilter){
        return searchStrategy.searchPerson(searchFilter);
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }
}
