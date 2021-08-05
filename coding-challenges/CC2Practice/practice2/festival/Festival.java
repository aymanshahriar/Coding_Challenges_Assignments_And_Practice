import java.util.ArrayList;
public class Festival {

	// instance variables
	private String name;
	private ArrayList<Movie> movieList = new ArrayList<Movie>();

	// constructors
	public Festival(String n) {
		this.name = n;
	}

	// getters
	public String getName() {
		String copyName = new String(this.name);
		return copyName;
	}

	public ArrayList<Movie> getMovieList() {
		ArrayList<Movie> copyList = new ArrayList<Movie>();
		for (Movie eachMovie : movieList) {
			Movie m = new Movie(eachMovie);
			copyList.add(m);
		}
		return copyList;
	}

	// methods
	
	public void addMovie(Movie m) {
		Movie copym = new Movie(m);
		this.movieList.add(copym);
	}
	
	public Movie getMovieWithLowestRating() {
		if (movieList.isEmpty()) {
			return null;
		}
		else {
			
			// sorting algoritm
			// first create a copy movielist what we shall sort
			ArrayList<Movie> copyList = this.getMovieList();    // returns a copy of the actual movie list
			for (int i = 0; i < copyList.size(); i++) {
				for (int j = 0;  j < (copyList.size()-1); j++) {
					if (copyList.get(j).getRating() > copyList.get(j+1).getRating()) {
						// switch
						Movie smallerMovie = new Movie(copyList.get(j+1));
						copyList.remove(copyList.get(j+1));
						copyList.add(j, smallerMovie);
					}	
				}
			}
			return copyList.get(0);
		}
		
	}






}
