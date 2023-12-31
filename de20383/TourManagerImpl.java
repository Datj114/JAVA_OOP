package de20383;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TourManagerImpl implements TourManager {
	private ArrayList<Tour> list;

	public TourManagerImpl() {
		this.list = new ArrayList<Tour>();
	}

	@Override
	public boolean addTour(Tour t) throws NullPointerException {
		try {
			for (Tour tour : list) {
				if (tour.getProduct_id() == t.getProduct_id()) {
					return false;
				}
			}
			list.add(t);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delTour(Tour t) {
		try {
			for (Tour tour : list) {
				if (tour.getProduct_id() == t.getProduct_id()) {
					list.remove(tour);
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Tour> searchTour(String name) throws NullPointerException {
		ArrayList<Tour> l = new ArrayList<Tour>();
		try {
			for (Tour tour : list) {
				if (tour.getProduct_name().contains(name)) {
					l.add(tour);
				}
				;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return l;
	}

	@Override
	public ArrayList<Tour> searchTour(double price) throws NullPointerException {
		ArrayList<Tour> l = new ArrayList<Tour>();
		try {
			for (Tour tour : list) {
				if (Math.abs(tour.getProduct_price() - price) < 10) {
					l.add(tour);
				}
				;

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return l;
	}

	@Override
	public boolean sortTour() throws NullPointerException {
		try {
			Collections.sort(list, new Comparator<Tour>() {
				@Override
				public int compare(Tour o1, Tour o2) {
					double result = o1.getProduct_price() - o2.getProduct_price();
					if (result < 0) {
						return -1;
					} else if (result > 0) {
						return 1;
					}
					return 0;
				}
			});
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public double getTotalStorage() throws NullPointerException {
		double result = 0;
		try {
			for (Tour tour : list) {
				result += tour.getTotalPrice();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	public void print() {
		list.forEach(e->{
			System.out.println(e);
		});
	}
}
