package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {

            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ?  1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {					// 키의 오름차순으로 정렬되어 있습니다.
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 169, 0.8),
                new PhyscData("홍준기", 171, 1.5),
                new PhyscData("전서현", 173, 0.7),
                new PhyscData("이호연", 174, 1.2),
                new PhyscData("이수민", 175, 2.0),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요?：");
        int height = stdIn.nextInt();						// 키 값 입력
        int idx = Arrays.binarySearch(
                x,									// 배열x에서
                new PhyscData("", height, 0.0),		// 키가 height인 요소를
                PhyscData.HEIGHT_ORDER				// HEIGHT_ORDER에 의해  검색
        );

        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터：" + x[idx]);
        }
    }
}
