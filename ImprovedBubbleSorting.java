package Algorithms;

public class ImprovedBubbleSorting {

        public static void main(String[] args) {

            long startTime = System.currentTimeMillis();

            // int[] array = new int[] {1, 5, 4, 3, 2};
            int[] array = new int[] {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 84, 15, 49, 33, 52, 99, 28, 30};
            printArray(array);
            System.out.println();

            int tmp;
            boolean isSorted = false;
            int step = 0;
            int arrayDepth;
            int iterrations = 0;

            while (!isSorted) {
                isSorted = true;
                arrayDepth = array.length - step; // На следующей итерации смотрим в массив поверхностнее
                for (int i = 0; i < arrayDepth; i++) {
                    iterrations++;
                    System.out.println("Iteration" + iterrations);
                    if (i < array.length - 1) {
                        if (array[i] > array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            isSorted = false;
                        }
                    }
                }
                printArray(array); // вывод текущего состояния массива
                step++;
                System.out.println(" Step " + step);
            }

            System.out.println("Iterrations: " + iterrations);

            // Блок, отвечающиий за подсчёт времени выполнения программы
            long endTime = System.currentTimeMillis();
            long runTime = endTime - startTime;
            System.out.println();
            System.out.println("Время выполнения программы: " + runTime + "ms");

        }

        private static void printArray(int[] arr) {
            //System.out.println();
            System.out.print("[");
            for (int i=0; i<arr.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
            System.out.print("]");
        }
    }
