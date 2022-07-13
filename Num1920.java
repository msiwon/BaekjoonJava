import java.io.*;
import java.util.*;

public class Num1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];     // �Է� ���� ���� �ֱ� ���� �迭 ����

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);           // �迭�� ������������ ����

        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            int mid = (arr.length / 2);     // �ð��� ���̱� ���ؼ� ������ ������ ������
            if (a >= arr[mid]) {            // �߰����� ���Ͽ� ���ݸ� �� ����
                for (int j = mid; j < arr.length; j++) {
                    if (arr[j] == a) {
                        result[i] = 1;      // ���� ���� �ִٸ�? ����迭�� 1�� �־��ְ� break!
                        break;
                    }
                }
            } else {
                for (int j = mid - 1; j >= 0; j--) {
                    if (arr[j] == a) {
                        result[i] = 1;
                        break;
                    }
                }
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
