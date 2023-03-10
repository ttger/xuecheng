package com.xuecheng.model.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 【请填写功能名称】对象 mq_message_history
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@TableName("mq_message_history")
public class MqMessageHistoryEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 消息id */
    private Long id;

    /** 消息类型代码 */
    private String messageType;

    /** 关联业务信息 */
    private String businessKey1;

    /** 关联业务信息 */
    private String businessKey2;

    /** 关联业务信息 */
    private String businessKey3;

    /** 通知次数 */
    private Integer executeNum;

    /** 处理状态，0:初始，1:成功，2:失败 */
    private Integer state;

    /** 回复失败时间 */
    private Date returnfailureDate;

    /** 回复成功时间 */
    private Date returnsuccessDate;

    /** 回复失败内容 */
    private String returnfailureMsg;

    /** 最近通知时间 */
    private Date executeDate;

    /** $column.columnComment */
    private String stageState1;

    /** $column.columnComment */
    private String stageState2;

    /** $column.columnComment */
    private String stageState3;

    /** $column.columnComment */
    private String stageState4;


}
