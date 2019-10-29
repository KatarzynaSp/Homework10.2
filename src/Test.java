public class Test {
    public static void main(String[] args) {
        Box[] boxes = new Box[2];
        {
            boxes[0] = new Box(5, 6, 7);
            boxes[1] = new Box(6, 10);
        }

        Shop shop = new Shop();
        Product product = new Product(5);
        shop.MatchTheBox(product);
    }
}