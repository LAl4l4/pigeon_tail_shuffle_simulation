public class PTSS{
	public static void main(String [] args){
        int times = 7;
        pigeon_tail_shuffle_simulation sim = new pigeon_tail_shuffle_simulation(times);
        int[] result = sim.generate();
        int[] after = sim.shuffle(times, result);
        for(int i =0;i<52;i++){
            System.out.print(after[i]+" ");
        }
	}
}

class pigeon_tail_shuffle_simulation{
    public int ti ;

    public pigeon_tail_shuffle_simulation(int times){
        ti = times;
    }
    
    
    
    public int[] generate(){
        int[] poker = new int[52];
        for(int i= 0; i<52 ;i++){
            poker[i] = i + 1;
        }
        //System.out.println(poker[51]);

        return poker;
    }

    public int[] shuffle(int t, int[] p){
        int[] af = p;
        for(int i =0; i < t; i++){
            af = pigeon_tail_shuffle_simulation.subshu(af);
        }
        return af;
    }

    public static int[] subshu(int[] p){
        int[] re = p;
        int[] sub1 = new int[26];
        int[] sub2 = new int[26];
        for(int i = 0; i< 26;i++){
            sub1[i] = re[i];
            sub2[i] = re[i+26];
        }
        int[] combined = new int[52];
        int k = 0;
        for(int i = 0; i< 52;i++){
            combined[i] = sub1[k];
            i++;
            combined[i] = sub2[k];
            k++;
        }
        return combined;
    }


}