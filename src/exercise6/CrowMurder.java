package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private ArrayList<Crow> crowmurder = new ArrayList();
    
    public CrowMurder(String filename) throws FileNotFoundException, IOException{
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Crow newcrow;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            if("Crow".equals(linestuff[2])){
//                System.out.println("yoyoyo");
                newcrow = new Crow(linestuff[0], new Integer(linestuff[1]));
                this.crowmurder.add(newcrow);
            }
        }
    }
    
    public int size(){
        return this.crowmurder.size();
    }
    
    public Crow getChief(){
//        System.out.println("hello");
        Crow chief = (Crow) this.crowmurder.get(0);
        for(int i=0;i<this.crowmurder.size();i++){
            if(this.crowmurder.get(i).getAge() > chief.getAge()){
                chief = this.crowmurder.get(i);
            }
        }
        return chief;
    }
}
