// https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6
public class nowcoder_RectCover {
	public static void main(String[] args) {
		System.out.println(RectCover(5));
	}

    public static int RectCover(int target) {
		if(target<=0)
			return 0;
		int f0=1,f1=1,f2=1;
		while(target>1){
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
			target--;
		}
		return f2;
    }
}