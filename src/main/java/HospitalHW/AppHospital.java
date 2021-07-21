package HospitalHW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHospital {
    public static void main(String[] args) {
        Hospital gkb8 = new Hospital();
        HashMap<Integer,String> rooms = new HashMap<>();

        rooms.put(101,"Reception");
        rooms.put(102,"Therapist");
        rooms.put(103,"Ophthalmologist");
        rooms.put(104,"Paediatrician");
        rooms.put(105,"Psychiatrist");
        rooms.put(201,"Gynaecologist");
        rooms.put(202,"Dentist");
        rooms.put(203,"Anaesthetist");
        rooms.put(204,"Radiologist");
        rooms.put(205,"Surgeon");

        Doctor therapist = new Doctor("Gregory","House",Position.PHYSICIAN);
        Doctor sight = new Doctor("John","Dorian",Position.OPHTHALMOLOGIST);
        Doctor kids = new Doctor("Nick","Riviera",Position.PAEDIATRICIAN);
        Doctor brains = new Doctor("Sigmund","Freud",Position.PSYCHIATRIST);
        Doctor women = new Doctor("Martha","Jones",Position.GYNAECOLOGIST);
        Doctor teeth = new Doctor("Hannibal","Lecter",Position.DENTIST);
        Doctor sleep = new Doctor("Josef","Mengele",Position.ANAESTHETIST);
        Doctor xray = new Doctor("Marie","Curie",Position.RADIOLOGIST);
        Doctor cut = new Doctor("John","Zoidberg",Position.SURGEON);

        List<Doctor> docs = new ArrayList<>();
        docs.add(therapist);
        docs.add(sight);
        docs.add(kids);
        docs.add(brains);
        docs.add(women);
        docs.add(teeth);
        docs.add(sleep);
        docs.add(xray);
        docs.add(cut);

        Address address = new Address("Gorkogo 18","Chelyabinsk","Russia",454071);

        ArrayList<InsuranceCompanies> insurances = new ArrayList<>();
        insurances.add(InsuranceCompanies.ALPHA);
        insurances.add(InsuranceCompanies.ASTRAMED);
        insurances.add(InsuranceCompanies.ROSGOSSTRAHK);
        insurances.add(InsuranceCompanies.SOGAZ);


        gkb8.setHospitalName("GKB №8");
        gkb8.setAddress(address);
        gkb8.setDoctors(docs);
        gkb8.setRooms(rooms);
        gkb8.setAcceptedInsurances(insurances);

//        System.out.println(gkb8);
//        printDoctors(gkb8);
//        printRooms(gkb8);
        printHospital(gkb8);
    }

    public static void printDoctors(Hospital hospital){
        System.out.print("\nDoctors of "+hospital.getHospitalName()+":");
        for (Doctor d: hospital.getDoctors()) System.out.print(d.toString());
    }

    public static void printRooms(Hospital hospital){
        System.out.print("\n\nRooms of "+hospital.getHospitalName()+":");
        for (Map.Entry<Integer,String> rooms : hospital.getRooms().entrySet()) {
            System.out.print("\n"+rooms.getKey()+": "+rooms.getValue());
        }
    }

    public static void printHospital(Hospital hospital) {
        System.out.println("Hospital " + hospital.getHospitalName() + ";\n" + hospital.getAddress() +";");
        printDoctors(hospital);
        printRooms(hospital);
        System.out.println("\n\nList of accepted Insurance companies: ");
        for (InsuranceCompanies s: hospital.getAcceptedInsurances()) System.out.println(s);

    }
}
