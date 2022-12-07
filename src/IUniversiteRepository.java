import java.sql.SQLException;

public interface IUniversiteRepository {
	
	IUniversite GetById(int universityId) throws SQLException;

}
