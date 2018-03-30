public class Sort {
    //Ascending sort
    public static void sortASC(int[] listNumber) {
        int temp = listNumber[0];
        for (int i = 0; i < listNumber.length - 1; i++) {
            for (int j = i + 1; j < listNumber.length; j++) {
                if (listNumber[i] > listNumber[j]) {
                    temp = listNumber[j];
                    listNumber[j] = listNumber[i];
                    listNumber[i] = temp;
                }
            }
        }
    }

    //Display list
    public static void showListNumber(int[] listNumber) {
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Create a 50-element-array
        int listNumber[] = new int[100000];

        //Random 0 - 100000
        for (int i = 0; i < 100000; i++) {
            listNumber[i] = (int) Math.round(Math.random() * 100000);
        }

        //Sort and display
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        System.out.println("Started");

        sortASC(listNumber);
        showListNumber(listNumber);

        System.out.println("Stopped");

        stopwatch.stop();

        double totalTime = (double) stopwatch.getElapsedTime() / 1000;
        System.out.println("Total time is: " + totalTime + " seconds ");
    }
}