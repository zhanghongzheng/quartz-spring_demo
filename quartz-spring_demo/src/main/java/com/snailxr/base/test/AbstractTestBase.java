package com.snailxr.base.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: zhangchundi
 * date: 16/7/8
 * since: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration
        (locations={"/spring.xml"})
public abstract class AbstractTestBase {

}

