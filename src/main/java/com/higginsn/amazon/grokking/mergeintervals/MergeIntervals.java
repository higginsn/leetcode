package com.higginsn.amazon.grokking.mergeintervals;

import com.higginsn.models.Interval;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/3jyVPKRA8yx
 */
public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty() || intervals.size() == 1) {
            return intervals;
        }

        List<Interval> result = new LinkedList<>();

        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

        Iterator<Interval> intervalIterator = intervals.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;

        while (intervalIterator.hasNext()) {
            interval = intervalIterator.next();

            if (interval.start <= end) {
                // overlapping intervals, adjust the end
                end = Math.max(interval.end, end);
            } else {
                // non-overlapping intervals, append previous interval and start from next
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));

        return result;
    }

}
