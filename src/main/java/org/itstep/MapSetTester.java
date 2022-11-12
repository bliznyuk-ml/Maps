package org.itstep;

import java.util.*;

public class MapSetTester {
    public static void main(String[] args) {
        // Ваш код пишите здесь

        Map<String, Set<String>> networkMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        boolean stop = true;

        while (stop) {
            System.out.println("Input tv network: ");
            String network = scanner.nextLine();
            Set<String> showSet;
            if (!networkMap.containsKey(network)) {
                showSet = new TreeSet<>();
                networkMap.put(network, showSet);
            } else {
                showSet = networkMap.get(network);
            }
            System.out.println("Input tv network " + network + ": ");
            String show = scanner.nextLine();
            showSet.add(show);

            System.out.println(networkMap);
            System.out.println("To stop press: s, to continue press: any key");
            if ("s".equals(scanner.nextLine())) {
                stop = false;
            }
        }

        String[] network = new String[networkMap.size()];
        int i = 0;
        for (String net : networkMap.keySet()) {
            network[i] = net;
            i++;
        }

        Arrays.sort(network);
        System.out.println(Arrays.toString(network));

        for (String net : network) {
            if (networkMap.containsKey(net)) {
                System.out.println(net + " " + networkMap.get(net));
            }
        }
    }
}
