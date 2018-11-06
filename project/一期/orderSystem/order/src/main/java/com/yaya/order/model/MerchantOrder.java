package com.yaya.order.model;

import java.io.Serializable;
import java.util.Date;

public class MerchantOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.MERCHANT_ORDER_ID
     *
     * @mbggenerated
     */
    private String merchantOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.MERCHANT_ID
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.ORDER_ID
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.MERCHANT_ORDER_DESC
     *
     * @mbggenerated
     */
    private String merchantOrderDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_order.LAST_UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchant_order
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.MERCHANT_ORDER_ID
     *
     * @return the value of merchant_order.MERCHANT_ORDER_ID
     *
     * @mbggenerated
     */
    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.MERCHANT_ORDER_ID
     *
     * @param merchantOrderId the value for merchant_order.MERCHANT_ORDER_ID
     *
     * @mbggenerated
     */
    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId == null ? null : merchantOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.MERCHANT_ID
     *
     * @return the value of merchant_order.MERCHANT_ID
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.MERCHANT_ID
     *
     * @param merchantId the value for merchant_order.MERCHANT_ID
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.ORDER_ID
     *
     * @return the value of merchant_order.ORDER_ID
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.ORDER_ID
     *
     * @param orderId the value for merchant_order.ORDER_ID
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.MERCHANT_ORDER_DESC
     *
     * @return the value of merchant_order.MERCHANT_ORDER_DESC
     *
     * @mbggenerated
     */
    public String getMerchantOrderDesc() {
        return merchantOrderDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.MERCHANT_ORDER_DESC
     *
     * @param merchantOrderDesc the value for merchant_order.MERCHANT_ORDER_DESC
     *
     * @mbggenerated
     */
    public void setMerchantOrderDesc(String merchantOrderDesc) {
        this.merchantOrderDesc = merchantOrderDesc == null ? null : merchantOrderDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.CREATE_TIME
     *
     * @return the value of merchant_order.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.CREATE_TIME
     *
     * @param createTime the value for merchant_order.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant_order.LAST_UPDATE_TIME
     *
     * @return the value of merchant_order.LAST_UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant_order.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for merchant_order.LAST_UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_order
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", merchantOrderId=").append(merchantOrderId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", orderId=").append(orderId);
        sb.append(", merchantOrderDesc=").append(merchantOrderDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}