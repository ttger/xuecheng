package com.xuecheng.model.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 【请填写功能名称】对象 mq_message
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
public class MqMessageEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 消息id */
    private Long id;

    /** 消息类型代码: course_publish ,  media_test */
    private String messageType;

    /** 关联业务信息 */
    private String businessKey1;

    /** 关联业务信息 */
    private String businessKey2;

    /** 关联业务信息 */
    private String businessKey3;

    /** 通知次数 */
    private Integer executeNum;

    /** 处理状态，0:初始，1:成功 */
    private String state;

    /** 回复失败时间 */
    private Date returnfailureDate;

    /** 回复成功时间 */
    private Date returnsuccessDate;

    /** 回复失败内容 */
    private String returnfailureMsg;

    /** 最近通知时间 */
    private Date executeDate;

    /** 阶段1处理状态, 0:初始，1:成功 */
    private String stageState1;

    /** 阶段2处理状态, 0:初始，1:成功 */
    private String stageState2;

    /** 阶段3处理状态, 0:初始，1:成功 */
    private String stageState3;

    /** 阶段4处理状态, 0:初始，1:成功 */
    private String stageState4;


}
