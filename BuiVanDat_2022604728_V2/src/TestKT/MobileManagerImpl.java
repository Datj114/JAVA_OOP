package TestKT;

import java.util.ArrayList;

public class MobileManagerImpl implements MobileManager {
	private ArrayList<Mobile> list = new ArrayList<Mobile>();

	public ArrayList<Mobile> getList() {
		return list;
	}

	public void setList(ArrayList<Mobile> list) {
		this.list = list;
	}

	@Override
	// bat loi truc tiep ham add
	public boolean addMobile(Mobile m) {
		try {
			for (Mobile mobile : list) {
				if (mobile.getProduct_id() == m.getProduct_id()) {
					return false;
				}
			}
			list.add(m);
			return true;
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delMobile(Mobile m) {
		try {
			for (Mobile mobile : list) {
				if (mobile.getProduct_id() == m.getProduct_id()) {
					this.list.remove(m);
					return true;
				}
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Mobile> searchMobile(String name) {
		ArrayList<Mobile> l = new ArrayList<Mobile>();
		try {
			for (Mobile mobile : list) {
				if (mobile.getProduct_name().contains(name)) {
					l.add(mobile);
				}
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return l;
	}

	@Override
	public double getTotalStorage() {
		double result = 0;
		try {
			for (Mobile mobile : list) {
				result = result + mobile.getTotalPrice();
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
