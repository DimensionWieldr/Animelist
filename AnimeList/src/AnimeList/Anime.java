//DimensionWieldr
//April 11, 2020
//AnimeList Anime Object Class

package AnimeList;

public class Anime {
    
    ///
    //FIELDS
    ///
    
    String name;
    int curEpisode;
    boolean finished;
    
    ///
    //CONSTRUCTOR
    ///
    
    public Anime(String name, int curEpisode, boolean finished){
        this.name = name;
        this.curEpisode = curEpisode;
        this.finished = finished;
    }
    
    ///
    //FUNCTIONS
    ///
    
    @Override
    public String toString(){
        return name + "\n" + curEpisode + "\n" + finished + "\n";
    }
    
}
