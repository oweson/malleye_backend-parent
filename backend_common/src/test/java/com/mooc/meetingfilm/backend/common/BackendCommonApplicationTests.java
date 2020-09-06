/*
package com.mooc.meetingfilm.backend.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.common.dao.mapper.MoocBackendUserTMapperGen;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendCommonApplicationTests {

    @Autowired
    MoocBackendUserTMapperGen moocBackendUserTMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void list() {
       */
/* for (int i = 0; i < 5; i++) {
            MoocBackendUserT moocBackendUserT = new MoocBackendUserT();
            //moocBackendUserT.setUuid(0);
            moocBackendUserT.setUserName("tom"+i);
            moocBackendUserT.setUserPwd("123");
            moocBackendUserT.setUserPhone("123");

            System.out.println(moocBackendUserTMapper.insert(moocBackendUserT));
        }*//*

        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name","tom");
        System.out.println(moocBackendUserTMapper.selectList(wrapper));

    }

    @Test
    public  void update(){

        MoocBackendUserT moocBackendUserT = new MoocBackendUserT();
        moocBackendUserT.setUuid(3);
        moocBackendUserT.setUserName("tomcat");
        moocBackendUserT.setUserPwd("123");
        moocBackendUserT.setUserPhone("123");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name","tom1");
        moocBackendUserTMapper.update(moocBackendUserT,wrapper);

    }

    @Test
    public void page(){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("user_name","tom");
        IPage iPage = moocBackendUserTMapper.selectMapsPage(new Page<MoocBackendUserT>(1, 2), wrapper);
        System.out.println(iPage);
    }
}
*/
