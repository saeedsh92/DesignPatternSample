package com.sevenlearn.designpatterns.facade;

/**
 * Created by user on 2/18/2018.
 */

public class NewsFacadeHelper {
    private NewsRepository localNewsRepository;
    private NewsRepository remoteNewsRepository;

    public NewsFacadeHelper() {
        localNewsRepository = new LocalNewsRepository();
        remoteNewsRepository = new RemoteNewsRepository();
    }

    public void save(News news) {
        localNewsRepository.saveNews(news);
        remoteNewsRepository.saveNews(news);
    }

    public News load(boolean forceUpdate) {
        if (forceUpdate) {
            return remoteNewsRepository.loadNews();
        } else {
            News news = localNewsRepository.loadNews();
            if (news == null) {
                return remoteNewsRepository.loadNews();
            } else {
                return localNewsRepository.loadNews();
            }
        }
    }
}
