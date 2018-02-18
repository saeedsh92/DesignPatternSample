package com.sevenlearn.designpatterns.facade;

/**
 * Created by user on 2/18/2018.
 */

public class RemoteNewsRepository implements NewsRepository {
    @Override
    public void saveNews(News news) {
        //Save
    }

    @Override
    public News loadNews() {
        return new News();
    }
}
