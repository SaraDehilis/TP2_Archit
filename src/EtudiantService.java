import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtudiantRepository StudRep= new EtudiantRepository();
	    IUniversiteRepository UnivRep= new UniversiteRepository();
	    IEtudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    IUniversite univ=UnivRep.GetById(id_universite);
	    
	    Journal j = new JournalDirect();
	    j.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
        EmailValide e = new EmailValide();
	    
	    if(!e.valide(email))
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
        NombreLivres nb = new NombreLivres();	
		stud.setNbLivreMensuel_Autorise(nb.getNbLivres(univ));                          
	     
		 StudRep.add(stud);
		 j.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	
	

public ArrayList<IEtudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<IEtudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
