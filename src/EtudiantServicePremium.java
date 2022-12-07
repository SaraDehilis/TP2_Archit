import java.sql.SQLException;
import java.util.ArrayList;

public class EtudiantServicePremium implements IEtudiantService{
	
	public boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtudiantRepository StudRep= new EtudiantRepository();
	    IUniversiteRepository UnivRep= new UniversiteRepository();
	    IEtudiant stud = new EtudiantPremium(matricule, nom, pr�nom, email,pwd,id_universite);
	    IUniversite univ=UnivRep.GetById(id_universite);
	    
	    Journal j = new JournalDirect();
	    j.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
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
		
		stud.setNbLivreMensuel_Autorise(NbLivres());
		    
	     
		 StudRep.add(stud);
		 j.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	    
		
	} 
	

public ArrayList<IEtudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

        public void ajouterBonus() throws SQLException {
        	for(IEtudiant e : this.GetEtudiantParUniversitye()) {
        		e.ajouterBonus();
        	}
        } 

public ArrayList<IEtudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}
	public int NbLivres() {
		return 20;
	}

}
