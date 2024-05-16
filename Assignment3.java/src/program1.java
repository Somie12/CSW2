class Pair<K,V>
{
	private K key;
	private V value;
	 Pair(K key,V value)
	{
       this.key=key;
       this.value=value;
	}
	
	public  K  get_key(){
		return (K) key;
	}
	public void set_key( K key)
	{
		this.key=key;
	}
	public V get_value()
	{
		return value;
	}
	public void set_value(V value)
	{
		this.value=value;
	}
}
public class program1 {
	public static void main(String[] args) {
		Pair p=new Pair(4,9);
		System.out.println("pair :"+"("+p.get_key()+" ,"+p.get_value()+")");
				
		
	}

}
