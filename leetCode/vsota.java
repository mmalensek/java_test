public class vsota {
    
    public int[] twoSum(int[] nums, int target) {
        int[] rezultat = new int[2];

        for(int i = 0; i < nums.length - 1; i++){
            for(int y = i + 1; y < nums.length; y++){
                
                if(nums[i] + nums[y] == target){
                    rezultat[0] = i;
                    rezultat[1] = y;
                    return rezultat;
                }
            }
        }

        return rezultat;
    }


    public static void main(String args[]){

        vsota izracun = new vsota();

        int[] vhod = {1, 2, 3};
        int cilj = 5;

        int[] rezultat = izracun.twoSum(vhod, cilj);

        for(int i = 0; i < 2; i++){
            System.out.println("Indeks: " + rezultat[i]);
        }
    }

}