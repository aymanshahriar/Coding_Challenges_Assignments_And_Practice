import java.util.ArrayList;
public class Festival {

	// instance variables
	private String name;
	private ArrayList<Movie> movieList = new ArrayList<Movie>();

	// getter methods
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Movie> getMovieList() {
		ArrayList<Movie> copyList = new ArrayList<Movie>();
		for (Movie eachMovie : movieList) {
			Movie copyMovie = new Movie(eachMovie);
			copyList.add(copyMovie);
		}
		return copyList;
	}

	// no setter methods
	

	// consructors
	
	public Festival(String name) {
		this.name = name;
	} 
	
	// methods
	public void addMovie(Movie m) {
		Movie copyMovie = new Movie(m);
		this.movieList.add(copyMovie);
	
	}

	public Movie getMovieWithLowestRating() {
		if (movieList.isEmpty()) {
			return null;
		}
		else {
			ArrayList<Movie> copyList = getMovieList();
			for (int i = 0; i <= copyList.size(); i++) {
				for (int j = 0; j < (copyList.size()-1); j++) {
					if (copyList.get(j).getRating() > copyList.get(j+1).getRating()) {
						Movie smallerMovie = new Movie(copyList.get(j+1));
						copyList.remove(j+1);
						copyList.add(j, smallerMovie);
					}
				}
			}	
			return copyList.get(0);
		}
	}
















}
