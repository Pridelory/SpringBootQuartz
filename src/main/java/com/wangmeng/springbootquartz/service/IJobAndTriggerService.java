package com.wangmeng.springbootquartz.service;

import com.github.pagehelper.PageInfo;
import com.wangmeng.springbootquartz.entity.JobAndTrigger;

public interface IJobAndTriggerService {

    PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);

}
