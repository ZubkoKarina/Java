package java_24;

class SpaceRemover{
    public static void main(String[] arguments){
        String mostFamous = "Рудольф - это олень "
                + "с красивым красным носом";
        char[] mfl = mostFamous.toCharArray();
        for(int dex = 0; dex < mfl.length; dex++){
            char current = mfl[dex];
            if(current !=' '){
                System.out.print(current);
            }else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
