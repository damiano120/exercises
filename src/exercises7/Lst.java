package exercises7;

import java.util.Arrays;

public class Lst {

    private int[] numbers;
    private int capacity;
    private int size;

    public Lst(int capacity) {
        this.numbers = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean addNumber(int number) {
        if (size == capacity) {
            System.out.println("Error. List is full");
            return false;
        } else {
            Arrays.sort(numbers);
            int i = Arrays.binarySearch(numbers, 0);
            numbers[i] = number;
            size++;
        }
        return true;
    }
//    POWYZSZE ZASTEPUJE PONIZSZE
//            for (int i = 0; i < capacity; i++) {
//                if (numbers[i] == 0) {
//                    numbers[i] = number;
//                    size++;
//                    break;
//                }
//            }
//        }
//        return true;
//    }

    public int find(int number) {
        Arrays.sort(numbers);
        int i = Arrays.binarySearch(numbers, number);
        if (numbers[i] == number) {
            return i;
        }
        return -1;
    }
//    POWYZSZE ZASTEPUJE PONIZSZE
//        for (int i = 0; i < capacity; i++) {
//            if (numbers[i] == number) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public String print() {
        System.out.println("Rozmiar listy: " + size + "\n" +
                "Pojemnosc listy: " + capacity + "\n" +
                "Lista elementow: " + Arrays.toString(numbers) + "\n");

        return "";
    }

//        POWYZSZE ZASTEPUJE PONIZSZE
//        String tab = null;
//        for (int i = 0; i < capacity; i++) {
//            if (numbers[i] == 0) {
//                continue;
//            }
//            if (tab == null) {
//                tab = numbers[i] + " ";
//            } else {
//                tab += numbers[i] + " ";
//            }
//        }
//        System.out.println("Rozmiar listy: " + size + "\n" +
//                "Pojemnosc listy: " + capacity + "\n" +
//                "Lista elementow: " + Arrays.toString(numbers) + "\n");
//
//        return "";
//    }

        public void removeFirst ( int number){
            int repeat = -1;
            int counter = 0;
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == number) {
                    if (repeat == -1) {
                        repeat = i;
                    }
                    counter++;
                }
                if (counter > 1) {
                    numbers[repeat] = 0;
                    size--;
                    break;
                }
            }
        }

        public void removeRepeat () {
            for (int i = 0; i < capacity - 1; i++) {
                for (int j = i + 1; j < capacity; j++) {
                    if (numbers[i] == numbers[j]) {
                        numbers[i] = 0;
                        size--;
                        break;
                    }
                }
            }
        }
    }
