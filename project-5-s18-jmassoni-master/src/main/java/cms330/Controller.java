package cms330;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
@RestController
public class Controller {
    
    SearchEngine se;

    // Fill this class with methods mapped to URLs

    // You should at least have a constructor that initializes the SearchEngine
    // and a query method that takes a String as input and returns its results.
    public Controller() {
        se = new SearchEngine();
    }
    
    // Add back the RequestMapping for /
    // Open, read, and return html/index.html
    @RequestMapping("/")
    public String index() {
        
        String indexHtml = null;

        try {
            byte[] bytes = Files.readAllBytes(Paths.get("html/index.html"));
    	    indexHtml = new String(bytes);
        } catch(Exception e) {
            e.printStackTrace();
        }

    	return indexHtml;
    }

    @RequestMapping("/query")
    public String query(@RequestParam(value="word", defaultValue="wherefore") String word) throws IOException{

        se = new SearchEngine();
        try{
            se.scan(word);
            String output = se.output(word);
            return output;
        } catch (Exception e) {
            return "<p>Word not found</p>";
        }
    }
    // Question to consider: do you want the query method to format the output
    // and return it as a String or do you want it to return an object that's
    // then formatted on the client side?
    
    // If you want to format the output on the server side, it must be in valid
    // HTML using <p> (for new paragraphs) and <br> (for line breaks).

} // end Controller class