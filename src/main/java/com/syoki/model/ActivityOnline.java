package com.syoki.model;

import com.syoki.mongo.AbstractBaseInfo;
import io.swagger.annotations.ApiModelProperty;
import org.mongodb.morphia.annotations.Entity;

@Entity(value = "t_activity_online",noClassnameStored = true)
public class ActivityOnline extends AbstractBaseInfo {

    @ApiModelProperty(value = "活动Id")
    private String activityId;
    @ApiModelProperty(value = "活动名称")
    private String activityName;
    @ApiModelProperty(value = "网络推广Id")
    private String promotionId;
    @ApiModelProperty(value = "人数限制")
    private Integer limit;
    @ApiModelProperty(value = "已报名人数")
    private Integer signed;
    @ApiModelProperty(value = "已领取福利数")
    private Integer received;
    @ApiModelProperty(value = "网络推广项名称")
    private String title;
    @ApiModelProperty(value = "奖励方式：【1评论抽奖/2邀请评论/3代表推广】")
    private Integer rewardWay;
    private Integer status;

    @ApiModelProperty(value = "活动开始时间")
    private Long startTime;

    @ApiModelProperty(value = "活动结束时间")
    private Long endTime;


    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getSigned() {
        return signed;
    }

    public void setSigned(Integer signed) {
        this.signed = signed;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRewardWay() {
        return rewardWay;
    }

    public void setRewardWay(Integer rewardWay) {
        this.rewardWay = rewardWay;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
