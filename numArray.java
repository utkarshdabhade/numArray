public class numArray {  
      
    public static void main(String[] args) {  
          
        //Prepara array   
        int [] array = new int [] {1, 2, 2, 1, 6, 6, 1, 5, 6, 5, 6};   
        //Array frequency will store frequencies of element  
        int [] frequency = new int [array.length];  
        int arrayOccured = -1;  
        
        for(int i = 0; i < array.length; i++){  
            int count = 1;  
            for(int j = i+1; j < array.length; j++){  
                if(array[i] == array[j]){  
                    count++;  
                    //To avoid counting same element again  
                    frequency[j] = arrayOccured;  
                }  
            }  
            if(frequency[i] != arrayOccured)  
                frequency[i] = count;  
        }  
        
        //Displays the frequency of each element present in array  
        System.out.println("Unique Numbers and their Frequencies");  
        // System.out.println(" Element | Frequency");  
        // System.out.println("---------------------");  
        for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != arrayOccured)  
                // System.out.println("    " + arr[i] + "    |    " + fr[i]);  
				System.out.println(array[i] + ":" + frequency[i] + " times");
        }  
        // System.out.println("---------------------");  
    }  
}   