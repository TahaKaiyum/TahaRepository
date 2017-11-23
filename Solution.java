package org.vehi;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Vehicle veh = new Vehicle();
		veh.setVehicleName("car");

		TwoWheeler tw = new TwoWheeler();
		tw.setVehicleName("Bullet");
		tw.setVehicleId(3374);
		tw.setSteeringHandle("Bullet Handle");

		Fourwheeler fw = new Fourwheeler();
		fw.setVehicleName("Honda");
		fw.setVehicleId(04);
		fw.setSteeringWheel("Honda Wheel");

		session.beginTransaction();
		session.save(veh);
		session.save(tw);
		session.save(fw);
		session.getTransaction().commit();

		session.close();
		sf.close();

	}

}
