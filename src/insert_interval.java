import java.util.ArrayList;

public class insert_interval {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0; int n = intervals.length;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        ArrayList<int[]> result = insertInterval(intervals, newInterval);

        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
