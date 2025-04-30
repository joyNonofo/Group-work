public class MainPlayer{

    public static void main(String[] args){

        //Create 10 football players
        Player player1= new Player("Gavi", 20, "CM", 84, 90, new Club("Barcelona"));
        Player player2= new Player("Lookman", 27,"ST", 81, 60, new Club("Atlanta"));
        Player player3= new Player("Cheisa", 27,"LW", 87, 18, new Club("Liverpool"));
        Player player4= new Player("Olise", 23,"CAM", 82, 80, new Club("Bayern Munch"));
        Player player5= new Player("Adeyemi", 23, "LW", 80, 40, new Club("Dortmund"));
        Player player6= new Player("Pulisic", 26, "RW", 86, 50, new Club("AC Milan"));
        Player player7= new Player("Ederson", 31, "GK", 89, 25, new Club("Manchester City"));
        Player player8= new Player("Camavinga", 22, "CDM", 83, 75, new Club("Real Madrid"));
        Player player9= new Player("Davies", 24, "LB", 85, 52, new Club("Bayern Munch"));
        Player player10= new Player("Barcola", 22, "RW", 79, 70, new Club("PSG"));

        //Create array for players
        Player[] players= {player1, player2, player3, player4, player5, player6, player7, player8, player9, player10};

        //Sort the array by market value
        selectionSortMV(players);

        Player lowestMV= players[0];
        Player highestMV= players[9];

        //Print out the cheapest player available
        System.out.printf("Player with the lowest market value is "+ lowestMV.getName()+": $" +lowestMV.getMarketValue()+ " millon.\n" );

        //Print out the most expensive player available
        System.out.printf("Player with the highest market value is "+ highestMV.getName()+": $" +highestMV.getMarketValue()+ " millon.\n" );

        //Sort the array by overall rating     
        selectionSortRA(players);

        Player lowestRA= players[0];
        Player highestRA= players[9];

        //Print out the least talented player with the worst rating
        System.out.printf("Player with the lowest rating is "+ lowestRA.getName()+": " +lowestRA.getMarketValue()+ ".\n" );

        //Print out the most talented player with the best rating
        System.out.printf("Player with the highest rating is "+ lowestRA.getName()+": " +lowestRA.getMarketValue()+ ".\n" );

        //Search for a player with a market value of 50 millon
        int indexMV= linearSearchMV(players, 50);
        
        if (indexMV != -1){
            System.out.printf("Found: "+players[indexMV].getName()+ " with market value of $"+ players[indexMV].getMarketValue()+" millon.\n");
        }
        else{
            System.out.printf("Player not found with that market value\n");
        }

        //Search for a player with a overall rating of 84
        int indexRA= linearSearchRA(players, 84);

        if (indexRA != -1){
            System.out.printf("Found: " + players[indexRA].getName()+ " with rating of " + players[indexRA].getRating()+ ".\n");
        }
        else{
            System.out.printf("Player not found with that rating\n");
        }

        //Show how the buyPlayer method in the Club class works
        Club.buyPlayer(player8, 78);
    }
    

}
