import com.ilike.classlearn.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //这个人
        Person person = new Person();
        person.setAge(25);
        person.setName("swd");
        //这个人的车
        Car car = new Car();
        car.setBrand("法拉利");
        car.setColor(" 黄色");
        List<Wheel>  wheels = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            Wheel wheel = new Wheel();
            wheel.setSize(25);
            wheel.setWeight(100);
        }
        car.setWheels(wheels);
        person.setCar(car);
        //这个人的宠物
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setName("笑咪咪");
        person.setCat(cat);
        //这个人的孩子
        List<Child> childs=new ArrayList<>();
        Child child1= new Child();
        child1.setAge(10);
        child1.setName("贝贝");
        child1.setGender(2);
        child1.setParent(person);
        childs.add(child1);
        Child child2= new Child();
        child2.setAge(6);
        child2.setName("费费");
        child2.setGender(1);
        child2.setParent(person);
        childs.add(child2);
        person.setChilds(childs);
        //这个人的腿
        List<Leg> legs=new ArrayList<>();
        Leg leg1=new Leg();
        leg1.setLength(180);
        legs.add(leg1);
        Leg leg2=new Leg();
        leg2.setLength(180);
        legs.add(leg2);
        person.setLegs(legs);
        show(person);

    }

    public static   void show(Person person){
        StringBuilder sb = new StringBuilder();
        sb.append("星期天").append(person.getAge()).append("岁的").append(person.getName()).append("开着他")
                .append(person.getCar().getColor()).append("的").append(person.getCar().getBrand()).append("汽车");
        sb.append("带着他的").append(person.getChilds().size()).append("个孩子,");
        sb.append(person.getChilds().get(0).getAge()).append("岁的").append(person.getChilds().get(0).getName()).append("和");
        sb.append(person.getChilds().get(1).getAge()).append("岁的").append(person.getChilds().get(1).getName());
        sb.append("换有他").append(person.getCat().getAge()).append("岁的小猫").append(person.getCat().getName());
        sb.append("去游玩");
        System.out.println(sb.toString());
    }
}
