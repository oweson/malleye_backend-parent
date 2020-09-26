package com.mooc.meetingfilm.cinema.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.cinema.dao.entity.MoocCinemaT;
import com.mooc.meetingfilm.cinema.dao.mapper.MoocCinemaTMapper;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.cinema.service
 * @description :
 **/
@Service
public class CinemaServiceImpl implements CinemaServiceAPI {

    @Resource
    private MoocCinemaTMapper cinemaTMapper;

    @Override
    public void saveCinema(CinemaSavedReqVO reqVO) throws CommonServiceException {
        MoocCinemaT cinema = new MoocCinemaT();
        //BeanUtils.copyProperties(reqVO,cinema);
        cinema.setCinemaName(reqVO.getCinemaName());
        cinema.setCinemaPhone(reqVO.getCinemaTele());
        cinema.setBrandId(Integer.parseInt(reqVO.getBrandId()));
        cinema.setAreaId(Integer.parseInt(reqVO.getAreaId()));
        cinema.setHallIds(reqVO.getHallTypeIds());
        cinema.setImgAddress(reqVO.getCinemaImgAddress());
        cinema.setCinemaAddress(reqVO.getCinemaAddress());
        cinema.setMinimumPrice(Integer.parseInt(reqVO.getCinemaPrice()));
        cinemaTMapper.insert(cinema);

    }


    @Override
    public IPage<DescribeCinemasRespVO> describeCinemas(int nowPage, int pageSize) throws CommonServiceException {

        // 1 查询实体对象，然后与表现层对象进行交互
        // TODO 提示
        Page<MoocCinemaT> page = new Page<>(nowPage, pageSize);
        IPage<MoocCinemaT> moocCinemaTIPage = cinemaTMapper.selectPage(page, null);
        // moocCinemaTIPage对象内的分页参数与IPage<DescribeCinemasRespVO>一模一样
        List<MoocCinemaT> records = moocCinemaTIPage.getRecords();
        // set到IPage<DescribeCinemasRespVO> records方法中
        ArrayList<DescribeCinemasRespVO> describeCinemasRespVOS = Lists.newArrayList(new DescribeCinemasRespVO());
        for (MoocCinemaT record : records) {
            DescribeCinemasRespVO respVO = new DescribeCinemasRespVO();
            BeanUtils.copyProperties(record, respVO);
            describeCinemasRespVOS.add(respVO);

        }
        IPage<DescribeCinemasRespVO> iPage = new Page<>();
        iPage.setPages(moocCinemaTIPage.getPages());
        iPage.setTotal(moocCinemaTIPage.getTotal());
        iPage.setSize(moocCinemaTIPage.getSize());
        iPage.setCurrent(moocCinemaTIPage.getCurrent());
        iPage.setRecords(describeCinemasRespVOS);

        return iPage;
    }
}
