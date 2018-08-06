package com.syoki.service.impl;

import com.syoki.model.ActivityOnline;
import com.syoki.mongo.MongoCommonDAO;
import com.syoki.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private MongoCommonDAO mongoCommonDAO;

    @Override
    public void addActivity() {
        ActivityOnline rel = rel = new ActivityOnline();
        rel.setActivityId("2");
        rel.setPromotionId("3");
        rel.setLimit(3);
        rel.setSigned(0);
        rel.setReceived(0);
        rel.setTitle("标题1");
        rel.setActivityName("活动名称");
        rel.setStatus(1);
        rel.setRewardWay(1);
        rel.setStartTime(new Date().getTime());
        rel.setEndTime(new Date().getTime());
        mongoCommonDAO.insertOrUpdate(rel);
    }
}
