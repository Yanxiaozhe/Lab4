
package project_one;
import java.util.List;
public class Graph{
    int wordNum;//椤剁偣鏁�
    List<String> wordList; //椤剁偣闆�
    int[][] E; //杈归泦
    public Graph(List<String> wordList,int[][] E,int wordNum){
        this.wordList = wordList;
        this.E = E;
        this.wordNum = wordNum;
    }   
}