package com.seleniumdesign.factory;

public abstract class GooglePage {
    public abstract void launchSite();
    public abstract void search(String Keyword);
    public abstract int getResultsCount();
}
