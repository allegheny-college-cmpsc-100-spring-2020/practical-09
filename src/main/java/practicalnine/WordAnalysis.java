package practicalnine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Performs an analysis of a list of words.
 *
 * @author {Your Name Here}
 */
public class WordAnalysis {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) { 
    // Set up and load data source
    File file = null;
    Scanner fileInput = null;
    try {
      file = new File("inputs/common_words.csv");
      fileInput = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO FOR THOSE MORE COMFORTABLE
     * 
     * Implement a second scanner to read keyboard input
     * to accept a limited number of words to read (e.g. 18480)
     * and store the value to use later
     */
    
    /*
     * TODO Initialize integer values needed in the while loop
     */
    
    /*
     * TODO Initialize String values needed in the while loop
     */
    
    
    /*
     * TODO Implement a while loop to iterate over the file
     */
     
    /*
     * TODO Read an individual value from the file
     */
     
    /*
     * TODO Compare the current value to see if it is the longest
     *      word seen so far
     */
      
    /*
     * TODO Add to total of letters in file; increment the count
     *      of words seen in the file.
     */
       
      
    /*
     * TODO FOR THOSE MORE COMFORTABLE
     * 
     * Exit the loop early to return statistics for only
     * the subset of the file read
     */
    
    /*
     * TODO Print the output similar to that in the README
     */
  }
}