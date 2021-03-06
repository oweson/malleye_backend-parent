package com.mooc.meetingfilm.user.dao;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.user.BackendUserApplicationTests;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;
import com.mooc.meetingfilm.utils.util.MD5Util;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserTest extends BackendUserApplicationTests {

    @Resource
    private MoocBackendUserTMapper backendUser;

    /**
     * @Description: 1 添加后台运维用户功能
     * @Param: []
     * @return: void
     * @Author: jiangzh
     */
    @Test
    public void add() {
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("admin");
        user.setUserPwd(MD5Util.encrypt("admin123"));
        user.setUserPhone("18588888888");
        backendUser.insert(user);
    }

    @Test
    public void select() {
        // 2 查询列表
        List<MoocBackendUserT> user = backendUser.selectList(null);
        user.stream().forEach(
                System.out::println
        );

    }

}
