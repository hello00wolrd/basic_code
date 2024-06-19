package com.whu.Algorithm;

public class BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
//        创建三个块对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};
//      要查找的元素
        int number = 16;
        int index = getIndex(blocks, arr, number);
        if (index == -1) {
            System.out.println("Not find!!!");
        } else {
            System.out.println("The number's index is " + index);
        }

    }

    private static int getIndex(Block[] blocks, int[] arr, int number) {
        int blockIndex = findIndexBlock(blocks, number);
        if (blockIndex == -1) {
//            没有找到数据
            return -1;
        }
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //    定义一个方法用来确定number在哪一个块中
    public static int findIndexBlock(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].getMax() < number) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;//最大值
    private int startIndex;//起始序列
    private int endIndex;//结束序列

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}