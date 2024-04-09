package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void addMenuItem(MenuItem item) {
        items.add(item);
        updateLastUpdated(new Date()); // Update lastUpdated whenever a new item is added
    }
    public void removeMenuItem(MenuItem item) {
        items.remove(item);
        updateLastUpdated(new Date()); // Update lastUpdated whenever an item is removed
    }
    public void updateLastUpdated(Date date) {
        this.lastUpdated = date;
    }
}