import java.util.*;
import java.awt.Image;

public class Match {
    private int match_id;
    private int match_date;
    private boolean shown;
    private boolean accepted;
    private List<Matcher> reviews; 
    private User_info[] users;
    private Date date;
    public User_info get_user_info() {
	int[] freetime = {};
	return new User_info("","",0,0,"","",new ArrayList<Image>(),freetime);
    }
    public Date accept(){
	boolean both_accepted = true;
	if (both_accepted){
	    date = create_date(users[0],users[1]);
	    
	}
	return date;
	
    }
    public boolean decline(){
	return true;
    }

    public int get_match_id(){
	return match_id;
    }
    
    public Date create_date(User_info d1, User_info d2){
	return new Date();
    }
}
