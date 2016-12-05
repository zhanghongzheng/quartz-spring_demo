package com.snailxr.base.test;

import com.snailxr.base.task.dao.ScheduleJobMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhz on 16/12/3.
 */

public class test extends AbstractTestBase {

    @Autowired
    private ScheduleJobMapper scheduleJobMapper;

    @Test
    public void test(){

        System.out.println("======"+scheduleJobMapper.selectByPrimaryKey(1l));
//        List<ScheduleJob> jobList = scheduleJobMapper.getAll();
//
//        for (ScheduleJob job : jobList) {
////            addJob(job);
//        }
    }



}
