package com.huayu.management.controller;

import com.huayu.management.bo.MyStatistics;
import com.huayu.management.mapper.TbBusinessMapper;
import com.huayu.management.mapper.TbContractMapper;
import com.huayu.management.mapper.TbDocumentaryMapper;
import com.huayu.management.service.impl.MyStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 统计接口
 * @author song
 */
@Controller
@RequestMapping("/management/statistic")
public class StatisticsController {
    @Autowired
    private MyStatisticsService statisticsService;

    @RequestMapping("selectall")
    @ResponseBody
    public List<MyStatistics> selectAll(){
        return statisticsService.selects();
    }
}
