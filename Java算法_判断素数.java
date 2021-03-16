//素数是指除了1和数本身，不能被其它数整除的数；
public boolean isPrime(int n){	
		int count = 0;
		if(n==1) return false;
		for(int i = 1;i<=n;i++){
			if(n%i==0) count++;
		}
		if(count!=2) return false;
		else return true;
	}