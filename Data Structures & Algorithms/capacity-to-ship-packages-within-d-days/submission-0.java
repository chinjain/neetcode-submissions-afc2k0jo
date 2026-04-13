class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0, res = 0;
        for(int w : weights){
            l = Math.max(l, w);
            r += w;
        }


        while(l <= r){
            int mid = (l + r) / 2;
            int day = canShip(weights,days, mid);

            if(day <= days){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return l;
    }

    static int canShip(int[]a, int days, int cap){
        int day = 1, load = 0;

        for(int i = 0; i < a.length; i++){
            if(load + a[i] > cap){
                day = day + 1;
                load = a[i];
        }else{
            load += a[i];
        }
    }
    return day;
    }
}