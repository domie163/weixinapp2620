package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuedujiluDao;
import com.entity.YuedujiluEntity;
import com.service.YuedujiluService;
import com.entity.vo.YuedujiluVO;
import com.entity.view.YuedujiluView;

@Service("yuedujiluService")
public class YuedujiluServiceImpl extends ServiceImpl<YuedujiluDao, YuedujiluEntity> implements YuedujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuedujiluEntity> page = this.selectPage(
                new Query<YuedujiluEntity>(params).getPage(),
                new EntityWrapper<YuedujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuedujiluEntity> wrapper) {
		  Page<YuedujiluView> page =new Query<YuedujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuedujiluVO> selectListVO(Wrapper<YuedujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuedujiluVO selectVO(Wrapper<YuedujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuedujiluView> selectListView(Wrapper<YuedujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuedujiluView selectView(Wrapper<YuedujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
