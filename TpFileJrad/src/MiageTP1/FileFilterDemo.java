package MiageTP1;
import java.io.File;
import java.io.FilenameFilter;

public class FileFilterDemo implements FilenameFilter {
	
	private String ext;

	  public FileFilterDemo(String ext) {
	    this.ext = "." + ext;
	  }
	  
	  public boolean accept(File dir, String name) {
	    return name.endsWith(ext);
	  }

	public static void main(String[] args) {
		
		  File f = null;
	      File[] chemins;
	      
	         f = new File("/Users/brolyzer/TP1-Jrad/tp1-HamzaJrad/TpFile/bin/MiageTP1");
	         FilenameFilter filtre = new FileFilterDemo("class");
	         chemins = f.listFiles(filtre);
	         
	         for(File chemin:chemins) {
	            System.out.println(chemin);
	         }
	 
	}

}