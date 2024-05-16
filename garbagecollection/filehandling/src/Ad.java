import java.util.*;
class Item{
	String name;
	double weight;
	double value;
	double valueperweight;
	Item(String name,double weight, double value ){
		this.name=name;
		this.weight=weight;
		this.value=value;
		this.valueperweight=value/weight;
	}
}

public class Ad {
public static List<Item> Ad(List<Item>items,double capacity){
	Collections.sort(items,Comparator.comparing(o -> -o.valueperweight));
	List<Item> knapsack=new ArrayList<>();
	double totalvalue=0;
	for(Item item:items)
	{
		if(capacity>=item.weight) {
		knapsack.add(item);
		totalvalue+=item.value;
		capacity-=item.weight;
		}
	else
	{
		double fraction=capacity/item.weight;
		
knapsack.add(new Item(item.name,capacity,fraction*item.value));
totalvalue+= fraction*item.value;
break;
	}
	}
	System.out.println("total value in the knapsack"+totalvalue);
	return knapsack;
}
	public static void main(String[] args) {
	List<Item>items=new ArrayList<>();
	items.add(new Item("item1",10,60));
	items.add(new Item("item2",20,100));
	items.add(new Item("item3",30,120));
	double capacity=50;
	List<Item>selectedItem=Ad(items,capacity);
	for(Item item:selectedItem)
	{
		System.out.println("name"+item.name+"weight"+item.weight+"value"+item.value);
	}


	}
}
