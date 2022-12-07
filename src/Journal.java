import java.util.ArrayList;

public abstract class Journal {
		
	abstract void outPut_Msg (String message);
	
	public void add (Journal j){
		
		throw new UnsupportedOperationException("Current operation is not support for this object");
		
		}
	
	public void remove (Journal j){
		
		throw new UnsupportedOperationException("Current operation is not support for this object");
		
		}
	
	public ArrayList<Journal> getChildren(){
		
		throw new UnsupportedOperationException("Current operation is not support for this object");
		
		}


}

