package com.abogailo;
import org.apache.ibatis.session.SqlSession;

public class ScraperDAO {
	public void save(Scraper scraper){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("com.abogailo.ScraperMapper.insertScraper", scraper);
		  session.commit();
		  session.close();
	}
	public void update(Scraper scraper){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.update("com.abogailo.ScraperMapper.updateScraper", scraper);
	  session.commit();
	  session.close();
	}
	public void delete(Integer id){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.delete("com.abogailo.ScraperMapper.deleteScraper", id);
	  session.commit();
	  session.close();
	}
	public Scraper getData(Integer id) {
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  Scraper scraper = session.selectOne("com.abogailo.ScraperMapper.selectScraper", id);
	  session.close();
	  return scraper;
	}
	/*public Scraper getAllData() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		Scraper scraperAll = session.selectMap(statement, parameter, mapKey)("com.abogailo.ScraperMapper.selectAllScraper");
		session.close();
	    return scraperAll;
	}*/
} 