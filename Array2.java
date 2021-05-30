public class Main {
    public static void main(String[] args) {
        String player ="”EÒ";
        String[] teamA = {player,"ím","–‚–@g‚¢"};
        System.out.print(teamA[0] + ",");
        System.out.print(teamA[1]+",");
        System.out.print(teamA[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamB = {teamA[0],teamA[1],teamA[2]};
        System.out.print(teamB[0] + ",");
        System.out.print(teamB[1]+",");
        System.out.print(teamB[2]);
        System.out.println("");
        System.out.println("---");
        
        String[] teamC={"—EÒ","ím","–‚–@g‚¢"};
        String[] teamD={"“‘¯","”EÒ","¤l"};
        String[] teamE={"ƒXƒ‰ƒCƒ€","ƒhƒ‰ƒSƒ“","–‚‰¤"};
        
        String[][] teams = {teamC,teamD,teamE};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==2){
                    System.out.print(teams[i][j]);
                    System.out.println();
                    System.out.println("---");
                }else{
                    System.out.println(teams[i][j]+",");
                }
            }
        }
    }
}
