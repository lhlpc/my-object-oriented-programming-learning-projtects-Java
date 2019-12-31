
public class SortedIntList extends IntList{
	
	public SortedIntList(int size){
		super(size);
	}
	
	public void add(int value){
		int i, a;
		
		if (numElements == list.length)
			System.out.println("Can't add, list is full!");
		else{
			
			for(i=0; i<=numElements ;i++){
				if(list[i]==0){
					list[i] = value;
					break;
				}
				else{
					if(value <= list[i]){
					for(a=numElements-1; a>=i; a--)
						list[a+1]=list[a];
					list[i] = value;
					break;
					}
				}
			}
			numElements++;
		}	
	}
}