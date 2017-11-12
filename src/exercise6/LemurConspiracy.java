package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class LeemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private ArrayList<Lemur> lemarray = new ArrayList();
    
    public LemurConspiracy(String filename) throws FileNotFoundException, IOException{
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Lemur newlem;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            if("Lemur".equals(linestuff[2])){
                newlem = new Lemur(linestuff[0], new Integer(linestuff[1]));
                this.lemarray.add(newlem);
            }
        }
    }
    
    public int size(){
        return this.lemarray.size();
    }
    
    public Lemur getChief(){
//        System.out.println("hello");
        Lemur chief = (Lemur) this.lemarray.get(0);
        for(int i=0;i<this.lemarray.size();i++){
            if(this.lemarray.get(i).getAge() >= chief.getAge()){
                chief = this.lemarray.get(i);
            }
        }
        return chief;
    }
    
}
