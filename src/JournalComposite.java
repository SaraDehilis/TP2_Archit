import java.util.ArrayList;

public class JournalComposite extends Journal{
	
	ArrayList<Journal> journals;
	
	public void outPut_Msg(String msg) {
		
		for(Journal journal : journals){
			journal.outPut_Msg(msg);}
		
	}
	
    public void add (Journal j){
		journals.add(j);}
	
	public void remove (Journal j){
		journals.remove(j);}
	
	public ArrayList<Journal> getChildren(){
		return this.journals;}

}
