package com.huayu.management.service;

import com.huayu.management.bo.DocuTheme;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbBusiness;
import com.huayu.management.entity.TbDocumentary;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 跟单表 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbDocumentaryService extends IService<TbDocumentary> {
    public LayuiEntity add(TbDocumentary documentary);

/**   跟单表按上面下拉框选中的值和文本框输入的值查询
 *   merchandisingtime 跟单时间
 *   documentarytheme 跟单主题
 *   merchandisingpeople 跟单人
 *   kong的话就查询全部
 * **/
 public List<TbDocumentary> selectall(String xiala, String shuru);
 public List<DocuTheme> slecttheme();
}
