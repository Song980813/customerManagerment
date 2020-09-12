package com.huayu.management.controller;

import com.huayu.management.bo.*;
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

    @RequestMapping("selectweek")
    @ResponseBody
    public List<WeekCount> selectWeek(){
        return statisticsService.selectWeek();
    }
    @RequestMapping("selectmon")
    @ResponseBody
    public List<MonCount> selectMon(){
        return statisticsService.selectMon();
    }
    @RequestMapping("selectjidu")
    @ResponseBody
    public List<JiduCount> selectJidu(){
        return statisticsService.selectJidu();
    }
    @RequestMapping("selectyear")
    @ResponseBody
    public List<YearCount> selectYear(){
        return statisticsService.selectYear();
    }

    @RequestMapping("selecthy")
    @ResponseBody
    public List<SjSum> selectHy(){
        return statisticsService.selectHy();
    }
    @RequestMapping("selectly")
    @ResponseBody
    public List<sjResource> selectLy(){
        return statisticsService.selectRe();
    }

    @RequestMapping("zongtj")
    @ResponseBody
    public Counts zongTJ(){
        return statisticsService.zTongji();
    }

    @RequestMapping("tjzongs")
    @ResponseBody
    public List<SjSum> tjZongS(){
        return statisticsService.sjZTong();
    }

    @RequestMapping("sjztj")
    @ResponseBody
    public List<SjSum> sjZong(){
        return statisticsService.selectAllCount();
    }
    @RequestMapping("sjzongs1")
    @ResponseBody
    public List<SjSum> sjZong1(){
        return statisticsService.selectAllCount1();
    }
    @RequestMapping("sjzongs2")
    @ResponseBody
    public List<SjSum> sjZong2(){
        return statisticsService.selectAllCount2();
    }
    @RequestMapping("sjzongs3")
    @ResponseBody
    public List<SjSum> sjZong3(){
        return statisticsService.selectAllCount3();
    }
    @RequestMapping("sjzongs4")
    @ResponseBody
    public List<SjSum> sjZong4(){
        return statisticsService.selectAllCount4();
    }
}
