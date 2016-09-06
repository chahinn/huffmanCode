import java.util.*;
import java.io.*;

class HuffmanCode {

    TreeNode root;
    Map<Character,String> codeMap;
    Map<Character,Double> freqMap;

    /*
     A nested class representing one node in a Huffman tree.
     In leaf nodes, left and right are null.
     In interior nodes, the "letter" field is unused.
     */
    class TreeNode {
       double freq;
       char letter;
       TreeNode left,right;
       
       // Use this constructor to create an interior node
       TreeNode(double freq,TreeNode left,TreeNode right){
          this.freq = freq;
          this.left = left;
          this.right = right;
       }
       
       // Use this constructor to create a leaf
       TreeNode(char letter, double freq){
          this.freq = freq;
          this.letter = letter;
          this.left = this.right = null;
       }
       
       public boolean isLeaf(){
          return left==null && right==null;
       }
       
    }
    
    /*
     This is the constructor for HuffmanCode.  It needs to
     1. Build the Huffman tree.
     2. Generate the code table from the tree.
     */
    HuffmanCode(Map<Character,Double> freqMap){
       //TODO:  Write me!
    }
    
    public String encode(String plain){
       //TODO:  Write me!
       return null;
    }
    
    public String decode(String code){
       //TODO:  Write me!
       return null;
    }
    
    public double bitsperchar(){
       //TODO:  Write me!
       return 0.0;
    }
    
    /*
     The main method in this class reads in a frequency map
     and builds a HuffmanCode from the map.  The input is 
     read from a file specified on the command line, or 
     (if no filename is not given) System.in.  The output
     of the program is a display of the code map.
     */
    public static void main(String[] args){
       //TODO:  Write me!
    }
    
}





