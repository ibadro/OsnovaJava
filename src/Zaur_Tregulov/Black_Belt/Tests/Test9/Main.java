package Zaur_Tregulov.Black_Belt.Tests.Test9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<CPU> listCpu = new ArrayList<>();
        CPU cpu1 = new CPU("AMD Ryzen 5 2600", 3.4, 340.20);
        CPU cpu2 = new CPU("Intel Core i5-10400F", 4.3, 417);
        CPU cpu3 = new CPU("AMD Ryzen 5 5600X", 4.6, 878);
        CPU cpu4 = new CPU("Intel Core i3-10100F", 4.3, 237.60);
        CPU cpu5 = new CPU("AMD Ryzen 7 3700X", 4.4, 810);
        CPU cpu6 = new CPU("Intel Core i9-9900K", 5.0, 1079);
        CPU cpu7 = new CPU("AMD Ryzen 5 PRO", 4.2, 537.14);
        CPU cpu8 = new CPU("AMD FX-6300", 4.1, 235.41);
        CPU cpu9 = new CPU("AMD Ryzen 9 5950X", 4.9, 2491.93);
        CPU cpu10 = new CPU("AMD Ryzen 5 2600", 3.4, 340.20);

        listCpu.add(cpu1);
        listCpu.add(cpu2);
        listCpu.add(cpu3);
        listCpu.add(cpu4);
        listCpu.add(cpu5);
        listCpu.add(cpu6);
        listCpu.add(cpu7);
        listCpu.add(cpu8);
        listCpu.add(cpu9);
        listCpu.add(cpu10);

        System.out.println("-----------------partitioningBy() метод--------------------");
        Map<Boolean, List<CPU>> map = // создаем Map ключ Boolean,значение список CPU
                listCpu.stream(). // стрим из списка
                        collect(Collectors. // создаем коллекцию
                        // если цена больше 500,0. то добавить с map c ключем true, иначе с ключем false
                                partitioningBy(cpu -> cpu.getPrice() > 500.0));
        // выводим результат
        for (Map.Entry<Boolean, List<CPU>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


        System.out.println("--------------------------------------------------------------");
        /* Первый вариант создания стрима */
        double sumPrice = listCpu.stream(). // стрим из listCpu
                map(CPU::getPrice). // стрим из price
                reduce((accum, price) -> accum + price). // суммируем все price
                get();
        System.out.println("Общая стоимость всех CPU = " + sumPrice);



        System.out.println("-----------------min() max() clockSpeed --------------------");
        CPU min = listCpu.stream().min(new ClockSpeedComparator()).get();
        System.out.println("CPU с минимальной тактовой частатой : \n" + min);
        CPU max = listCpu.stream().max(new ClockSpeedComparator()).get();
        System.out.println("CPU с максимальной тактовой частатой : \n" + max);



        System.out.println("-----------------Только модели марки Intel--------------------");
        listCpu.stream().
                filter(cpu -> cpu.getName().contains("Intel")). // фильтруем по модели Intel
                forEach(System.out::println);



        System.out.println("--------------------------------------------------------------");
        /* Второй вариант создания стрима */
        Stream<CPU> CPUstream =
                Stream.of(cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10); // стрим из объектов

        // находим сумму тактовых частот через mapToDouble() и sum()
        double sumClockSpeed = CPUstream.
                mapToDouble(CPU::getClockSpeed). // стрим из double метода getClockSpeed()
                sum(); // сумма всех значений
        System.out.println("Суммарная частота всех CPU = " + sumClockSpeed);



        System.out.println("-----------------Сортировка по имени--------------------");
        listCpu.stream().
                sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).
                forEach(System.out::println);


        System.out.println("--------------------------------------------------------------");
        /* Третий вариант создания стрима */
        Stream<CPU> streamCPU = Stream.<CPU>builder(). // начали создавать стрим через Stream.builder()
                add(cpu1). // добавили объект CPU
                add(cpu2).
                add(cpu3).
                add(cpu4).
                add(cpu5).
                add(cpu6).
                add(cpu7).
                add(cpu8).
                add(cpu9).
                add(cpu10).
                build(). // создали
                distinct(). // вернули стрим без дубликатов
                sorted(new ClockSpeedComparator()). // отсортировали через компаратор по частоте
                filter(cpu -> cpu.getClockSpeed() > 4.0). // отфильтровали частота должна быть больше 4,0 ГГц
                skip(1). // пропускаем первый элемент
                peek(cpu -> cpu.setName(cpu.getName() + "+")); // добавляем к названию "+"


        listCpu = streamCPU.collect(Collectors.toList()); // Преобразовали стрим в коллекцию
        for (CPU cpu : listCpu) { // вывод
            System.out.println(cpu);
        }

        System.out.println("-----------------concat() метод--------------------");
        Stream<CPU> stream1 = Stream.of(cpu1, cpu2, cpu3, cpu4, cpu5);
        Stream<CPU> stream2 = Stream.of(cpu6, cpu7, cpu8, cpu9, cpu10);
        Stream<CPU> sumStreams = Stream.concat(stream1, stream2);
        sumStreams.forEach(System.out::println);

        System.out.println("-----------------count() метод--------------------");
        Stream<CPU> cpuCount = Stream.of(cpu1, cpu2, cpu3);
        System.out.println(cpuCount.count()); // 3

        System.out.println("-----------------flatMapToDouble() метод--------------------");
        Stream<CPU> CPUstream2 =
                Stream.of(cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10);
        // из стрима объектов CPU получаем стрим double значений его параметра price и выводим результат
        CPUstream2.flatMapToDouble(d -> DoubleStream.of(d.getPrice())).forEach(System.out::println);


    }
}
