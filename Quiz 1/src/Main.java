public class Main {

    public static void main(String[] args) {

        int[] bubbleNumbers = new int[10];

        bubbleNumbers[0] = 23;
        bubbleNumbers[1] = 83;
        bubbleNumbers[2] = 14;
        bubbleNumbers[3] = 3;
        bubbleNumbers[4] = 43;
        bubbleNumbers[5] = 11;
        bubbleNumbers[6] = 68;
        bubbleNumbers[7] = 63;
        bubbleNumbers[8] = 84;
        bubbleNumbers[9] = 12;

        int[] selectionNumbers = new int[10];

        selectionNumbers[0] = 35;
        selectionNumbers[1] = 72;
        selectionNumbers[2] = 2;
        selectionNumbers[3] = 24;
        selectionNumbers[4] = 23;
        selectionNumbers[5] = 78;
        selectionNumbers[6] = 36;
        selectionNumbers[7] = 34;
        selectionNumbers[8] = 31;
        selectionNumbers[9] = 56;

        System.out.println("Before bubble sort: ");
        printArrayElements(bubbleNumbers);
        bubbleSort(bubbleNumbers);
        System.out.println("\n\nAfter bubble sort: ");
        printArrayElements(bubbleNumbers);

        System.out.println("\n\nBefore selection sort: ");
        printArrayElements(selectionNumbers);
        selectionSort(selectionNumbers);
        System.out.println("\n\nAfter selection sort: ");
        printArrayElements(selectionNumbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static  void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}