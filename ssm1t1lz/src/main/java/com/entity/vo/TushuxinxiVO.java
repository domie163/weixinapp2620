package com.entity.vo;

import com.entity.TushuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 图书信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-04 18:42:33
 */
public class TushuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 内容关键词
	 */
	
	private String neirongguanjianci;
		
	/**
	 * 图书编号
	 */
	
	private String tushubianhao;
		
	/**
	 * 图书类型
	 */
	
	private String tushuleixing;
		
	/**
	 * 图书简介
	 */
	
	private String tushujianjie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 图书上传
	 */
	
	private String tushushangchuan;
		
	/**
	 * 图书下载
	 */
	
	private String tushuxiazai;
				
	
	/**
	 * 设置：内容关键词
	 */
	 
	public void setNeirongguanjianci(String neirongguanjianci) {
		this.neirongguanjianci = neirongguanjianci;
	}
	
	/**
	 * 获取：内容关键词
	 */
	public String getNeirongguanjianci() {
		return neirongguanjianci;
	}
				
	
	/**
	 * 设置：图书编号
	 */
	 
	public void setTushubianhao(String tushubianhao) {
		this.tushubianhao = tushubianhao;
	}
	
	/**
	 * 获取：图书编号
	 */
	public String getTushubianhao() {
		return tushubianhao;
	}
				
	
	/**
	 * 设置：图书类型
	 */
	 
	public void setTushuleixing(String tushuleixing) {
		this.tushuleixing = tushuleixing;
	}
	
	/**
	 * 获取：图书类型
	 */
	public String getTushuleixing() {
		return tushuleixing;
	}
				
	
	/**
	 * 设置：图书简介
	 */
	 
	public void setTushujianjie(String tushujianjie) {
		this.tushujianjie = tushujianjie;
	}
	
	/**
	 * 获取：图书简介
	 */
	public String getTushujianjie() {
		return tushujianjie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：图书上传
	 */
	 
	public void setTushushangchuan(String tushushangchuan) {
		this.tushushangchuan = tushushangchuan;
	}
	
	/**
	 * 获取：图书上传
	 */
	public String getTushushangchuan() {
		return tushushangchuan;
	}
				
	
	/**
	 * 设置：图书下载
	 */
	 
	public void setTushuxiazai(String tushuxiazai) {
		this.tushuxiazai = tushuxiazai;
	}
	
	/**
	 * 获取：图书下载
	 */
	public String getTushuxiazai() {
		return tushuxiazai;
	}
			
}
