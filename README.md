# Grouped Horizontal Visibility Graph Motifs


## Example 1: Calculate Grouped Horizontal Visibility Graph Entropy

```Java
//Sample RR-intervals
List<Double> list =  Arrays.asList(0.695,0.711,0.711,0.703,0.711,0.68,0.695,0.664,0.688,0.656,0.672,0.68,0.711,0.703,0.727);
int window = 5;
//Horizontal visibility graph class
HVG hvg = new HVG(window);

//Visibility information
hvg.HorrVisibility(list);

//count motifs by their edges
Hashtable<String, Integer> motif = hvg.countMotif();

//Motifs found are
System.out.println("Motifs found in data : ");
System.out.println(motif.toString());
		
//Grouped horizontal visibility graph entropy
double ghe = hvg.shannonEntropy(motif, list.size()-window+1);

//print the hvg graph source to destination list
System.out.println("Entropy value is : "+ghe);

//degree distribution statistics
System.out.println(hvg.countDegree());

```
## Output
```bash
Motifs found in data : 
{[]=1, [14, 15]=1, [14]=3, [26]=2, [1, 2, 3]=1, [1, 26]=3}
Entropy value is : 2.413088436425758
{8=1, 7=1, 6=3, 5=2, 4=3, 3=1}
```

## Reference
If you are using this code then site the following paper.
Choudhary, G. I., Aziz, W., Khan, I. R., Rahardja, S., & Fränti, P. (2019). Analysing the Dynamics of Interbeat Interval Time Series Using Grouped Horizontal Visibility Graph. IEEE Access, 7, 9926–9934.

## License
[MIT](https://choosealicense.com/licenses/mit/)
