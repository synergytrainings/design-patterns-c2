package model.impl;

import model.api.MenuItem;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public class MenuItemImpl implements MenuItem {

    private String name;
    private String description;
    private Integer price;

    public MenuItemImpl(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
