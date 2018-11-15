package org.news.test;

import org.junit.Test;
import org.news.util.ConfigManager;

public class ConfigManagerTest {
    @Test
    public void getPropertyTest() {
        System.out.println(ConfigManager.getProperty("url"));
    }
}
