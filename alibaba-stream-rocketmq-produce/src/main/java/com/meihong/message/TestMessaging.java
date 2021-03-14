package com.meihong.message;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author tch
 */
@Data
@Accessors(chain = true)
public class TestMessaging {
    /**
     * 消息id
     */
    private String msgId;
    /**
     * 消息内容
     */
    private String msgText;
}