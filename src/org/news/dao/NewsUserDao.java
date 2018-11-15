package org.news.dao;

import org.news.entity.NewsUser;

public interface NewsUserDao {
    // 查找用户
    public int findUser(NewsUser newsUser);

    public int insert(NewsUser newsUser);
}
