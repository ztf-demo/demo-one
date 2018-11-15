package org.news.dao.impl;

import org.news.dao.BaseDao;
import org.news.dao.NewsUserDao;
import org.news.entity.NewsUser;

public class NewsUserImpl extends BaseDao implements NewsUserDao {

    @Override
    public int findUser(NewsUser newsUser) {
        return 0;
    }

    @Override
    public int insert(NewsUser newsUser) {
        int result = 0;
        try {
            String sql = "INSERT INTO `NEWS_USERS`(`uname`, `upwd`) VALUES(?, ?)";
            result = this.executeUpdate(sql, newsUser.getUname(),
                    newsUser.getUpwd());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeAll(conn, null, null);
        }
        return result;
    }
}
