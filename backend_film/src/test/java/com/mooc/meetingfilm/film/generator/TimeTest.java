package com.mooc.meetingfilm.film.generator;

import com.alibaba.fastjson.JSON;
import com.mooc.meetingfilm.film.controller.vo.FilmSavedReqVO;

import java.time.LocalDateTime;

/**
 * @author chengwanli
 * @date 2020/9/15 22:36
 */


public class TimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        FilmSavedReqVO filmSavedReqVO = new FilmSavedReqVO();
        filmSavedReqVO.setFilmStatus("0");
        filmSavedReqVO.setFilmName("八百");
        filmSavedReqVO.setFilmEnName("eight-fight");
        filmSavedReqVO.setMainImgAddress("成龙，周润发");
        filmSavedReqVO.setFilmScore("9.8");
        filmSavedReqVO.setFilmScorers("100");
        filmSavedReqVO.setPreSaleNum("100");
        filmSavedReqVO.setBoxOffice("1");
        filmSavedReqVO.setFilmTypeId("1");
        filmSavedReqVO.setFilmSourceId("10");
        filmSavedReqVO.setFilmCatIds("");
        filmSavedReqVO.setAreaId("");
        filmSavedReqVO.setDateId("");
        filmSavedReqVO.setFilmTime("");
        filmSavedReqVO.setDirectorId("");
        filmSavedReqVO.setActIds("1");
        filmSavedReqVO.setRoleNames("");
        filmSavedReqVO.setFilmLength("");
        filmSavedReqVO.setBiography("");
        filmSavedReqVO.setFilmImgs("");
        System.out.println(JSON.toJSONString(filmSavedReqVO));

    }
}
