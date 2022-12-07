
import java.io.FileWriter;
import java.io.IOException;

public class JournalFichier extends Journal {
	
	public void outPut_Msg(String msg) {
		
		try {
			FileWriter f = new FileWriter("fichier");
			f.write(msg);
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
