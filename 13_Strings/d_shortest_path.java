/*
Given a route containing 4 Directions (N, S, E, W)
Find the shortest path from origin (0, 0) to the destination
*/
public class d_shortest_path {

    public static double shortest_path(String str){
        int n = str.length();
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++){
            char d = Character.toUpperCase(str.charAt(i));
            switch (d) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
                default -> {
                }
            }
        }

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(shortest_path(path));
    }
}
