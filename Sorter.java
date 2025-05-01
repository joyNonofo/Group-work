public class Sorter{

    //Sort by market value (ascending order)
    public static void selectionSortMV(Player[] array){

        //Write the selection sort algorithum here 
        for(int i= 0; i < array.length-1; i++){
            int minIndex= i;

            for(int j= i+1; j < array.length; j++){

                if(array[j].getMarketValue() < array[minIndex].getMarketValue()){
                    minIndex= j;
                }
            }
            //Swap
            Player temp= array[i];
            array[i]= array[minIndex];
            array[minIndex]= temp;
        }
    }

    //Sort by market value (ascending order)
    public static void insertionSortMV(Player[] array){

        //Write the insertion sort algorithum here
        for(int i= 1; i < array.length; i++){

            Player temp= array[i];
            int j= i-1;

            while(j >= 0 && array[i].getMarketValue() > temp.getMarketValue()){
                array[j+1]= array[j];

                j--;
            }
            array[j+1]= temp;
        }
    }

    //Search a player by market value
    public static int linearSearchMV(Player[] array, int target){

        //Write the linear search algorithum here
        for(int i=0; i < array.length; i++){

            if(array[i].getMarketValue()==target){
                return i;
            }
            
        }
        return -1;
    }

    //Binary search a player by market value
    public static Player binarySearchMV(Player[] array, int target){

        int low= 0;
        int high= array.length - 1;

        while (low <= high){

            int mid= low + (high-low)/2;
            int midRating= array[mid].getMarketValue();

            if (midRating == target){
                return array[mid];
            }

            else if(midRating < target){
                low= mid + 1;
            }

            else{
                high= mid - 1;
            }
        }
        return null; //Not found
    }

    //Sort by rating (ascending order)
    public static void selectionSortRA(Player[] array){

        //Write the selection sort algorithum here
        for(int i= 0; i < array.length-1; i++){
            int minIndex= i;

            for(int j= i+1; j < array.length; j++){

                if(array[j].getRating() < array[minIndex].getRating()){
                    minIndex= j;
                }
            }
            //Swap
            Player temp= array[i];
            array[i]= array[minIndex];
            array[minIndex]= temp;
        }
    }

    //Sort by rating (ascending order)
    public static void insertionSortRA(Player[] array){

        //Write the insertion sort algorithum here
        for(int i= 1; i < array.length; i++){

            Player temp= array[i];
            int j= i-1;

            while(j >= 0 && array[i].getRating() > temp.getRating()){
                array[j+1]= array[j];

                j--;
            }
            array[j+1]= temp;
        }
    }

    //Search a player by rating
    public static int linearSearchRA(Player[] array, int target){

        //Write the linear search algorithum here
        for(int i=0; i < array.length; i++){

            if(array[i].getRating()==target){
                return i;
            }
           
        }
        return -1;
    }

     //Binary search a player by overall rating
    public static Player binarySearchRA(Player[] array, int target){

        int low= 0;
        int high= array.length - 1;

        while (low <= high){

            int mid= low + (high-low)/2;
            int midRating= array[mid].getRating();

            if (midRating == target){
                return array[mid];
            }

            else if(midRating < target){
                low= mid + 1;
            }

            else{
                high= mid - 1;
            }
        }
        return null; //Not found
    }
}