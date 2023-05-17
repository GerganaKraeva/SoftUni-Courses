package ExamPre;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carsDistance = new LinkedHashMap<>();
        Map<String, Integer> carsFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            String[] carsInfo = line.split("\\|");
            String car = carsInfo[0];
            int distance = Integer.parseInt(carsInfo[1]);
            int fuel = Integer.parseInt(carsInfo[2]);
            if (!carsDistance.containsKey(car)) {
                carsDistance.put(car, distance);
            }
            if (!carsFuel.containsKey(car)) {
                carsFuel.put(car, fuel);
            }

        }
        String userInput = scanner.nextLine();
        while (!userInput.equals("Stop")) {
            String[] data = userInput.split("\\s+:\\s+");
            String command = data[0];

            if (command.equals("Drive")) {
                String carToDrive = data[1];
                int distanceToDrive = Integer.parseInt(data[2]);
                int fuelToDrive = Integer.parseInt(data[3]);
                if (carsFuel.containsKey(carToDrive) & carsDistance.containsKey(carToDrive)) {
                    if (carsFuel.get(carToDrive) < fuelToDrive) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentFuel = carsFuel.get(carToDrive);
                        int currentDistance=carsDistance.get(carToDrive);
                        carsFuel.put(carToDrive, currentFuel - fuelToDrive);
                        carsDistance.put(carToDrive, currentDistance + distanceToDrive);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", carToDrive, distanceToDrive, fuelToDrive);
                        if (carsDistance.get(carToDrive) > 100000) {
                            carsDistance.remove(carToDrive);
                            carsFuel.remove(carToDrive);
                            System.out.printf("Time to sell the %s!\n", carToDrive);
                        }
                    }
                }
            } else if (command.equals("Refuel")) {
                String car = data[1];
                int refuel = Integer.parseInt(data[2]);
                if (carsFuel.containsKey(car)) {
                    int currentFuel = carsFuel.get(car);
                    int newFuel = currentFuel + refuel;
                    if (newFuel < 75) {
                        carsFuel.put(car, newFuel);
                        System.out.printf("%s refueled with %d liters\n", car, refuel);
                    } else {
                        carsFuel.put(car, 75);
                        System.out.printf("%s refueled with %d liters\n", car, 75 - currentFuel);
                    }
                }
            } else if (command.equals("Revert")) {
                String car=data[1];
                int km=Integer.parseInt(data[2]);
                if(carsDistance.containsKey(car)){
                    int currentDis=carsDistance.get(car);
                    int newDis=currentDis-km;
                    if(newDis<10000){
                        carsDistance.put(car,10000);
                    }else{
                        carsDistance.put(car,newDis);
                        System.out.printf("%s mileage decreased by %d kilometers\n",car,km);
                    }
                }

            }


            userInput = scanner.nextLine();
        }

        carsDistance.entrySet().forEach(entry-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",entry.getKey(),entry.getValue(),carsFuel.get(entry.getKey())));
    }
}
