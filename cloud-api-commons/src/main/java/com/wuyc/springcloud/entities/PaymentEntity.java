/**
 * projectName: springcloud2020
 * fileName: PaymentEntity
 * packageName: com.wuyc.springcloud.entities
 * date: 2020年05月11日 11:15 上午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Wuyc
 * @Description:
 */
@TableName("payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity implements Serializable {

    private Long id;

    private String payBillId;
}
