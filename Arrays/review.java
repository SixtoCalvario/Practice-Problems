package Arrays;
import java.util.Arrays;
public class review {
    public static void main(String[] args) {
                
        // ascii art 
        System.out.println("____________________________________________________");
        System.out.println("|____________________________________________________|");
        System.out.println("| __     __   ____   ___ ||  ____    ____     _  __  |");
        System.out.println("|| p|__ |--|_| || |_|   |||_|**|*|__|+|+||___| ||  | |");
        System.out.println("||=L|^^||--| |=||=| |=*=||| |~~|~|  |=|=|| | |~||==| |");
        System.out.println("|| U|##||  | | || | |BRO|||-|  | |==|+|+||-|-|~||__| |");
        System.out.println("||_H|__||__|_|_||_|_|___|||_|__|_|__|_|_||_|_|_||__|_|");
        System.out.println("||_______________________||__________________________|");
        System.out.println("| _____________________  ||      __   __  _  __    _ |");
        System.out.println("||=|=|=|=|=|=|=|=|=|=|=| __..\\/ |  |_|  ||#||==|  / /|");
        System.out.println("|| |0| | | | |9| | |2|4|/\\ \\  \\\\|++|=|  || ||==| / / |");
        System.out.println("||_|_|_|_|_|_|_|_|_|_|_/_/\\_.___\\__|_|__||_||__|/_/__|");
        System.out.println("|____________________ /\\~()/()~//\\ __________________|");
        System.out.println("| __   __    _  _     \\_  (_ .  _/ _    ___     _____|");
        System.out.println("||~~|_|..|__| || |_ _   \\ //\\\\ /  |=|__|~|~|___| | | |");
        System.out.println("||--|+|^^|==|1||2| | |__/\\ __ /\\__| |==|x|x|+|+|=|=|=|");
        System.out.println("||__|_|__|__|_||_|_| /  \\ \\  / /  \\_|__|_|_|_|_|_|_|_|");
        System.out.println("|_________________ _/    \\/\\/\\/    \\_ _______________|");
        System.out.println("| _____   _   __  |/      \\../      \\|  __   __   ___|");
        System.out.println("||_____|_| |_|##|_||   |   \\/ __|   ||_|==|_|++|_|-|||");
        System.out.println("||______||=|#|--| |\\   \\   o    /   /| |  |~|  | | |||");
        System.out.println("||______||_|_|__|_|_\\   \\  o   /   /_|_|__|_|__|_|_|||");
        System.out.println("|_________ __________\\___\\____/___/___________ ______|");
        System.out.println("|__    _  /    ________     ______           /| _ _ _|");
        System.out.println("|\\ \\  |=|/   //java /| //   /  /  / |        / ||%|%|%|");
        System.out.println("| \\/\\ | /  .//____//.//   /__/__/ (_)      /  ||=|=|=|");
        System.out.println("__|  \\/\\|/   /(____|/ //                    /  /||~|~|~|__");
        System.out.println("|___\\_/   /________//   ________         /  / ||_|_|_|");
        System.out.println("|___ /   (|________/   |\\_______\\       /  /| |______|");
            System.out.println("/                  \\|________)     /  / | |");
        String rawData = "97,95,93,64,77";
        String[] splitData = rawData.split(",");
        // convert to int array
        int[] intData = new int[splitData.length];
        for(int i=0; i<splitData.length; i++) {
            intData[i] = Integer.parseInt(splitData[i]);
            System.out.println(intData[i]);
        }

        // print arrays as a string 
        System.out.println("Data: "+Arrays.toString(intData));

        // for each loops we are gonna find the top score pluh we dont need index 
        int topScore = 0;
        for(int cow : intData) {
            if(topScore<cow){
                topScore = cow;
            }
        }
        System.out.println(topScore);

    }    
}

