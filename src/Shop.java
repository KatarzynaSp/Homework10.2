 class Shop {

    Box[] boxes = new Box[2];

    {
        boxes[0] = new Box(5, 6, 7);
        boxes[1] = new Box(5, 10);

    }

    public Box MatchTheBox(Product product) {

        int i = 0;
        for (; i < boxes.length - 1; i++) {
            double v1 = product.countSphereVolume(product);
            double v2 = product.countCubeVolume(product);
            double vProd = Math.max(v1, v2);

            double v3 = boxes[i].countSphereVolume(boxes[i]);
            double v4 = boxes[i].countCylinderVolume(boxes[i]);
            double vBox = Math.max(v3, v4);

            if (vProd < vBox) {

                return boxes[i];
            }
        }
        return boxes[i];

    }
}