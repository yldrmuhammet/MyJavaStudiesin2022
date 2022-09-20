/*

16 EYLÜL 2022- Algoritmaların Çalışma Zamanının Hesaplanması 

1.Ödev

Aşağıda verilen fonksiyonun çalışma zamanını bulunuz
def   topla(dizi, N):                  			// 1Kez                                           
        while(i < N):					              // 1Kez
                   topla += dizi[i]				  // N-1 Kez
                   i+=1					            // N-1 Kez
        return topla	
        
        // 1 Kez
ADIMLAR	Algoritma	            Maliyeti	Zamanı
1	      def   topla(dizi, N):       0	   NZ                                         
2	        while(i < N):	            C2	 NZ
3       	topla += dizi[i]	        C3	 NZ-1
4	        i+=1                      C4	 NZ-1
5	      return topla	              C5	 NZ

Satır Maliyeti 1
Çz = (0*NZ)+(1*NZ)+ (1*(NZ-1))+ (1*(NZ-1))+ (1*NZ)
Çz =  4Nz-2




2.Ödev

Aşağıda verilen fonksiyonun çalışma zamanını bulunuz
İnt faktoriyel(int n){			            // 1 Kez
İf (n <= 1)					                    // 1 Kez
            return 1;				            // 1 Kez
  else						                      // 1 Kez
       return (n * faktoriyel(n - 1));	// 1 Kez
} 


ADIMLAR	Algoritma	                        Maliyeti	Zamanı
1	      İnt faktoriyel(int n){                 C1     NZ        / Maliyet 0                                          
2      	İf (n <= 1)                            C2	    NZ        	
3	        return 1;	                           C3	    NZ        / Maliyet 0  
4	      else 	0	NZ                             C4    	NZ        / Maliyet 0  
5	        return (n * faktoriyel(n - 1));      C5   	NZ

Çz = (0*NZ)+(1*NZ)+ (0*NZ)+ (0*NZ)+ (1*NZ)
Çz = 2Nz


*/
