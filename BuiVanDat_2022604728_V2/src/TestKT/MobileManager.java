package TestKT;
import java.util.ArrayList;

public interface MobileManager {
//	public boolean addMobile(Mobile m) throws IOException;
	public boolean addMobile(Mobile m) throws NullPointerException;// su dung bat loi
	public boolean delMobile(Mobile m) throws NullPointerException;
	public ArrayList<Mobile> searchMobile(String name) throws NullPointerException;
	public double getTotalStorage() throws NullPointerException;
}
