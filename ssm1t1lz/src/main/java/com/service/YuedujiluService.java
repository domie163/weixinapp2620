package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuedujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuedujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuedujiluView;


/**
 * 阅读记录
 *
 * @author 
 * @email 
 * @date 2021-04-04 18:42:34
 */
public interface YuedujiluService extends IService<YuedujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuedujiluVO> selectListVO(Wrapper<YuedujiluEntity> wrapper);
   	
   	YuedujiluVO selectVO(@Param("ew") Wrapper<YuedujiluEntity> wrapper);
   	
   	List<YuedujiluView> selectListView(Wrapper<YuedujiluEntity> wrapper);
   	
   	YuedujiluView selectView(@Param("ew") Wrapper<YuedujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuedujiluEntity> wrapper);
   	
}

