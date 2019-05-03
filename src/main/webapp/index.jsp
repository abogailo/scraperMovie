<<<<<<< HEAD

<%@ page import="com.abogailo.*"%>

<html>
<body>
<h2>A Random Movie!</h2>

<body>
<%
	int movie_id = 1009;

	ScraperDAO scraperDAO = new ScraperDAO();	

	Scraper scraper = new Scraper();

	scraper = scraperDAO.getData(movie_id);

	out.println("Movie Id: "+scraper.getId()+", Movie Title: "+scraper.getTitle()+", Movie Released: "+scraper.getReleaseYear()+ ", Movie Rated: " + scraper.getRating()); 
%>
</body>
</body>
</html>
=======

<%@ page import="com.abogailo.*"%>

<html>
<body>
<h2>A Random Movie!</h2>

<body>
<%
	int movie_id = 1009;

	ScraperDAO scraperDAO = new ScraperDAO();	

	Scraper scraper = new Scraper();

	scraper = scraperDAO.getData(movie_id);

	out.println("Movie Id: "+scraper.getId()+", Movie Title: "+scraper.getTitle()+", Movie Released: "+scraper.getReleaseYear()+ ", Movie Rated: " + scraper.getRating()); 
%>
</body>
</body>
</html>
>>>>>>> e7f2fd04ae40ec4af916c79d5c11f48b21d3f501
