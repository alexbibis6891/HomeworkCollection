import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<SalesRep> SalesRepList = new ArrayList<>();

        SalesRepList.add(new SalesRep("Georgica", 2, 1000, 2000));
        SalesRepList.add(new SalesRep("Alex", 8, 400, 3200));
        SalesRepList.add(new SalesRep("Stefanel", 6, 480, 2880));
        SalesRepList.add(new SalesRep("Gabi", 9, 650, 5850));
        SalesRepList.add(new SalesRep("Valentin", 3, 200, 1200));
        SalesRepList.add(new SalesRep("Tudor", 7, 500, 3500));
        SalesRepList.add(new SalesRep("Sanziana", 12, 700, 8400));
        SalesRepList.add(new SalesRep("Alexandra", 7, 480, 3360));
        SalesRepList.add(new SalesRep("Sclifosita", 1, 3000, 3000));
        SalesRepList.add(new SalesRep("Alfred", 20, 100, 2000));

        SalesRep[] reps = SalesRepList.toArray(new SalesRep[10]);

            BubbleSort b = new BubbleSort();
            b.BubbbleSort(reps);

            SalesRep[] sortedReps = b.BubbbleSort(reps);

            for (SalesRep a : sortedReps){
                a.showList();
            }

        }

    }


