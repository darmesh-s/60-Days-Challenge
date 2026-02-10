public class NumberAnalyzer {
    public static void main(String args[]){
        int [] Numbers = {9   ,5,6,7,3,6};
        System.out.println("Sum of the Numbers : "+SumOfNums(Numbers));
        System.out.println("Average of the Numbers : "+AverageofNums(Numbers));
        System.out.println("Largest Number :" +LargestNum(Numbers) );
        System.out.println("Smallest Number :" +SmallestNum(Numbers) );
        System.out.print("Prime Numbers are :");
        PrimeNum(Numbers);
    }

    public static int SumOfNums(int[] arr ){
        int sum =0;
        for(int num : arr){
            sum+=num;
        }
        return sum;
    }
    public static int AverageofNums(int[] arr){
        int sum = 0;
        int avg;
        for(int num : arr){
            sum = sum + num;
        }
        avg = sum/arr.length;
        return avg;
    }
    public static int LargestNum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int SmallestNum(int[] arr){
        int min = arr[0];
        for(int num : arr){
            if(num<min){
                min =num;
            }
        }
        return min;
    }
    public static void PrimeNum(int[] arr){
       for(int i=0;i<arr.length;i++){
            int num = arr[i];
            boolean isprime = true;
            if(num<=1){
                isprime = false;
            }else{
                for(int j=2;j<=Math.sqrt(num);j++){
                    if(num%j==0){
                        isprime = false;
                        break;

                    }
                }
                if(isprime==true){
                    System.out.print(num + " ");
                }
            }
       }
        
    }

    }



