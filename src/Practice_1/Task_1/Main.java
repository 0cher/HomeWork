package Practice_1.Task_1;

public class Main {

    public static void main(String[] args) {

        MakeBricks makeBricks = new MakeBricks();

        int numberOfBricksSmall = 3;
        int numberOfBricksBig = 5;
        int wallLength = 39;

        System.out.println( makeBricks.getMakeBricks
                (numberOfBricksSmall,numberOfBricksBig,wallLength));

        if (!makeBricks.getMakeBricks
                (numberOfBricksSmall, numberOfBricksBig, wallLength)) {
            int iBig = makeBricks.getBricksQuantityBig(
                    numberOfBricksSmall,numberOfBricksBig,wallLength);
            int iSmall = makeBricks.getBricksQuantitySmall(
                    numberOfBricksSmall,numberOfBricksSmall,wallLength);

            System.out.println("Необходимое количество больших кирпичей: "+iBig+
                    "\nНеобходимое количество маленьких кирпичей: "+iSmall);
        }

    }

}
