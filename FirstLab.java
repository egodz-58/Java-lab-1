import java.util.Random;
import java.util.Scanner;

// Вариант 4 (2, 4, 6, 8, 10)
public class FirstLab {
    public static void main(String[] args) {
        FirstLab lab = new FirstLab();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер задания (0 - выход): ");
            String question = scanner.nextLine();

            if (question.equals("0")) {
                System.out.println("Программа завершена");
                break;
            }

            switch (question) {
                case "1.2":
                    int test1 = lab.sumLastNums(1);
                    System.out.println(" cумма двух последних знаков равна: " + test1);
                    int test2 = lab.sumLastNums(12);
                    System.out.println(" cумма двух последних знаков равна: " + test2);
                    int test3 = lab.sumLastNums(10012300);
                    System.out.println(" cумма двух последних знаков равна: " + test3);
                    break;

                case "1.4":
                    System.out.println("Проверка на положительноть числа");
                    boolean testFlag1 = lab.isPositive(0);
                    System.out.println(" " + testFlag1);
                    boolean testFlag2 = lab.isPositive(-1);
                    System.out.println(" " + testFlag2);
                    boolean testFlag3 = lab.isPositive(1);
                    System.out.println(" " + testFlag3);
                    break;

                case "1.6":
                    System.out.println("Проверка на заглавную букву в диапазоне от A до Z");
                    boolean upperTest1 = lab.isUpperCase('A');
                    System.out.println(" " + upperTest1);
                    boolean upperTest2 = lab.isUpperCase('Z');
                    System.out.println(" " + upperTest2);
                    boolean upperTest3 = lab.isUpperCase('a');
                    System.out.println(" " + upperTest3);
                    boolean upperTest4 = lab.isUpperCase('@');
                    System.out.println(" " + upperTest4);
                    boolean upperTest5 = lab.isUpperCase(']');
                    System.out.println(" " + upperTest5);
                    break;

                case "1.8":
                    System.out.println("Проверка: любое из принятых чисел делит другое нацело");
                    boolean divTest1 = lab.isDivisor(3, 6);
                    System.out.println(" " + divTest1);
                    boolean divTest2 = lab.isDivisor(2, 15);
                    System.out.println(" " + divTest2);
                    boolean divTest3 = lab.isDivisor(0, 0);
                    System.out.println(" " + divTest3);
                    boolean divTest4 = lab.isDivisor(0, 5);
                    System.out.println(" " + divTest4);
                    boolean divTest5 = lab.isDivisor(-3, 6);
                    System.out.println(" " + divTest5);
                    break;

                case "1.10":
                    System.out.println("Сумма двух чисел из разряда единиц");
                    int result = 8;
                    result = lab.lastNumSum(result, 27);
                    result = lab.lastNumSum(result, 104);
                    result = lab.lastNumSum(result, 39);
                    result = lab.lastNumSum(result, 50);
                    System.out.println("Итого: " + result);
                    break;

                case "2.2":
                    System.out.println("Безопасное деление");
                    double safeDivTest1 = lab.safeDiv(5, 0);
                    System.out.println(safeDivTest1);
                    double safeDivTest2 = lab.safeDiv(8, 2);
                    System.out.println(safeDivTest2);
                    double safeDivTest3 = lab.safeDiv(5, 2);
                    System.out.println(safeDivTest3);
                    double safeDivTest4 = lab.safeDiv(-5, 2);
                    System.out.println(safeDivTest4);
                    break;

                case "2.4":
                    System.out.println("Строка сравнения");
                    String makeDecisionTest1 = lab.makeDecision(1, 2);
                    System.out.println(makeDecisionTest1);
                    String makeDecisionTest2 = lab.makeDecision(5, 3);
                    System.out.println(makeDecisionTest2);
                    String makeDecisionTest3 = lab.makeDecision(7, 7);
                    System.out.println(makeDecisionTest3);
                    break;

                case "2.6":
                    System.out.println("Два любых (из трех принятых) можно сложить так, чтоб получить третье");
                    boolean sumTest1 = lab.sum3(2,3,5);
                    System.out.println(sumTest1);
                    boolean sumTest2 = lab.sum3(2,5,3);
                    System.out.println(sumTest2);
                    boolean sumTest3 = lab.sum3(5,2,3);
                    System.out.println(sumTest3);
                    boolean sumTest4 = lab.sum3(8,-1,4);
                    System.out.println(sumTest4);
                    break;

                case "2.8":
                    System.out.println("Возраст");
                    String ageTest1 = lab.age(1);
                    System.out.println(ageTest1);
                    String ageTest2 = lab.age(2);
                    System.out.println(ageTest2);
                    String ageTest3 = lab.age(5);
                    System.out.println(ageTest3);
                    String ageTest4 = lab.age(11);
                    System.out.println(ageTest4);
                    String ageTest5= lab.age(14);
                    System.out.println(ageTest5);
                    String ageTest6 = lab.age(21);
                    System.out.println(ageTest6);
                    String ageTest7= lab.age(111);
                    System.out.println(ageTest7);
                    break;

                case "2.10":
                    System.out.println("Вывод дней недели");
                    System.out.println("1)");
                    lab.printDays("Понедельник");
                    System.out.println("2)");
                    lab.printDays("четверг");
                    System.out.println("3)");
                    lab.printDays("Воскресенье");
                    System.out.println("4)");
                    lab.printDays("пн");
                    break;

                case "3.2":
                    System.out.println("Числа наоборот");
                    String strListTest1 = lab.reverseListNums(0);
                    System.out.println(strListTest1);
                    String strListTest2 = lab.reverseListNums(1);
                    System.out.println(strListTest2);
                    String strListTest3 = lab.reverseListNums(5);
                    System.out.println(strListTest3);
                    break;

                case "3.4":
                    System.out.println("Степень числа");
                    int powTest1 = lab.pow(2, 5);
                    System.out.println(powTest1);
                    int powTest2 = lab.pow(5, 0);
                    System.out.println(powTest2);
                    int powTest3 = lab.pow(0, 3);
                    System.out.println(powTest3);
                    int powTest4 = lab.pow(-2, 3);
                    System.out.println(powTest4);
                    int powTest5 = lab.pow(-2, 2);
                    System.out.println(powTest5);
                    break;
                
                case "3.6":
                    System.out.println("Одинаковость");
                    boolean flagNumTest1 = lab.equalNum(7);
                    System.out.println(flagNumTest1);
                    boolean flagNumTest2 = lab.equalNum(0);
                    System.out.println(flagNumTest2);
                    boolean flagNumTest3 = lab.equalNum(1111);
                    System.out.println(flagNumTest3);
                    boolean flagNumTest4 = lab.equalNum(1211);
                    System.out.println(flagNumTest4);
                    boolean flagNumTest5 = lab.equalNum(1000);
                    System.out.println(flagNumTest5);
                    break;

                case "3.8":
                    System.out.println("Левый треугольник");
                    System.out.println("1)");
                    lab.leftTriangle(1);
                    System.out.println("2)");
                    lab.leftTriangle(0);
                    System.out.println("3)");
                    lab.leftTriangle(4);
                    break;

                case "3.10":
                    lab.guessGame(scanner);
                    scanner.nextLine();
                    break;

                case "4.2":
                    System.out.println("Тест 1");
                    int[] testFind1 = {1, 2, 3, 2, 5, 2};
                    System.out.println("Исходный массив: ");
                    lab.showArray(testFind1);
                    int numIndex1 = lab.findLast(testFind1, 2);
                    System.out.println(numIndex1);
                    System.out.println("Тест 2");
                    int[] testFind2 = {1, 3, 5, 7};
                    System.out.println("Исходный массив: ");
                    lab.showArray(testFind2);
                    int numIndex2 = lab.findLast(testFind2, 8);
                    System.out.println(numIndex2);
                    System.out.println("Тест 3");
                    int[] testFind3 = {};
                    System.out.println("Исходный массив: ");
                    lab.showArray(testFind3);
                    int numIndex3 = lab.findLast(testFind3, 3);
                    System.out.println(numIndex3);
                    break;

                case "4.4":
                    int[] testAdd1 = {1, 2, 3};
                    int[] add1 = lab.add(testAdd1, 5, 0);
                    lab.showArray(add1);
                    int[] testAdd2 = {1, 2, 3, 4, 5};
                    int[] add2 = lab.add(testAdd2, 9, 2);
                    lab.showArray(add2);
                    int[] testAdd3 = {1, 2, 3};
                    int[] add3 = lab.add(testAdd3, 9, 3);
                    lab.showArray(add3);
                    int[] testAdd4 = {};
                    int[] add4 = lab.add(testAdd4, 9, 0);
                    lab.showArray(add4);
                    break;
                
                case "4.6":
                    int[] testReverse1 = {1, 2, 3, 4, 5};
                    lab.reverse(testReverse1);
                    int[] testReverse2 = {7};
                    lab.reverse(testReverse2);
                    int[] testReverse3 = {};
                    lab.reverse(testReverse3);
                    break;
                    

                case "4.8":
                    System.out.println("Тест 1");
                    int[] firstTest1 = {1, 2, 3, 4, 5};
                    int[] secondTest1 = {5, 6, 7, 8};
                    System.out.println("2 исходных массива: ");
                    lab.showArray(firstTest1);
                    lab.showArray(secondTest1);
                    int[] concatArray1 = lab.concat(firstTest1, secondTest1);
                    System.out.println("Массив после склеивания:");
                    lab.showArray(concatArray1);
                    System.out.println("Тест 2");
                    int[] firstTest2 = {};
                    int[] secondTest2 = {4, 5, 6};
                    System.out.println("2 исходных массива: ");
                    lab.showArray(firstTest2);
                    lab.showArray(secondTest2);
                    int[] concatArray2 = lab.concat(firstTest2, secondTest2);
                    System.out.println("Массив после склеивания:");
                    lab.showArray(concatArray2);
                    break;
                
                case "4.10":
                    System.out.println("Тест 1");
                    int[] testArray1 = {1, -2, -3, 0, -5};
                    System.out.println("Исходный массив: ");
                    lab.showArray(testArray1);
                    int[] negativeTest1 = lab.deleteNegative(testArray1);
                    System.out.println("Массив после исключения отрицательных чисел:");
                    lab.showArray(negativeTest1);
                    System.out.println("Тест 2");
                    int[] testArray2 = {-2, -3, -5};
                    System.out.println("Исходный массив: ");
                    lab.showArray(testArray2);
                    int[] negativeTest2 = lab.deleteNegative(testArray2);
                    System.out.println("Массив после исключения отрицательных чисел:");
                    lab.showArray(negativeTest2);
                    break;

                default:
                    System.out.println("Такого задания нет.");
                    break;
            }
        }
        scanner.close();
    }

    // Задание 1.2.
    public int sumLastNums(int x) {
        System.out.print("Для числа " + x + ": ");
        int first = lastNum(x);
        x = putLastNum(x);
        int second = lastNum(x);
        return second + first;
    }
    private int lastNum(int x) {
        return x % 10;
    }
    private int putLastNum(int x) {
        return x / 10;
    }
    // Задание 1.4
    public boolean isPositive(int x) {
        System.out.print("Для числа " + x + ": ");
        return x > 0;
    }
    // Задание 1.6
    public boolean isUpperCase(char x) {
        System.out.print("Для символа " + x + ": ");
        return x >= 'A' && x <= 'Z';
    }
    // Задание 1.8
    public boolean isDivisor(int a, int b) {
        System.out.print("Для чисел " + a + " и " + b + ": ");
        if (a == 0 && b == 0) {
            return false;
        }
        return a % b == 0 || b % a == 0;
    }
    // Задание 1.10
    public int lastNumSum(int a, int b) {
        int first = lastNum(a);
        int second = lastNum(b);
        int summ = first + second;
        System.out.println(a + " + " + b + " = " + summ);
        return summ;
    }

    // Задание 2.2
    public double safeDiv(int x, int y) {
        System.out.print("Для чисел " + x + " и " + y + ": ");
        if (y == 0) {
            return 0;
        } else {
            return (double) x / y;
        }
    }

    // Задание 2.4
    public String makeDecision(int x, int y) {
        String makeStr = "";
        System.out.print("Для чисел " + x + " и " + y + ": ");
        if (x == y) {
            makeStr = x + " == " + y;
            return makeStr;
        } else if (x < y) {
            makeStr = x + " < " + y;
            return makeStr;
        } else {
            makeStr = x + " > " + y;
            return makeStr;
        }
    }

    // Задание 2.6
    public boolean sum3(int x, int y, int z) {
        System.out.print("Для чисел " + x + ", " + y + ", " + z + ": ");
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2.8
    public String age(int x) {
        System.out.print("Для числа " + x + ": ");
        int lastNumber = lastNum(x);
        int lastTwo = x % 100;
        if ((lastTwo >= 11 && lastTwo <= 19) || lastNumber > 4 || lastNumber == 0) {
            return x + " лет";
        } else if (lastNumber >= 2 && lastNumber <= 4) {
            return x + " года";
        } else if (x < 0) {
            return "Возраст должен быть положительным";
        } else {
            return x + " год";
        }
    }

    // Задание 2.10
    public void printDays(String x) {
        System.out.println("Для строки: " + x + ": ");
        String pn = "понедельник ";
        String vt = "вторник ";
        String sr = "среда ";
        String cht = "четверг ";
        String pt = "пятница ";
        String sb = "суббота ";
        String vs = "воскресенье ";

        switch (x) {
            case "понедельник", "Понедельник":
                System.out.println(pn + vt + sr + cht + pt + sb + vs);
                break;
            case "вторник", "Вторник":
                System.out.println(vt + sr + cht + pt + sb + vs);
                break;
            case "среда", "Среда":
                System.out.println(sr + cht + pt + sb + vs);
                break;
            case "четверг", "Четверг":
                System.out.println(cht + pt + sb + vs);
                break;
            case "пятница", "Пятница":
                System.out.println(pt + sb + vs);
                break;
            case "суббота", "Суббота":
                System.out.println(sb + vs);
                break;
            case "воскресенье", "Воскресенье":
                System.out.println(vs);
                break;
        
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    // Задание 3.2
    public String reverseListNums(int x) {
        String strList = "";
        System.out.print("Для числа " + x + ": ");
        for (int i = x; i >= 0; i--) {
            strList += " " + i;
        }
        return strList;
    }

    // Задание 3.4
    public int pow(int x, int y) {
        int powNumber = 1;
        System.out.print("Число " + x + " в степени " + y + " равно: ");
        for (int i = 1; i <= y; i++) {
            powNumber *= x;
        }
        return powNumber;
    }

    // Задание 3.6
    public boolean equalNum(int x) {
        System.out.print("Для числа " + x + ": ");
        int totalNums = counterNumbers(x);
        if (totalNums == 1) {
            return true;
        }
        int last = 0;
        int nextLast = 0;
        for (int i = 0; i < totalNums - 1; i++) {
            last = lastNum(x);
            x = putLastNum(x);
            nextLast = lastNum(x);
            if (last != nextLast) {
                return false;
            }
        }
        return true;
    }
    private int counterNumbers(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        for (;n > 0;) {
            n = n / 10;
            count += 1;
        }
        return count;
    }

    // Задание 3.8
    public void leftTriangle(int x) {
        System.out.println("Для числа " + x + ": ");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 3.10
    public void guessGame(Scanner scanner) {
        Random random = new Random();
        int randNum = random.nextInt(10);
        int count = 0;
        while (true) {
            System.out.println("Введите число от 0 до 9:");
            int userNum = scanner.nextInt();
            if (userNum == randNum) {
                count += 1;
                System.out.println("Вы угадали! Вам понадобилось " + count + " попыток");
                break;
            } else {
                count += 1;
                System.out.println("Вы не угадали");
            }
        }
    }

    // Задание 4.2
    public int findLast(int[] array, int x) {
        System.out.print("Последнее вхождение числа " + x + ": ");
        int userNumIndex = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                userNumIndex = i;
                flag = true;
            }
        }
        if (!flag) {
            return -1;
        } else {
            return userNumIndex;
        }
    }

    // Задание 4.4
    public int[] add(int[] array, int x, int pos) {
        System.out.println("Исходный массив: ");
        showArray(array);
        if (pos < 0 || pos > array.length) {
            System.out.println("Некорректная позиция!");
            return array;
        }
        int size = array.length + 1;
        int[] arrayWithX = new int[size];
        for (int i = 0; i < arrayWithX.length; i++) {
            if (i < pos) {
                arrayWithX[i] = array[i];
            } else if(i == pos) {
                arrayWithX[i] = x;
            } else {
                arrayWithX[i] = array[i - 1];
            }
        }
        System.out.println("Массив после добавляения элемента " + x + " на позицию " + pos + ": ");
        return arrayWithX;
    }

    // Задание 4.6
    public void reverse(int[] array) {
        System.out.println("Для массива: ");
        showArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            int lastIndex = (array.length - 1) - i;
            int saveFirstNum = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = saveFirstNum;

        }

        System.out.println("Результат после переворота: ");
        showArray(array);

    }
    private void showArray(int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " " );
        }
    System.out.println();
    }

    // Задание 4.8
    public int[] concat(int[] array1, int[] array2) {
        int count = 0;
        int[] concatArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) { 
            concatArray[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            concatArray[count++] = array2[j];
        }
        return concatArray;
    }
    
    // Задание 4.10
    public int[] deleteNegative(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }
        int[] arrayWithoutNegatives = new int[count];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                arrayWithoutNegatives[index++] = array[j];
            }
        }
        return arrayWithoutNegatives;
    }
    
}



