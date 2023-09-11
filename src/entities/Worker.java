package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    public String name;
    public WorkerLevel level;
    public Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public Department getDepartment() {
        return this.department;
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());
            int contractYear = cal.get(Calendar.YEAR);
            int contractMonth = 1 + cal.get(Calendar.MONTH);
            if (year == contractYear && month == contractMonth) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

}
