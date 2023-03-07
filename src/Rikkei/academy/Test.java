package Rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[100];
        int choice;
        int size = 0;

        do {
            System.out.println("****************HACKATHON-JAVA-BASIC-1-MENU***************");
            System.out.println("1. Nhập số phần tử và giá trị cho các phần tử từ bàn phím.");
            System.out.println("2. In ra giá trị các phần tử trong mảng.");
            System.out.println("3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng");
            System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("6. In ra mảng đảo ngược");
            System.out.println("7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng");
            System.out.println("8. Sắp xếp mảng tăng dần");
            System.out.println("9. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    // Nhập phần tử
                    System.out.println("Mời nhập số lượng phần tử muốn khai báo: ");
                    size = sc.nextInt();
                    int num;
                    if (size > 0) {
                        for (int i = 0; i < size; i++) {
                            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
                            num = sc.nextInt();
                            arrays[i] = num;
                        }
                        System.out.println("Nhập thành công!");
                    } else {
                        System.out.println("Không hợp lệ.");
                    }
                    break;
                }
                case 2:
                    // In ra các phần tử trong mảng
                    System.out.println("Giá trị các phần tử trong mảng trên là: ");
                    System.out.println(Arrays.toString(arrays));
                    break;
                case 3:
                    // Tính tổng và in ra các phần tử là số lẻ
                    int sum = 0;
                    String result1 = "Danh sách các số lẻ trong mảng trên là: ";
                    for (int i = 0; i < size; i++) {
                        if (arrays[i] % 2 != 0) {
                            sum += arrays[i];
                            result1 += arrays[i] + " ";
                        }
                    }
                    System.out.println("Tổng của các phần tử lẻ trong mảng trên là: " + sum);
                    System.out.println(result1);
                    break;
                case 4:
                    // In ra số lớn nhất và nhỏ nhất
                    if (size > 0) {
                        int max = arrays[0], min = arrays[0];
                        for (int i = 0; i < size; i++) {
                            if (max < arrays[i])
                                max = arrays[i];
                        }
                        for (int i = 0; i < size; i++) {
                            if (min > arrays[i])
                                min = arrays[i];
                        }
                        System.out.println("Số lớn nhất: " + max + "\tSố nhỏ nhất: " + min);
                    } else {
                        System.out.println("Bạn chưa nhập vào phần tử nào.");
                    }
                    break;
                case 5:
                    // Thống kê số lượng phần tử chia hết cho cả 2 và 3
                    String result2 = "Các phần tử chia hết cho cả 2 và 3 là: ";
                    if (size > 0) {
                        for (int i = 0; i < size; i++) {
                            if (arrays[i] % 2 == 0 && arrays[i] % 3 == 0)
                                result2 += arrays[i] + " ";
                        }
                        System.out.println(result2);
                    } else {
                        System.out.println("Bạn chưa nhập vào phần tử nào.");
                    }
                    break;
                case 6:
                    // In ra mảng đảo ngược
                    if (size > 0) {
                        int[] reverseArray = new int[size];
                        int x;
                        for (int i = 0; i < size; i++) {
                            reverseArray[i] = arrays[i];
                        }
                        System.out.println("Mảng gốc: " + Arrays.toString(reverseArray));
                        for (int i = 0; i < size / 2; i++) {
                            x = reverseArray[i];
                            reverseArray[i] = reverseArray[size - 1 - i];
                            reverseArray[size - 1 - i] = x;
                        }
                        System.out.println("Mảng đảo ngược là: " + Arrays.toString(reverseArray));
                    } else {
                        System.out.println("Bạn chưa nhập vào phần tử nào.");
                    }
                    break;
                case 7:
                    // In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng
                    int sumPrime = 0;
                    int count = 0;
                    String result3 = "Các phần tử là số nguyên tố: ";
                    if (size > 0) {
                        for (int i = 0; i < size; i++) {
                            boolean isPrime = true;
                            if (arrays[i] == 2) {
                                isPrime = true;
                            } else if (arrays[i] > 2) {
                                for (int j = 2; j < arrays[i]; j++) {
                                    if (arrays[i] % j == 0)
                                        isPrime = false;
                                }
                            } else {
                                isPrime = false;
                            }
                            if (isPrime) {
                                result3 += arrays[i] + " ";
                                sumPrime += arrays[i];
                                count++;
                            }
                        }
                        System.out.println("Tổng các phần tử là số nguyên tố: " + sumPrime);
                        System.out.println("Tổng số lượng các phần tử là số nguyên tố: " + count);
                        System.out.println(result3);
                    } else {
                        System.out.println("Bạn chưa nhập vào phần tử nào.");
                    }
                    break;
                case 8:
                    // Sắp xếp mảng tăng dần
                    if (size > 0) {
                        int[] newArray = new int[size];
                        for (int i = 0; i < size; i++) {
                            newArray[i] = arrays[i];
                        }
                        int temp = newArray[0];
                        System.out.println(Arrays.toString(newArray));
                        for (int i = 0; i < size - 1; i++) {
                            for (int j = i + 1; j < size; j++) {
                                if (newArray[i] > newArray[j]) {
                                    temp = newArray[j];
                                    newArray[j] = newArray[i];
                                    newArray[i] = temp;
                                }
                            }
                        }
                        System.out.println("Mảng tăng dần là: " + Arrays.toString(newArray));
                    } else {
                        System.out.println("Bạn chưa nhập vào phần tử nào.");
                    }
                    break;
                case 9:
                    System.exit(0);
            }
        } while (choice != 9);
    }


}
