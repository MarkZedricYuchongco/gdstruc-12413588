import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numbers[] = {60, 33, 12, 64, 17, 105, -53, 534, 2, 5342, 7, 864, 2467, 463, 865};

//        System.out.println(linearSearch(numbers, 105));
//        System.out.println(linearSearch(numbers, 67));

        System.out.println(binarySearch(numbers, 105));
        //for (int i = 0; i < 10; i++)
        System.out.println(umaSearch(numbers, 2467));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (input[middle] == value) {
                return middle;
            } else if (value < input[middle]) {
                end = middle - 1;
            } else if (value > input[middle]) {
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int umaSearch(int[] input, int value)
    {
        if (input == null || input.length == 0) {
            return -1;
        }

        int track2 = (input.length / 4) ;
        int track2End = input.length / 2;

        int track4 = track2End + (input.length / 4);
        int track4End = input.length - 1;

        int track1 = 0;
        int track1End = track2 - 1;

        int track3 = track2End + 1;
        int track3End = track4 - 1;

        Random random = new Random();
        List<Integer> tracksLeft = new ArrayList<>(List.of(0, 1, 2, 3));

        while (!tracksLeft.isEmpty()) {
            int randTrackIndex = random.nextInt(tracksLeft.size());
            int randTrack = tracksLeft.get(randTrackIndex);

            switch (randTrack) {
                case 0:
                    if (track1 <= track1End) {
                        if (input[track1] == value) {
                            return track1;
                        }
                        track1++;
                    }
                    if (track1 > track1End)
                        tracksLeft.remove((Object) 0);
                    break;
                case 1:
                    if (track2 <= track2End) {
                        if (input[track2] == value) {
                            return track2;
                        }
                        track2++;
                    }
                    if (track2 > track2End)
                        tracksLeft.remove((Object) 1);
                    break;
                case 2:
                    if (track3 <= track3End) {
                        if (input[track3] == value) {
                            return track3;
                        }
                        track3++;
                    }
                    if (track3 > track3End)
                        tracksLeft.remove((Object) 2);
                    break;
                case 3:
                    if (track4 <= track4End) {
                        if (input[track4] == value) {
                            return track4;
                        }
                        track4++;
                    }
                    if (track4 > track4End)
                        tracksLeft.remove((Object) 3);
                    break;
                default:
                    break;
            }
        }
        return -1;
    }
}