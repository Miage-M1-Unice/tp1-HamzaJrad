package MiageTP1;
import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File f = null;
	      File[] chemins;
	         f = new File(".");
	         
	         chemins = f.listFiles();
	         for(File chemin:chemins) {
	            System.out.println(chemin);
	         }
	    
	}

}
