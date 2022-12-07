import java.sql.SQLException;

public interface IEtudiantRepository {
	
	void add(IEtudiant E) throws SQLException;
	
	boolean Exists(String email) throws SQLException;
	
	boolean Exists(int mat) throws SQLException	;

}
