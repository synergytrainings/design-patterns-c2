package com.synisys.training.patterns.behavioral.strategy;

import com.synisys.training.patterns.behavioral.strategy.domain.Filter;
import com.synisys.training.patterns.behavioral.strategy.domain.Person;
import com.synisys.training.patterns.behavioral.strategy.strategy.APISearchStrategy;
import com.synisys.training.patterns.behavioral.strategy.strategy.LocalDBSearchStrategy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public class Main {

    public static void main(String[] args){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Person person;
        try {
            Date dateOfBirth = dateFormat.parse("17/07/1989");
            Filter searchFilter = new Filter("AA001122", dateOfBirth);

            SearchContext searchContext = new SearchContext(new LocalDBSearchStrategy());
            person = searchContext.search(searchFilter);

            // if Person isn't found in local db then System must find it with API in External server
            if (person == null){
                searchContext.setSearchStrategy(new APISearchStrategy());
                person = searchContext.search(searchFilter);
            }

            System.out.println(person.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
