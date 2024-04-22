package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на завод карандашей!");

        PencilFactory pencilFactory = new PencilFactory(5000, 4000, "HB");

        pencilFactory.showProductionStatus();

        pencilFactory.scheduleMaintenance();

        pencilFactory.automateProduction();

        pencilFactory.analyzeData();

        pencilFactory.customizeProduct("Red");


        pencilFactory.prioritizeOrders(List.of("order1", "order2"));

        PencilFactory.handleEmergency();

        PencilFactory.manageEmployees();
    }

    public static class PencilFactory {
        private int productionCapacity;
        private int demand;
        private String leadGrade; // Градация графита

        public PencilFactory(int productionCapacity, int demand, String leadGrade) {
            this.productionCapacity = productionCapacity;
            this.demand = demand;
            this.leadGrade = leadGrade;
        }

        public int calculateExcess() {
            return productionCapacity - demand;
        }

        public void showProductionStatus() {
            System.out.println("Текущее состояние производства карандашей:");
            System.out.println("Производственная мощность: " + productionCapacity);
            System.out.println("Спрос: " + demand);
            System.out.println("Градация графита: " + leadGrade);
        }

        public void scheduleMaintenance() {
            System.out.println("Запланировано техническое обслуживание оборудования для производства карандашей.");
        }

        public void automateProduction() {
            System.out.println("Автоматизация производственных процессов карандашей.");
        }

        public void analyzeData() {
            System.out.println("Анализ данных для оптимизации производства карандашей.");
        }

        public void customizeProduct(String color) {
            System.out.println("Персонализация продукции карандашей: " + color + " карандаши.");
        }

        public void prioritizeOrders(List<String> orders) {
            System.out.println("Определение приоритета заказов на производство карандашей: " + orders);
        }

        public static void handleEmergency() {
            System.out.println("Обработка аварийных ситуаций на заводе карандашей.");
        }

        public static void manageEmployees() {
            System.out.println("Управление персоналом на заводе карандашей.");
        }
    }
}
