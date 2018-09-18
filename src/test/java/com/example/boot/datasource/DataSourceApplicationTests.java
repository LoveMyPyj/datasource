package com.example.boot.datasource;

import com.example.boot.datasource.dao.test.TestOpUserLoginMapper;
import com.example.boot.datasource.dao.uat.UatOpUserLoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceApplicationTests {
    @Autowired
    private TestOpUserLoginMapper testsOpUserLoginMapper;
    @Autowired
    private UatOpUserLoginMapper uatOpUserLoginMapper;
	@Test
	public void contextLoads() {
        System.out.println(testsOpUserLoginMapper.selectByPrimaryKey("173db91819594bcda5a1fba6005d37b9"));
        System.out.println(uatOpUserLoginMapper.selectByPrimaryKey("2bc17072761f4603b6767ea1454cb92d"));
	}

}
