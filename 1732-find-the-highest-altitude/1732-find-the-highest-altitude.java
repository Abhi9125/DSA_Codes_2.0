// Is Question me hame maximum altitude btana h. ki eek biker maximum kitne haight tk gya tha.
// Insialy uski height 0 hogi.

class Solution {
    public int largestAltitude(int[] gain) {
//        Inisialy maxAltitude is 0
        int maxAlt = 0;
        
//         Current Altitude
        int currAlt = 0;
            
            for(int i = 0; i < gain.length; i++){
                currAlt += gain[i];
                
                if(currAlt > maxAlt){
                    maxAlt = currAlt;
                }
            }
        
        return maxAlt;
    }
}