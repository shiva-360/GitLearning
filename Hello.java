class Hello{


	public static void main(String[] args)
	{
	
		int arr[] ={1,2,3,4,5,6,7};
		int target = 7;
		
		search(arr,target);
		
	}
	
	
	public static void search(int[] arr, int target)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i] == target)
			{
				
				System.out.println("Found");
			
			}
			
			
		
		}
			
		
	}
}



