package top.xiaorang.ruoyi.system.mapper;

import top.xiaorang.ruoyi.common.core.domain.entity.SysUserPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与岗位关联表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Mapper
public interface SysUserPostMapper extends BaseMapper<SysUserPost> {
	
}
