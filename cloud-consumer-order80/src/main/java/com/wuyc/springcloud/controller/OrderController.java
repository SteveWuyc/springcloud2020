/**
 * projectName: springcloud2020
 * fileName: OrderController
 * packageName: com.wuyc.springcloud.controller
 * date: 2020年05月14日 8:56 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Wuyc
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    //public
}
