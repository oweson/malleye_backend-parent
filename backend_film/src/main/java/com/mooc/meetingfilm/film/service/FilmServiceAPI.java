package com.mooc.meetingfilm.film.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.meetingfilm.apis.film.vo.DescribeFilmRespVO;
import com.mooc.meetingfilm.film.controller.vo.DescribeActorsRespVO;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.controller.vo.FilmSavedReqVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.film.service
 * @description : 影片逻辑层
 **/
public interface FilmServiceAPI {

    /**
     * 1 获取演员列表
     *
     * @param nowPage
     * @param pageSize
     * @return
     * @throws CommonServiceException
     */
    IPage<DescribeActorsRespVO> describeActors(int nowPage, int pageSize) throws CommonServiceException;

    /**
     * 2 获取电影列表
     *
     * @param nowPage
     * @param pageSize
     * @return
     * @throws CommonServiceException
     */
    IPage<DescribeFilmsRespVO> describeFilms(int nowPage, int pageSize) throws CommonServiceException;

    /**
     * 3 根据主键获取电影信息
     *
     * @param filmId
     * @return
     * @throws CommonServiceException
     */
    DescribeFilmRespVO describeFilmById(String filmId) throws CommonServiceException;

    /**
     * 4 保存电影信息
     *
     * @param filmSavedReqVO
     * @throws CommonServiceException
     */
    void saveFilm(FilmSavedReqVO filmSavedReqVO) throws CommonServiceException;

}
