public class BubbleSort {

     public SalesRep[] BubbbleSort(SalesRep[] unsortedReps){

         int n = unsortedReps.length;
         for (int i = 0; i < n-1; i++){
             for (int j = 0; j < n-i-1; j++){
                 if (unsortedReps[j].getRevenue() < unsortedReps[j+1].getRevenue()){
                     SalesRep temp = unsortedReps[j];
                     unsortedReps[j] = unsortedReps[j+1];
                     unsortedReps[j+1] = temp;
                 }
             }
         }
         return unsortedReps;
     }
}
