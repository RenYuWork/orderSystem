package com.yaya.orderApi.permissionModel;

import java.io.Serializable;
import java.util.Date;

public class UserPermission implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.USER_PERMISSION_ID
     *
     * @mbggenerated
     */
    private String userPermissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.USER_TYPE
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    private String permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.USER_PERMISSION_STATUS
     *
     * @mbggenerated
     */
    private String userPermissionStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    private Date lastUpdateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.USER_PERMISSION_ID
     *
     * @return the value of user_permission.USER_PERMISSION_ID
     *
     * @mbggenerated
     */
    public String getUserPermissionId() {
        return userPermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.USER_PERMISSION_ID
     *
     * @param userPermissionId the value for user_permission.USER_PERMISSION_ID
     *
     * @mbggenerated
     */
    public void setUserPermissionId(String userPermissionId) {
        this.userPermissionId = userPermissionId == null ? null : userPermissionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.USER_TYPE
     *
     * @return the value of user_permission.USER_TYPE
     *
     * @mbggenerated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.USER_TYPE
     *
     * @param userType the value for user_permission.USER_TYPE
     *
     * @mbggenerated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.PERMISSION_ID
     *
     * @return the value of user_permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.PERMISSION_ID
     *
     * @param permissionId the value for user_permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.USER_PERMISSION_STATUS
     *
     * @return the value of user_permission.USER_PERMISSION_STATUS
     *
     * @mbggenerated
     */
    public String getUserPermissionStatus() {
        return userPermissionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.USER_PERMISSION_STATUS
     *
     * @param userPermissionStatus the value for user_permission.USER_PERMISSION_STATUS
     *
     * @mbggenerated
     */
    public void setUserPermissionStatus(String userPermissionStatus) {
        this.userPermissionStatus = userPermissionStatus == null ? null : userPermissionStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.CREATE_DATE
     *
     * @return the value of user_permission.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.CREATE_DATE
     *
     * @param createDate the value for user_permission.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.LAST_UPDATE_DATE
     *
     * @return the value of user_permission.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for user_permission.LAST_UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPermissionId=").append(userPermissionId);
        sb.append(", userType=").append(userType);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", userPermissionStatus=").append(userPermissionStatus);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}