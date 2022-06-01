package ghe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * @ Author : Gulraiz Iqbal Date : 1/1/2017
 * 
 */
public class HVG {
	@SuppressWarnings("rawtypes")
	Hashtable<Integer, ArrayList> HVG = new Hashtable<Integer, ArrayList>();

	int window;

	HVG(int window) {
		this.window = window;
	}

	/*
	 * Finds the number of motif occurrence in time series
	 * 
	 */
	public Hashtable<String, Integer> countMotif() {
		Hashtable<String, Integer> countMotifs = new Hashtable<String, Integer>();
		for (int i = 1; i < HVG.size() - this.window + 1; i++) {
			ArrayList<Integer> motifs = new ArrayList<Integer>();
			for (int indx = i; indx < i + this.window - 2; indx++) {
				ArrayList<Integer> visible = HVG.get(indx);

				for (int j = 1; j < visible.size(); j++)
					if (visible.get(j) <= i + this.window - 1)
						motifs.add(motifType(i, indx, visible.get(j)));
			}

			String key = motifs.toString();

			Set<String> keys = countMotifs.keySet();
			if (keys.contains(key)) {
				int c = countMotifs.get(key);
				c = c + 1;
				countMotifs.put(key, c);
			} else {
				countMotifs.put(key, 1);
			}
		}
		return countMotifs;
	}
	
