package com.whu.Algorithm;

public abstract class ToolClass {
    private ToolClass() {
    }

    private static final int[] arrSource = {679, 1313, 1601, 151, 615, 589, 736, 300, 1170, 1404,
            1184, 162, 1378, 1614, 1281, 373, 905, 1038, 417, 1554,
            1215, 1276, 1017, 1925, 1100, 105, 148, 1524, 1831, 1598,
            1252, 692, 870, 2000, 1928, 1305, 1196, 352, 1690, 1061,
            1205, 656, 940, 1194, 1562, 1538, 832, 1442, 1412, 1413,
            144, 1473, 152, 1828, 903, 48, 456, 51, 1128, 1222,
            1024, 429, 530, 910, 1676, 1256, 542, 1893, 1168, 1284,
            1294, 1256, 1568, 489, 1947, 1865, 1843, 1071, 1456, 1848,
            1463, 1441, 1542, 1450, 1617, 882, 145, 195, 798, 1744,
            944, 838, 1063, 965, 1164, 961, 1506, 1923, 1307, 1690};

    private static final int[] arrSort = {48, 51, 105, 144, 145, 148, 151, 152, 162, 195,
            300, 352, 373, 417, 429, 456, 489, 530, 542, 589,
            615, 656, 679, 692, 736, 798, 832, 838, 870, 882,
            903, 905, 910, 940, 944, 961, 965, 1017, 1024, 1038,
            1061, 1063, 1071, 1100, 1128, 1164, 1168, 1170, 1184, 1194,
            1196, 1205, 1215, 1222, 1252, 1256, 1256, 1276, 1281, 1284,
            1294, 1305, 1307, 1313, 1378, 1404, 1412, 1413, 1441, 1442,
            1450, 1456, 1463, 1473, 1506, 1524, 1538, 1542, 1554, 1562,
            1568, 1598, 1601, 1614, 1617, 1676, 1690, 1690, 1744, 1828,
            1831, 1843, 1848, 1865, 1893, 1923, 1925, 1928, 1947, 2000};

    public static int[] getArrSourceClone() {
        return arrSource.clone();
    }

    public static int[] getArrSortClone() {
        return arrSort.clone();
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arrSort[i]) {
                return false;
            }
        }
        return true;
    }
}