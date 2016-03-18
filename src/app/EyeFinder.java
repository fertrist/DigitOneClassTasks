package app;

import java.util.*;

public class EyeFinder {

    static char[][] picture = new char[][] {
        {'b','w','w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','r','r','r','w','w','w','w'},
        {'w','w','w','r','r','r','r','r','w','w','w'},
        {'w','w','r','r','b','b','b','r','r','w','w'},
        {'w','r','r','b','b','b','b','b','r','r','w'},
        {'w','r','r','b','b','b','b','b','r','r','w'},
        {'w','r','r','b','b','b','b','b','r','r','w'},
        {'w','w','r','r','b','b','b','r','r','w','w'},
        {'w','w','w','r','r','r','r','r','w','w','w'},
        {'w','w','w','w','r','r','r','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w','w','w'},
    };

    public static void main(String[] args) {
        EyeFinder eyeFinder = new EyeFinder();
        System.out.println(eyeFinder.hasRedEyes());
    }

    public boolean hasRedEyes() {
        List<Group> groups = groupPixelsByColor(picture, 'b');
        System.out.println(groups);
        return false;
    }

    private List<Group> groupPixelsByColor(char [][] picture, char color) {
        List<Group> groups = new ArrayList<>();
        for (int x = 0; x < picture.length; x++) {
            for (int y = 0; y < picture[0].length; y++) {
                char pointColor = picture[x][y];
                if (pointColor == color) {
                    Point point = new Point(x, y, pointColor);
                    boolean wasAdded = false;
                    for (Group group : groups) {
                        if (group.isNeighbour(point)) {
                            wasAdded = group.addPoint(point);
                        }
                    }
                    //workaround
                    if (!wasAdded) {
                        Group group = new Group();
                        group.addPoint(point);
                        groups.add(group);
                    }
                }
            }
        }
        return groups;
    }

    class Point{
        int x;
        int y;
        char color;

        public Point(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    class Group {
        List<Point> points;

        public boolean addPoint(Point point) {
            if (points == null) {
                points = new ArrayList<>();
            }
            return points.add(point);
        }

        /**
         * Defines if point is contained by a group.
         */
        public boolean isNeighbour(Point point) {
            for (Point p : points){
                int absX = (Math.abs(point.x - p.x));
                int absY = (Math.abs(point.y - p.y));
                if ((absX == 1 && absY <= 1)
                    || (absY == 1 && absX <= 1)) {
                    return true;
                }
            }
            return false;
        }
    }

}
