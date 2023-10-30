package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "Amit");
		map.put(200, "Sumit");
		map.put(400, "Arun");
		map.put(100, "Deepan");
		
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		

	}

}
