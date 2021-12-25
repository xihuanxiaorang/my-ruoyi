package top.xiaorang.ruoyi.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.xiaorang.ruoyi.common.constant.HttpStatus;
import top.xiaorang.ruoyi.common.core.page.PageDomain;
import top.xiaorang.ruoyi.common.core.page.TableDataInfo;
import top.xiaorang.ruoyi.common.core.page.TableSupport;
import top.xiaorang.ruoyi.common.utils.StringUtils;
import top.xiaorang.ruoyi.common.utils.sql.SqlUtil;

import java.util.List;

/**
 * web层通用数据处理
 *
 * @author ruoyi
 */
public class BaseController {
  protected final Logger logger = LoggerFactory.getLogger(this.getClass());

  /** 设置请求分页数据 */
  protected void startPage() {
    /** 从request中获取出分页的数据 比如：当前页码，每页大小 */
    PageDomain pageDomain = TableSupport.buildPageRequest();
    Integer pageNum = pageDomain.getPageNum();
    Integer pageSize = pageDomain.getPageSize();
    if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
      String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
      PageHelper.startPage(pageNum, pageSize, orderBy);
    }
  }

  /** 响应请求分页数据 */
  @SuppressWarnings({"rawtypes", "unchecked"})
  protected TableDataInfo getDataTable(List<?> list) {
    TableDataInfo rspData = new TableDataInfo();
    rspData.setCode(HttpStatus.OK.getCode());
    rspData.setMsg(HttpStatus.OK.getMessage());
    rspData.setRows(list);
    rspData.setTotal(new PageInfo(list).getTotal());
    return rspData;
  }
}
