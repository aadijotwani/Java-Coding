package pack2;

public class Duplicate2 
{
	public static void ar(int[] arr)
	{
		int[] arrd = new int[arr.length]; // this is new array which is storing the frequency of repeated values
		int mask =-1; // yaha hum ne ek mask initialize kiya jis ki value hum ne -1 declare ki hai 
		
		for(int i = 0; i<arr.length; i++) // iss wale for loop se apan apne main array ko traverse karwa rahe hai yah voh wala for loop hai jo value hold karega 
		{
			
			int count = 1;// yaha hum ne ek count initialize kiya jis ki value hum ne 1 declare ki hai 
			int j;// yaha hum ne sirf j ko initialize kiya hai taaki hum usse neecha wale for loop mai or uss ke bahar bhi use kar saaken
			for(j = i+1; j< arr.length; j++) // iss wale for loop se bhi traverse ho raha hai par yah wala for loop check kar raha hai ki aage kaha kaha number repeat hai 
			{
				
				if(arr[i]==arr[j]) // yah voh condition hai jiss se pata chal raha ki kaha kaha same value aa rahi hai array mai 
				{
					count++; // yaha pe apan ne jo int count = 1 liya hai uss ki value badh rahi hai or iss increment se hume yah pata chalega ki value kitni baar repeat hui haii
					arrd[j] = mask; // yaha par humara jo doosra array hai jis mai hum voh frequency ki value store karwa rahe hai uss ko hum mask ke barabar kar rahe hai or uss mask ki value -1 hai
				}
				
			}
			if(arrd[i]!= mask) //yaha pe hum condition check kar rahe hai ki agar humara doosra array ka mask ka barabar nahi hai 
			{
				arrd[i] = count; // agar humara uper wala condition true hai matlab agar arrd jo ki doosra array hai voh humare mask ke barabar nahi hai toh humare doosre array ke i ki value wale index place pe count ki jo badhi hui value hai voh store ho jayegi
			}
			
		}
		
		for(int k = 0; k<arr.length ; k++) // yah humara aakhri for loop hai jiss ki madat se hum ne jo naye array mai values store karai hai usse hum print kar saake 
		{
			
			if (arrd[k] == mask) // iss condition ki madat se hum check kar rahee hai ki humare doosre array mai jo k ki value wala index hai uss mai jo value hai agar voh mask ke barabar hai to vaha space print ho jayega
			{
                System.out.println(" ");    
            } 
			else // agar uper wala condition false hai matlab ki agar uper wale condition mai arrd[k] ki value mask ke barabar nahi hai to arrd[k] ke index pe jo value store hui hai voh print ho jayegi
            {
                System.out.println(arrd[k]);  // yaha humara value print ho raha hai 
            }
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,4,2,5}; // yah humara array hai jis pe hum kaam kar rahe hai
		ar(arr); // or yaha hum ne uss method ko call kiya hai jiss ke andar hum ne uper wale array ka kaam kiya hai or uss mai repeated numbers ki frequency nikali hai
	}
}