package com.juan.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * 读取Apollo配置测试
 */
public class GetConfigTest {
    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig();
        String property = config.getProperty("apollo.test", "hello-apollo");
        System.out.println(property);
    }
}
