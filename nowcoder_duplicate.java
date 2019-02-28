public class nowcoder_duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;

    public static void main(String[] args) {
        int[] numbers={2,3,1,0,2,5,3};
        int length=numbers.length;
        int[] duplication=new int[1];
        System.out.println(duplicate(numbers,length,duplication));
        System.out.println(duplication[0]);
    }    
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        duplication[0]=-1;
        if(numbers==null)
            return false;
        int[] flags=new int[length];
        for(int num:numbers){
            if(num>=length)
                return false;
            if(flags[num]==1){
                duplication[0]=num;
                return false;
            }else{
                flags[num]=1;
            }
        }
        return true;
    }
}