//DimensionWieldr
//April 11, 2020
//AnimeList Hub (Functions, Fields, File Loading/Saving)

package AnimeList;

import java.util.*;
import java.io.*;

public class AnimeList {
    
    ///
    //FIELDS
    ///
    
    List<Anime> list;
    int episodeCount;
    final String FILE_NAME = "animeList.txt";
    
    ///
    //CONSTRUCTOR
    ///
    
    public AnimeList(){
        list = new ArrayList();
        loadFile();
    }
    
    ///
    //FUNCTIONS
    ///
    
    public void sort(){
        boolean sorted = false;
        Anime temp;
        for(int i = 0; i < list.size()-1 && sorted == false; i++){
            sorted = true;
            for(int j = i; j < list.size()-1; j++){
                if(list.get(j).name.compareTo(list.get(j+1).name) > 0){
                    sorted = false;
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
    
    public void addAnime(String name, int curEpisode, boolean finished){
        Anime newAnime = new Anime(name, curEpisode, finished);
        list.add(newAnime);
        saveFile();
    }
    
    public boolean removeAnime(int index){
        if(index == -1){
            return false;
        }else{
            list.remove(index);
            saveFile();
            return true;
        }
    }
    
    public int searchAnimeIndex(String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).name.equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean loadFile(){
        try{
            BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while((line = in.readLine()) != null){
                Anime newAnime = new Anime(line, Integer.parseInt(in.readLine()), Boolean.parseBoolean(in.readLine()));
                list.add(newAnime);
            }
            in.close();
            return true;
        }catch(IOException iox){
            System.out.println("Error.");
            return false;
        }
    }
    
    public boolean saveFile(){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME, false));
            for(int i = 0; i < list.size(); i++){
                out.write(list.get(i).toString());
            }
            out.close();
            return true;
        }catch(IOException iox){
            System.out.println("Error.");
            return false;
        }
    }
    
    public int updateEpisodeCount(){
        this.episodeCount = 0;
        for(int i = 0; i < list.size(); i++){
            this.episodeCount += list.get(i).curEpisode;
        }
        return this.episodeCount;
    }
    
}
