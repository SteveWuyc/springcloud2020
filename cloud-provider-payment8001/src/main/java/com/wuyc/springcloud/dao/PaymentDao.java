/**
 * projectName: springcloud2020
 * fileName: PaymentDao
 * packageName: com.wuyc.springcloud.dao
 * date: 2020年05月13日 9:53 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.dao;

import com.wuyc.springcloud.entities.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Wuyc
 * @Description:
 */
@Mapper
public interface PaymentDao {

    int create(PaymentEntity paymentEntity);

    PaymentEntity selectById(@Param("id") Long id);

}
