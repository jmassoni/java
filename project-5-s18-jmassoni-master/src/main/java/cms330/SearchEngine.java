package cms330;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
public class SearchEngine {
        
        private String play = "";
        private String act = "";
        private String scene = "";
        private String prologue = "";
        private String character = "Narrator";
        HashMap<String, LinkedList<Entry>> hm = new HashMap<>();
 
        public void scan(String word) throws IOException {
            String target_dir = "/home/ubuntu/workspace/project-5-s18-jmassoni/src/main/java/cms330/texts";
            File dir = new File(target_dir);
            File [] folder = dir.listFiles();
            
            for (File f : folder) {
                if(f.isFile()) {
                    BufferedReader inputStream = null;
    
                    try {
                        inputStream = new BufferedReader(new FileReader(f));
                        String line = inputStream.readLine();
                        play = line;
                        
                        while ((line = inputStream.readLine()) != null) {
                            retrieveWord(line);
                        }
                    }
                    finally {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                }
            } // end for loop
        } // end scan method
        
        public void addToHashMap(String word, Entry entry){
            word = word.toLowerCase();
            LinkedList<Entry> llCoolJ = hm.get(word);
            if(llCoolJ == null){
                llCoolJ = new LinkedList<Entry>();
                hm.put(word, llCoolJ);
            }
            llCoolJ.add(entry);
        } // end addToHashMap
        
        public String output(String word){
            StringBuilder output = new StringBuilder();
            word = word.toLowerCase();
            int count = 0;
            LinkedList<Entry> llCoolJ = hm.get(word);
            System.out.println(llCoolJ.size());

            
            for( Entry entries : llCoolJ) {
           
                output.append(entries.toString());
                output.append("<br>");
                output.append("<br>");

            }


            return output.toString();
            
            
            
            
        }  // end output
    
        public void retrieveWord(String line) {
            String [] words = line.split("\t");
            
            if(words[0] != null && !words[0].isEmpty()){
                if(line.contains("ACT")) {
                    act = words[0];
                } else if(line.contains("SCENE")) {
                    scene = words[0];
                } else if(line.contains("PROLOGUE")) {
                    prologue = words[0];
                } else {
                    character = words[0];
                }
            }
            
            for(int i=1; i < words.length; i++) {
                if(words[i] != null || !words[i].isEmpty()) {
                    // line = line.replaceAll("[;:,?! \\. \\[ \\] ]", " ");
                    words[i] = words[i].replaceAll("[;:,?! \\. \\[ \\] ]", " ");
                    Scanner wordScanner = new Scanner(words[i]);
                    while(wordScanner.hasNext()) {
                        String word = wordScanner.next();
                    	// Insert an Entry for this word into the index
                    	if(word.length() > 3) {
                    	    Entry something = new Entry(play, act, scene, character, line);
                    	    addToHashMap(word, something);
                    	}	    		
                    } // end inner while loop
                }
            }
        } // end retrieveWord
        
    } // end SearchEngine class