/**
 * projectName: springcloud2020
 * fileName: ApplicationContextConfig
 * packageName: com.wuyc.springcloud.config
 * date: 2020年05月14日 8:57 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Wuyc
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }
}
