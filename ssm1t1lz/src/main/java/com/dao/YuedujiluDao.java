package com.dao;

import com.entity.YuedujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuedujiluVO;
import com.entity.view.YuedujiluView;


/**
 * 阅读记录
 * 
 * @author 
 * @email 
 * @date 2021-04-04 18:42:34
 */
public interface YuedujiluDao extends BaseMapper<YuedujiluEntity> {
	
	List<YuedujiluVO> selectListVO(@Param("ew") Wrapper<YuedujiluEntity> wrapper);
	
	YuedujiluVO selectVO(@Param("ew") Wrapper<YuedujiluEntity> wrapper);
	
	List<YuedujiluView> selectListView(@Param("ew") Wrapper<YuedujiluEntity> wrapper);

	List<YuedujiluView> selectListView(Pagination page,@Param("ew") Wrapper<YuedujiluEntity> wrapper);
	
	YuedujiluView selectView(@Param("ew") Wrapper<YuedujiluEntity> wrapper);
	
}
