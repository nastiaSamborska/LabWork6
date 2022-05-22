package Tests;

import Tasks.ComputerConfiguration;
import Tasks.Main;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests {

    @Test
    public void sortTheTypeOfProcessorTest(){

        ComputerConfiguration[] array;
        ComputerConfiguration[] expected;
        ComputerConfiguration[] actual;

        {
            array = new ComputerConfiguration[5];
            array[0] = new ComputerConfiguration("RISC", 3000.78, 200, 500, "HF78767", 20.2);
            array[1] = new ComputerConfiguration("Клон", 1234.5, 344, 566, "DY7689", 14.5);
            array[2] = new ComputerConfiguration("RISC", 4545.44, 333, 600, "DG765", 23);
            array[3] = new ComputerConfiguration("CISC", 3391.91, 588, 222, "HFG786", 22);
            array[4] = new ComputerConfiguration("Клон", 3243.43, 100, 100, "DS766", 19);

            expected = new ComputerConfiguration[5];
            expected[0] = new ComputerConfiguration("CISC", 3391.91, 588, 222, "HFG786", 22);
            expected[1] = new ComputerConfiguration("RISC", 3000.78, 200, 500, "HF78767", 20.2);
            expected[2] = new ComputerConfiguration("RISC", 4545.44, 333, 600, "DG765", 23);
            expected[3] = new ComputerConfiguration("Клон", 1234.5, 344, 566, "DY7689", 14.5);
            expected[4] = new ComputerConfiguration("Клон", 3243.43, 100, 100, "DS766", 19);

            actual = Main.sortTheTypeOfProcessor(array);
            assertArrayEquals(expected,actual);
        }

    }
        @Test
        public  void emptyCase(){
            ComputerConfiguration[] array;

            {
                array = new ComputerConfiguration[5];
                assertThrows(NullPointerException.class, () ->{
                    Main.sortTheTypeOfProcessor(array);
                });


            }

    }
}
