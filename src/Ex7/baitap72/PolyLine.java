package Ex7.baitap72;

import java.util.*;

public class PolyLine {
    private List<Point> points;
    public PolyLine()
    {
        points = new ArrayList<Point>();
    }
    public PolyLine(List<Point> points)
    {
        this.points = points;
    }
    public void appendPoint(int x,int y)
    {
        Point p = new Point(x,y);
        points.add(p);
    }
    public void appendPoint(Point p)
    {
        points.add(p);
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("{");
        for (Point point : points) {
            sb.append(point.toString());
        }
        sb.append("}");
        return sb.toString();
    }
    // Tính tổng độ dài của PolyLine (tối ưu)
    public double getLength() {
        int n = points.size();
        if (n < 2) return 0.0;

        double length = 0.0;
        Point prev = points.get(0);
        for (int i = 1; i < n; i++) {
            Point curr = points.get(i);
            length += prev.distance(curr);
            prev = curr;
        }
        return length;
    }

}
