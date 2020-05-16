/**
 * projectName: springcloud2020
 * fileName: PaymentController
 * packageName: com.wuyc.springcloud.controller
 * date: 2020年05月13日 10:14 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.controller;

import com.wuyc.springcloud.entities.CommonResult;
import com.wuyc.springcloud.entities.PaymentEntity;
import com.wuyc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Wuyc
 * @Description:
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody PaymentEntity paymentEntity){
        int result = paymentService.create(paymentEntity);
        log.info("插入结果：" + result);
        CommonResult<Integer> integerCommonResult = new CommonResult<>();
        if (result < 0){
            integerCommonResult.setCode(500);
            integerCommonResult.setMessage("未知异常，请联系管理员");
        } else {
            integerCommonResult.setCode(200);
            integerCommonResult.setData(result);
        }
        return integerCommonResult;
    }


    @GetMapping("/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        PaymentEntity result = paymentService.selectById(id);
        log.info("查询结果：" + result);
        CommonResult<PaymentEntity> integerCommonResult = new CommonResult<>();
        if (result == null){
            integerCommonResult.setCode(500);
            integerCommonResult.setMessage("没有查到相关记录，查询id:" + id);
        } else {
            integerCommonResult.setCode(200);
            integerCommonResult.setData(result);
        }
        return integerCommonResult;
    }

}
