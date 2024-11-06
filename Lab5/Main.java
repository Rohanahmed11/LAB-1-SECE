package Lab5;


class RollNumberTask implements Runnable {
    // List of student roll numbers
    private String[] rollNumbers = {
        "2022F-BSE-201", "2022F-BSE-204", "2022-SE-317", "2019-SE-095", "2019-SE-096"
    };

    @Override
    public void run() {
        for (String rollNumber : rollNumbers) {
            try {
                // Simulate some delay for printing
                Thread.sleep(500);
                System.out.println("Roll Number: " + rollNumber);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class DateOfBirthTask implements Runnable {
    // List of dates of birth
    private String[] dob = {
        "06-OCTOBER", "7-OCTOBER", "03-April", "08-April", "09-April"
    };

    @Override
    public void run() {
        for (String date : dob) {
            try {
                // Simulate some delay for printing
                Thread.sleep(500);
                System.out.println("Date of Birth: " + date);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RollNumberTask rollNumberTask = new RollNumberTask();
        DateOfBirthTask dobTask = new DateOfBirthTask();

        Thread rollNumberThread = new Thread(rollNumberTask);
        Thread dobThread = new Thread(dobTask);

        rollNumberThread.start();
        dobThread.start();

        try {
            // Wait for both threads to finish before ending the main method
            rollNumberThread.join();
            dobThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}