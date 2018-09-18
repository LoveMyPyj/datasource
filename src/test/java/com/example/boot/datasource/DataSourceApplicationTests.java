package com.example.boot.datasource;

import com.example.boot.datasource.dao.test.OpUserLoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceApplicationTests {
    @Autowired
    private OpUserLoginMapper testOpUserLoginMapper;
    @Autowired
    private com.example.boot.datasource.dao.uat.OpUserLoginMapper uatOpUserLoginMapper;
	@Test
	public void contextLoads() {
        System.out.println(testOpUserLoginMapper.selectByPrimaryKey("198bcde1d9454a798416302902374961"));
        System.out.println(uatOpUserLoginMapper.selectByPrimaryKey("3984ca82caa5404d93da871400302c2f"));
	}

}
