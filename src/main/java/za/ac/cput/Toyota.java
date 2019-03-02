package za.ac.cput;

import org.springframework.stereotype.Component;

@Component
 class Toyota implements Car, Company{

    int speed;

    @Override
    public int accelerate(int increase)
    {
        speed = speed + increase;

        return increase;
    }

    @Override
    public int brake(int decrease)
    {
        speed = speed - decrease;

        return decrease;
    }

    public void displaySpeed()
    {
        System.out.println(speed);

    }

    @Override
    public void companyName() {

        System.out.println("Toyota Motor Corportation");

    }
}
