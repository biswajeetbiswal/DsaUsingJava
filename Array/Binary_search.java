import java.util.*;

class Binary_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the you want to found");
        int t = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int flag = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == t) {
                flag++;
                break;
            } else if (arr[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("The element found on " + mid + " index.");
        } else {
            System.out.println("the element not found");
        }
    }
}