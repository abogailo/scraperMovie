<<<<<<< HEAD
package com.abogailo;
public class RunMybatis {
	public static void main(String[] args) {
	  ScraperDAO scraperDAO = new ScraperDAO();	
	 //insert	
	  Scraper scraper = new Scraper();
	 /* scraper.setId(15);
	  scraper.setTitle("Fuad goes to the Store");
	  scraper.setReleaseYear(1978);
	  scraper.setRating(8);
	  scraperDAO.save(scraper);
	  System.out.println("---Data saved---");
	  */
	  //update
	  scraper = new Scraper();
	  scraper.setId(1);
	  scraper.setTitle("Fuad Didn't Make it to the Store");
	  scraper.setReleaseYear(1979);
	  scraper.setRating(5);
	  scraperDAO.update(scraper);
	  System.out.println("---Data updated---");
	  
	  //select
	  scraper = scraperDAO.getData(13);
	  System.out.println("Movie Id:"+ scraper.getId() + ", Movie Title:"+scraper.getTitle() +", Movie Released: "+scraper.getReleaseYear() + ", Movie Rating: " + scraper.getRating());
	  //scraper = scraperDAO.getAllData();
	  //delete
	  scraperDAO.delete(1008);
	  System.out.println("---Data deleted---");
	}
=======
package com.abogailo;
public class RunMybatis {
	public static void main(String[] args) {
	  ScraperDAO scraperDAO = new ScraperDAO();	
	 //insert	
	  Scraper scraper = new Scraper();
	 /* scraper.setId(15);
	  scraper.setTitle("Fuad goes to the Store");
	  scraper.setReleaseYear(1978);
	  scraper.setRating(8);
	  scraperDAO.save(scraper);
	  System.out.println("---Data saved---");
	  */
	  //update
	  scraper = new Scraper();
	  scraper.setId(1);
	  scraper.setTitle("Fuad Didn't Make it to the Store");
	  scraper.setReleaseYear(1979);
	  scraper.setRating(5);
	  scraperDAO.update(scraper);
	  System.out.println("---Data updated---");
	  
	  //select
	  scraper = scraperDAO.getData(13);
	  System.out.println("Movie Id:"+ scraper.getId() + ", Movie Title:"+scraper.getTitle() +", Movie Released: "+scraper.getReleaseYear() + ", Movie Rating: " + scraper.getRating());
	  //scraper = scraperDAO.getAllData();
	  //delete
	  scraperDAO.delete(1008);
	  System.out.println("---Data deleted---");
	}
>>>>>>> e7f2fd04ae40ec4af916c79d5c11f48b21d3f501
} 