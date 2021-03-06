package com.yaya.baseCategories.model;

import java.io.Serializable;
import java.util.Date;

public class BaseCategoriesDataInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_categories_data_info.CATEGORIES_DATA_INFO_ID
     *
     * @mbggenerated
     */
    private String categoriesDataInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_categories_data_info.CATEGORIES_NAM
     *
     * @mbggenerated
     */
    private String categoriesNam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_categories_data_info.CREATION_DATE
     *
     * @mbggenerated
     */
    private Date creationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_categories_data_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_categories_data_info.CATEGORIES_DATA_INFO_ID
     *
     * @return the value of base_categories_data_info.CATEGORIES_DATA_INFO_ID
     *
     * @mbggenerated
     */
    public String getCategoriesDataInfoId() {
        return categoriesDataInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_categories_data_info.CATEGORIES_DATA_INFO_ID
     *
     * @param categoriesDataInfoId the value for base_categories_data_info.CATEGORIES_DATA_INFO_ID
     *
     * @mbggenerated
     */
    public void setCategoriesDataInfoId(String categoriesDataInfoId) {
        this.categoriesDataInfoId = categoriesDataInfoId == null ? null : categoriesDataInfoId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_categories_data_info.CATEGORIES_NAM
     *
     * @return the value of base_categories_data_info.CATEGORIES_NAM
     *
     * @mbggenerated
     */
    public String getCategoriesNam() {
        return categoriesNam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_categories_data_info.CATEGORIES_NAM
     *
     * @param categoriesNam the value for base_categories_data_info.CATEGORIES_NAM
     *
     * @mbggenerated
     */
    public void setCategoriesNam(String categoriesNam) {
        this.categoriesNam = categoriesNam == null ? null : categoriesNam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_categories_data_info.CREATION_DATE
     *
     * @return the value of base_categories_data_info.CREATION_DATE
     *
     * @mbggenerated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_categories_data_info.CREATION_DATE
     *
     * @param creationDate the value for base_categories_data_info.CREATION_DATE
     *
     * @mbggenerated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_categories_data_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoriesDataInfoId=").append(categoriesDataInfoId);
        sb.append(", categoriesNam=").append(categoriesNam);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}