import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {

        HashMap<String, Double> medical = new HashMap<>();
        medical.put("Khyber_Medical_College", 91.2);
        medical.put("Abbottabad_Medical_College", 91.11);
        medical.put("Bacha_Khan_Medical_College", 90.66);
        medical.put("Saidu_Medical_College", 90.32);
        medical.put("Army_Medical_College", 95.63);
        medical.put("Khyber_College_of_Dentistry,Peshawar(KCD)", 89.31);

        HashMap<String, Double> qau = new HashMap<>();
        qau.put("CS", 93.4);
        qau.put("IR", 94.89);
        qau.put("LLB", 93.91);
        qau.put("BBA", 89.39);
        qau.put("Economics", 83.6);
        qau.put("Pharm_D", 97.5);
        qau.put("Psychology", 92.6);

        HashMap<String, Double> nust = new HashMap<>();
        nust.put("CS", 84.0);
        nust.put("EE", 79.0);
        nust.put("LLB", 68.0);
        nust.put("BBA", 65.02);
        nust.put("Civil_Engineering", 77.0);
        nust.put("SE", 83.42);
        nust.put("Mechanical_Engineering", 82.3);

        HashMap<String, Double> cui = new HashMap<>();
        cui.put("CS", 87.0);
        cui.put("AI", 85.33);
        cui.put("SE", 85.42);
        cui.put("BBA", 50.02);
        cui.put("CE", 80.02);
        cui.put("EE", 55.08);
        cui.put("Psychology", 50.04);

        HashMap<String, Double> giki = new HashMap<>();
        giki.put("CS", 84.0);
        giki.put("AI", 85.33);
        giki.put("SE", 85.42);
        giki.put("Chemical_Engineering", 59.02);
        giki.put("Civil_Engineering", 68.01);
        giki.put("EE", 65.08);
        giki.put("Mechanical_Engineering", 77.04);

        HashMap<String, Double> numl = new HashMap<>();
        numl.put("CS", 80.0);
        numl.put("AI", 79.34);
        numl.put("SE", 79.0);
        numl.put("BBA", 57.02);
        numl.put("Economics", 53.0);
        numl.put("EE", 55.08);
        numl.put("Psychology", 54.04);

        HashMap<String, Double> lums = new HashMap<>();
        lums.put("CS", 81.0);
        lums.put("AI", 80.33);
        lums.put("English", 78.0);
        lums.put("BBA", 76.02);
        lums.put("Political_Science", 73.0);
        lums.put("EE", 67.08);
        lums.put("Psychology", 69.04);

        ArrayList<HashMap<String, Double>> list = new ArrayList<>();
        list.add(medical);
        list.add(qau);
        list.add(nust);
        list.add(cui);
        list.add(giki);
        list.add(numl);
        list.add(lums);

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Press 1 for List of Universities. \nPress 2 for Merit calculator of universities. \nPress 3 for Merit List of universities. \nPress 4 for Automation of career Counselling. \nPress 0 to exit the program.");
        int selection = scanner.nextInt();
        while (selection != 0) {
            if (selection == 1) {
                System.out.println(
                        "1.Medical Universities are: \n  a.Khyber Medical College \n  b.Abbottabad Medical College \n  c.Bacha Khan Medical College \n  d.Saidu Medical College \n  e.Army Medical College \n  f.Khyber College of Dentistry,Peshawar(KCD) \n2.Quaid-e-Azam University Islamabad \n3.NUST \n4.CUI \n5.GIKI \n6.NUML \n7.LUMS");
            } else if (selection == 2) {
                System.out.println("Enter Your Matric Marks: ");
                int matricMarks = scanner.nextInt();
                System.out.println("Enter your Fsc Marks: ");
                int fscMarks = scanner.nextInt();
                System.out.println("Enter Your EntryTest marks: ");
                int entryTest = scanner.nextInt();
                double matricPercentage = (matricMarks * 10) / 1100;
                double fscPercentage = (fscMarks * 40 / 1100);
                double entryTestPercentage = (entryTest * 50 / 200);
                double percentage = matricPercentage + fscPercentage + entryTestPercentage;
                System.out.println(percentage);
            } else if (selection == 3) {
                System.out.println(
                        "Press 1 for Medical Universities Merit Lists \nPress 2 for QAU \nPress 3 for NUST \nPress 4 for CUI \nPress 5 for GIKI \nPress 6 for NUML \nPress 7 for LUMS.");
                int numUni = scanner.nextInt();
                switch (numUni) {
                    case 1:
                        System.out.println(
                                "Press 1 for Khyber Medical College \nPress 2 for Abbottabad Medical College \nPress 3 for Bacha Khan Medical College \nPress 4 for Saidu Medical College \nPress 5 for Army Medical College \nPress 6 for Khyber College of Dentistry, Peshawar(KCD).");
                        int numUni2 = scanner.nextInt();
                        switch (numUni2) {
                            case 1:
                                System.out.println(medical.get("Khyber_Medical_College"));
                                break;
                            case 2:
                                System.out.println(medical.get("Abbottabad_Medical_College"));
                                break;
                            case 3:
                                System.out.println(medical.get("Bacha_Khan_Medical_College"));
                                break;
                            case 4:
                                System.out.println(medical.get("Saidu_Medical_College"));
                            case 5:
                                System.out.println(medical.get("Army_Medical_College"));
                                break;
                            case 6:
                                System.out.println(medical.get("Khyber_College_of_Dentistry,Peshawar(KCD)"));
                                break;
                            default:
                                System.out.println("Enter the Correct Number.");
                        }
                        break;

                    case 2:
                        System.out.println(
                                "Press 1 for CS \n Press 2 for IR \n Press 3 for LLB \n Press 4 for BBA \n Press 5 for Economics \n Press 6 for Pharm D \n Press 7 for Psychology.");
                        int numDep2 = scanner.nextInt();
                        switch (numDep2) {
                            case 1:
                                System.out.println(qau.get("CS"));
                                break;
                            case 2:
                                System.out.println(qau.get("IR"));
                                break;
                            case 3:
                                System.out.println(qau.get("LLB"));
                                break;
                            case 4:
                                System.out.println(qau.get("BBA"));
                                break;
                            case 5:
                                System.out.println(qau.get("Economics"));
                                break;
                            case 6:
                                System.out.println(qau.get("Pharm_D"));
                                break;
                            case 7:
                                System.out.println(qau.get("Psychology"));
                                break;
                            default:
                                System.out.println("Enter the Correct Number.");
                        }
                        break;

                    case 3:
                        System.out.println(
                                "Press 1 for CS \nPress 2 for EE \nPress 3 for LLB \nPress 4 for BBA \nPress 5 for Civil_Engineering \nPress 6 for SE \nPress 7 for Mechanical_Engineering.");
                        int numDep3 = scanner.nextInt();
                        switch (numDep3) {
                            case 1:
                                System.out.println(nust.get("CS"));
                                break;
                            case 2:
                                System.out.println(nust.get("EE"));
                                break;
                            case 3:
                                System.out.println(nust.get("LLb"));
                                break;
                            case 4:
                                System.out.println(nust.get("BBA"));
                                break;
                            case 5:
                                System.out.println(nust.get("Civil_Engineering"));
                                break;
                            case 6:
                                System.out.println(nust.get("SE"));
                                break;
                            case 7:
                                System.out.println(nust.get("Mechanical_Engineering"));
                                break;
                            default:
                                System.out.println("Please Enter the Correct Number");
                        }
                        break;

                    case 4:
                        System.out.println(
                                "Press 1 for CS \nPress 2 for AI \nPress 3 for SE \nPress 4 for BBA \nPress 5 for CE \n Press 6 for EE \nPress 7 for Psychology.");
                        int numDep4 = scanner.nextInt();
                        switch (numDep4) {
                            case 1:
                                System.out.println(cui.get("CS"));
                                break;
                            case 2:
                                System.out.println(cui.get("AI"));
                                break;
                            case 3:
                                System.out.println(cui.get("SE"));
                                break;
                            case 4:
                                System.out.println(cui.get("BBA"));
                                break;
                            case 5:
                                System.out.println(cui.get("CE"));
                                break;
                            case 6:
                                System.out.println(cui.get("EE"));
                                break;
                            case 7:
                                System.out.println(cui.get("Psychology"));
                                break;
                            default:
                                System.out.println("Please Enter the Correct Number");
                        }
                        break;

                    case 5:
                        System.out.println(
                                "Press 1 for CS \nPress 2 for AI \nPress 3 for SE \nPress 4 for Chemical_Engineering \nPress 5 for Civil_Engineering \nPress 6 for EE \nPress 7 for Mechanical_Engineering.");
                        int numDep5 = scanner.nextInt();
                        switch (numDep5) {
                            case 1:
                                System.out.println(giki.get("CS"));
                                break;
                            case 2:
                                System.out.println(giki.get("AI"));
                                break;
                            case 3:
                                System.out.println(giki.get("SE"));
                                break;
                            case 4:
                                System.out.println(giki.get("Chemical_Engineering"));
                                break;
                            case 5:
                                System.out.println(giki.get("Civil_Engineering"));
                                break;
                            case 6:
                                System.out.println(giki.get("EE"));
                                break;
                            case 7:
                                System.out.println(giki.get("Mechanical_Engineering"));
                                break;
                            default:
                                System.out.println("Please Enter the Correct Number");
                        }
                        break;

                    case 6:
                        System.out.println(
                                "Press 1 for CS \nPress 2 for AI \nPress 3 for SE \nPress 4 for BBA \nPress 5 for Economics \nPress 6 for EE \nPress 7 for Psychology.");
                        int numDep6 = scanner.nextInt();
                        switch (numDep6) {
                            case 1:
                                System.out.println(numl.get("CS"));
                                break;
                            case 2:
                                System.out.println(numl.get("AI"));
                                break;
                            case 3:
                                System.out.println(numl.get("SE"));
                                break;
                            case 4:
                                System.out.println(numl.get("BBA"));
                                break;
                            case 5:
                                System.out.println(numl.get("Economics"));
                                break;
                            case 6:
                                System.out.println(numl.get("EE"));
                                break;
                            case 7:
                                System.out.println(numl.get("Psychology"));
                                break;
                            default:
                                System.out.println("Please Enter the Correct Number");
                        }
                        break;

                    case 7:
                        System.out.println(
                                "Press 1 for CS \nPress 2 for AI \nPress 3 for English \nPress 4 for BBA \nPress 5 for Political_Science \nPress 6 for EE \nPress 7 for Psychology.");
                        int numDep7 = scanner.nextInt();
                        switch (numDep7) {
                            case 1:
                                System.out.println(lums.get("CS"));
                                break;
                            case 2:
                                System.out.println(lums.get("AI"));
                                break;
                            case 3:
                                System.out.println(lums.get("English"));
                                break;
                            case 4:
                                System.out.println(lums.get("BBA"));
                                break;
                            case 5:
                                System.out.println(lums.get("Political_Science"));
                                break;
                            case 6:
                                System.out.println(lums.get("EE"));
                                break;
                            case 7:
                                System.out.println(lums.get("Psychology"));
                                break;
                            default:
                                System.out.println("Please Enter the Correct Number");
                        }
                        break;
                }
            } else if (selection == 4) {
                ArrayList<String> csData = dataSet("ComputerScience.txt");
                ArrayList<String> engData = dataSet("Engineering.txt");
                ArrayList<String> medData = dataSet("Medical.txt");

                String[][] normalizedCsData = normalizedDataSet(csData);
                String[][] normalizedMedData = normalizedDataSet(medData);
                String[][] normalizedEngData = normalizedDataSet(engData);

                System.out.println("Enter Your Matric Marks: ");
                int matric = scanner.nextInt();
                while (matric > 1100 || matric < 0) {
                    System.out.println("Enter Matric Marks from 0-1100: ");
                    matric = scanner.nextInt();
                }
                double matric2 = (Double.valueOf(matric) * 10) / 1100; 
                // System.err.println(matric2);

                System.out.println("Enter Your FSc Marks: ");
                int fsc = scanner.nextInt();
                while (fsc > 1100 || fsc < 0) {
                    System.out.println("Enter FSc Marks from 0-1100: ");
                    fsc = scanner.nextInt();
                }
                double fsc2 = (Double.valueOf(fsc)*10)/1100;

                System.out.println("How much you like Math(1-10): ");
                int math = scanner.nextInt();
                while (math > 10 || math < 1) {
                    System.out.println("Enter between 1 & 10: ");
                    math = scanner.nextInt();
                }
                System.out.println("How much you like Physics(1-10): ");
                int phy = scanner.nextInt();
                while (phy > 10 || phy < 1) {
                    System.out.println("Enter between 1 & 10: ");
                    phy = scanner.nextInt();
                }
                System.out.println("How much you like Biology(1-10): ");
                int bio = scanner.nextInt();
                while (bio > 10 || bio < 1) {
                    System.out.println("Enter between 1 & 10: ");
                    bio = scanner.nextInt();
                }
                System.out.println("How much you like Chemistry(1-10): ");
                int chem = scanner.nextInt();
                while (chem > 10 || chem < 1) {
                    System.out.println("Enter Between 1 & 10: ");
                    chem = scanner.nextInt();
                }
                System.out.println("How much you like Problem Solving(1-10): ");
                int ps = scanner.nextInt();
                while (ps > 10 || ps < 1) {
                    System.out.println("Enter between 1 & 10: ");
                    ps = scanner.nextInt();
                }
                double[] inp = { matric2, fsc2, math, phy, bio, chem, ps };
                // System.out.println(Arrays.toString(inp));

                ArrayList<Double> distanceCsSet = distanceDataSet(normalizedCsData, inp);
                ArrayList<Double> distanceMedSet = distanceDataSet(normalizedMedData, inp);
                ArrayList<Double> distanceEngSet = distanceDataSet(normalizedEngData, inp);

                sortDistanceDataSet(distanceCsSet);
                sortDistanceDataSet(distanceMedSet);
                sortDistanceDataSet(distanceEngSet);

                double averageCs = average(distanceCsSet);
                double averageMed = average(distanceMedSet);
                double averageEng = average(distanceEngSet);
                
                

                if(averageCs<averageEng && averageCs<averageMed){
                    System.out.println("You should join Computer Science related Fields.");
                }else if(averageMed<averageCs && averageMed<averageEng){
                    System.out.println("You have to make Career in Medical Fields.");
                } else{
                    System.out.println("You should go for Engineering.");
                }

            } else {
                System.out.println("Press number from 0 to 4.");
            }

            System.out.println(
                    "\nPress 1 for List of Universities. \nPress 2 for Merit calculator for different universities. \nPress 3 for Merit List of universities. \nPress 4 for Automation of career Counselling. \nPress 0 to exit the program.");
            selection = scanner.nextInt();

        }
        scanner.close();
    }

    public static ArrayList<String> dataSet(String filePath) throws IOException {
        FileReader f = new FileReader(filePath);
        int i;
        String str = "";
        ArrayList<String> dataSet = new ArrayList<String>();
        while ((i = f.read()) != -1) {
            if (((char) i) == '\n') {
                dataSet.add(str);
                str = "";
            } else {
                str += (char) i;
            }
        }
        f.close();
        return dataSet;
    }
                
    public static String[][] normalizedDataSet(ArrayList<String> nDataSet) throws IOException {
        String[][] normalizedDataSet = new String[nDataSet.size()][7];

        for (int i = 0; i < nDataSet.size(); i++) {
            String row = nDataSet.get(i);
            String[] nRow = row.split(",");
            normalizedDataSet[i] = nRow;
        }

        // for (int i = 0; i < normalizedDataSet.length; i++) {
        //     for (int j = 0; j < normalizedDataSet[i].length; j++) {
        //         System.out.print(normalizedDataSet[i][j]);
        //     }
        //     System.out.println();
        // }
        return normalizedDataSet;
    }

    public static ArrayList<Double> distanceDataSet(String[][] normalizedDataSets, double[] inpArr) {
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < normalizedDataSets.length; i++) {
            double sum = 0;
            for (int j = 0; j < normalizedDataSets[i].length; j++) {
                // System.out.println(normalizedDataSets[i][j].length());
                Double convertedPoint;
                if (j == normalizedDataSets[i].length - 1) {
                    convertedPoint = Double.parseDouble(normalizedDataSets[i][j].substring(0, normalizedDataSets[i][j].length() - 1));
                } else {
                    convertedPoint = Double. parseDouble(normalizedDataSets[i][j]);
                }
                double distanceSet = inpArr[j] - convertedPoint;
                distanceSet = distanceSet * distanceSet;
                sum += distanceSet;
            }
            sum = Math.sqrt(sum);
            arr.add(sum);
        }
        return arr;
    }

    public static void sortDistanceDataSet(ArrayList<Double> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < (arr.size() - i); j++) {
                if (arr.get(j) < arr.get(j - 1)) {
                    // int refJ = j;
                    double temp = arr.get(j);
                    double v1 = arr.get(j - 1);
                    arr.set(j, v1);
                    arr.set(j - 1, temp);
                }
            }
        }
    }

    public static double average (ArrayList<Double> sortDataSet){
        double averageNum = (sortDataSet.get(0)+sortDataSet.get(1)+sortDataSet.get(2))/3;
        return averageNum;
    }
}