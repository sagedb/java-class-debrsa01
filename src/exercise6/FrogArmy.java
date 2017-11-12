package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private ArrayList<Frog> frogarray = new ArrayList();
    
    public FrogArmy(String filename) throws FileNotFoundException, IOException{
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Frog newfrog;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            if("Frog".equals(linestuff[2])){
//                System.out.println("yoyoyo");
                newfrog = new Frog(linestuff[0], new Integer(linestuff[1]));
                this.frogarray.add(newfrog);
            }
        }
    }
    
    public int size(){
        return this.frogarray.size();
    }
    
    public Frog getChief(){
//        System.out.println("hello");
        Frog chief = (Frog) this.frogarray.get(0);
        for(int i=0;i<this.frogarray.size();i++){
            if(this.frogarray.get(i).getAge() > chief.getAge()){
                chief = this.frogarray.get(i);
            }
        }
        return chief;
    }
}
    
    
    
    