	/*
	 * Determine the type of pattern and return a unique number
	 */
	private int motifType(int Cnode, int out, int in) {

		if (Cnode + 2 == in && Cnode == out)
			return 1;
		else if (Cnode + 3 == in && Cnode == out)
			return 2;
		else if (Cnode + 4 == in && Cnode == out)
			return 3;
		else if (Cnode + 5 == in && Cnode == out)
			return 4;
		else if (Cnode + 6 == in && Cnode == out)
			return 5;
		else if (Cnode + 7 == in && Cnode == out)
			return 6;
		else if (Cnode + 8 == in && Cnode == out)
			return 7;
		else if (Cnode + 9 == in && Cnode == out)
			return 8;
		else if (Cnode + 10 == in && Cnode == out)
			return 9;
		else if (Cnode + 11 == in && Cnode == out)
			return 10;
		else if (Cnode + 12 == in && Cnode == out)
			return 11;
		else if (Cnode + 13 == in && Cnode == out)
			return 12;
		else if (Cnode + 14 == in && Cnode == out)
			return 13;
		else if (Cnode + 3 == in && out == Cnode + 1)
			return 14;
		else if (Cnode + 4 == in && out == Cnode + 1)
			return 15;
		else if (Cnode + 5 == in && out == Cnode + 1)
			return 16;
		else if (Cnode + 6 == in && out == Cnode + 1)
			return 17;
		else if (Cnode + 7 == in && out == Cnode + 1)
			return 18;
		else if (Cnode + 8 == in && out == Cnode + 1)
			return 19;
		else if (Cnode + 9 == in && out == Cnode + 1)
			return 20;
		else if (Cnode + 10 == in && out == Cnode + 1)
			return 21;
		else if (Cnode + 11 == in && out == Cnode + 1)
			return 22;
		else if (Cnode + 12 == in && out == Cnode + 1)
			return 23;
		else if (Cnode + 13 == in && out == Cnode + 1)
			return 24;
		else if (Cnode + 14 == in && out == Cnode + 1)
			return 25;
		else if (Cnode + 4 == in && out == Cnode + 2)
			return 26;
		else if (Cnode + 5 == in && out == Cnode + 2)
			return 27;
		else if (Cnode + 6 == in && out == Cnode + 2)
			return 28;
		else if (Cnode + 7 == in && out == Cnode + 2)
			return 29;
		else if (Cnode + 8 == in && out == Cnode + 2)
			return 30;
		else if (Cnode + 9 == in && out == Cnode + 2)
			return 31;
		else if (Cnode + 10 == in && out == Cnode + 2)
			return 32;
		else if (Cnode + 11 == in && out == Cnode + 2)
			return 33;
		else if (Cnode + 12 == in && out == Cnode + 2)
			return 34;
		else if (Cnode + 13 == in && out == Cnode + 2)
			return 35;
		else if (Cnode + 14 == in && out == Cnode + 2)
			return 36;
		else if (Cnode + 5 == in && out == Cnode + 3)
			return 37;
		else if (Cnode + 6 == in && out == Cnode + 3)
			return 38;
		else if (Cnode + 7 == in && out == Cnode + 3)
			return 39;
		else if (Cnode + 8 == in && out == Cnode + 3)
			return 40;
		else if (Cnode + 9 == in && out == Cnode + 3)
			return 41;
		else if (Cnode + 10 == in && out == Cnode + 3)
			return 42;
		else if (Cnode + 11 == in && out == Cnode + 3)
			return 43;
		else if (Cnode + 12 == in && out == Cnode + 3)
			return 44;
		else if (Cnode + 13 == in && out == Cnode + 3)
			return 45;
		else if (Cnode + 14 == in && out == Cnode + 3)
			return 46;

		else if (Cnode + 6 == in && out == Cnode + 4)
			return 47;
		else if (Cnode + 7 == in && out == Cnode + 4)
			return 48;
		else if (Cnode + 8 == in && out == Cnode + 4)
			return 49;
		else if (Cnode + 9 == in && out == Cnode + 4)
			return 50;
		else if (Cnode + 10 == in && out == Cnode + 4)
			return 51;
		else if (Cnode + 11 == in && out == Cnode + 4)
			return 52;
		else if (Cnode + 12 == in && out == Cnode + 4)
			return 53;
		else if (Cnode + 13 == in && out == Cnode + 4)
			return 54;
		else if (Cnode + 14 == in && out == Cnode + 4)
			return 55;
		else if (Cnode + 7 == in && out == Cnode + 5)
			return 56;
		else if (Cnode + 8 == in && out == Cnode + 5)
			return 57;
		else if (Cnode + 9 == in && out == Cnode + 5)
			return 58;
		else if (Cnode + 10 == in && out == Cnode + 5)
			return 59;
		else if (Cnode + 11 == in && out == Cnode + 5)
			return 60;
		else if (Cnode + 12 == in && out == Cnode + 5)
			return 61;
		else if (Cnode + 13 == in && out == Cnode + 5)
			return 62;
		else if (Cnode + 14 == in && out == Cnode + 5)
			return 63;
		else if (Cnode + 8 == in && out == Cnode + 6)
			return 64;
		else if (Cnode + 9 == in && out == Cnode + 6)
			return 65;
		else if (Cnode + 10 == in && out == Cnode + 6)
			return 66;
		else if (Cnode + 11 == in && out == Cnode + 6)
			return 67;
		else if (Cnode + 12 == in && out == Cnode + 6)
			return 68;
		else if (Cnode + 13 == in && out == Cnode + 6)
			return 69;
		else if (Cnode + 14 == in && out == Cnode + 6)
			return 70;
		else if (Cnode + 9 == in && out == Cnode + 7)
			return 71;
		else if (Cnode + 10 == in && out == Cnode + 7)
			return 72;
		else if (Cnode + 11 == in && out == Cnode + 7)
			return 73;
		else if (Cnode + 12 == in && out == Cnode + 7)
			return 74;
		else if (Cnode + 13 == in && out == Cnode + 7)
			return 75;
		else if (Cnode + 14 == in && out == Cnode + 7)
			return 76;
		else if (Cnode + 10 == in && out == Cnode + 8)
			return 77;
		else if (Cnode + 11 == in && out == Cnode + 8)
			return 78;
		else if (Cnode + 12 == in && out == Cnode + 8)
			return 79;
		else if (Cnode + 13 == in && out == Cnode + 8)
			return 80;
		else if (Cnode + 14 == in && out == Cnode + 8)
			return 81;
		else if (Cnode + 11 == in && out == Cnode + 9)
			return 82;
		else if (Cnode + 12 == in && out == Cnode + 9)
			return 83;
		else if (Cnode + 13 == in && out == Cnode + 9)
			return 84;
		else if (Cnode + 14 == in && out == Cnode + 9)
			return 85;
		else if (Cnode + 12 == in && out == Cnode + 10)
			return 86;
		else if (Cnode + 13 == in && out == Cnode + 10)
			return 87;
		else if (Cnode + 14 == in && out == Cnode + 10)
			return 88;
		else if (Cnode + 13 == in && out == Cnode + 11)
			return 89;
		else if (Cnode + 14 == in && out == Cnode + 11)
			return 90;
		else if (Cnode + 14 == in && out == Cnode + 12)
			return 91;
		

		return 0;
	}

	
	/*
	 * Computing horizontal visibility Graph from a given time series
	 */
	public void HorrVisibility(List<Double> vals) {
		for (int i = 0; i <= vals.size(); i++) {

			double nextMax = 0;

			ArrayList<Integer> edges = new ArrayList<Integer>();

			for (int j = i; j < vals.size(); j++) {

				if (vals.get(i) > vals.get(j) && nextMax < vals.get(j)) {

					nextMax = vals.get(j);

					edges.add(j + 1);
				}

				if (vals.get(i) <= vals.get(j) && i != j) {

					int conectedNode = j + 1;

					edges.add(conectedNode);
					break;
				}
			}
			HVG.put(i + 1, edges);
		}
	}

