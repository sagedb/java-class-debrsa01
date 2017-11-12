package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private ArrayList<Owl> owlarray = new ArrayList();
    
    public OwlParliament(String filename) throws FileNotFoundException, IOException{
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Owl newowl;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            if("Owl".equals(linestuff[2])){
                newowl = new Owl(linestuff[0], new Integer(linestuff[1]));
                this.owlarray.add(newowl);
            }
        }
    }
    
    public int size(){
        return this.owlarray.size();
    }
    
    public Owl getChief(){
//        System.out.println("hello");
        Owl chief = (Owl) this.owlarray.get(0);
        for(int i=0;i<this.owlarray.size();i++){
            if(this.owlarray.get(i).getAge() >= chief.getAge()){
                chief = this.owlarray.get(i);
            }
        }
        return chief;
    }
    
}
