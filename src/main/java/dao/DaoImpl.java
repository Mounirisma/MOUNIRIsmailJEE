package dao;

import org.springframework.stereotype.Component;

@Component("dao")

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version de base de donnes");
        double temp=40;
        return temp;

    }
}