/**
 * projectName: springcloud2020
 * fileName: CommonResult
 * packageName: com.wuyc.springcloud.entities
 * date: 2020年05月13日 9:46 下午
 * copyright(c) 2019-2025 版权为浙江双城网络科技集团有限公司所有，违者必究。
 */
package com.wuyc.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: Wuyc
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommonResult <T> implements Serializable {
    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
