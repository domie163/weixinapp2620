package com.entity.view;

import com.entity.YuedujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 阅读记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 18:42:34
 */
@TableName("yuedujilu")
public class YuedujiluView  extends YuedujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuedujiluView(){
	}
 
 	public YuedujiluView(YuedujiluEntity yuedujiluEntity){
 	try {
			BeanUtils.copyProperties(this, yuedujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
