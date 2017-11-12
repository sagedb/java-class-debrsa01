package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private ArrayList<Kangaroo> kangarray = new ArrayList();
    
    public KangarooMob(String filename) throws FileNotFoundException, IOException{
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Kangaroo newkang;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            if("Kangaroo".equals(linestuff[2])){
                newkang = new Kangaroo(linestuff[0], new Integer(linestuff[1]));
                this.kangarray.add(newkang);
            }
        }
    }
    
    public int size(){
        return this.kangarray.size();
    }
    
    public Kangaroo getChief(){
//        System.out.println("hello");
        Kangaroo chief = (Kangaroo) this.kangarray.get(0);
        for(int i=0;i<this.kangarray.size();i++){
            if(this.kangarray.get(i).getAge() > chief.getAge()){
                chief = this.kangarray.get(i);
            }
        }
        return chief;
    }
    
}
