package Tasks;


import java.util.*;

public class Main {

      public static ComputerConfiguration[] sortTheTypeOfProcessor (ComputerConfiguration [] tempComputer) {
          ArrayList<ComputerConfiguration> computers = new ArrayList<ComputerConfiguration>(Arrays.asList(tempComputer));
              if (computers.size() == 0){
                  throw new NullPointerException();
              }
              ComputerConfiguration maxValueMainMemory = computers.stream().max(Comparator.comparing(ComputerConfiguration::getMainMemory)).get();
              System.out.println('\n' + "The computer with the largest amount of RAM: " + maxValueMainMemory);

              ComputerConfiguration maxValueDiskMemory = computers.stream().max(Comparator.comparing(ComputerConfiguration::getDiskMemory)).get();
              System.out.println("The computer with the largest amount of disk memory: " + maxValueDiskMemory);

              Comparator<ComputerConfiguration> comparator = Comparator.comparing(ComputerConfiguration::getProcessorType);
              computers.sort(comparator);

              ComputerConfiguration[] computerSort = new ComputerConfiguration[computers.size()];
              for (int i = 0; i < computers.size(); i++){
                  computerSort[i] = computers.get(i);
              }
              return computerSort;
          }


         public static void main(String[] args) {
           ComputerConfiguration [] tempComputer = new ComputerConfiguration[10];
           tempComputer[0] = new ComputerConfiguration("CISC", 3391.91, 200, 200, "LR56879", 18.5);
           tempComputer[1] = new ComputerConfiguration("RISC", 2566.67, 389, 567, "HF78767", 20.2);
           tempComputer[2] = new ComputerConfiguration("Клон", 4677.78, 300, 300, "DY7689", 15);
           tempComputer[3] = new ComputerConfiguration("CISC", 2346.54, 120, 220, "FY7676", 17);
           tempComputer[4] = new ComputerConfiguration("CISC", 5778.45, 340, 500, "FY7676", 25.4);
           tempComputer[5] = new ComputerConfiguration("RISC", 3456.49, 540, 587, "YY978", 20.7);
           tempComputer[6] = new ComputerConfiguration("Клон", 1234.5, 344, 566, "DY7689", 14.5);
           tempComputer[7] = new ComputerConfiguration("RISC", 4545.44, 333, 600, "DG765", 23);
           tempComputer[8] = new ComputerConfiguration("CISC", 3391.91, 588, 222, "HFG786", 22);
           tempComputer[9] = new ComputerConfiguration("Клон", 3243.43, 100, 100, "DS766", 19);

           ComputerConfiguration[] computers = sortTheTypeOfProcessor(tempComputer);
           for (ComputerConfiguration computer : computers){
               System.out.println( "\n" +computer);
           }

         }
    }

