
public class NombreLivres {
	
	public int getNbLivres(IUniversite univ) {
		
		if (univ.getPack() == TypePackage.Standard)
	     {
	          return 10;
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 return 20;
	     }else {
	    	 return 0;
	     }
	}

}
