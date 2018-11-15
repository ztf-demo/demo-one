package org.news.test;

import org.junit.Test;
import org.news.dao.impl.NewsUserImpl;
import org.news.entity.NewsUser;

public class UserTest {
    @Test
    public void addUserTest() {
        NewsUser user = new NewsUser("test", "123");
        int result = new NewsUserImpl().insert(user);
        System.out.println(result);
    }
}
