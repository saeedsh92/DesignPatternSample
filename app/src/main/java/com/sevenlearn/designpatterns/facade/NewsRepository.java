package com.sevenlearn.designpatterns.facade;

/**
 * Created by user on 2/18/2018.
 */

public interface NewsRepository {
    void saveNews(News news);

    News loadNews();
}
