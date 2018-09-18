package com.example.boot.datasource.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:op_user_login表的实体类
 * @version
 * @author:  issuser
 * @创建时间: 2018-09-18
 */
@Data
public class OpUserLogin {
    /**
     * 主键
     */
    private String cPkId;

    /**
     * 渠道二级机构代码
     */
    private String cChannelCode;

    /**
     * 手机号
     */
    private String cMobile;

    /**
     * 登录密码
     */
    private String cPwd;

    /**
     * 密码盐
     */
    private String cSalt;

    /**
     * 联系人姓名
     */
    private String cName;

    /**
     * 省份
     */
    private String cProvince;

    /**
     * 城市
     */
    private String cCity;

    /**
     * 公司编码
     */
    private String cComCode;

    /**
     * 公司名称
     */
    private String cComName;

    /**
     * 邮箱
     */
    private String cEmal;

    /**
     * 行业类型
     */
    private String cProType;

    /**
     * 主体类型：1个人，2企业
     */
    private String cMainType;

    /**
     * 主体名称
     */
    private String cMainName;

    /**
     * 负责人
     */
    private String cLeaderName;

    /**
     * 负责人身份证号
     */
    private String cCredNo;

    /**
     * 万象优图路劲:责任人身份证(正面)
     */
    private String cCredFront;

    /**
     * 责任人身份证(反面)
     */
    private String cCredReverse;

    /**
     * 详细地址
     */
    private String cDetailAddr;

    /**
     * 个人状态:1.已录入 2.已推送3.审核通过。4.审核失败
     */
    private String cPersonState;

    /**
     * 审核原因
     */
    private String cCheckReason;

    /**
     * 用户创建时间
     */
    private Date tCreateTime;

    /**
     * 用户修改时间
     */
    private Date tUpdateTime;

    /**
     * 备用字段1
     */
    private String cResvTxt1;

    /**
     * 备用字段2
     */
    private String cResvTxt2;

    /**
     * 备用字段3
     */
    private String cResvTxt3;

    /**
     * 备用字段4
     */
    private BigDecimal nResvNum1;

    /**
     * 备用字段5
     */
    private BigDecimal nResvNum2;

    /**
     * 本地身份证路劲：责任人身份证(正面)
     */
    private String cLocaFrontPath;

    /**
     * 本地身份证路劲：责任人身份证(反面)
     */
    private String cLocaRevPath;

    /**
     * 父级页面代码(存放父级账号pkid,如果为顶级账号该代码为0)
     */
    private String cParentCode;


}