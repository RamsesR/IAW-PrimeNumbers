class NumerosPrimos{
	public static void main(String[] args){
		boolean primotrue = true;
		int count = 0;
		int number = 0;
		int primes = 0;
		
		for(count = 1; count <= 10000; count++){
			int counter = 0;
			for(number = count; number >= 1; number--){
				if(count%number==0){
					counter = counter + 1;
					primotrue= false;
				}
			}
			
			if (counter == 2){
				primes = count;
				System.out.println(primes);
			}
			
			
			
			if (count%1000==0){
				System.out.println("------------------------------");
			}
		}
	}
}