import java.util.*;

public class Match_GUI {
    private List<String> matches;
    private static Match_GUI instance;
    public static Match_GUI getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Match_GUI();
	}
    }
    public boolean remove(){
	return true;
    }
    public boolean view_matches(String uid){
	Match_controller mc = Match_controller.getInstance();
	List<Match> matches = mc.view_matches(uid);
	return true;
    }
    public boolean review(){
	return true;
    }
}
