package com.mooc.meetingfilm.cinema.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.cinema.service
 * @description :
 **/
public interface CinemaServiceAPI {

    /**
     * 1 保存影院
     *
     * @param reqVO
     * @throws CommonServiceException
     */
    void saveCinema(CinemaSavedReqVO reqVO) throws CommonServiceException;

    /**
     * 2 获取影院列表
     *
     * @param nowPage
     * @param pageSize
     * @return
     * @throws CommonServiceException
     */
    IPage<DescribeCinemasRespVO> describeCinemas(int nowPage, int pageSize) throws CommonServiceException;

}
