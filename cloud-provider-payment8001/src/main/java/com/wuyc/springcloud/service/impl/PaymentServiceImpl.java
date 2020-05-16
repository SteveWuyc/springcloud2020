/**
 * projectName: springcloud2020
 * fileName: PaymentServiceImpl
 * packageName: com.wuyc.springcloud.service.impl
 * date: 2020年05月13日 9:55 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.service.impl;

import com.wuyc.springcloud.dao.PaymentDao;
import com.wuyc.springcloud.entities.PaymentEntity;
import com.wuyc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Wuyc
 * @Description:
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(PaymentEntity paymentEntity) {
        return paymentDao.create(paymentEntity);
    }

    @Override
    public PaymentEntity selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
