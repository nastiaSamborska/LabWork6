package Tasks;

import java.util.InputMismatchException;
import java.util.Objects;

public class ComputerConfiguration {
    private String processorType;
    private double clockFrequency;
    private int mainMemory;
    private int diskMemory;
    private String monitorModel;
    private double monitorLength;


    public ComputerConfiguration(String processorType, double clockFrequency, int mainMemory, int diskMemory, String monitorModel, double monitorLength) {
       setProcessorType(processorType);
       setClockFrequency(clockFrequency);
       setMainMemory(mainMemory);
       setDiskMemory(diskMemory);
       setMonitorModel(monitorModel);
       setMonitorLength(monitorLength);
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        if (processorType.equals("CISC") || processorType.equals("RISC") || processorType.equals("Клон")) {
            this.processorType = processorType;
        } else {
            throw new InputMismatchException("Invalid processor type (can be CISC, RISC, Клон)!");
        }
    }
    public double getClockFrequency() {
        return clockFrequency;
    }
    public void setClockFrequency(double clockFrequency) {
        if (clockFrequency > 0) {
            this.clockFrequency = clockFrequency;
        } else {
            throw new IllegalArgumentException("Invalid clock frequency !");
        }
    }
    public int getMainMemory() {
        return mainMemory;
    }
    public void setMainMemory(int mainMemory) {
        if (mainMemory > 0) {
            this.mainMemory = mainMemory;
        } else {
            throw new IllegalArgumentException("Invalid main memory !");
        }
    }
    public int getDiskMemory() {
        return diskMemory;
    }
    public void setDiskMemory(int diskMemory) {
        if (diskMemory > 0) {
            this.diskMemory = diskMemory;
        } else {
            throw new IllegalArgumentException("Invalid disk memory !");
        }
    }

    public String getMonitorModel() {
        return monitorModel;
    }

    public void setMonitorModel(String monitor) {
        this.monitorModel = monitor;
    }
    public double getMonitorLength() {
        return monitorLength;
    }

    public void setMonitorLength(double monitorLength) {
        if (monitorLength > 0) {
            this.monitorLength = monitorLength;
        } else {
            throw new IllegalArgumentException("Invalid monitor length !");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerConfiguration that = (ComputerConfiguration) o;
        return Double.compare(that.clockFrequency, clockFrequency) == 0 &&
                mainMemory == that.mainMemory &&
                diskMemory == that.diskMemory &&
                Double.compare(that.monitorLength, monitorLength) == 0 &&
                Objects.equals(processorType, that.processorType) &&
                Objects.equals(monitorModel, that.monitorModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processorType, clockFrequency, mainMemory, diskMemory, monitorModel, monitorLength);
    }

    @Override
    public String toString() {
        return "ComputerConfiguration {" +
                "processorType='" + processorType + '\'' +
                ", clockFrequency=" + clockFrequency +
                ", mainMemory=" + mainMemory +
                ", diskMemory=" + diskMemory +
                ", monitorModel='" + monitorModel + '\'' +
                ", monitorLength=" + monitorLength +
                '}';
    }


}