package com.meishijie.dao;

import java.util.List;

import com.meishijie.entity.NewsContent;

/**
 * @Title: INewsContentDao
 * @Description: newscontent表的操作dao接口
 * @Company: null
 * @author  DHA
 * @date    Feb 28, 2014
 */
public interface INewsContentDao {
	public List<NewsContent> getAllNewsContent();
	public NewsContent getOneNewsContent(int id);
	public boolean insertNewsContent(NewsContent newsContent);
	public List<NewsContent> getPartNewsContent(String limit);
	public int getSuperSum(String superName);
	public int getSubSum(String subName);
	public List<NewsContent> getPartNewsContentBySuperName(String superName,
			String limit);
	
	public List<NewsContent> getAllNewsByString(String ndKeys,String limit);
	public List<NewsContent> getAllNewsByKouwei(String kwKeys, String limit);
	public List<NewsContent> getAllNewsByGongYi(String gyKeys, String limit);
	public List<NewsContent> getAllNewsByTitle(String title, String limit);
	public int getCountByDataNd(String strnd);
	public int getCountByDataGy(String strgy);
	public int getCountByDataKw(String strkw);
	public int getCountByDataKey(String keys);
	
}
