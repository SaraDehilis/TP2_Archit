import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			 Journal j1 = new JournalDirect();
			 Journal j2 = new JournalFichier();
			 Journal j3 = new JournalComposite();
			 j3.add(j1);
			 j3.add(j2);
			 j3.outPut_Msg("Journal");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
