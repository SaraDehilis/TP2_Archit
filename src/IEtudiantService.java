import java.sql.SQLException;

public interface IEtudiantService {
	
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException;
	
	int NbLivres(); 
	
	 void ajouterBonus() throws SQLException;

}
