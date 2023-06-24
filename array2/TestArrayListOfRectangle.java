
package array;

public class TestArrayListOfRectangle {
    private MyArrayList<Rectangle> arr;
    public void add(Rectangle x)
    {
        arr.add(x);
    }
    public double sum()
    {
        double s=0;
        for(int i=0;i<arr.size();i++)
            s += arr.get(i).calculateArea();
        return s;
    }
    public double findLargestArea() {
        double largestArea = 0;
        for (int i = 0; i < arr.size(); i++) {
            double area = arr.get(i).calculateArea();
            if (area > largestArea) {
                largestArea = area;
            }
        }
        return largestArea;
    }
    public double findLargestSumOfPerimeters() {
        double largestSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            double perimeterSum = arr.get(i).calculatePerimeter() * 2;
            if (perimeterSum > largestSum) {
                largestSum = perimeterSum;
            }
        }
        return largestSum;
    }
    public void sortRectanglesByWidthDescending() {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j).getWidth() < arr.get(j + 1).getWidth()) {
                    Rectangle temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        TestArrayListOfRectangle test = new TestArrayListOfRectangle();

        test.add(new Rectangle(3, 4));
        test.add(new Rectangle(5, 6));
        test.add(new Rectangle(7, 8));

        double largestArea = test.findLargestArea();
        System.out.println("Dien tich lon nhat trong danh sach: " + largestArea);

        
        double largestSumOfPerimeters = test.findLargestSumOfPerimeters();
        System.out.println("Tong lon nhat cua 2 chu vi trong danh sach: " + largestSumOfPerimeters);


        test.sortRectanglesByWidthDescending();
        System.out.println("Danh sach sau khi sap xep chieu rong giam dan:");
        for (int i = 0; i < test.arr.size(); i++) {
            Rectangle test1 = test.arr.get(i);
            System.out.println(test1.getWidth());
        }
    }
}