	public int getMotifKey(String key) {
		for (Motifs6 m : Motifs6.values()) {
			if (m.getValue().equals(key))
				return m.getKey();
		}
		return -1;
	}

	public int getMotifEdgeType(String key) {
		for (Motifs6 m : Motifs6.values()) {
			if (m.getValue().equals(key))
				return m.getEdges();
		}
		return -1;
	}
	
	/*
	 * Finds the number of motif occurred in time series
	 * 
	 */
	public Hashtable<Integer, Integer> countDegree() {
		Hashtable<Integer, Integer> countDegree = new Hashtable<Integer, Integer>();
		for (int i = 1; i < HVG.size() - this.window + 1; i++) {
			Integer key = 0;
			for (int indx = i; indx < i + this.window - 2; indx++) 
				key += HVG.get(indx).size();
			

			Set<Integer> keys = countDegree.keySet();
			if (keys.contains(key)) {
				int c = countDegree.get(key);
				c = c + 1;
				countDegree.put(key, c);
			} else {
				countDegree.put(key, 1);
			}
		}
		return countDegree;
	}

	
	/*
	 * Shannon Entropy Implementation S = -sum(p log p/log(N))s
	 * 
	 */
	public double shannonEntropy(Hashtable<String, Integer> data, int size) {

		double grandTotal = 0;
		Set<String> keys = data.keySet();
		
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String str = it.next();
			double realVal = (double) (data.get(str));
			double p = realVal / size;
			double log2 = Math.log(p) / Math.log(2);
			
			grandTotal += (p * log2);
		}
		
		return -1*grandTotal;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return HVG.toString();
	}
	
	public static void main(String[] args){
		//Sample RR-intervals
		List<Double> list =  Arrays.asList(0.695,0.711,0.711,0.703,0.711,0.68,0.695,0.664,0.688,0.656,0.672,0.68,0.711,0.703,0.727);
		int window = 5;
		//Horizontal visibility graph class
		HVG hvg = new HVG(window);
		
		//Visibility information
		hvg.HorrVisibility(list);
		
		//count motifs by their edges
		Hashtable<String, Integer> motif = hvg.countMotif();
		
		//Grouped horizontal visibility graph entropy
		double ghe = hvg.shannonEntropy(motif, list.size()-window+1);
		
		//print the hvg graph source to destination list
		System.out.println("Entropy value is : "+ghe);
		
		//degree distribution statistics
		System.out.println(hvg.countDegree());
	}
}
