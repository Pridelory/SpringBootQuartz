package com.wangmeng.springbootquartz.dao;

import com.wangmeng.springbootquartz.entity.JobAndTrigger;

import java.util.List;

public interface JobAndTriggerMapper {

    List<JobAndTrigger> getJobAndTriggerDetails();
}
